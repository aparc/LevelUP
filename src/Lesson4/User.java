package Lesson4;

import java.util.Calendar;
import java.util.Date;

public class User {
    int userId;
    String name;
    String lastName;
    String email;
    Date registrationDate;

    public User() {

    }

    public User(int userId, String name, String lastName, String email, Calendar calendar) {
        this.userId = userId;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.registrationDate = calendar.getTime();
    }
}
