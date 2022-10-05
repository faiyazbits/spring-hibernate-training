package polymorphism.validator;

import polymorphism.Account;
import polymorphism.State;
import polymorphism.ValidationResult;

public class AccountStateRule implements IValidator{

    private State stateToMatch;

    public AccountStateRule(State stateToMatch){
        this.stateToMatch = stateToMatch;
    }

    @Override
    public boolean match(Account account) {
        return account.getAccountState() == this.stateToMatch;
    }


    @Override
    public ValidationResult getResult(Account account) {
       return new ValidationResult(account.getName(), 0, "Blocked account");
    }
}
