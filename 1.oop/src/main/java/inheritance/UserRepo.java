package inheritance;

import polymorphism.Account;

public class UserRepo extends JpaRepo<Account> {

    private String name;

    UserRepo(String name){
        super(Account.class);
        this.name = name;
    }

    public String findByUserName(){
        return "SELECT * from users WHERE user.name = " + this.name;
    }
}
