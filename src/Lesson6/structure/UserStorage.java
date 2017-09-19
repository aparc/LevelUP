package Lesson6.structure;



import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class UserStorage {


    public static List<User> list = new ArrayList<>();


    static {
        list.add(new User(4554, "Andrei", "Parchukov", "aparc", "Kor2", "aparc@mail.ru", Calendar.getInstance()));
        list.add(new User(3164, "Aleksandr", "Petrov", "petro", "PLO32", "apetrov@mail.ru", Calendar.getInstance()));
        list.add(new User(7618, "Michael", "Zotov", "zotm", "hTO", "mzotov@mail.ru", Calendar.getInstance()));
        list.add(new User(4322, "Alexei", "Krotov", "krot", "QWE324", "krotoal@mail.ru", Calendar.getInstance()));
        list.add(new User(2873, "Valeriya", "Kotova", "kitty", "qwerty", "kittylera@mail.ru", Calendar.getInstance()));
    }







}
