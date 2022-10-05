package polymorphism;

public class Validator {

    public ValidationResult validate(Account account) {
        if (account.getCard() == null) {
            return new ValidationResult(account.getName(), 0, "unregistered card");
        } else if (account.getCard().getCardState() == State.Blocked) {
            return new ValidationResult(account.getName(), 0, "blocked card");
        } else if (account.getCard().getCardState() == State.Cancelled) {
            return new ValidationResult(account.getName(), 0, "cancelled card");
        } else if (account.getAccountState() == State.Blocked) {
            return new ValidationResult(account.getName(), 0, "Blocked account");
        } else if (account.getAccountState() == State.Active && account.getCard().getCardState() == State.Active) {
            return new ValidationResult(account.getName(), 1, "Successfull");
        }

        return new ValidationResult(account.getName(), 1, "Successfull");
    }
}
