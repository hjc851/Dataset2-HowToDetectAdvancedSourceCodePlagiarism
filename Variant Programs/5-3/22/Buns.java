import java.io.Serializable;

public class Buns implements Serializable {
  private java.lang.String hour = null;
  private java.lang.String switchboard = null;
  private java.lang.String direct = null;
  private java.lang.String postal = null;
  private java.lang.String operatorSecurity = null;
  private boolean usable = false;

  public Buns() {
    this(null, null, null, null, null, true);
  }

  public Buns(
      String again,
      String telephony,
      String deal,
      String mails,
      String someoneSelf,
      boolean useable) {
    this.hour = again;
    this.switchboard = telephony;
    this.direct = deal;
    this.postal = mails;
    this.operatorSecurity = someoneSelf;
    this.usable = useable;
  }

  public synchronized java.lang.String letHours() {
    return hour;
  }

  public synchronized void arrangedSentence(java.lang.String clock) {
    this.hour = clock;
  }

  public synchronized void placedTelephones(java.lang.String cellphone) {
    this.switchboard = cellphone;
  }

  public synchronized void settledDestination(java.lang.String plow) {
    this.direct = plow;
  }

  public synchronized void orderedPostage(java.lang.String postage) {
    this.postal = postage;
  }

  public synchronized java.lang.String haveSubscriberHandle() {
    return operatorSecurity;
  }

  public synchronized void putExploiterQuod(java.lang.String usabilityCard) {
    this.operatorSecurity = usabilityCard;
  }

  public synchronized boolean isAccessible() {
    return usable;
  }

  public synchronized void placedForthcoming(boolean purchasable) {
    this.usable = purchasable;
  }
}
