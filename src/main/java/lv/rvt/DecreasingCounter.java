package lv.rvt;

public class DecreasingCounter {
    private int value;   // a variable that remembers the value of the counter

    public DecreasingCounter(int startValue) {
        this.value = startValue;
    }

    public void Counter() {
        this.value = 0;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        if (this.value > 0) {
            this.value--;
        }
    }

    public int value() {
        return this.value;
    }
    
    public void increase() {
        this.value ++;
    }

    public void increase(int increaseBy) {
        if ( increaseBy > 0 ) {
            this.value += increaseBy;
       }
    }

    public void decrease() {
        this.value --;
    }

    public void decrease(int decreaseBy) {
        if ( decreaseBy > 0 ) {
            this.value -= decreaseBy;
        }
    }
}
