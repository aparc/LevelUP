package Lesson6.Stack;

public class App {

    public static void main(String[] args) throws Exception {
        CustomStack<String> stack = new OneWayStack<>();

        stack.push("Cat");
        stack.push("Dog");
        stack.push("Bat");
        stack.push("Bird");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());






    }
}
