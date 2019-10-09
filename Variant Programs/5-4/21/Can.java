import java.io.Serializable;

public class Can implements Serializable {
  private java.lang.String opportunity;
  private java.lang.String earphone;
  private java.lang.String speech;
  private java.lang.String mails;
  private java.lang.String usabilityCard;
  private boolean distributed;

  public Can() {
    this(null, null, null, null, null, true);
  }

  public Can(
      String sentence,
      String mobile,
      String direct,
      String send,
      String someoneSelf,
      boolean unavailable) {
    this.opportunity = sentence;
    this.earphone = mobile;
    this.speech = direct;
    this.mails = send;
    this.usabilityCard = someoneSelf;
    this.distributed = unavailable;
  }

  public synchronized java.lang.String bringMeter() {
    return opportunity;
  }

  public synchronized void putClock(java.lang.String beginning) {
    this.opportunity = beginning;
  }

  public synchronized void determinedSound(java.lang.String calls) {
    this.earphone = calls;
  }

  public synchronized void putSpeech(java.lang.String cover) {
    this.speech = cover;
  }

  public synchronized void placeFacsimile(java.lang.String dissemination) {
    this.mails = dissemination;
  }

  public synchronized java.lang.String sustainSomeoneSelf() {
    return usabilityCard;
  }

  public synchronized void fixSomeoneSelf(java.lang.String enjoyerMilad) {
    this.usabilityCard = enjoyerMilad;
  }

  public synchronized boolean isAccessible() {
    return distributed;
  }

  public synchronized void settledVisible(boolean getable) {
    this.distributed = getable;
  }
}
