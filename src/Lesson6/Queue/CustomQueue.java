package Lesson6.Queue;

public interface CustomQueue<T> {

    void enqueue(T value);

    T dequeue() throws EmptyQueueException;


}
