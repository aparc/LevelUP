package Lesson2;

import java.util.Locale;
import java.util.Scanner;

public class HomeWork1 {
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
        System.out.printf(Locale.US, "Дискриминант равен: %.2f%n", dis);

        if (dis > 0)
        {
            double x1 = (-b + Math.sqrt(dis)) / (2 * a);
            double x2 = (-b - Math.sqrt(dis)) / (2 * a);
            System.out.printf(Locale.US, "x1 = %.2f%n", x1);
            System.out.printf(Locale.US, "x2 = %.2f%n", x2);


        }
        if (dis == 0)
        {
            double x1 = (-b) / (2 * a);
            System.out.printf(Locale.US, "x1 = x2 = %.2f", x1);

        }
        if (dis < 0)
        {
            System.out.println("Уравнение вещественных корней не имеет.");
        }
    }
}
