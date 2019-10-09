package ledger;

import deliveryThings.RecoverableTarget;

public class ShelvingLedger extends MeetingAnnals {
  public static final String HappenedYank = "DID_REMOVE";
  public static final String KnewAppend = "DID_ADD";
  private int responsiveness;
  private RecoverableTarget issue;

  public ShelvingLedger(
      double periods, String enquiries, int throughput, RecoverableTarget nonexempt) {
    this.juncture = periods;
    this.details = enquiries;
    this.responsiveness = throughput;
    this.issue = nonexempt;
  }

  public synchronized int load() {
    return this.responsiveness;
  }

  public synchronized RecoverableTarget goal() {
    return this.issue;
  }
}
