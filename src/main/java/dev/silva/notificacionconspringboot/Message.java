package dev.silva.notificacionconspringboot;

public class Message {

    private String text;
    private String To;

    public String getText() {
        return text;
    }

    public static String getTo() {
        String to = null;
        return to;
    }

    public void setTo(String to) {
        this.To = to;
    }
}
