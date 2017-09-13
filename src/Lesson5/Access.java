package Lesson5;
import java.util.Scanner;
import static Lesson5.UserStorage.user;

public class Access {

    String login;
    String password;


    public Access(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public static void main(String[] args) {

        String[] var = new String[4];
        var[0] = "\n1. Показать все мои посты";
        var[1] = "2. Написать сообщение пользователю";
        var[2] = "3. Оставить комментарий к посту";
        var[3] = "4. Выход";
        Scanner scanner = new Scanner(System.in);

        int console = 0;
        String loginAccess;
        String passwordAccess;

        System.out.print("Введите логин: ");
        loginAccess = scanner.nextLine();
        System.out.print("Введите пароль: ");
        passwordAccess = scanner.nextLine();
        Access access = new Access(loginAccess, passwordAccess);



        UserStorage us = new UserStorage(); // Можно ли обойтись без создания объекта класса UserStorage, что бы вызвать нон-статик метод authenticate
       if(us.authenticate(user, access)) {  // из статического метода main? authenticate можно сделать static, но тогда он не будет вызывать equals :(
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

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof User)) return false;

        User other = (User) obj;
        return  login.equals(other.login) &&
                password.equals(other.password);
    }

    @Override
    public int hashCode() {
        int result = 23;
        result = 24 * result + login.hashCode();
        result = 24 * result + password.hashCode();
        return result;


    }
}
