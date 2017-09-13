package Lesson5;

import java.util.Calendar;

public class UserStorage {



    public static User[] user = new User[5];

    static {

        user[0] = new User(4554, "Andrei", "Parchukov", "aparc", "hregpjv", "aparc@mail.ru", Calendar.getInstance());
        user[1] = new User(3164, "Aleksandr", "Petrov", "petro", "GJkggjkl", "apetrov@mail.ru", Calendar.getInstance());
        user[2] = new User(7618, "Michael", "Zotov", "zotm", "GHGjgwo122", "mzotov@mail.ru", Calendar.getInstance());
        user[3] = new User(4322, "Alexei", "Krotov", "krot", "gehIfreh1245", "krotoal@mail.ru", Calendar.getInstance());
        user[4] = new User(2873, "Valeriya", "Kotova", "kitty", "qwerty", "kittylera@mail.ru", Calendar.getInstance());

    }

    public boolean authenticate(User[] user, Access access){ // Тут я отошел от описанной в условии задачи сигнатуры метода. Конкретно по условию пока не могу сделать, не получается :)
        boolean result = false;
        for(int i = 0; i < user.length; i++){
            if(access.equals(user[i])) {result = true;
            break;}

        }
    return result;
    }







}
