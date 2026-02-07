import java.util.ArrayList;

public class BankManager {

    public static void main(String[] args) {

        ArrayList<BankAccount> accounts = new ArrayList<>();

        SavingsAccount savings = new SavingsAccount("12345", "Alice", 0.02);
        CheckingAccount checking = new CheckingAccount("67890", "Bob", 500.0);

        accounts.add(savings);
        accounts.add(checking);

        savings.deposit(200);
        checking.withdraw(100);

        savings.applyInterest();

        for (BankAccount account : accounts) {
            System.out.println(account.getAccountDetails());
        }
    }
}
