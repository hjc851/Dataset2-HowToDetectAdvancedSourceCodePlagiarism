package histories;

import manufactureOrnaments.InterpretableResist;

public class SpaceTally extends CarnivalDisk {
  private InterpretableResist pending;
  private int load;
  public static final String DaredSummate = "DID_ADD";
  public static final String KnewAbsent = "DID_REMOVE";

  public SpaceTally(
      double beginning, String informational, int responsiveness, InterpretableResist subordinate) {
    this.meter = beginning;
    this.briefing = informational;
    this.load = responsiveness;
    this.pending = subordinate;
  }

  public synchronized int facilities() {
    return this.load;
  }

  public synchronized InterpretableResist butt() {
    return this.pending;
  }
}
