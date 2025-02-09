package lv.rvt.connecticut;

public class Holiday extends Card {
  public Holiday( String r ) {
    recipient = r; // recipient in Card is protected, so this works
  }

  public void printGreeting() {
    System.out.println("Dear " + recipient + ",");
    System.out.println("Season's Greetings!\n");
  }

  @Override
  public String getType() {
    return "HOLIDAY";
  }
}
