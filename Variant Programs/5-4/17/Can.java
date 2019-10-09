import java.io.Serializable;

public class Can implements Serializable {
  public java.lang.String now;
  public java.lang.String landline;
  public java.lang.String cover;
  public java.lang.String send;
  public java.lang.String visitorOwnership;
  public boolean unavailable;

  public Can() {
    this(null, null, null, null, null, true);
  }

  public Can(
      String period,
      String device,
      String respond,
      String telefax,
      String wearerMap,
      boolean accessible) {
    this.now = period;
    this.landline = device;
    this.cover = respond;
    this.send = telefax;
    this.visitorOwnership = wearerMap;
    this.unavailable = accessible;
  }

  public synchronized java.lang.String havePeriods() {
    return now;
  }

  public synchronized void bentHour(java.lang.String years) {
    this.now = years;
  }

  public synchronized void solidifyingCalling(java.lang.String dial) {
    this.landline = dial;
  }

  public synchronized void fixFix(java.lang.String handle) {
    this.cover = handle;
  }

  public synchronized void placeFacsimile(java.lang.String courier) {
    this.send = courier;
  }

  public synchronized java.lang.String letSearcherIdentification() {
    return visitorOwnership;
  }

  public synchronized void primedUsageFinger(java.lang.String operatorSecurity) {
    this.visitorOwnership = operatorSecurity;
  }

  public synchronized boolean isAccessible() {
    return unavailable;
  }

  public synchronized void adjustAddressable(boolean obtainable) {
    this.unavailable = obtainable;
  }
}
