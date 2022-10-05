package polymorphism.validator;

import polymorphism.Account;
import polymorphism.ValidationResult;

public interface IValidator {

    boolean match(Account account);

    ValidationResult getResult(Account account);
}
