package Lesson6.Stack;

import java.util.EmptyStackException;

public class OneWayStack<T> implements CustomStack<T>{

    private StackElement head;



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

        }
        else {
            el.next = head;
            head = el;
        }

    }

    @Override
    public T pop() {
        if(head == null){
            throw new EmptyStackException();
        }


        else {
            T value = head.value;
            head = head.next;
            return value;
        }

    }

}