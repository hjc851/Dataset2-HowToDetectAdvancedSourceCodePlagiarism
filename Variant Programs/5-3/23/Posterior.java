import java.io.Serializable;

public class Posterior implements Serializable {
  public java.lang.String month = null;
  public java.lang.String calling = null;
  public java.lang.String plow = null;
  public java.lang.String mail = null;
  public java.lang.String loginIdentifier = null;
  public boolean accessed = false;

  public Posterior() {
    this(null, null, null, null, null, true);
  }

  public Posterior(
      String day,
      String dial,
      String tackle,
      String telefax,
      String subscriberHandle,
      boolean viewable) {
    this.month = day;
    this.calling = dial;
    this.plow = tackle;
    this.mail = telefax;
    this.loginIdentifier = subscriberHandle;
    this.accessed = viewable;
  }

  public synchronized java.lang.String comeClip() {
    return month;
  }

  public synchronized void fixThing(java.lang.String years) {
    this.month = years;
  }

  public synchronized void orderedCaller(java.lang.String voice) {
    this.calling = voice;
  }

  public synchronized void markAdress(java.lang.String adress) {
    this.plow = adress;
  }

  public synchronized void dictatedEmailed(java.lang.String inbox) {
    this.mail = inbox;
  }

  public synchronized java.lang.String obtainViewerEst() {
    return loginIdentifier;
  }

  public synchronized void settledSubscriberHandle(java.lang.String clientIdentifying) {
    this.loginIdentifier = clientIdentifying;
  }

  public synchronized boolean isAccessible() {
    return accessed;
  }

  public synchronized void arrangeUncommitted(boolean gettable) {
    this.accessed = gettable;
  }
}
