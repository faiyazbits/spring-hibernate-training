package inheritance;

public class UserRepo {

    private String name;

    UserRepo(String name){
        this.name = name;
    }

    public String findAll(){
        return "SELECT * from users";
    }

    public String findByUserName(){
        return "SELECT * from users WHERE user.name = " + this.name;
    }
}
