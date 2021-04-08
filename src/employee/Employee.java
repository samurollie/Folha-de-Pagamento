package src.employee;

public abstract class Employee {
    protected String name;
    protected String adress;
    protected int card;
    protected String paymentMethod;
    public static int quantity = 0;

    public Employee(String name, String adress, int card, int paymentMethod) {
        this.name = name;
        this.adress = adress;
        this.card = card;
        this.setPaymentMethod(paymentMethod);
        quantity++;
    }

    public abstract String showEmployeeInfo();

    public void setPaymentMethod(int method) {
        if (method == 1) {
            this.paymentMethod = "hand";
        } else if (method ==  2) {
            this.paymentMethod = "deposit";
        } else if (method == 3) {
            this.paymentMethod = "mail";
        } else {
            System.out.println("Metodo de pagamento inválido!\n");
        }
    }

}