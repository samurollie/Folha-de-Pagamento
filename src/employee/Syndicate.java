package src.employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Syndicate {
    private double syndicalCharge;
    private ArrayList<Double> extraCharges;
    private int syndicalId;
    private static HashMap<Employee, Syndicate> employeeList; // Lista dos empregados que fazem parte do sindicato
    private static int maxCapacity;
    Scanner input = new Scanner(System.in);

    public Syndicate(int employeeCount) {
        Syndicate.maxCapacity = employeeCount;
        Syndicate.employeeList = new HashMap<Employee, Syndicate>();
    }

    public Syndicate(double syndicalCharge, int syndicalId) {
        this.syndicalCharge = syndicalCharge;
        this.syndicalId = syndicalId;
        this.extraCharges = new ArrayList<Double>();
    }

    public void addEmployee(Employee employee) {
        if (employeeList.containsKey(employee)) {
            System.out.println("Esse empregado já faz parte do sindicato!");
        } else {
            System.out.println("Insira a taxa sindical para " + employee.name);
            double syndicalCharge = input.nextDouble();
            employeeList.put(employee, new Syndicate(syndicalCharge, employeeList.size() + 1));
            System.out.println("Empregado adicionado ao sindicato!");
        }
    }

    public int getsyndicalId() {
        return syndicalId;
    }

    public void setsyndicalId(int syndicalId) {
        this.syndicalId = syndicalId;
    }

    /* public double getextraCharges() {
        return extraCharges;
    }

    public void setextraCharges(double extraCharges) {
        this.extraCharges = extraCharges;
    } */

    public double getsyndicalCharge() {
        return syndicalCharge;
    }

    public void setsyndicalCharge(double syndicalCharge) {
        this.syndicalCharge = syndicalCharge;
    }

    /* public String showEmployeeInfo() {
        return "Nome: " + this.name + "\nEndereco: " + this.adress +"\nNumero do cartao: " + this.card + "\nMetodo de Pagamento: " + this.paymentMethod;
    } */
}
