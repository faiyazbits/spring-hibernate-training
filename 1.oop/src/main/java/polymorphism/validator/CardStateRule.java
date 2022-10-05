package polymorphism.validator;

import polymorphism.Account;
import polymorphism.State;
import polymorphism.ValidationResult;

public class CardStateRule implements IValidator{

    private State stateToMatch;

    public CardStateRule(State stateToMatch){
        this.stateToMatch = stateToMatch;
    }
    @Override
    public boolean match(Account account) {
        return  account.getCard().getCardState() == this.stateToMatch;
    }

    @Override
    public ValidationResult getResult(Account account) {
       return new ValidationResult(account.getName(), 0, "cancelled card");
    }
}
