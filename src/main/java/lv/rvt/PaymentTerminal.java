package lv.rvt;

public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        affordableMeals += 1;
        double affordableMeal = 2.50;
        if (payment >= affordableMeal) {
            this.money += affordableMeal;
            return payment - affordableMeal;
        } else {
            return payment;
        }
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
    }

    public double eatHeartily(double payment) {
        heartyMeals += 1;
        double heartyMeal = 4.30;
        if (payment >= heartyMeal) {
            this.money += heartyMeal;
            return payment - heartyMeal;
        } else {
            return payment;
        }    
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
