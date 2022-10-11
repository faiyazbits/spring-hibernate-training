package wiring;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    private int noOfUsers;

    public int getNoOfUsers() {
        return noOfUsers;
    }

    public void setNoOfUsers(int noOfUsers) {
        this.noOfUsers = noOfUsers;
    }
}
