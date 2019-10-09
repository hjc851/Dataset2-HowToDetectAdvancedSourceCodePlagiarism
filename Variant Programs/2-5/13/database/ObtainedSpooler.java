package database;

import vendor.Originator;
import database.Outliner;
import database.Proceeding;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ObtainedSpooler extends database.Outliner {
  private java.util.PriorityQueue<Proceeding> cookCue = null;
  private java.util.Comparator<Proceeding> intercomparison = null;

  public ObtainedSpooler() {
    this.intercomparison = new NegotiationsWitness();
    this.cookCue = new java.util.PriorityQueue<>(5, intercomparison);
  }

  private class NegotiationsWitness implements Comparator<Proceeding> {

    public synchronized int compare(Proceeding b, Proceeding p4) {
      int piPending = b.findImplementationSmall() - b.haveSpoutingPeriods();
      int mKeeping = p4.findImplementationSmall() - p4.haveSpoutingPeriods();

      if (piPending < mKeeping) {
        return -1;
      }

      if (piPending > mKeeping) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String databaseNickname() {
    return "SRT:";
  }

  public synchronized void optiBeat() {

    if (afootSummons != null) synx153();

    if (!cookCue.isEmpty() && afootSummons != null) synx154();

    if (this.fellyAlert && afootSummons == null) synx155();
    else synx156();
  }

  public synchronized void phaseEntry(Proceeding serve) {
    cookCue.add(serve);
  }

  private synchronized void synx153() {
    afootSummons.rigidWalkingAmount(afootSummons.haveSpoutingPeriods() + 1);

    if (afootSummons.haveSpoutingPeriods() == afootSummons.findImplementationSmall()) {
      afootSummons.determineWithdrawBeginning(this.goPrevailingClick());
      this.doneAppendage.addLast(afootSummons);
      afootSummons = null;
      this.fellyAlert = true;
    }
  }

  private synchronized void synx154() {
    int circulatingRest =
        afootSummons.findImplementationSmall() - afootSummons.haveSpoutingPeriods();
    int lookOdd = cookCue.peek().findImplementationSmall() - cookCue.peek().haveSpoutingPeriods();

    if (lookOdd < circulatingRest) {
      cookCue.add(afootSummons);
      afootSummons = null;
      this.fellyAlert = true;
    }
  }

  private synchronized void synx155() {
    this.additionalDikMonth--;

    if (additionalDikMonth == 0) {
      this.fellyAlert = false;
      this.additionalDikMonth = Originator.RoutingWeek;
    }
  }

  private synchronized void synx156() {

    if (afootSummons == null && !cookCue.isEmpty()) {
      afootSummons = cookCue.poll();
      ladenWork(afootSummons);
      afootSummons.fixedBeginsOpportunity(this.goPrevailingClick());
    }
  }
}
