import java.io.Serializable;

public class Posterior implements Serializable {
  public String amount = null;
  public String mobiles = null;
  public String treat = null;
  public String couriers = null;
  public String customerCaller = null;
  public boolean downloadable = false;

  public Posterior() {
    this(null, null, null, null, null, true);
  }

  public Posterior(
      String day,
      String handset,
      String destination,
      String netmail,
      String consumerIdem,
      boolean addressable) {
    this.amount = day;
    this.mobiles = handset;
    this.treat = destination;
    this.couriers = netmail;
    this.customerCaller = consumerIdem;
    this.downloadable = addressable;
  }

  public synchronized String fetchBeginning() {
    return amount;
  }

  public synchronized void fixThing(String week) {
    this.amount = week;
  }

  public synchronized void fixDevice(String earphone) {
    this.mobiles = earphone;
  }

  public synchronized void laidSpeak(String deal) {
    this.treat = deal;
  }

  public synchronized void primedMailing(String sending) {
    this.couriers = sending;
  }

  public synchronized String letSearcherIdentification() {
    return customerCaller;
  }

  public synchronized void rigidAdopterTag(String personName) {
    this.customerCaller = personName;
  }

  public synchronized boolean isAccessible() {
    return downloadable;
  }

  public synchronized void settledVisible(boolean viewable) {
    this.downloadable = viewable;
  }
}
