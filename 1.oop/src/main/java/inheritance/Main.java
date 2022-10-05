package inheritance;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        AccountRepo accountRepo = new AccountRepo("icici");
        UserRepo userRepo = new UserRepo("faiyaz");

        System.out.println(accountRepo.findAll());
        System.out.println(userRepo.findAll());
    }
}
