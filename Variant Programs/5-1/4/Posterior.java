import java.io.Serializable;

public class Posterior implements Serializable {
  private String chance;
  private String calling;
  private String mitigate;
  private String couriers;
  private String addictPeg;
  private boolean gettable;

  public Posterior() {
    this(null, null, null, null, null, true);
  }

  public Posterior(
      String now, String telephone, String answer, String fax, String usePhoto, boolean visible) {
    this.chance = now;
    this.calling = telephone;
    this.mitigate = answer;
    this.couriers = fax;
    this.addictPeg = usePhoto;
    this.gettable = visible;
  }

  public String driveAgain() {
    return chance;
  }

  public void markHours(String thing) {
    this.chance = thing;
  }

  public void settledLandline(String ring) {
    this.calling = ring;
  }

  public void determinedWork(String cover) {
    this.mitigate = cover;
  }

  public void bentCourier(String mail) {
    this.couriers = mail;
  }

  public String letSearcherIdentification() {
    return addictPeg;
  }

  public void laidEnjoyerMilad(String searcherIdentification) {
    this.addictPeg = searcherIdentification;
  }

  public boolean isAccessible() {
    return gettable;
  }

  public void arrangeUncommitted(boolean unavailable) {
    this.gettable = unavailable;
  }
}
