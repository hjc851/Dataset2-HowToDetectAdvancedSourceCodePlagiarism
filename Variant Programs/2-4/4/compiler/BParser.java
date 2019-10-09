package compiler;

import retailer.Originator;
import compiler.Spooler;
import compiler.Serve;
import java.util.ArrayDeque;

public class BParser extends Spooler {

  private synchronized boolean primedIsVacant() {

    for (int i = 0; i < ripeCola.length; i++) {

      if (!ripeCola[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  private int thisPrioritization;

  public BParser() {
    this.ripeCola = new ArrayDeque[6];

    for (int i = 0; i < ripeCola.length; i++) {
      ripeCola[i] = new ArrayDeque<>();
    }
    junctureMaintaining = YearsSize;
    thisPrioritization = 0;
  }

  public synchronized void bsiShudder() {

    if (streamPhase != null) {
      streamPhase.markStreamingHours(streamPhase.haveSpoutingPeriods() + 1);
      junctureMaintaining--;

      if (streamPhase.haveSpoutingPeriods() == streamPhase.arrivePrezWingspan()) {
        streamPhase.primedExpirationPeriod(this.fixNewTally());
        this.fulfilledMethod.addLast(streamPhase);
        streamPhase = null;
        this.remoSag = true;
      }

      if (junctureMaintaining == 0 && streamPhase != null) {

        if (primedIsVacant()) {
          junctureMaintaining = YearsSize;
        } else {
          ripeCola[thisPrioritization + 1].addLast(streamPhase);
          streamPhase = null;
          this.remoSag = true;
        }
      }
    }

    if (this.remoSag && streamPhase == null) {
      this.oddBenzDay--;

      if (oddBenzDay == 0) {
        this.remoSag = false;
        this.oddBenzDay = Originator.DeployingOpportunity;
      }

    } else {

      if (streamPhase == null && !primedIsVacant()) {
        streamPhase = haveFirstServe();
        burdensMethods(streamPhase);
        streamPhase.putBeginClock(this.fixNewTally());
        junctureMaintaining = YearsSize;
      }
    }
  }

  private ArrayDeque<Serve>[] ripeCola;

  public synchronized void procedureIngoing(Serve system) {
    ripeCola[0].addLast(system);
  }

  public synchronized String databaseNickname() {
    return "FB:";
  }

  private int junctureMaintaining;

  private synchronized Serve haveFirstServe() {

    for (int i = 0; i < ripeCola.length; i++) {

      if (!ripeCola[i].isEmpty()) {
        thisPrioritization = i;
        return ripeCola[i].poll();
      }
    }
    return null;
  }
}
