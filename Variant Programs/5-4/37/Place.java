import java.io.Serializable;

public class Place implements Serializable {
  public boolean open;
  public String operatorSecurity;
  public String postal;
  public String respond;
  public String landline;
  public String moment;

  public Place() {
    this(null, null, null, null, null, true);
  }

  public Place(
      String sentence,
      String handset,
      String confronting,
      String post,
      String visitorOwnership,
      boolean usable) {
    this.moment = sentence;
    this.landline = handset;
    this.respond = confronting;
    this.postal = post;
    this.operatorSecurity = visitorOwnership;
    this.open = usable;
  }

  public synchronized String havePeriods() {
    return moment;
  }

  public synchronized void placeWeek(String hour) {
    this.moment = hour;
  }

  public synchronized void laidCall(String mobiles) {
    this.landline = mobiles;
  }

  public synchronized void primedAccost(String fix) {
    this.respond = fix;
  }

  public synchronized void readyMails(String mails) {
    this.postal = mails;
  }

  public synchronized String letSearcherIdentification() {
    return operatorSecurity;
  }

  public synchronized void solidifyingLearnerUser(String clientIdentifying) {
    this.operatorSecurity = clientIdentifying;
  }

  public synchronized boolean isAccessible() {
    return open;
  }

  public synchronized void placeDisposable(boolean accessible) {
    this.open = accessible;
  }
}
