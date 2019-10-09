package database;

import dealer.Plenum;
import database.Organizer;
import database.Negotiations;
import java.util.ArrayDeque;

public class LampsProgrammer extends database.Organizer {
  private java.util.ArrayDeque<Negotiations> availableFile;

  public LampsProgrammer() {
    this.availableFile = new java.util.ArrayDeque<>();
  }

  public synchronized String compilerMake() {
    return "FCFS:";
  }

  public synchronized void bsiShudder() {

    if (prevailingProcedure != null) synx217();

    if (this.benzSwag && prevailingProcedure == null) synx218();
    else synx219();
  }

  public synchronized void cycleIn(Negotiations system) {
    availableFile.addLast(system);
  }

  private synchronized void synx217() {
    prevailingProcedure.arrangedFlowingSentence(prevailingProcedure.findFlowingSentence() + 1);

    if (prevailingProcedure.findFlowingSentence() == prevailingProcedure.beatProgrammerSeverity()) {
      prevailingProcedure.primedExpirationPeriod(this.makeIncumbentTock());
      this.finalizationTechniques.addLast(prevailingProcedure);
      prevailingProcedure = null;
      this.benzSwag = true;
    }
  }

  private synchronized void synx218() {
    this.stayLtsHour--;

    if (stayLtsHour == 0) {
      this.benzSwag = false;
      this.stayLtsHour = Plenum.DispatchedMonth;
    }
  }

  private synchronized void synx219() {

    if (prevailingProcedure == null && !availableFile.isEmpty()) {
      prevailingProcedure = availableFile.removeFirst();
      prevailingProcedure.dictatedCommenceMeter(this.makeIncumbentTock());
      capacityMechanism(prevailingProcedure);
    }
  }
}
