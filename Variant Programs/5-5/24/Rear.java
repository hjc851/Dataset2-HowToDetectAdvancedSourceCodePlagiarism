import java.io.Serializable;

public class Rear implements Serializable {

  public Rear() {
    this(null, null, null, null, null, true);
  }

  public synchronized void primedPeriod(java.lang.String beginning) {
    this.meter = (beginning);
  }

  private boolean purchasable = false;

  public synchronized java.lang.String conveyAmount() {
    return meter;
  }

  private java.lang.String switchboard = null;
  private java.lang.String meter = null;

  public synchronized java.lang.String obtainViewerEst() {
    return wearerMap;
  }

  private java.lang.String plow = null;

  public synchronized void bentGettable(boolean obtainable) {
    this.purchasable = (obtainable);
  }

  private java.lang.String dissemination = null;

  public synchronized void fitPlow(java.lang.String cover) {
    this.plow = (cover);
  }

  private java.lang.String wearerMap = null;

  public synchronized void situatedTelephony(java.lang.String mobile) {
    this.switchboard = (mobile);
  }

  public synchronized void laidEnjoyerMilad(java.lang.String usernameDimidiate) {
    this.wearerMap = (usernameDimidiate);
  }

  public Rear(
      String amount,
      String telephonic,
      String confronting,
      String messaging,
      String usabilityCard,
      boolean procurable) {
    this.meter = (amount);
    this.switchboard = (telephonic);
    this.plow = (confronting);
    this.dissemination = (messaging);
    this.wearerMap = (usabilityCard);
    this.purchasable = (procurable);
  }

  public synchronized void settledCorrespondence(java.lang.String mail) {
    this.dissemination = (mail);
  }

  public synchronized boolean isAccessible() {
    return purchasable;
  }
}
