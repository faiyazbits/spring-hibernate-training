package creation;

import org.springframework.stereotype.Component;

@Component
public class AccountService {

    public AccountService(String accountName) {
        this.accountName = accountName;
    }

    private String accountName;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}
