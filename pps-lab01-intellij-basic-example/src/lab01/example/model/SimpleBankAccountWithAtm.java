package lab01.example.model;

public class SimpleBankAccountWithAtm implements BankAccount {

    private SimpleBankAccount simpleBankAccount;

    public SimpleBankAccountWithAtm(SimpleBankAccount simpleBankAccount) {
        this.simpleBankAccount = simpleBankAccount;
    }

    @Override
    public AccountHolder getHolder() {
        return null;
    }

    @Override
    public double getBalance() {
        return this.simpleBankAccount.getBalance();
    }

    @Override
    public void deposit(int userID, double amount) {
        this.simpleBankAccount.deposit(userID, amount - 1);
    }

    @Override
    public void withdraw(int userID, double amount) {
        this.simpleBankAccount.withdraw(userID, amount + 1);
    }
}
