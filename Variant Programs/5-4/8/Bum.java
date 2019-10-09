import java.io.Serializable;

public class Bum implements Serializable {

  public synchronized boolean isAccessible() {
    return acquirable;
  }

  private java.lang.String personName = null;

  public synchronized void determinedWork(java.lang.String speech) {
    this.rectify = speech;
  }

  private java.lang.String rectify = null;
  private java.lang.String meter = null;

  public synchronized void solidifyingCalling(java.lang.String mobile) {
    this.landline = mobile;
  }

  public synchronized java.lang.String findLoginIdentifier() {
    return personName;
  }

  public synchronized void laidEnjoyerMilad(java.lang.String usernameDimidiate) {
    this.personName = usernameDimidiate;
  }

  private java.lang.String postage = null;

  public synchronized void markEasy(boolean availability) {
    this.acquirable = availability;
  }

  public Bum() {
    this(null, null, null, null, null, true);
  }

  public synchronized void determinedMail(java.lang.String mailing) {
    this.postage = mailing;
  }

  private java.lang.String landline = null;
  private boolean acquirable = false;

  public Bum(
      String hours,
      String ring,
      String plow,
      String facsimile,
      String developerPicture,
      boolean distributed) {
    this.meter = hours;
    this.landline = ring;
    this.rectify = plow;
    this.postage = facsimile;
    this.personName = developerPicture;
    this.acquirable = distributed;
  }

  public synchronized java.lang.String takePeriod() {
    return meter;
  }

  public synchronized void adjustMonth(java.lang.String moment) {
    this.meter = moment;
  }
}
