package Lesson4;

import java.util.Calendar;
import java.util.Date;

public class Message {

    private int messageId;
    private String text;
    private User user;
    private Date date;

    public Message() {
    }

    public Message(int messageId, String text, User user, Calendar calendar) {
        this.messageId = messageId;
        this.text = text;
        this.user = user;
        this.date = calendar.getTime();
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public static void send(Message message){
            MessageStore.add(message);
    }
}
