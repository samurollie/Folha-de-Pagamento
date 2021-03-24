package src;

public class Employee {
    String name;
    String adress;
    int card;

    public Employee(String name, String adress, int card) {
        this.name = name;
        this.adress = adress;
        this.card = card;
    }

    public String showEmployeeInfo() {
        return "Nome: " + this.name + "\nEndereco: " + this.adress +"\nNumero do cartao: " + this.card;
    }
}