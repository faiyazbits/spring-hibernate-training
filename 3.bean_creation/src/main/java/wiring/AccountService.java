package wiring;

import org.springframework.stereotype.Component;

@Component
public class AccountService {

    private ProjectService projectService;

    public AccountService(ProjectService projectService) {
        this.projectService = projectService;
    }

    private String accountName;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getProjectName(){
        return  this.projectService.getName();
    }
}
