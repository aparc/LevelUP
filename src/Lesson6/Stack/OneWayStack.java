package Lesson6.Stack;

import java.util.EmptyStackException;

public class OneWayStack<T> implements CustomStack<T>{

    private StackElement head;
    private StackElement bottom;
    private StackElement top;


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
    public T pop() {
        if(bottom == null){
            throw new EmptyStackException();
            }

        top = head;


        if (bottom == head){
            bottom = null;
            return  head.value;
        }

        else {
            StackElement current = bottom;
            while (current.next != head) {
                current = current.next;
            }
            head = current;
            return top.value;
        }

    }

}
