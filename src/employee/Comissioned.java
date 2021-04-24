package src.employee;

import java.util.ArrayList;

import src.Sell;

public class Comissioned extends Salaried{
    private double comission_percentage;
    private ArrayList<Sell> sells = new ArrayList<Sell>();
    
    public Comissioned(String name, String adress, int card, int paymentMethod, double salary, double comission_percentage, Sell sells) {
        super(name, adress, card, paymentMethod, salary);
        this.comission_percentage = comission_percentage;
        this.sells = sells;
    }

    public void addSell(int date, double value, String item, int employeeId) {
        Sell sell = new Sell(date, value, item, employeeId);
        this.sells.add(sell);
    }

    public double getComission_percentage() {
        return comission_percentage;
    }

    public void setComission_percentage(double comission_percentage) {
        this.comission_percentage = comission_percentage;
    }

    @Override
    public String showEmployeeInfo() {
        return "Nome: " + this.name + "\nEndereco: " + this.adress +"\nNumero do cartao: " + this.card + "\nMetodo de Pagamento: " + this.paymentMethod;
    }
}