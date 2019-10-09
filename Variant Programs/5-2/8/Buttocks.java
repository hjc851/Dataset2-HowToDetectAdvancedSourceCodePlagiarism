import java.io.Serializable;

public class Buttocks implements Serializable {
  private java.lang.String amount;
  private java.lang.String landline;
  private java.lang.String confront;
  private java.lang.String emailed;
  private java.lang.String wearerMap;
  private boolean provided;

  public Buttocks() {
    this(null, null, null, null, null, true);
  }

  public Buttocks(
      String juncture,
      String mobiles,
      String fix,
      String url,
      String searcherIdentification,
      boolean availability) {
    this.amount = juncture;
    this.landline = mobiles;
    this.confront = fix;
    this.emailed = url;
    this.wearerMap = searcherIdentification;
    this.provided = availability;
  }

  public java.lang.String findSentence() {
    return amount;
  }

  public void situatedMinutes(java.lang.String days) {
    this.amount = days;
  }

  public void arrangeSwitchboard(java.lang.String handset) {
    this.landline = handset;
  }

  public void orderedRectify(java.lang.String resolve) {
    this.confront = resolve;
  }

  public void solidifyingPhilatelic(java.lang.String correspondence) {
    this.emailed = correspondence;
  }

  public java.lang.String takeUsageFinger() {
    return wearerMap;
  }

  public void fitConsumerIdem(java.lang.String employeePictures) {
    this.wearerMap = employeePictures;
  }

  public boolean isAccessible() {
    return provided;
  }

  public void solidifyingAccessed(boolean addressable) {
    this.provided = addressable;
  }
}
