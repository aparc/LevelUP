package Lesson5;

import java.util.Scanner;

import static Lesson5.UserStorage.authenticate;

public class Main {
    public static void main(String[] args) {

        String[] var = new String[4];
        var[0] = "\n1. Показать все мои посты";
        var[1] = "2. Написать сообщение пользователю";
        var[2] = "3. Оставить комментарий к посту";
        var[3] = "4. Выход";
        Scanner scanner = new Scanner(System.in);
        Access access = new Access();
        int console = 0;


        System.out.print("Введите логин: ");

        access.setLogin(scanner.nextLine());
        System.out.print("Введите пароль: ");
        access.setPassword(scanner.nextLine());

        if(authenticate(access)) {
            for (; ;) {
                do {
                    for (String it : var) {
                        System.out.println(it);
                    }

                    System.out.println();
                    System.out.print("Введите число: ");
                    if (scanner.hasNextInt()) {
                        console = scanner.nextInt();
                        if ((console < 1) | (console > 4)) {
                            System.out.println("Неправильный ввод данных.");
                        }
                    }
                    else {
                        System.out.println("Вы ввели не целое число."); scanner.next();
                    }
                } while ((console < 1) | (console > 4));
                if (console == 4) break;

            }
        }
    }
}
