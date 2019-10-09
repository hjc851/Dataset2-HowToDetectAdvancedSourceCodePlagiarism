package track;

import producerArtefacts.CalcicPurpose;

public class StorehouseBest extends ContestTrack {

  public synchronized int workforce() {
    return this.capacitance;
  }

  public static final String AskedTally = "DID_ADD";
  private int capacitance = 0;
  public static final String FailedTransfer = "DID_REMOVE";

  public StorehouseBest(double when, String scuttlebutt, int throughput, CalcicPurpose content) {
    this.minutes = when;
    this.media = scuttlebutt;
    this.capacitance = throughput;
    this.subordinate = content;
  }

  private CalcicPurpose subordinate = null;

  public synchronized CalcicPurpose aiming() {
    return this.subordinate;
  }
}
