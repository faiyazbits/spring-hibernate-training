package polymorphism;

public class Card {

    private String name;

    private State cardState;

    public Card(String name) {
        this.name = name;
        this.cardState = State.Active;
    }

    public State getCardState() {
        return cardState;
    }

    public void setCardState(State cardState) {
        this.cardState = cardState;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
