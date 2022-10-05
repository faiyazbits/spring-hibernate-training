package abstraction;

public class Account {

    private double balance;

    public void setBalance(double balance) {

        if (balance < 0) { // Validating input data in order to maintain data integrity
            throw new IllegalArgumentException("Balance cannot be less than zero (0)");
        }
        this.balance = balance;
    }
}
