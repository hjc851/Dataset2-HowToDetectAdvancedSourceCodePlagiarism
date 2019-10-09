import java.io.Serializable;

public class Prat implements Serializable {
  private java.lang.String moment;
  private java.lang.String telephonic;
  private java.lang.String treat;
  private java.lang.String inbox;
  private java.lang.String clientIdentifying;
  private boolean obtainable;

  public Prat() {
    this(null, null, null, null, null, true);
  }

  public Prat(
      String day,
      String mobiles,
      String destination,
      String emailed,
      String visitorOwnership,
      boolean viewable) {
    this.moment = day;
    this.telephonic = mobiles;
    this.treat = destination;
    this.inbox = emailed;
    this.clientIdentifying = visitorOwnership;
    this.obtainable = viewable;
  }

  public synchronized java.lang.String goClock() {
    return moment;
  }

  public synchronized void primedPeriod(java.lang.String juncture) {
    this.moment = juncture;
  }

  public synchronized void doLaptop(java.lang.String headset) {
    this.telephonic = headset;
  }

  public synchronized void layDeal(java.lang.String respond) {
    this.treat = respond;
  }

  public synchronized void readyMails(java.lang.String send) {
    this.inbox = send;
  }

  public synchronized java.lang.String makeUsernameDimidiate() {
    return clientIdentifying;
  }

  public synchronized void layUsabilityCard(java.lang.String someoneSelf) {
    this.clientIdentifying = someoneSelf;
  }

  public synchronized boolean isAccessible() {
    return obtainable;
  }

  public synchronized void putAccessible(boolean accessible) {
    this.obtainable = accessible;
  }
}
