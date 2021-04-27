package src.employee;

import java.util.Scanner;

public class EmployeeList {
    private Employee employees[];
    private int maxCapacity;
    private Scanner input = new Scanner(System.in);

    public EmployeeList(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.employees = new Employee[maxCapacity];
    }

    public boolean containsId(int id) {
        return this.employees[id] != null;
    }

    public Employee getEmployee(int index) {
        return this.employees[index];
    }

    public void addEmployee(String name, String address, int id, int payment) {
        System.out.println("Que tipo de empregado " + name + " será?");
        System.out.println("(1) - Horista");
        System.out.println("(2) - Assalariado");
        int type = input.nextInt();
        
        if (type == 1) {
            System.out.println("Insira o valor do coeficiente salario/hora: ");
            double hourSalary = input.nextDouble();
            this.employees[id] = new Hourly(name, address, id, payment, hourSalary);
        } else {
            int comissioned;
            System.out.println("Será um empregado comissionado?");
            System.out.println("(1) - Sim");
            System.out.println("(2) - Não");
            comissioned = input.nextInt();
            System.out.println("Qual será o salário inicial?");
            double salary = input.nextDouble();
            
            if (comissioned == 1) {
                System.out.println("Qual a taxa de comissão?");
                double taxa = input.nextDouble();
                this.employees[id] = new Comissioned(name, address, id, payment, salary, taxa);
            } else {
                this.employees[id] = new Salaried(name, address, id, payment, salary);
            }
        }

        System.out.println("Adicionando empregado " + id);

        System.out.println("Empregado adicionado!\n");
        System.out.println(this.employees[id].showEmployeeInfo());
        input.nextLine();
    }
}
