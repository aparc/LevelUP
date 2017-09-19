package Lesson6.Stack;

public class OneWayStack<T> implements CustomStack<T>{

    private StackElement head;
    private StackElement bottom;


    public class StackElement{
    StackElement next;
    T value;

        StackElement(T value) {
            this.value = value;
        }
    }


    @Override
    public void push(T value) {

        StackElement el = new StackElement(value);
        if(head == null) {
            head = el;
            bottom = el;
        }
        else {
            head.next = el;
            head = el;
        }

    }

    @Override
    public void pop() {
        if(bottom == null){return;}

        System.out.println("delete stack: " + head.value);

        StackElement current = bottom;
        for(;;){

            if(current.next == null){
                current = null;
                head = null;
                bottom = null;
                break;
            }
            else if(current.next == head){
            current.next = null;
            head = current;
            break;
            }
            else {current = current.next;}
        }

        if(head == null){
            System.out.println("Stack is Empty.");
        }
        else {System.out.println("now head is " + head.value);}

    }
}
