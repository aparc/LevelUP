package Lesson1;

import java.util.Locale;
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        //ax*x + bx + c = 0

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); //чтоб читались точки как разделитель

        System.out.print("Введите число a: ");
        double a = scanner.nextDouble();
        if (a == 0) {
            System.out.println("a не должно быть равно 0");
            return;
        }
        System.out.print("Введите число b: ");
        double b = scanner.nextDouble();
        System.out.print("Введите число c: ");
        double c = scanner.nextDouble();

        double dis = b * b - 4 * a * c;
        System.out.println("Дискриминант равен: " + String.format(Locale.US, "%.2f", dis));


        if (dis > 0)
        {
            double x1 = (-b + Math.sqrt(dis)) / (2 * a);
            double x2 = (-b - Math.sqrt(dis)) / (2 * a);
            System.out.println("x1 = " + String.format(Locale.US, "%.2f", x1));
            System.out.println("x2 = " + String.format(Locale.US, "%.2f", x2));

        }
        if (dis == 0)
        {
            double x1 = (-b) / (2 * a);
            System.out.println("x1 = x2 = " + String.format(Locale.US, "%.2f", x1));

        }
        if (dis < 0)
        {
            System.out.println("Уравнение вещественных корней не имеет.");
        }
    }
}