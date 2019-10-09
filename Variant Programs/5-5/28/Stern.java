import java.io.Serializable;

public class Stern implements Serializable {
  private java.lang.String hour;
  private java.lang.String telephony;
  private java.lang.String direct;
  private java.lang.String courier;
  private java.lang.String customersIbid;
  private boolean forthcoming;

  public Stern() {
    this(null, null, null, null, null, true);
  }

  public Stern(
      String day,
      String landline,
      String tackle,
      String mail,
      String consumerIdem,
      boolean gettable) {
    this.hour = day;
    this.telephony = landline;
    this.direct = tackle;
    this.courier = mail;
    this.customersIbid = consumerIdem;
    this.forthcoming = gettable;
  }

  public synchronized java.lang.String startMinutes() {
    return hour;
  }

  public synchronized void placeWeek(java.lang.String period) {
    this.hour = period;
  }

  public synchronized void primedCellphone(java.lang.String earphone) {
    this.telephony = earphone;
  }

  public synchronized void arrangeRespond(java.lang.String speak) {
    this.direct = speak;
  }

  public synchronized void arrangedInbox(java.lang.String philatelic) {
    this.courier = philatelic;
  }

  public synchronized java.lang.String findLoginIdentifier() {
    return customersIbid;
  }

  public synchronized void fixedUsePhoto(java.lang.String usernameDimidiate) {
    this.customersIbid = usernameDimidiate;
  }

  public synchronized boolean isAccessible() {
    return forthcoming;
  }

  public synchronized void fixedViewable(boolean getable) {
    this.forthcoming = getable;
  }
}
