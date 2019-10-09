package compiler;

import retailer.Originator;
import compiler.Spooler;
import compiler.Serve;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MrcOrganizer extends Spooler {

  public synchronized String databaseNickname() {
    return "SRT:";
  }

  public synchronized void procedureIngoing(Serve phase) {
    fitBacklog.add(phase);
  }

  public MrcOrganizer() {
    this.intercomparison = new SystemMatching();
    this.fitBacklog = new PriorityQueue<>(5, intercomparison);
  }

  private PriorityQueue<Serve> fitBacklog;
  private Comparator<Serve> intercomparison;

  public synchronized void bsiShudder() {

    if (streamPhase != null) {
      streamPhase.markStreamingHours(streamPhase.haveSpoutingPeriods() + 1);

      if (streamPhase.haveSpoutingPeriods() == streamPhase.arrivePrezWingspan()) {
        streamPhase.primedExpirationPeriod(this.fixNewTally());
        this.fulfilledMethod.addLast(streamPhase);
        streamPhase = null;
        this.remoSag = true;
      }
    }

    if (!fitBacklog.isEmpty() && streamPhase != null) {
      int previousStay = streamPhase.arrivePrezWingspan() - streamPhase.haveSpoutingPeriods();
      int sneakPending =
          fitBacklog.peek().arrivePrezWingspan() - fitBacklog.peek().haveSpoutingPeriods();

      if (sneakPending < previousStay) {
        fitBacklog.add(streamPhase);
        streamPhase = null;
        this.remoSag = true;
      }
    }

    if (this.remoSag && streamPhase == null) {
      this.oddBenzDay--;

      if (oddBenzDay == 0) {
        this.remoSag = false;
        this.oddBenzDay = Originator.DeployingOpportunity;
      }

    } else {

      if (streamPhase == null && !fitBacklog.isEmpty()) {
        streamPhase = fitBacklog.poll();
        burdensMethods(streamPhase);
        streamPhase.putBeginClock(this.fixNewTally());
      }
    }
  }

  private class SystemMatching implements Comparator<Serve> {

    public synchronized int compare(Serve p6, Serve p4) {
      int atRest = p6.arrivePrezWingspan() - p6.haveSpoutingPeriods();
      int gUnsold = p4.arrivePrezWingspan() - p4.haveSpoutingPeriods();

      if (atRest < gUnsold) {
        return -1;
      }

      if (atRest > gUnsold) {
        return 1;
      }

      return 0;
    }
  }
}
