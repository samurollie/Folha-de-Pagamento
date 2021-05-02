package src;

public class Sale {
    //TODO: mudar date de string pra data msm

    public String date;
    public double value;
    public String description;
    public int employeeId;
    
    public Sale(String date, double value, String description, int employeeId) {
        this.date = date;
        this.value = value;
        this.description = description;
        this.employeeId = employeeId;
    }
}
