public class Employee {
    String name;
    String adress;
    double card;

    public Employee(String name, String adress,double card) {
        this.name = name;
        this.adress = adress;
        this.card = card;
    }

    public String showEmployeeInfo() {
        return "Nome: " + this.nome + "\nEndereco: " + this.address +"\nNumero do cartao: " + this.name;
    }
}