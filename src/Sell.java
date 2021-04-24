package src;

public class Sell {
    int date;
    double value;
    String item;
    int employeeId;
    
    public Sell(int date, double value, String item, int employeeId) {
        this.date = date;
        this.value = value;
        this.item = item;
        this.employeeId = employeeId;
    }
}
