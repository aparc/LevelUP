package Lesson1;

import java.nio.Buffer;
import java.util.Locale;
import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        //ax + b = 0
        //x = -b / a;
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); //чтоб читались точки как разделитель

        System.out.print("Введите число a: ");
        double a = scanner.nextDouble();
        if (a == 0){
            System.out.println("a не должно быть равно 0");
            return;
        }
        System.out.print("Введите число b: ");
        double b = scanner.nextDouble();
        double x;

        x = -b / a;
        System.out.print("x = ");
        System.out.print(String.format(Locale.US, "%.2f", x)); // сделал 2 знака после запятой с точкой в качестве разделителя, мне так удобнее :))

    }
}
