package src.employee;

public class SindicatedEmployee extends Employee{
    private double sindicalCharge;
    private double serviceCharge;
    private int sindicalId;

    public SindicatedEmployee(String name, String adress, int card, String paymentMethod, double sindicalCharge, double serviceCharge, int sindicalId) {
        super(name, adress, card, paymentMethod);
        this.sindicalCharge = sindicalCharge;
        this.serviceCharge = serviceCharge;
        this.sindicalId = sindicalId;
    }

    public int getSindicalId() {
        return sindicalId;
    }

    public void setSindicalId(int sindicalId) {
        this.sindicalId = sindicalId;
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public double getSindicalCharge() {
        return sindicalCharge;
    }

    public void setSindicalCharge(double sindicalCharge) {
        this.sindicalCharge = sindicalCharge;
    }
}
