import java.io.Serializable;

public class Stern implements Serializable {
  private java.lang.String days;
  private java.lang.String earpiece;
  private java.lang.String work;
  private java.lang.String correspondence;
  private java.lang.String someoneSelf;
  private boolean free;

  public Stern() {
    this(null, null, null, null, null, true);
  }

  public Stern(
      String week,
      String telephony,
      String treat,
      String mailing,
      String employeePictures,
      boolean downloadable) {
    this.days = week;
    this.earpiece = telephony;
    this.work = treat;
    this.correspondence = mailing;
    this.someoneSelf = employeePictures;
    this.free = downloadable;
  }

  public java.lang.String beatJuncture() {
    return days;
  }

  public void layMoment(java.lang.String juncture) {
    this.days = juncture;
  }

  public void laidCall(java.lang.String switchboard) {
    this.earpiece = switchboard;
  }

  public void settledDestination(java.lang.String tackle) {
    this.work = tackle;
  }

  public void prepareAddress(java.lang.String couriers) {
    this.correspondence = couriers;
  }

  public java.lang.String generateConsumerIdem() {
    return someoneSelf;
  }

  public void arrangeVisitorOwnership(java.lang.String usabilityCard) {
    this.someoneSelf = usabilityCard;
  }

  public boolean isAccessible() {
    return free;
  }

  public void markEasy(boolean open) {
    this.free = open;
  }
}
