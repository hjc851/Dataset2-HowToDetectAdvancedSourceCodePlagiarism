import java.io.Serializable;

public class Behind implements Serializable {
  private java.lang.String period = null;
  private java.lang.String dial = null;
  private java.lang.String handle = null;
  private java.lang.String messaging = null;
  private java.lang.String clientIdentifying = null;
  private boolean useable = false;

  public Behind() {
    this(null, null, null, null, null, true);
  }

  public Behind(
      String week,
      String handset,
      String fix,
      String electronically,
      String addictPeg,
      boolean availability) {
    this.period = week;
    this.dial = handset;
    this.handle = fix;
    this.messaging = electronically;
    this.clientIdentifying = addictPeg;
    this.useable = availability;
  }

  public synchronized java.lang.String arriveMonth() {
    return period;
  }

  public synchronized void rigidAmount(java.lang.String clock) {
    this.period = clock;
  }

  public synchronized void dictatedEarpiece(java.lang.String telephone) {
    this.dial = telephone;
  }

  public synchronized void fixFix(java.lang.String speak) {
    this.handle = speak;
  }

  public synchronized void rigidCouriers(java.lang.String mailing) {
    this.messaging = mailing;
  }

  public synchronized java.lang.String produceWearerMap() {
    return clientIdentifying;
  }

  public synchronized void rigidAdopterTag(java.lang.String usePhoto) {
    this.clientIdentifying = usePhoto;
  }

  public synchronized boolean isAccessible() {
    return useable;
  }

  public synchronized void putAccessible(boolean ready) {
    this.useable = ready;
  }
}
