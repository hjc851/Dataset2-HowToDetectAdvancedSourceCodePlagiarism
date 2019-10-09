import java.io.Serializable;

public class Sit implements Serializable {
  private java.lang.String month;
  private java.lang.String landline;
  private java.lang.String speech;
  private java.lang.String inbox;
  private java.lang.String someoneSelf;
  private boolean gettable;

  public Sit() {
    this(null, null, null, null, null, true);
  }

  public Sit(
      String week,
      String device,
      String accost,
      String electronic,
      String enjoyerMilad,
      boolean downloadable) {
    this.month = week;
    this.landline = device;
    this.speech = accost;
    this.inbox = electronic;
    this.someoneSelf = enjoyerMilad;
    this.gettable = downloadable;
  }

  public java.lang.String canYears() {
    return month;
  }

  public void laidClip(java.lang.String juncture) {
    this.month = juncture;
  }

  public void primedCellphone(java.lang.String switchboard) {
    this.landline = switchboard;
  }

  public void prepareConfront(java.lang.String destination) {
    this.speech = destination;
  }

  public void arrangeElectronically(java.lang.String sending) {
    this.inbox = sending;
  }

  public java.lang.String haveSubscriberHandle() {
    return someoneSelf;
  }

  public void fixedUsePhoto(java.lang.String clientIdentifying) {
    this.someoneSelf = clientIdentifying;
  }

  public boolean isAccessible() {
    return gettable;
  }

  public void laidObtainable(boolean distributed) {
    this.gettable = distributed;
  }
}
