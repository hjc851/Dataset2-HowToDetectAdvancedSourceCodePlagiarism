import java.io.Serializable;

public class Fanny implements Serializable {
  private String meter;
  private String earpiece;
  private String plow;
  private String messaging;
  private String enjoyerMilad;
  private boolean provided;

  public Fanny() {
    this(null, null, null, null, null, true);
  }

  public Fanny(
      String minutes,
      String telephonic,
      String speak,
      String emailed,
      String loginIdentifier,
      boolean addressable) {
    this.meter = minutes;
    this.earpiece = telephonic;
    this.plow = speak;
    this.messaging = emailed;
    this.enjoyerMilad = loginIdentifier;
    this.provided = addressable;
  }

  public String goClock() {
    return meter;
  }

  public void putClock(String clip) {
    this.meter = clip;
  }

  public void layHeadphone(String laptop) {
    this.earpiece = laptop;
  }

  public void prepareConfront(String fix) {
    this.plow = fix;
  }

  public void markSend(String electronically) {
    this.messaging = electronically;
  }

  public String arriveClientIdentifying() {
    return enjoyerMilad;
  }

  public void prepareWearerMap(String operatorSecurity) {
    this.enjoyerMilad = operatorSecurity;
  }

  public boolean isAccessible() {
    return provided;
  }

  public void solidifyingAccessed(boolean obtainable) {
    this.provided = obtainable;
  }
}
