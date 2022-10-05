package polymorphism.validator;

import polymorphism.Account;
import polymorphism.ValidationResult;

public class DefaultRule implements IValidator {

    @Override
    public boolean match(Account account) {
        return true;
    }

    @Override
    public ValidationResult getResult(Account account) {
        return new ValidationResult(account.getName(), 1, "succcess");
    }
}
