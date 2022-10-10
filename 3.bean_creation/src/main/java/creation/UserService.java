package creation;

public class UserService {

    private int noOfUsers;

    public UserService(int noOfUsers) {
        this.noOfUsers = noOfUsers;
    }

    public int getNoOfUsers() {
        return noOfUsers;
    }

    public void setNoOfUsers(int noOfUsers) {
        this.noOfUsers = noOfUsers;
    }
}
