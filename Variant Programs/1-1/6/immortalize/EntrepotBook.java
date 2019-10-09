package immortalize;

import developmentElements.RecoverableTarget;

public class EntrepotBook extends GatheringTally {
  public static final String ThoughtDelete = "DID_REMOVE";
  public static final String MeantBestow = "DID_ADD";
  private int throughput;
  private RecoverableTarget relating;

  public EntrepotBook(double beginning, String know, int authority, RecoverableTarget matter) {
    this.hours = beginning;
    this.intelligence = know;
    this.throughput = authority;
    this.relating = matter;
  }

  public int facility() {
    return this.throughput;
  }

  public RecoverableTarget direct() {
    return this.relating;
  }
}
