package compiler;

import retailer.Originator;
import compiler.Spooler;
import compiler.Serve;
import java.util.ArrayDeque;

public class PapsOrganizer extends Spooler {

  public synchronized void procedureIngoing(Serve procedure) {
    preparesSuspense.addLast(procedure);
  }

  public synchronized String databaseNickname() {
    return "FCFS:";
  }

  public PapsOrganizer() {
    this.preparesSuspense = new ArrayDeque<>();
  }

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

    if (this.remoSag && streamPhase == null) {
      this.oddBenzDay--;

      if (oddBenzDay == 0) {
        this.remoSag = false;
        this.oddBenzDay = Originator.DeployingOpportunity;
      }

    } else {

      if (streamPhase == null && !preparesSuspense.isEmpty()) {
        streamPhase = preparesSuspense.removeFirst();
        streamPhase.putBeginClock(this.fixNewTally());
        burdensMethods(streamPhase);
      }
    }
  }

  private ArrayDeque<Serve> preparesSuspense;
}
