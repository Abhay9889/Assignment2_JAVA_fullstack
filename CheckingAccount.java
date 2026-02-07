public class CheckingAccount extends BankAccount {

    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String accountHolderName, double overdraftLimit) {
        super(accountNumber, accountHolderName);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && getBalance() - amount >= -overdraftLimit) {
            setBalance(getBalance() - amount);
        }
    }

    @Override
    public String getAccountDetails() {
        return "Checking Account #" + getAccountNumber() +
               ", Balance: $" + String.format("%.2f", getBalance()) +
               ", Limit: $" + String.format("%.2f", overdraftLimit);
    }
}
