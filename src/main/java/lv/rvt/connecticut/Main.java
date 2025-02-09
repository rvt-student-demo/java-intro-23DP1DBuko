package lv.rvt.connecticut;

public class Main {
    public static void main ( String[] args ) {
        Valentine cardV = new Valentine("Deniss", 2);
        System.out.println(cardV.getType());
        cardV.printGreeting();
    }
}
