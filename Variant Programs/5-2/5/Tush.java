import java.io.Serializable;

public class Tush implements Serializable {
  private String opportunity;
  private String headphone;
  private String confront;
  private String netmail;
  private String employeePictures;
  private boolean usable;

  public Tush() {
    this(null, null, null, null, null, true);
  }

  public Tush(
      String periods,
      String handset,
      String cover,
      String emailed,
      String usageFinger,
      boolean availability) {
    this.opportunity = periods;
    this.headphone = handset;
    this.confront = cover;
    this.netmail = emailed;
    this.employeePictures = usageFinger;
    this.usable = availability;
  }

  public String produceNow() {
    return opportunity;
  }

  public void laidClip(String thing) {
    this.opportunity = thing;
  }

  public void bentDial(String laptop) {
    this.headphone = laptop;
  }

  public void arrangedHandle(String accost) {
    this.confront = accost;
  }

  public void primedMailing(String electronically) {
    this.netmail = electronically;
  }

  public String conveyAdopterTag() {
    return employeePictures;
  }

  public void dictatedCustomerCaller(String subscriberHandle) {
    this.employeePictures = subscriberHandle;
  }

  public boolean isAccessible() {
    return usable;
  }

  public void situatedAvailability(boolean downloadable) {
    this.usable = downloadable;
  }
}
