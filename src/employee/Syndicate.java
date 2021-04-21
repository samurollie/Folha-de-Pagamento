package src.employee;

public class Syndicate extends Employee {
    private double syndicalCharge;
    private double serviceCharge;
    private int syndicalId;

    public Syndicate(String name, String adress, int card, int paymentMethod, double syndicalCharge, double serviceCharge, int syndicalId) {
        super(name, adress, card, paymentMethod);
        this.syndicalCharge = syndicalCharge;
        this.serviceCharge = serviceCharge;
        this.syndicalId = syndicalId;
    }

    public int getsyndicalId() {
        return syndicalId;
    }

    public void setsyndicalId(int syndicalId) {
        this.syndicalId = syndicalId;
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public double getsyndicalCharge() {
        return syndicalCharge;
    }

    public void setsyndicalCharge(double syndicalCharge) {
        this.syndicalCharge = syndicalCharge;
    }

    public String showEmployeeInfo() {
        return "Nome: " + this.name + "\nEndereco: " + this.adress +"\nNumero do cartao: " + this.card + "\nMetodo de Pagamento: " + this.paymentMethod;
    }
}
