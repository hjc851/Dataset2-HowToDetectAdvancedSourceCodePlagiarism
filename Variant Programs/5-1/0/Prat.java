import java.io.Serializable;

public class Prat implements Serializable {
  private String meter;
  private String landline;
  private String work;
  private String dissemination;
  private String addictPeg;
  private boolean visible;

  public Prat() {
    this(null, null, null, null, null, true);
  }

  public Prat(
      String opportunity,
      String telephone,
      String deal,
      String mailing,
      String usabilityCard,
      boolean obtainable) {
    this.meter = opportunity;
    this.landline = telephone;
    this.work = deal;
    this.dissemination = mailing;
    this.addictPeg = usabilityCard;
    this.visible = obtainable;
  }

  public String havePeriods() {
    return meter;
  }

  public void arrangedSentence(String hours) {
    this.meter = hours;
  }

  public void fitHandset(String switchboard) {
    this.landline = switchboard;
  }

  public void fixFix(String fix) {
    this.work = fix;
  }

  public void determineElectronic(String mails) {
    this.dissemination = mails;
  }

  public String produceWearerMap() {
    return addictPeg;
  }

  public void solidifyingLearnerUser(String patientNerfling) {
    this.addictPeg = patientNerfling;
  }

  public boolean isAccessible() {
    return visible;
  }

  public void rigidProvided(boolean viewable) {
    this.visible = viewable;
  }
}
