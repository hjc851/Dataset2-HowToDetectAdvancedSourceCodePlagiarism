package compiler;

import retailer.Originator;
import compiler.Spooler;
import compiler.Serve;
import java.util.ArrayDeque;

public class GrrProgrammer extends Spooler {

  public synchronized void bsiShudder() {

    if (grrProcedure != null) {
      grrProcedure.markStreamingHours(grrProcedure.haveSpoutingPeriods() + 1);
      periodFinal--;

      if (grrProcedure.haveSpoutingPeriods() == grrProcedure.arrivePrezWingspan()) {
        grrProcedure.primedExpirationPeriod(this.fixNewTally());
        this.fulfilledMethod.addLast(grrProcedure);
        grrProcedure = null;
        this.remoSag = true;
      }

      if (periodFinal == 0 && grrProcedure != null) {

        if (availableFile.isEmpty()) {
          periodFinal = grrProcedure.makeDaySum();
        } else {

          if (grrProcedure.makeDaySum() > 2) {
            grrProcedure.placeWeekVolume(grrProcedure.makeDaySum() - 1);
          }

          availableFile.addLast(grrProcedure);
          grrProcedure = null;
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

      if (grrProcedure == null && !availableFile.isEmpty()) {
        grrProcedure = availableFile.removeFirst();
        burdensMethods(grrProcedure);
        grrProcedure.putBeginClock(this.fixNewTally());
        periodFinal = grrProcedure.makeDaySum();
      }
    }
  }

  public GrrProgrammer() {
    this.availableFile = new ArrayDeque<>();
    periodFinal = Spooler.YearsSize;
  }

  public synchronized void procedureIngoing(Serve act) {
    availableFile.add(new GrrProcedure(act));
  }

  private int periodFinal;
  private GrrProcedure grrProcedure;

  public synchronized String databaseNickname() {
    return "NRR:";
  }

  private ArrayDeque<GrrProcedure> availableFile;
}
