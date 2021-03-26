package src;

public class CheckMail {
    private String from;
    private String to;
    
    public CheckMail(String from, String to) {
        this.from = from;
        this.to = to;
    }
    
    public String getTo() {
        return to;
    }
    public String getFrom() {
        return from;
    }
    public void setFrom(String from) {
        this.from = from;
    }
    public void setTo(String to) {
        this.to = to;
    }
}
