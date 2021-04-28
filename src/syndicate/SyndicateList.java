package src.syndicate;

import java.util.HashMap;
import java.util.Scanner;

import src.employee.Employee;

public class SyndicateList {
    private HashMap<Employee, Syndicate> employeeList; // Lista dos empregados que fazem parte do sindicato
    private Scanner input = new Scanner(System.in);

    public SyndicateList() {
        this.employeeList = new HashMap<Employee, Syndicate>();
    }

    public void addEmployee(Employee employee) {
        if (employeeList.containsKey(employee)) {
            System.out.println("Esse empregado já faz parte do sindicato!");
        } else {
            System.out.println("Insira a taxa sindical para " + employee.getName());
            double syndicalCharge = input.nextDouble();
            employeeList.put(employee, new Syndicate(syndicalCharge, employeeList.size() + 1));
            System.out.println("Empregado adicionado ao sindicato!");
        }
    }

    public boolean containsEmployee(Employee employee) {
        return employeeList.containsKey(employee);
    }

    public void removeEmployee(Employee employee) {
        if (!employeeList.containsKey(employee)) {
            System.out.println("Esse empregado não faz parte do sindicato!");
        } else {
            employeeList.remove(employee);
        }
    }

    public String showInfoOnSyndicate(Employee employee) {
        return employee.showEmployeeInfo() + employeeList.get(employee).toString();
    }
}
