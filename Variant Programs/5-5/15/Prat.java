import java.io.Serializable;

public class Prat implements Serializable {
  private String thing = null;
  private String sound = null;
  private String speak = null;
  private String post = null;
  private String wearerMap = null;
  private boolean ready = false;

  public Prat() {
    this(null, null, null, null, null, true);
  }

  public Prat(
      String when,
      String telephonic,
      String solve,
      String electronically,
      String searcherIdentification,
      boolean gettable) {
    this.thing = (when);
    this.sound = (telephonic);
    this.speak = (solve);
    this.post = (electronically);
    this.wearerMap = (searcherIdentification);
    this.ready = (gettable);
  }

  public synchronized String letHours() {
    return thing;
  }

  public synchronized void situatedMinutes(String week) {
    this.thing = (week);
  }

  public synchronized void readyRing(String voice) {
    this.sound = (voice);
  }

  public synchronized void orderedRectify(String work) {
    this.speak = (work);
  }

  public synchronized void adjustUrl(String sending) {
    this.post = (sending);
  }

  public synchronized String becomeUsePhoto() {
    return wearerMap;
  }

  public synchronized void fitConsumerIdem(String customerCaller) {
    this.wearerMap = (customerCaller);
  }

  public synchronized boolean isAccessible() {
    return ready;
  }

  public synchronized void fixDownloadable(boolean unavailable) {
    this.ready = (unavailable);
  }
}
