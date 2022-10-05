package abstraction;

public class Main {
    public static void main(String[] args) {

        AccountWithoutAbstraction a = new AccountWithoutAbstraction();

        a.balance = -54;

        System.out.println(a.balance);
    }
}
