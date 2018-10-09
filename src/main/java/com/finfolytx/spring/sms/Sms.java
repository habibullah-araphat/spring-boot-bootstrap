package com.finfolytx.spring.sms;

public class Sms {
    private String from;
    private String to;
    private String message;

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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Sms() {
        this.from = null;
        this.to = null;
        this.message = null;

    }

    public Sms(String from, String to, String message) {

        this.from = from;
        this.to = to;
        this.message = message;
    }
}
