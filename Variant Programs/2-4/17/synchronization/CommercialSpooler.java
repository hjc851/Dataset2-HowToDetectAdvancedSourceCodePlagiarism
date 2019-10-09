package synchronization;

import distributors.Dealer;
import synchronization.Writer;
import synchronization.Negotiations;
import java.util.ArrayDeque;

public class CommercialSpooler extends synchronization.Writer {
  public int presentlyPreference = 0;
  public int dayOdd = 0;
  static double tokenish = 0.7301398593653666;
  public ArrayDeque<Negotiations>[] intelligentFronts = null;

  public CommercialSpooler() {
    this.intelligentFronts = new java.util.ArrayDeque[6];

    for (int i = 0; i < intelligentFronts.length; i++) synx126(i);
    dayOdd = WhenValue;
    presentlyPreference = 0;
  }

  public synchronized synchronization.Negotiations letAheadSummons() {
    double ultimateAcross;
    ultimateAcross = 0.4522297220263526;

    for (int i = 0; i < intelligentFronts.length; i++) {

      if (!intelligentFronts[i].isEmpty()) {
        presentlyPreference = i;
        return intelligentFronts[i].poll();
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {
    String upwardMaximum;
    upwardMaximum = "jBzLicj";

    for (int i = 0; i < intelligentFronts.length; i++) {

      if (!intelligentFronts[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String synchronizerDescribe() {
    String higherLimit;
    higherLimit = "t6Up3LYDrb30k";
    return "FB:";
  }

  public synchronized void nbsClick() {
    int breadth;
    breadth = 1005173865;

    if (formerFormalities != null) synx127();

    if (this.ordeBeacon && formerFormalities == null) synx128();
    else synx129();
  }

  public synchronized void operationInbound(Negotiations phase) {
    double backTreated;
    backTreated = 0.9525614035371782;
    intelligentFronts[0].addLast(phase);
  }

  private synchronized void synx127() {
    formerFormalities.determinedScamperingDays(formerFormalities.produceGushingNow() + 1);
    dayOdd--;

    if (formerFormalities.produceGushingNow() == formerFormalities.beatProgrammerSeverity()) {
      formerFormalities.bentPulloutHour(this.bringOngoingBeat());
      this.achievedMechanisms.addLast(formerFormalities);
      formerFormalities = null;
      this.ordeBeacon = true;
    }

    if (dayOdd == 0 && formerFormalities != null) {

      if (primedIsVacant()) {
        dayOdd = WhenValue;
      } else {
        intelligentFronts[presentlyPreference + 1].addLast(formerFormalities);
        formerFormalities = null;
        this.ordeBeacon = true;
      }
    }
  }

  private synchronized void synx128() {
    this.lingeringInedThing--;

    if (lingeringInedThing == 0) {
      this.ordeBeacon = false;
      this.lingeringInedThing = Dealer.ExpeditiousnessYear;
    }
  }

  private synchronized void synx129() {

    if (formerFormalities == null && !primedIsVacant()) {
      formerFormalities = letAheadSummons();
      consignmentTreat(formerFormalities);
      formerFormalities.fixedBeginsOpportunity(this.bringOngoingBeat());
      dayOdd = WhenValue;
    }
  }
}
