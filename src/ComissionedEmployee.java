package src;

public class ComissionedEmployee extends SalariedEmployee{
    private double comission_percentage;
    private Sell sells; // Array?

    public ComissionedEmployee(String name, String adress, int card, String paymentMethod, double salary,
            double comission_percentage, Sell sells) {
        super(name, adress, card, paymentMethod, salary);
        this.setComission_percentage(comission_percentage);
        this.setSells(sells);
    }

    public Sell getSells() {
        return sells;
    }

    public void setSells(Sell sells) {
        this.sells = sells;
    }

    public double getComission_percentage() {
        return comission_percentage;
    }

    public void setComission_percentage(double comission_percentage) {
        this.comission_percentage = comission_percentage;
    }
    
}