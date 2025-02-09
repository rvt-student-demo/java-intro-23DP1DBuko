package lv.rvt.connecticut;

public class Birthday extends Card {
    private int age;

    public Birthday(String r, int years) {
        super.recipient = r;
        age = years;
    }

        public void printGreeting()
    {
        System.out.println("Dear " + recipient + ",");
        System.out.println("Happy " + age + "th Birthday\n");
    }
    @Override
    public String getType() {
        return "HOLIDAY";
    }
}
