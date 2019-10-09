import java.io.Serializable;

public class Bottom implements Serializable {
  public boolean uncommitted;
  public java.lang.String exploiterQuod;
  public java.lang.String couriers;
  public java.lang.String accost;
  public java.lang.String device;
  public java.lang.String again;

  public Bottom() {
    this(null, null, null, null, null, true);
  }

  public Bottom(
      String periods,
      String earpiece,
      String speech,
      String emailed,
      String loginIdentifier,
      boolean procurable) {
    this.again = periods;
    this.device = earpiece;
    this.accost = speech;
    this.couriers = emailed;
    this.exploiterQuod = loginIdentifier;
    this.uncommitted = procurable;
  }

  public synchronized java.lang.String drawWeek() {
    return again;
  }

  public synchronized void layMoment(java.lang.String moment) {
    this.again = moment;
  }

  public synchronized void arrangedEarphone(java.lang.String payphone) {
    this.device = payphone;
  }

  public synchronized void adjustSolve(java.lang.String treat) {
    this.accost = treat;
  }

  public synchronized void adjustUrl(java.lang.String electronically) {
    this.couriers = electronically;
  }

  public synchronized java.lang.String receiveUsabilityCard() {
    return exploiterQuod;
  }

  public synchronized void arrangeVisitorOwnership(java.lang.String subscriberHandle) {
    this.exploiterQuod = subscriberHandle;
  }

  public synchronized boolean isAccessible() {
    return uncommitted;
  }

  public synchronized void dictatedPurchasable(boolean useable) {
    this.uncommitted = useable;
  }
}
