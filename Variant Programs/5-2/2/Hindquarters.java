import java.io.Serializable;

public class Hindquarters implements Serializable {
  private String meter;
  private String landline;
  private String adress;
  private String couriers;
  private String addictPeg;
  private boolean open;

  public Hindquarters() {
    this(null, null, null, null, null, true);
  }

  public Hindquarters(
      String periods,
      String caller,
      String speak,
      String send,
      String exploiterQuod,
      boolean downloadable) {
    this.meter = periods;
    this.landline = caller;
    this.adress = speak;
    this.couriers = send;
    this.addictPeg = exploiterQuod;
    this.open = downloadable;
  }

  public String becomeOpportunity() {
    return meter;
  }

  public void fixedOpportunity(String when) {
    this.meter = when;
  }

  public void determineTelephonic(String mobiles) {
    this.landline = mobiles;
  }

  public void primedAccost(String fix) {
    this.adress = fix;
  }

  public void putNetmail(String mail) {
    this.couriers = mail;
  }

  public String developAddictPeg() {
    return addictPeg;
  }

  public void putExploiterQuod(String wearerMap) {
    this.addictPeg = wearerMap;
  }

  public boolean isAccessible() {
    return open;
  }

  public void putAccessible(boolean distributed) {
    this.open = distributed;
  }
}
