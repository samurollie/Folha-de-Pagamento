package src.employee;

public class Salaried extends Employee{
    private double salary;

    public Salaried(String name, String adress, int card, int paymentMethod, double salary) {
        super(name, adress, card, paymentMethod);
        this.setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
 
    public String showEmployeeInfo() {
        return "Nome: " + this.name + "\nEndereco: " + this.adress +"\nNumero do cartao: " + this.card + "\nMetodo de Pagamento: " + this.paymentMethod;
    }

    /* @Override
    public Salaried add() {
        Scanner input = new Scanner(System.in);
        if 
        System.out.println("Será um empregado comissionado?");
        System.out.println("(1) - Sim");
        System.out.println("(2) - Não");
        int comissioned = input.nextInt();
    } */
}
