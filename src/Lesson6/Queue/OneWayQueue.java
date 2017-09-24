package Lesson6.Queue;



public class OneWayQueue<T> implements CustomQueue<T>{

    Element head;
    Element tail;


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
        else{
            T value = head.value;
            head = head.next;
            return value;
        }


    }

}
