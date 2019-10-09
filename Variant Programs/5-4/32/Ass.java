import java.io.Serializable;

public class Ass implements Serializable {
  public boolean useable = false;
  public java.lang.String clientIdentifying = null;
  public java.lang.String emailed = null;
  public java.lang.String mitigate = null;
  public java.lang.String telephones = null;
  public java.lang.String period = null;

  public Ass() {
    this(null, null, null, null, null, true);
  }

  public Ass(
      String periods,
      String device,
      String confront,
      String inbox,
      String learnerUser,
      boolean unavailable) {
    this.period = periods;
    this.telephones = device;
    this.mitigate = confront;
    this.emailed = inbox;
    this.clientIdentifying = learnerUser;
    this.useable = unavailable;
  }

  public synchronized java.lang.String obtainDays() {
    return period;
  }

  public synchronized void dictatedMeter(java.lang.String week) {
    this.period = week;
  }

  public synchronized void fixDevice(java.lang.String sound) {
    this.telephones = sound;
  }

  public synchronized void rigidTackle(java.lang.String solve) {
    this.mitigate = solve;
  }

  public synchronized void layMessaging(java.lang.String mails) {
    this.emailed = mails;
  }

  public synchronized java.lang.String driveOperatorSecurity() {
    return clientIdentifying;
  }

  public synchronized void determinedViewerEst(java.lang.String developerPicture) {
    this.clientIdentifying = developerPicture;
  }

  public synchronized boolean isAccessible() {
    return useable;
  }

  public synchronized void doUnavailable(boolean availability) {
    this.useable = availability;
  }
}
