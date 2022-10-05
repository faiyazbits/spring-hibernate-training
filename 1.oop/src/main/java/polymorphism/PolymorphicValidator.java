package polymorphism;

import polymorphism.validator.*;

import java.util.ArrayList;

public class PolymorphicValidator {

    private final ArrayList<IValidator> ruleList = new ArrayList<>();

    PolymorphicValidator() {
        this.ruleList.add(new AccountStateRule(State.Blocked));
        this.ruleList.add(new RegisteredRule());
        this.ruleList.add(new CardStateRule(State.Blocked));
        this.ruleList.add(new CardStateRule(State.Cancelled));
    }

    public ValidationResult validate(Account account) {
        IValidator matchingRule = this.ruleList.stream()
                .filter(rule -> rule.match(account))
                .findFirst()
                .orElse(new DefaultRule());

        return matchingRule.getResult(account);
    }
}
