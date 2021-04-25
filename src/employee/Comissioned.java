package src.employee;

import java.util.ArrayList;

import src.Sale;

public class Comissioned extends Salaried{
    private double comissionPercentage;
    private ArrayList<Sale> sales = new ArrayList<Sale>();
    
    public Comissioned(String name, String adress, int card, int paymentMethod, double salary, double comissionPercentage) {
        super(name, adress, card, paymentMethod, salary);
        this.comissionPercentage = comissionPercentage;
    }

    public void addSale(int date, double value, String description, int employeeId) {
        Sale sale = new Sale(date, value, description, employeeId);
        this.sales.add(sale);
    }

    public double getComissionPercentage() {
        return comissionPercentage;
    }

    public void setComissionPercentage(double comissionPercentage) {
        this.comissionPercentage = comissionPercentage;
    }

    @Override
    public String showEmployeeInfo() {
        return "Nome: " + this.name + "\nEndereco: " + this.adress +"\nNumero do cartao: " + this.card + "\nMetodo de Pagamento: " + this.paymentMethod;
    }
}