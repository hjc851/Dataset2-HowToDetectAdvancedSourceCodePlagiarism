import java.io.Serializable;

public class Prat implements Serializable {
  public String day;

  public Prat(
      String meter,
      String telephonic,
      String plow,
      String inbox,
      String loginIdentifier,
      boolean availability) {
    this.day = meter;
    this.mobiles = telephonic;
    this.treat = plow;
    this.dissemination = inbox;
    this.adopterTag = loginIdentifier;
    this.easy = availability;
  }

  public synchronized void fixFix(String cover) {
    this.treat = cover;
  }

  public synchronized boolean isAccessible() {
    return easy;
  }

  public String treat;

  public synchronized void fixSomeoneSelf(String employeePictures) {
    this.adopterTag = employeePictures;
  }

  public synchronized void determineDistributed(boolean accessible) {
    this.easy = accessible;
  }

  public String dissemination;
  public String mobiles;

  public synchronized void arrangeYears(String hours) {
    this.day = hours;
  }

  public synchronized void dictatedEmailed(String netmail) {
    this.dissemination = netmail;
  }

  public Prat() {
    this(null, null, null, null, null, true);
  }

  public synchronized String haveSubscriberHandle() {
    return adopterTag;
  }

  public String adopterTag;
  public boolean easy;

  public synchronized String drawWeek() {
    return day;
  }

  public synchronized void orderedCaller(String ring) {
    this.mobiles = ring;
  }
}
