package Lesson4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import static Lesson4.MessageStore.*;

public class Main {
    public static void main(String[] args) {

        Calendar calendarUser = Calendar.getInstance();
        Calendar calendarMessage = Calendar.getInstance();
        calendarUser.set(2001, 4, 19);
        calendarMessage.set(2017, 7, 29);



        User user = new User(4571,"Andrei", "Parchukov", "aparc@mail.ru", calendarUser);
        Message message = new Message(48487, "Title1", user, calendarMessage);
        SimpleDateFormat myFormat = new SimpleDateFormat("d-MMM-y", Locale.US);

        PrivateMessage privateMessage = new PrivateMessage(user);
        PostComment postComment = new PostComment();


        Message.send(message);

        System.out.println("messageID: " + array[0].getMessageId() + "\n"  + "Text: " + array[0].getText() + "\n" + "userID: " + array[0].getUser().userId + "\n" + "name: " +
                array[0].getUser().name + "\n" + "lastName: " + array[0].getUser().lastName + "\n" + "email: " + array[0].getUser().email + "\n" + "registrationDate: " + myFormat.format(array[0].getUser().registrationDate) + "\n" +
                "Date: " + myFormat.format(array[0].getDate()));
    }
}
