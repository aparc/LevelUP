package Lesson5;

import java.util.Calendar;
import java.util.Date;

public class User {

    int userId;
    String name;
    String lastName;
    String login;
    String password;
    String email;
    Date registrationDate;

    public User() {

    }

    public User(int userId, String name, String lastName, String login, String password, String email, Calendar calendar) {
        this.userId = userId;
        this.name = name;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
        this.email = email;
        this.registrationDate = calendar.getTime();
    }


}
