package lv.rvt.connecticut;

public abstract class Card {
 // pataisa šo mainīgo neredzamo priekš citām klasēm
 // izņēmot! visas dotās klases (Card) sub/child klases
    protected String recipient;

    public abstract void printGreeting();

    public String getType(){
        return "Card"; // Funkcionalitāte
    }
}
