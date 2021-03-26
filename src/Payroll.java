package src;

public class Payroll {
    String[][] dias = new String[500][2]; // Coluna 0 -> nome, coluna 1 -> dia
    CheckMail checkMail;
    CheckHand checkHand;
    Deposit deposit;

    public void showPayroll(int d) {
        System.out.println("Empregados que recebem no dia " + d);
        for (int i = 0; i < 500; i++) {
            if(Integer.parseInt(dias[i][1]) == d) {
                System.out.println(dias[i]);
            }
        }        
    }
}
