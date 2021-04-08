package src.employee;

public class SalariedEmployee extends Employee{
    private double salary;

    public SalariedEmployee(String name, String adress, int card, String paymentMethod, double salary) {
        super(name, adress, card, paymentMethod);
        this.setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}
