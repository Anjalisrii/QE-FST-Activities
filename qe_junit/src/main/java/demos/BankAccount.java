package demos;

// Main class
public class BankAccount {

    private Integer balance;

    // Constructor
    public BankAccount(Integer initialBalance) {
        this.balance = initialBalance;
    }

    // Withdraw method
    public Integer withdraw(Integer amount) {
        if (balance < amount) {
            throw new NotEnoughFundsException(amount, balance);
        }
        balance -= amount;
        return balance;
    }

    // Optional getter (useful for testing)
    public Integer getBalance() {
        return balance;
    }
}

// Custom Exception (same file, public not required if tests don't access it directly)
class NotEnoughFundsException extends RuntimeException {

    public NotEnoughFundsException(Integer amount, Integer balance) {
        super("Attempted to withdraw " + amount + " with a balance of " + balance);
    }
}