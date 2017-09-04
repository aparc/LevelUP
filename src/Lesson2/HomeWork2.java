package Lesson2;

public class HomeWork2 {
    public static void main(String[] args) {
        String s = "Hello World!";

        for (int i = 0; i < 3; i++){
            System.out.println(s);
        }
        int a = 0;
        while (a <= 3)
        {
            System.out.println(s);
            a++;
        }
        int b = 1;
        do {
            System.out.println(s);
            b++;
        } while (b <= 4);
    }
}
