package Lesson5;


import java.util.Calendar;
import java.util.Date;

public abstract class AbstractMessage {

    private int messageId;
    private String text;
    private User user;
    private Date date;

    protected AbstractMessage() {
    }


    protected  AbstractMessage(int messageId, String text, User user, Calendar calendar) {
        this.messageId = messageId;
        this.text = text;
        this.user = user;
        this.date = calendar.getTime();
    }

    public abstract void send();
}
