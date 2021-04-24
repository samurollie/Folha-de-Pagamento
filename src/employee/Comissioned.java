package src.employee;

import java.util.ArrayList;

import src.Sell;

public class Comissioned extends Salaried{
    private double comissionPercentage;
    private ArrayList<Sell> sells = new ArrayList<Sell>();
    
    public Comissioned(String name, String adress, int card, int paymentMethod, double salary, double comissionPercentage) {
        super(name, adress, card, paymentMethod, salary);
        this.comissionPercentage = comissionPercentage;
    }

    public void addSell(int date, double value, String item, int employeeId) {
        Sell sell = new Sell(date, value, item, employeeId);
        this.sells.add(sell);
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