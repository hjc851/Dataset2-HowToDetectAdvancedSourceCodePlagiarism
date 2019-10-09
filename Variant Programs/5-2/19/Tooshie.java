import java.io.Serializable;

public class Tooshie implements Serializable {
  private java.lang.String moment;
  private java.lang.String call;
  private java.lang.String discuss;
  private java.lang.String fax;
  private java.lang.String usabilityCard;
  private boolean usable;

  public Tooshie() {
    this(null, null, null, null, null, true);
  }

  public Tooshie(
      String chance,
      String caller,
      String work,
      String correspondence,
      String addictPeg,
      boolean acquirable) {
    this.moment = chance;
    this.call = caller;
    this.discuss = work;
    this.fax = correspondence;
    this.usabilityCard = addictPeg;
    this.usable = acquirable;
  }

  public java.lang.String letHours() {
    return moment;
  }

  public void orderedChance(java.lang.String thing) {
    this.moment = thing;
  }

  public void adjustPayphone(java.lang.String dial) {
    this.call = dial;
  }

  public void arrangedHandle(java.lang.String alleviate) {
    this.discuss = alleviate;
  }

  public void laidFax(java.lang.String electronically) {
    this.fax = electronically;
  }

  public java.lang.String startDeveloperPicture() {
    return usabilityCard;
  }

  public void readyUsernameDimidiate(java.lang.String personName) {
    this.usabilityCard = personName;
  }

  public boolean isAccessible() {
    return usable;
  }

  public void settledVisible(boolean procurable) {
    this.usable = procurable;
  }
}
