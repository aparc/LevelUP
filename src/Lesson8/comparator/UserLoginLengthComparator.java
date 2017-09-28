package Lesson8.comparator;

import java.util.Comparator;

public class UserLoginLengthComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o2.getLogin().length() - o1.getLogin().length();
    }
}
