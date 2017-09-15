package Lesson5;

import java.util.Calendar;

public class UserStorage {



    private static User[] user = new User[5];

    static {

        user[0] = new User(4554, "Andrei", "Parchukov", "aparc", "Kor2", "aparc@mail.ru", Calendar.getInstance());
        user[1] = new User(3164, "Aleksandr", "Petrov", "petro", "PLO32", "apetrov@mail.ru", Calendar.getInstance());
        user[2] = new User(7618, "Michael", "Zotov", "zotm", "hTO", "mzotov@mail.ru", Calendar.getInstance());
        user[3] = new User(4322, "Alexei", "Krotov", "krot", "QWE324", "krotoal@mail.ru", Calendar.getInstance());
        user[4] = new User(2873, "Valeriya", "Kotova", "kitty", "qwerty", "kittylera@mail.ru", Calendar.getInstance());

    }

    public static boolean authenticate(Access access){ // Тут я отошел от описанной в условии задачи сигнатуры метода. Конкретно по условию пока не могу сделать, не получается :)


        for(User i: user) {
            if (access.equals(i)){return true;}
        }

        return false;
    }
}
