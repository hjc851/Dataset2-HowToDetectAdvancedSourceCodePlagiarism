import java.io.Serializable;

public class Buns implements Serializable {
  private String clip;
  private String payphone;
  private String cover;
  private String dissemination;
  private String wearerMap;
  private boolean purchasable;

  public Buns() {
    this(null, null, null, null, null, true);
  }

  public Buns(
      String day,
      String earphone,
      String tackle,
      String electronically,
      String subscriberHandle,
      boolean gettable) {
    this.clip = day;
    this.payphone = earphone;
    this.cover = tackle;
    this.dissemination = electronically;
    this.wearerMap = subscriberHandle;
    this.purchasable = gettable;
  }

  public String produceNow() {
    return clip;
  }

  public void determineBeginning(String clock) {
    this.clip = clock;
  }

  public void rigidVoice(String telephonic) {
    this.payphone = telephonic;
  }

  public void arrangeRespond(String alleviate) {
    this.cover = alleviate;
  }

  public void bentCourier(String philatelic) {
    this.dissemination = philatelic;
  }

  public String haveSubscriberHandle() {
    return wearerMap;
  }

  public void orderedPatientNerfling(String addictPeg) {
    this.wearerMap = addictPeg;
  }

  public boolean isAccessible() {
    return purchasable;
  }

  public void primedAcquirable(boolean obtainable) {
    this.purchasable = obtainable;
  }
}
