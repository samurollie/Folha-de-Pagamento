package src.payment;

public class Deposit {
    private int agencyNumber;
    private int accountNumber;
    private int bank;
    
    public Deposit(int agencyNumber, int accountNumber, int bank) {
        this.setAgencyNumber(agencyNumber);
        this.setAccountNumber(accountNumber);
        this.setBank(bank); 
    }

    public int getBank() {
        return bank;
    }

    public void setBank(int bank) {
        this.bank = bank;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAgencyNumber() {
        return agencyNumber;
    }

    public void setAgencyNumber(int agencyNumber) {
        this.agencyNumber = agencyNumber;
    }
}
