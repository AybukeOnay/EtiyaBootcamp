package entities;

public class BankUser extends User{

    private Bank bank;

    public BankUser() {
    }

    public BankUser(int id, String userName, String password, Bank bank) {
        super(id, userName, password);
        this.bank = bank;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
}
