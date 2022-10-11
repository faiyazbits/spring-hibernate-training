package wiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProjectService {

    @Autowired
    private AccountService accountService;
    private String name = "jira";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
