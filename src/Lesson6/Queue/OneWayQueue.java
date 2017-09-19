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
    public void dequeue() {

        if (head == null) {return;}

        if(head.next == null){
            head = null;
            System.out.println("Queue is empty.");
        }
        else{
            System.out.println("head is " + head.value);
            current = head;
            head = null;
            head = current.next;
            System.out.println("now head is " + head.value);
        }


    }

}
