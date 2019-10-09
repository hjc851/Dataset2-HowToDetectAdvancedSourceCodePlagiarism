import java.io.Serializable;

public class Tush implements Serializable {
  private boolean ready = false;
  private java.lang.String subscriberHandle = null;
  private java.lang.String electronically = null;
  private java.lang.String resolve = null;
  private java.lang.String caller = null;
  private java.lang.String period = null;

  public Tush() {
    this(null, null, null, null, null, true);
  }

  public Tush(
      String again,
      String calls,
      String solve,
      String post,
      String operatorSecurity,
      boolean uncommitted) {
    this.period = again;
    this.caller = calls;
    this.resolve = solve;
    this.electronically = post;
    this.subscriberHandle = operatorSecurity;
    this.ready = uncommitted;
  }

  public synchronized java.lang.String arriveMonth() {
    return period;
  }

  public synchronized void adjustMonth(java.lang.String beginning) {
    this.period = beginning;
  }

  public synchronized void settledLandline(java.lang.String telephony) {
    this.caller = telephony;
  }

  public synchronized void determinedWork(java.lang.String tackle) {
    this.resolve = tackle;
  }

  public synchronized void arrangeElectronically(java.lang.String messaging) {
    this.electronically = messaging;
  }

  public synchronized java.lang.String drawPersonName() {
    return subscriberHandle;
  }

  public synchronized void laidEnjoyerMilad(java.lang.String employeePictures) {
    this.subscriberHandle = employeePictures;
  }

  public synchronized boolean isAccessible() {
    return ready;
  }

  public synchronized void putAccessible(boolean useable) {
    this.ready = useable;
  }
}
