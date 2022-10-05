package polymorphism.validator;

import polymorphism.Account;
import polymorphism.State;
import polymorphism.ValidationResult;

public class RegisteredRule implements IValidator {

    @Override
    public boolean match(Account account) {
        return account.getAccountState() == State.Active && account.getCard().getCardState() == State.Active;
    }

    @Override
    public ValidationResult getResult(Account account) {
      return  new ValidationResult(account.getName(), 1, "Successfull");
    }
}
