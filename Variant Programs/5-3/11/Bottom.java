import java.io.Serializable;

public class Bottom implements Serializable {
  public boolean unavailable;
  public java.lang.String customersIbid;
  public java.lang.String couriers;
  public java.lang.String confronting;
  public java.lang.String payphone;
  public java.lang.String hours;

  public Bottom() {
    this(null, null, null, null, null, true);
  }

  public Bottom(
      String again,
      String laptop,
      String identify,
      String mails,
      String viewerEst,
      boolean availability) {
    this.hours = again;
    this.payphone = laptop;
    this.confronting = identify;
    this.couriers = mails;
    this.customersIbid = viewerEst;
    this.unavailable = availability;
  }

  public synchronized java.lang.String findSentence() {
    return hours;
  }

  public synchronized void fixedOpportunity(java.lang.String thing) {
    this.hours = thing;
  }

  public synchronized void fixedHeadset(java.lang.String voice) {
    this.payphone = voice;
  }

  public synchronized void readyCover(java.lang.String answer) {
    this.confronting = answer;
  }

  public synchronized void laidFax(java.lang.String postal) {
    this.couriers = postal;
  }

  public synchronized java.lang.String becomeUsePhoto() {
    return customersIbid;
  }

  public synchronized void determineEmployeePictures(java.lang.String usageFinger) {
    this.customersIbid = usageFinger;
  }

  public synchronized boolean isAccessible() {
    return unavailable;
  }

  public synchronized void fitOpen(boolean ready) {
    this.unavailable = ready;
  }
}
