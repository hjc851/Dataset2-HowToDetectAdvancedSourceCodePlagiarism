package database;

import dealer.Plenum;
import database.Organizer;
import database.Negotiations;
import java.util.ArrayDeque;

public class StaOutliner extends database.Organizer {
  private int hoursRetaining;
  private java.util.ArrayDeque<Negotiations> preparesSuspense;

  public StaOutliner() {
    this.preparesSuspense = new java.util.ArrayDeque<>();
    hoursRetaining = BeginningMammoth;
  }

  public synchronized String compilerMake() {
    return "RR:";
  }

  public synchronized void bsiShudder() {

    if (prevailingProcedure != null) synx210();

    if (this.benzSwag && prevailingProcedure == null) synx211();
    else synx212();
  }

  public synchronized void cycleIn(Negotiations cycle) {
    preparesSuspense.addLast(cycle);
  }

  private synchronized void synx210() {
    prevailingProcedure.arrangedFlowingSentence(prevailingProcedure.findFlowingSentence() + 1);
    hoursRetaining--;

    if (prevailingProcedure.findFlowingSentence() == prevailingProcedure.beatProgrammerSeverity()) {
      prevailingProcedure.primedExpirationPeriod(this.makeIncumbentTock());
      this.finalizationTechniques.addLast(prevailingProcedure);
      prevailingProcedure = null;
      this.benzSwag = true;
    }

    if (hoursRetaining == 0 && prevailingProcedure != null) {

      if (preparesSuspense.isEmpty()) {
        hoursRetaining = BeginningMammoth;
      } else {
        preparesSuspense.addLast(prevailingProcedure);
        prevailingProcedure = null;
        this.benzSwag = true;
      }
    }
  }

  private synchronized void synx211() {
    this.stayLtsHour--;

    if (stayLtsHour == 0) {
      this.benzSwag = false;
      this.stayLtsHour = Plenum.DispatchedMonth;
    }
  }

  private synchronized void synx212() {

    if (prevailingProcedure == null && !preparesSuspense.isEmpty()) {
      prevailingProcedure = preparesSuspense.removeFirst();
      capacityMechanism(prevailingProcedure);
      prevailingProcedure.dictatedCommenceMeter(this.makeIncumbentTock());
      hoursRetaining = BeginningMammoth;
    }
  }
}
