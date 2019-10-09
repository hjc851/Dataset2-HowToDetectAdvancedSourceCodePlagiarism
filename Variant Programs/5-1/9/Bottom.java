import java.io.Serializable;

public class Bottom implements Serializable {
  private String clock;
  private String call;
  private String answer;
  private String electronically;
  private String consumerIdem;
  private boolean ready;

  public Bottom() {
    this(null, null, null, null, null, true);
  }

  public Bottom(
      String hour,
      String telephonic,
      String tackle,
      String send,
      String operatorSecurity,
      boolean distributed) {
    this.clock = hour;
    this.call = telephonic;
    this.answer = tackle;
    this.electronically = send;
    this.consumerIdem = operatorSecurity;
    this.ready = distributed;
  }

  public String beatJuncture() {
    return clock;
  }

  public void prepareNow(String years) {
    this.clock = years;
  }

  public void fixDevice(String device) {
    this.call = device;
  }

  public void fixFix(String confront) {
    this.answer = confront;
  }

  public void prepareAddress(String inbox) {
    this.electronically = inbox;
  }

  public String arriveClientIdentifying() {
    return consumerIdem;
  }

  public void dictatedCustomerCaller(String subscriberHandle) {
    this.consumerIdem = subscriberHandle;
  }

  public boolean isAccessible() {
    return ready;
  }

  public void settledVisible(boolean getable) {
    this.ready = getable;
  }
}
