import java.io.Serializable;

public class Induct implements Serializable {
  private boolean addressable = false;
  private java.lang.String clientIdentifying = null;
  private java.lang.String postage = null;
  private java.lang.String fix = null;
  private java.lang.String sound = null;
  private java.lang.String juncture = null;

  public Induct() {
    this(null, null, null, null, null, true);
  }

  public Induct(
      String chance,
      String laptop,
      String rectify,
      String courier,
      String visitorOwnership,
      boolean free) {
    this.juncture = chance;
    this.sound = laptop;
    this.fix = rectify;
    this.postage = courier;
    this.clientIdentifying = visitorOwnership;
    this.addressable = free;
  }

  public synchronized java.lang.String findSentence() {
    return juncture;
  }

  public synchronized void bentHour(java.lang.String amount) {
    this.juncture = amount;
  }

  public synchronized void primedCellphone(java.lang.String cellphone) {
    this.sound = cellphone;
  }

  public synchronized void layDeal(java.lang.String confronting) {
    this.fix = confronting;
  }

  public synchronized void putNetmail(java.lang.String emailed) {
    this.postage = emailed;
  }

  public synchronized java.lang.String findLoginIdentifier() {
    return clientIdentifying;
  }

  public synchronized void primedUsageFinger(java.lang.String consumerIdem) {
    this.clientIdentifying = consumerIdem;
  }

  public synchronized boolean isAccessible() {
    return addressable;
  }

  public synchronized void markEasy(boolean uncommitted) {
    this.addressable = uncommitted;
  }
}
