package Lesson6.Queue;

public class App {

    public static void main(String[] args) {

        CustomQueue<String> queue = new OneWayQueue<>();

        queue.enqueue("Cat");
        queue.enqueue("Dog");
        queue.enqueue("Bat");
        queue.enqueue("Bird");

        queue.dequeue();
//        queue.dequeue();
//        queue.dequeue();
//        queue.dequeue();



    }
}
