package src.employee;

public class Sindicated extends Employee {
    private double sindicalCharge;
    private double serviceCharge;
    private int sindicalId;

    public Sindicated(String name, String adress, int card, int paymentMethod, double sindicalCharge, double serviceCharge, int sindicalId) {
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

    @Override
    public String showEmployeeInfo() {
        return "Nome: " + this.name + "\nEndereco: " + this.adress +"\nNumero do cartao: " + this.card + "\nMetodo de Pagamento: " + this.paymentMethod;
    }
}
