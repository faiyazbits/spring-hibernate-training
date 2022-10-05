package inheritance;


import polymorphism.Account;

public class AccountRepo extends JpaRepo<Account> {

    private String bank;

    AccountRepo(String bank){
        super(Account.class);
        this.bank = bank;
    }

    public String findByBank(){
        return "SELECT * from accounts WHERE user.bank = " + this.bank;
    }
}
