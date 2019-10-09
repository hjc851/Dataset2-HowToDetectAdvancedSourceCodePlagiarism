package tally;

public abstract class GatheringTally {
  protected double opportunity;
  protected String briefing;

  public double minutes() {
    return this.opportunity;
  }

  public String update() {
    return this.briefing;
  }
}
