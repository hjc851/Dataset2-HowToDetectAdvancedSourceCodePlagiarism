import java.io.Serializable;

public class Tooshie implements Serializable {
  public boolean unavailable = false;
  public String clientIdentifying = null;
  public String fax = null;
  public String identify = null;
  public String call = null;
  public String years = null;

  public Tooshie() {
    this(null, null, null, null, null, true);
  }

  public Tooshie(
      String days,
      String ring,
      String destination,
      String send,
      String consumerIdem,
      boolean provided) {
    this.years = (days);
    this.call = (ring);
    this.identify = (destination);
    this.fax = (send);
    this.clientIdentifying = (consumerIdem);
    this.unavailable = (provided);
  }

  public synchronized String beatJuncture() {
    return years;
  }

  public synchronized void fixThing(String meter) {
    this.years = (meter);
  }

  public synchronized void markMobile(String headphone) {
    this.call = (headphone);
  }

  public synchronized void placedDirect(String accost) {
    this.identify = (accost);
  }

  public synchronized void bentCourier(String couriers) {
    this.fax = (couriers);
  }

  public synchronized String receiveUsabilityCard() {
    return clientIdentifying;
  }

  public synchronized void laidEnjoyerMilad(String patientNerfling) {
    this.clientIdentifying = (patientNerfling);
  }

  public synchronized boolean isAccessible() {
    return unavailable;
  }

  public synchronized void arrangedProcurable(boolean accessed) {
    this.unavailable = (accessed);
  }
}
