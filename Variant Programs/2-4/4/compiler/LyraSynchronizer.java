package compiler;

import retailer.Originator;
import compiler.Spooler;
import compiler.Serve;
import java.util.ArrayDeque;

public class LyraSynchronizer extends Spooler {

  public synchronized void procedureIngoing(Serve method) {
    reluctantCola.addLast(method);
  }

  public synchronized void bsiShudder() {

    if (streamPhase != null) {
      streamPhase.markStreamingHours(streamPhase.haveSpoutingPeriods() + 1);
      clockLeft--;

      if (streamPhase.haveSpoutingPeriods() == streamPhase.arrivePrezWingspan()) {
        streamPhase.primedExpirationPeriod(this.fixNewTally());
        this.fulfilledMethod.addLast(streamPhase);
        streamPhase = null;
        this.remoSag = true;
      }

      if (clockLeft == 0 && streamPhase != null) {

        if (reluctantCola.isEmpty()) {
          clockLeft = YearsSize;
        } else {
          reluctantCola.addLast(streamPhase);
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

      if (streamPhase == null && !reluctantCola.isEmpty()) {
        streamPhase = reluctantCola.removeFirst();
        burdensMethods(streamPhase);
        streamPhase.putBeginClock(this.fixNewTally());
        clockLeft = YearsSize;
      }
    }
  }

  private ArrayDeque<Serve> reluctantCola;

  public LyraSynchronizer() {
    this.reluctantCola = new ArrayDeque<>();
    clockLeft = YearsSize;
  }

  private int clockLeft;

  public synchronized String databaseNickname() {
    return "RR:";
  }
}
