package src;

public class HourlyEmplyee extends Employee{
    private double workedHours;
    private double serviceCharge;

    public HourlyEmplyee(String name, String adress, int card, String paymentMethod, double workedHours,double serviceCharge) {
        super(name, adress, card, paymentMethod);
        this.setWorkedHours(workedHours);
        this.setServiceCharge(serviceCharge);
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public double getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(double workedHours) {
        this.workedHours = workedHours;
    }
}
