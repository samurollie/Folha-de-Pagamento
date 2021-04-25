package src;

public class Sale {
    public int date;
    public double value;
    public String description;
    public int employeeId;
    
    public Sale(int date, double value, String description, int employeeId) {
        this.date = date;
        this.value = value;
        this.description = description;
        this.employeeId = employeeId;
    }
}
