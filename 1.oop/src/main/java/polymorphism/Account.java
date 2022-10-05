package polymorphism;

public class Account {

    private String name;

    private State accountState;

    private Card card;



    public Account(String name) {
        this.name = name;
        this.accountState = State.Active;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public State getAccountState() {
        return accountState;
    }

    public void setAccountState(State accountState) {
        this.accountState = accountState;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
