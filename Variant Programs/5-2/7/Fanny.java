import java.io.Serializable;

public class Fanny implements Serializable {
  private java.lang.String again;
  private java.lang.String device;
  private java.lang.String destination;
  private java.lang.String mails;
  private java.lang.String employeePictures;
  private boolean purchasable;

  public Fanny() {
    this(null, null, null, null, null, true);
  }

  public Fanny(
      String sentence,
      String ring,
      String treat,
      String send,
      String personName,
      boolean accessed) {
    this.again = sentence;
    this.device = ring;
    this.destination = treat;
    this.mails = send;
    this.employeePictures = personName;
    this.purchasable = accessed;
  }

  public java.lang.String havePeriods() {
    return again;
  }

  public void laidClip(java.lang.String moment) {
    this.again = moment;
  }

  public void orderedCaller(java.lang.String telephony) {
    this.device = telephony;
  }

  public void doIdentify(java.lang.String tackle) {
    this.destination = tackle;
  }

  public void layMessaging(java.lang.String electronically) {
    this.mails = electronically;
  }

  public java.lang.String bringCustomerCaller() {
    return employeePictures;
  }

  public void laidEnjoyerMilad(java.lang.String loginIdentifier) {
    this.employeePictures = loginIdentifier;
  }

  public boolean isAccessible() {
    return purchasable;
  }

  public void arrangedProcurable(boolean ready) {
    this.purchasable = ready;
  }
}
