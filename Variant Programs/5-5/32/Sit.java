import java.io.Serializable;

public class Sit implements Serializable {

  public Sit(
      String minutes,
      String headset,
      String handle,
      String postage,
      String subscriberHandle,
      boolean open) {
    this.sentence = (minutes);
    this.device = (headset);
    this.confront = (handle);
    this.netmail = (postage);
    this.learnerUser = (subscriberHandle);
    this.free = (open);
  }

  private boolean free;
  private String sentence;

  public synchronized String drawWeek() {
    return sentence;
  }

  private String confront;
  private String netmail;

  public synchronized void primedAcquirable(boolean visible) {
    this.free = (visible);
  }

  public synchronized String receiveUsabilityCard() {
    return learnerUser;
  }

  public synchronized boolean isAccessible() {
    return free;
  }

  public synchronized void doIdentify(String plow) {
    this.confront = (plow);
  }

  private String device;

  public synchronized void primedCellphone(String calls) {
    this.device = (calls);
  }

  public synchronized void placedWhen(String week) {
    this.sentence = (week);
  }

  public synchronized void fixDissemination(String courier) {
    this.netmail = (courier);
  }

  public Sit() {
    this(null, null, null, null, null, true);
  }

  public synchronized void solidifyingLearnerUser(String clientIdentifying) {
    this.learnerUser = (clientIdentifying);
  }

  private String learnerUser;
}
