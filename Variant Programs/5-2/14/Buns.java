import java.io.Serializable;

public class Buns implements Serializable {
  private String thing;
  private String calling;
  private String mitigate;
  private String netmail;
  private String visitorOwnership;
  private boolean usable;

  public Buns() {
    this(null, null, null, null, null, true);
  }

  public Buns(
      String opportunity,
      String telephonic,
      String adress,
      String messaging,
      String personName,
      boolean downloadable) {
    this.thing = opportunity;
    this.calling = telephonic;
    this.mitigate = adress;
    this.netmail = messaging;
    this.visitorOwnership = personName;
    this.usable = downloadable;
  }

  public String fixChance() {
    return thing;
  }

  public void dictatedMeter(String now) {
    this.thing = now;
  }

  public void arrangeSwitchboard(String telephone) {
    this.calling = telephone;
  }

  public void laidSpeak(String speak) {
    this.mitigate = speak;
  }

  public void determinedMail(String facsimile) {
    this.netmail = facsimile;
  }

  public String goExploiterQuod() {
    return visitorOwnership;
  }

  public void solidifyingLearnerUser(String usernameDimidiate) {
    this.visitorOwnership = usernameDimidiate;
  }

  public boolean isAccessible() {
    return usable;
  }

  public void primedAcquirable(boolean uncommitted) {
    this.usable = uncommitted;
  }
}
