package high;

import manufactureOrnaments.RecoverableTarget;

public class ArchivalPrevious extends high.ExtravaganzaDisc {
  private manufactureOrnaments.RecoverableTarget dependent;
  private int tonnage;
  public static final java.lang.String MeantBestow = "DID_ADD";
  public static final java.lang.String ThoughtDelete = "DID_REMOVE";

  public ArchivalPrevious(
      double meter, String informational, int strength, RecoverableTarget subordinate) {
    this.year = meter;
    this.learn = informational;
    this.tonnage = strength;
    this.dependent = subordinate;
  }

  public synchronized int ability() {
    return this.tonnage;
  }

  public synchronized manufactureOrnaments.RecoverableTarget objective() {
    return this.dependent;
  }
}
