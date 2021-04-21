package src.employee;

import java.util.Random;
import java.util.Scanner;

public class Employee {
    protected String name;
    protected String adress;
    protected int card;
    protected String paymentMethod;
    private static Employee employeeList[];
    // private bool syndicate;

    public Employee(int employeeCount) {
        Employee.employeeList = new Employee[employeeCount];
    }
    
    public Employee(String name, String adress, int card, int paymentMethod) {
        this.name = name;
        this.adress = adress;
        this.card = card;
        this.setPaymentMethod(paymentMethod);
    }

    public void setPaymentMethod(int method) {
        if (method == 1) {
            this.paymentMethod = "hand";
        } else if (method ==  2) {
            this.paymentMethod = "deposit";
        } else if (method == 3) {
            this.paymentMethod = "mail";
        } else {
            System.out.println("Metodo de pagamento inválido!\n");
        }
    }

    public void add() {
        Random randInt = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o nome do empregado:");
        String name = input.nextLine();

        System.out.println("Insira o endereco do empregado:");
        String address = input.nextLine();

        
        System.out.println("Como " + name + " deseja receber o seu salário?");
        System.out.println("(1) - Em mãos");
        System.out.println("(2) - Depósito bancário");
        System.out.println("(3) - Cheque pelos correios");
        int payment = input.nextInt();

        System.out.println("Gerando o nº do cartão...");
        int id = randInt.nextInt(500); // Gera um número aletório de 0 a 500
        while (employeeList[id] != null) { // Null = não tem alguem com aql numero
            id = randInt.nextInt(500);
        }

        System.out.println("Que tipo de empregado " + name + " será?");
        System.out.println("(1) - Horista");
        System.out.println("(2) - Assalariado");
        int type = input.nextInt();
        
        if (type == 1) {
            employeeList[id] = new Hourly(name, address, id, payment);
        } else {
            int comissioned;
            System.out.println("Será um empregado comissionado?");
            System.out.println("(1) - Sim");
            System.out.println("(2) - Não");
            comissioned = input.nextInt();
            
            if (comissioned == 1) {
                // employeeList[id] = new Comissioned(name, address, id, payment, 1, 1, null);
            } else {
                System.out.println("Qual será o salário inicial?");
                double salary = input.nextDouble();
                employeeList[id] = new Salaried(name, address, id, payment, salary);
            }
        }

        

        System.out.println("Adicionando empregado " + id);

        System.out.println("Empregado adicionado!\n");
        System.out.println(employeeList[id].toString());
        input.close();
    }

    public void remove(int id) {


    }

}