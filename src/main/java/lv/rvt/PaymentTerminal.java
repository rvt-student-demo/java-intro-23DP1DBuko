package lv.rvt;

public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals
    private double affordableMeal;
    private double heartyMeal;

    public PaymentTerminal() {
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        this.affordableMeal = 2.50;
        if (payment >= affordableMeal) {
            affordableMeals += 1;
            this.money += affordableMeal;
            return payment - affordableMeal;
        } else {
            return payment;
        }
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
    }

    public double eatHeartily(double payment) {
        this.heartyMeal = 4.30;
        if (payment >= heartyMeal) {
            heartyMeals += 1;
            this.money += heartyMeal;
            return payment - heartyMeal;
        } else {
            return payment;
        }    
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() >= this.affordableMeal) {
            affordableMeals += 1;
            card.takeMoney(this.affordableMeal);
            return true;
        } else {
            return false;
        }
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() >= this.heartyMeal) {
            heartyMeals += 1;
            card.takeMoney(this.heartyMeal);
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
