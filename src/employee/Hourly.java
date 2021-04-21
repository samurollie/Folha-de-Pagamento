package src.employee;

import java.util.ArrayList;

import src.Timecard;

public class Hourly extends Employee{
    private ArrayList<Timecard> timeCards = new ArrayList<Timecard>();

    public Hourly(String name, String adress, int card, int paymentMethod) {
        super(name, adress, card, paymentMethod);
    }

    public void getTimeCards() {
        int total = 0;
        for (Timecard timecard : timeCards) {
            System.out.println("Dia: " + timecard.day);
            System.out.println("Horas Trabahadas: " + timecard.workedHours);
            System.out.println("#############\n");
            total += timecard.workedHours;
        }

        System.out.println("Total de horas trabalhadas: " + total);
    }

    public void setTimeCards(int workedHours, String day) {
        Timecard timeCard = new Timecard(workedHours, day);
        this.timeCards.add(timeCard);
    }

    public String showEmployeeInfo() {
        return "Nome: " + this.name + "\nEndereco: " + this.adress +"\nNumero do cartao: " + this.card + "\nMetodo de Pagamento: " + this.paymentMethod;
    }

    /* @Override
    public Hourly add() {
        return ;
    } */
}
