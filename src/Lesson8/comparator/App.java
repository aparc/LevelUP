package Lesson8.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) {


        List<User> list = new ArrayList<>();

        list.add(new User("apzrc", "Kor2"));
        list.add(new User("aparc", "Kor2"));
        list.add(new User("petro", "PLO32"));
        list.add(new User("zotm", "hTO"));
        list.add(new User("krot", "QWE324"));
        list.add(new User("kitty", "qwerty"));

        Collections.sort(list, new UserLoginLengthComparator().thenComparing(new UserLoginAlphabetComparator()));

        for(User x: list){
            System.out.println(x.toString());
        }


    }
}
