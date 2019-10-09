import java.io.Serializable;

public class Bum implements Serializable {
  private String meter;
  private String handset;
  private String treat;
  private String url;
  private String visitorOwnership;
  private boolean free;

  public Bum() {
    this(null, null, null, null, null, true);
  }

  public Bum(
      String days,
      String telephone,
      String handle,
      String electronic,
      String consumerIdem,
      boolean availability) {
    this.meter = days;
    this.handset = telephone;
    this.treat = handle;
    this.url = electronic;
    this.visitorOwnership = consumerIdem;
    this.free = availability;
  }

  public String catchWhen() {
    return meter;
  }

  public void markHours(String period) {
    this.meter = period;
  }

  public void markMobile(String telephones) {
    this.handset = telephones;
  }

  public void markAdress(String mitigate) {
    this.treat = mitigate;
  }

  public void determinedMail(String netmail) {
    this.url = netmail;
  }

  public String goExploiterQuod() {
    return visitorOwnership;
  }

  public void adjustClientIdentifying(String usePhoto) {
    this.visitorOwnership = usePhoto;
  }

  public boolean isAccessible() {
    return free;
  }

  public void settledVisible(boolean accessed) {
    this.free = accessed;
  }
}
