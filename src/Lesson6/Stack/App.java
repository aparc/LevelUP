package Lesson6.Stack;

public class App {

    public static void main(String[] args) {
        CustomStack<String> stack = new OneWayStack<>();

        stack.push("Cat");
        stack.push("Dog");
        stack.push("Bat");
        stack.push("Bird");

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();




    }
}
