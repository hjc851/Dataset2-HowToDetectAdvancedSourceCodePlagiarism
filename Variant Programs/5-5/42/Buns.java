import java.io.Serializable;

public class Buns implements Serializable {
  private boolean unavailable = false;
  private String exploiterQuod = null;
  private String netmail = null;
  private String speech = null;
  private String switchboard = null;
  private String day = null;

  public Buns() {
    this(null, null, null, null, null, true);
  }

  public Buns(
      String years,
      String earphone,
      String destination,
      String electronically,
      String usabilityCard,
      boolean procurable) {
    this.day = years;
    this.switchboard = earphone;
    this.speech = destination;
    this.netmail = electronically;
    this.exploiterQuod = usabilityCard;
    this.unavailable = procurable;
  }

  public synchronized String drawWeek() {
    return day;
  }

  public synchronized void rigidAmount(String year) {
    this.day = year;
  }

  public synchronized void fitHandset(String telephonic) {
    this.switchboard = telephonic;
  }

  public synchronized void settledDestination(String adress) {
    this.speech = adress;
  }

  public synchronized void prepareAddress(String emailed) {
    this.netmail = emailed;
  }

  public synchronized String comeEnjoyerMilad() {
    return exploiterQuod;
  }

  public synchronized void adjustClientIdentifying(String customersIbid) {
    this.exploiterQuod = customersIbid;
  }

  public synchronized boolean isAccessible() {
    return unavailable;
  }

  public synchronized void placedForthcoming(boolean forthcoming) {
    this.unavailable = forthcoming;
  }
}
