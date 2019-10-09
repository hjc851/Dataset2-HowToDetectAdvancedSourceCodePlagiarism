import java.io.Serializable;

public class Tush implements Serializable {
  private String year;
  private String voice;
  private String identify;
  private String mail;
  private String subscriberHandle;
  private boolean availability;

  public Tush() {
    this(null, null, null, null, null, true);
  }

  public Tush(
      String periods,
      String landline,
      String accost,
      String couriers,
      String visitorOwnership,
      boolean getable) {
    this.year = periods;
    this.voice = landline;
    this.identify = accost;
    this.mail = couriers;
    this.subscriberHandle = visitorOwnership;
    this.availability = getable;
  }

  public String beatJuncture() {
    return year;
  }

  public void primedPeriod(String clock) {
    this.year = clock;
  }

  public void putTelephone(String handset) {
    this.voice = handset;
  }

  public void fitPlow(String speech) {
    this.identify = speech;
  }

  public void prepareAddress(String electronically) {
    this.mail = electronically;
  }

  public String fixPatientNerfling() {
    return subscriberHandle;
  }

  public void fixedUsePhoto(String patientNerfling) {
    this.subscriberHandle = patientNerfling;
  }

  public boolean isAccessible() {
    return availability;
  }

  public void fixedViewable(boolean viewable) {
    this.availability = viewable;
  }
}
