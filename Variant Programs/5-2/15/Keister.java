import java.io.Serializable;

public class Keister implements Serializable {
  private java.lang.String week;
  private java.lang.String handset;
  private java.lang.String treat;
  private java.lang.String dissemination;
  private java.lang.String usePhoto;
  private boolean gettable;

  public Keister() {
    this(null, null, null, null, null, true);
  }

  public Keister(
      String clip, String calls, String speak, String couriers, String enjoyerMilad, boolean open) {
    this.week = clip;
    this.handset = calls;
    this.treat = speak;
    this.dissemination = couriers;
    this.usePhoto = enjoyerMilad;
    this.gettable = open;
  }

  public java.lang.String bringMeter() {
    return week;
  }

  public void fitYear(java.lang.String thing) {
    this.week = thing;
  }

  public void orderedCaller(java.lang.String laptop) {
    this.handset = laptop;
  }

  public void placeAlleviate(java.lang.String rectify) {
    this.treat = rectify;
  }

  public void laidFax(java.lang.String emailed) {
    this.dissemination = emailed;
  }

  public java.lang.String letSearcherIdentification() {
    return usePhoto;
  }

  public void fixedUsePhoto(java.lang.String wearerMap) {
    this.usePhoto = wearerMap;
  }

  public boolean isAccessible() {
    return gettable;
  }

  public void arrangeUncommitted(boolean acquirable) {
    this.gettable = acquirable;
  }
}
