package src;

public class Sell {
    private int date;
    private double value;

    public Sell(int date, double value) {
        this.setDate(date);
        this.setValue(value);
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
