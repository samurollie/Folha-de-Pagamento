package src.syndicate;

import java.util.ArrayList;
import java.util.Random;

public class Syndicate {
    protected double syndicalCharge;
    protected ArrayList<Double> extraCharges;
    protected int syndicalId;
    private Random random = new Random();

    public Syndicate(double syndicalCharge, int syndicalId) {
        this.syndicalCharge = syndicalCharge;
        this.syndicalId = syndicalId;
        this.extraCharges = new ArrayList<Double>();
    }

    public int getsyndicalId() {
        return syndicalId;
    }

    public void setsyndicalId(int syndicalId) {
        this.syndicalId = syndicalId;
    }

    public int changesyndicalId(int max) {
        return random.nextInt(max);
    }

    public double getsyndicalCharge() {
        return syndicalCharge;
    }

    public void setsyndicalCharge(double syndicalCharge) {
        this.syndicalCharge = syndicalCharge;
    }

    @Override
    public String toString() {
        return "\nIdentificação no Sindicato:" + this.syndicalId +
        "\nTaxa Sindical:" + this.syndicalCharge
        +"\n----------";
    }
}
