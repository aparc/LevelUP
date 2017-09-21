package Lesson6.Queue;



public class OneWayQueue<T> implements CustomQueue<T>{

    Element head;
    Element tail;
    Element current;

    public class Element{

        Element next;
        T value;

        public Element(T value) {
            this.value = value;
        }
    }

    @Override
    public void enqueue(T value) {
        Element el = new Element(value);
        if (head == null) {
            head = el;
            tail = el;
        } else {
            tail.next = el;
            tail = el;

        }
    }
    @Override
    public T dequeue() throws EmptyQueueException {

        if (head == null) {

            throw new EmptyQueueException();
        }

        if(head.next == null){
            current = head;
            head = null;
            return current.value;

        }
        else{
            current = head;
            head = head.next;
            return current.value;
        }


    }

}
