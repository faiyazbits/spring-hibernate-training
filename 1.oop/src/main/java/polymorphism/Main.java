package polymorphism;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Account icici = new Account("icici");

        Card debitCard = new Card("debit");

        debitCard.setCardState(State.Blocked);

        icici.setCard(debitCard);

        Validator v = new Validator();

        ValidationResult valid = v.validate(icici);

        System.out.println(valid.getMessage());
    }
}
