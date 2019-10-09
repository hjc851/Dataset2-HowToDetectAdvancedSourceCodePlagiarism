package commemorate;

public abstract class MeetingAnnals {

  public synchronized double minutes() {
    return this.periods;
  }

  public synchronized String briefing() {
    return this.stuff;
  }

  public double periods = 0.0;
  public String stuff = null;
}
