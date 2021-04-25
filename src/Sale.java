package src;

public class Sale {
    int date;
    double value;
    String item;
    int employeeId;
    
    public Sale(int date, double value, String item, int employeeId) {
        this.date = date;
        this.value = value;
        this.item = item;
        this.employeeId = employeeId;
    }
}
