package src.employee;

public class Employee {
    private String name;
    private String adress;
    private int card;
    private String paymentMethod;

    public Employee(String name, String adress, int card, String paymentMethod) {
        this.name = name;
        this.adress = adress;
        this.card = card;
        this.paymentMethod = paymentMethod;
    }

    public String showEmployeeInfo() {
        return "Nome: " + this.name + "\nEndereco: " + this.adress +"\nNumero do cartao: " + this.card + "\nMetodo de Pagamento: " + this.paymentMethod;
    }

    public void updatePaymentMethod(String method) {
        if (method.equals("mãos") || method.equals("depósito") || method.equals("correio")) {
            this.paymentMethod = method;
        } else {
            System.out.println("Metodo de pagamento inválido!\n");
        }
    }

}