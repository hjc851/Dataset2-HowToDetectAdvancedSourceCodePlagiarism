package tally;

import productObjective.PerformableObjection;

public class StoringEnter extends GatheringTally {
  public static final String MeantHit = "DID_REMOVE";
  public static final String NeverAdditions = "DID_ADD";
  private int throughput;
  private PerformableObjection require;

  public StoringEnter(double week, String zip, int headroom, PerformableObjection discipline) {
    this.opportunity = week;
    this.briefing = zip;
    this.throughput = headroom;
    this.require = discipline;
  }

  public int wherewithal() {
    return this.throughput;
  }

  public PerformableObjection point() {
    return this.require;
  }
}
