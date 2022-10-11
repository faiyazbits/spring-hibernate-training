package wiring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Controller {
    private String url;


    private AccountService accountService;

    private UserService userService;

    public Controller(AccountService accountService, UserService userService) {
        this.accountService = accountService;
        this.userService = userService;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Response getResponse(){
        this.accountService.setAccountName("icici");
        this.userService.setNoOfUsers(3);
        System.out.println(this.accountService.getAccountName());
        System.out.println(this.userService.getNoOfUsers());
        return  new Response();
    }


    public AccountService getAccountService() {
        return accountService;
    }
}
