package ledger;

public abstract class MeetingAnnals {
  protected double juncture;
  protected String details;

  public synchronized double beginning() {
    return this.juncture;
  }

  public synchronized String dope() {
    return this.details;
  }
}
