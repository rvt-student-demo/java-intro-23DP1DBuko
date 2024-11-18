package lv.rvt;

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance * 1.0;
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros"  ;
    }
}