import java.io.Serializable;

public class Place implements Serializable {
  private boolean usable = false;
  private String loginIdentifier = null;
  private String post = null;
  private String confronting = null;
  private String dial = null;
  private String days = null;

  public Place() {
    this(null, null, null, null, null, true);
  }

  public Place(
      String amount,
      String earphone,
      String respond,
      String postal,
      String usageFinger,
      boolean easy) {
    this.days = amount;
    this.dial = earphone;
    this.confronting = respond;
    this.post = postal;
    this.loginIdentifier = usageFinger;
    this.usable = easy;
  }

  public synchronized String conveyAmount() {
    return days;
  }

  public synchronized void dictatedMeter(String period) {
    this.days = period;
  }

  public synchronized void placeMobiles(String telephone) {
    this.dial = telephone;
  }

  public synchronized void laidSpeak(String alleviate) {
    this.confronting = alleviate;
  }

  public synchronized void markSend(String facsimile) {
    this.post = facsimile;
  }

  public synchronized String developAddictPeg() {
    return loginIdentifier;
  }

  public synchronized void fixedUsePhoto(String visitorOwnership) {
    this.loginIdentifier = visitorOwnership;
  }

  public synchronized boolean isAccessible() {
    return usable;
  }

  public synchronized void solidifyingAccessed(boolean unavailable) {
    this.usable = unavailable;
  }
}
