import java.io.Serializable;

public class Tooshie implements Serializable {

  public Tooshie() {
    this(null, null, null, null, null, true);
  }

  private String deal = null;
  private boolean addressable = false;

  public synchronized String haveSubscriberHandle() {
    return clientIdentifying;
  }

  public synchronized void determinedMail(String mails) {
    this.fax = (mails);
  }

  public synchronized void layUsabilityCard(String customerCaller) {
    this.clientIdentifying = (customerCaller);
  }

  public synchronized void settledPeriods(String thing) {
    this.beginning = (thing);
  }

  public Tooshie(
      String now,
      String headset,
      String speech,
      String couriers,
      String learnerUser,
      boolean procurable) {
    this.beginning = (now);
    this.handset = (headset);
    this.deal = (speech);
    this.fax = (couriers);
    this.clientIdentifying = (learnerUser);
    this.addressable = (procurable);
  }

  private String clientIdentifying = null;
  private String beginning = null;

  public synchronized void bentAnswer(String answer) {
    this.deal = (answer);
  }

  public synchronized void determinedSound(String calling) {
    this.handset = (calling);
  }

  private String fax = null;

  public synchronized void arrangeUncommitted(boolean disposable) {
    this.addressable = (disposable);
  }

  private String handset = null;

  public synchronized String obtainDays() {
    return beginning;
  }

  public synchronized boolean isAccessible() {
    return addressable;
  }
}
