package org.challenge.dto;

import java.util.Date;

/**
 * Created from sravz on 6/25/2017.
 */
public class Message {

    private String message;
    private Date when;
    private String from;
    private String to;
    private int id;
    private int chatId;

    public Message(String message, Date when, String from, String to) {
        this.message = message;
        this.when = when;
        this.from = from;
        this.to = to;
    }
    public Message(int id,int chatId,String message, Date when, String from, String to) {
        this.chatId=chatId;
        this.id=id;
        this.message = message;
        this.when = when;
        this.from = from;
        this.to = to;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getWhen() {
        return when;
    }

    public void setWhen(Date when) {
        this.when = when;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
