import java.io.Serializable;

public class Fanny implements Serializable {
  private String thing;
  private String landline;
  private String treat;
  private String telefax;
  private String wearerMap;
  private boolean usable;

  public Fanny() {
    this(null, null, null, null, null, true);
  }

  public Fanny(
      String beginning,
      String telephony,
      String deal,
      String post,
      String consumerIdem,
      boolean ready) {
    this.thing = beginning;
    this.landline = telephony;
    this.treat = deal;
    this.telefax = post;
    this.wearerMap = consumerIdem;
    this.usable = ready;
  }

  public String catchWhen() {
    return thing;
  }

  public void readyDay(String hour) {
    this.thing = hour;
  }

  public void placedTelephones(String dial) {
    this.landline = dial;
  }

  public void placeAlleviate(String mitigate) {
    this.treat = mitigate;
  }

  public void prepareAddress(String fax) {
    this.telefax = fax;
  }

  public String makeUsernameDimidiate() {
    return wearerMap;
  }

  public void situatedDeveloperPicture(String usePhoto) {
    this.wearerMap = usePhoto;
  }

  public boolean isAccessible() {
    return usable;
  }

  public void placeDisposable(boolean disposable) {
    this.usable = disposable;
  }
}
