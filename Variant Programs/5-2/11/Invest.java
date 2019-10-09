import java.io.Serializable;

public class Invest implements Serializable {
  private String when;
  private String landline;
  private String adress;
  private String postal;
  private String searcherIdentification;
  private boolean usable;

  public Invest() {
    this(null, null, null, null, null, true);
  }

  public Invest(
      String years, String caller, String speech, String mail, String usePhoto, boolean accessed) {
    this.when = years;
    this.landline = caller;
    this.adress = speech;
    this.postal = mail;
    this.searcherIdentification = usePhoto;
    this.usable = accessed;
  }

  public String canYears() {
    return when;
  }

  public void placedWhen(String year) {
    this.when = year;
  }

  public void readyRing(String call) {
    this.landline = call;
  }

  public void fixedResolve(String plow) {
    this.adress = plow;
  }

  public void rigidCouriers(String post) {
    this.postal = post;
  }

  public String drawPersonName() {
    return searcherIdentification;
  }

  public void placedCustomersIbid(String adopterTag) {
    this.searcherIdentification = adopterTag;
  }

  public boolean isAccessible() {
    return usable;
  }

  public void determineDistributed(boolean availability) {
    this.usable = availability;
  }
}
