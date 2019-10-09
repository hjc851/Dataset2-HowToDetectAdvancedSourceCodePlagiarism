import java.io.Serializable;

public class Stern implements Serializable {
  private boolean acquirable;
  private String visitorOwnership;
  private String mails;
  private String rectify;
  private String calling;
  private String clip;

  public Stern() {
    this(null, null, null, null, null, true);
  }

  public Stern(
      String month,
      String laptop,
      String deal,
      String fax,
      String clientIdentifying,
      boolean accessible) {
    this.clip = (month);
    this.calling = (laptop);
    this.rectify = (deal);
    this.mails = (fax);
    this.visitorOwnership = (clientIdentifying);
    this.acquirable = (accessible);
  }

  public synchronized String obtainDays() {
    return clip;
  }

  public synchronized void settledPeriods(String hour) {
    this.clip = (hour);
  }

  public synchronized void solidifyingCalling(String sound) {
    this.calling = (sound);
  }

  public synchronized void putSpeech(String mitigate) {
    this.rectify = (mitigate);
  }

  public synchronized void fixDissemination(String telefax) {
    this.mails = (telefax);
  }

  public synchronized String conveyAdopterTag() {
    return visitorOwnership;
  }

  public synchronized void rigidAdopterTag(String enjoyerMilad) {
    this.visitorOwnership = (enjoyerMilad);
  }

  public synchronized boolean isAccessible() {
    return acquirable;
  }

  public synchronized void readyUseable(boolean availability) {
    this.acquirable = (availability);
  }
}
