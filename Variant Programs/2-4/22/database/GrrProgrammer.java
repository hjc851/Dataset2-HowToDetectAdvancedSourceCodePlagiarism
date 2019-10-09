package database;

import dealer.Plenum;
import database.Organizer;
import database.Negotiations;
import java.util.ArrayDeque;

public class GrrProgrammer extends database.Organizer {
  private database.GrrProcedure grrProcedure;
  private int hourStay;
  private java.util.ArrayDeque<GrrProcedure> fitBacklog;

  public GrrProgrammer() {
    this.fitBacklog = new java.util.ArrayDeque<>();
    hourStay = Organizer.BeginningMammoth;
  }

  public synchronized String compilerMake() {
    return "NRR:";
  }

  public synchronized void bsiShudder() {

    if (grrProcedure != null) synx203();

    if (this.benzSwag && prevailingProcedure == null) synx204();
    else synx205();
  }

  public synchronized void cycleIn(Negotiations procedure) {
    fitBacklog.add(new database.GrrProcedure(procedure));
  }

  private synchronized void synx203() {
    grrProcedure.arrangedFlowingSentence(grrProcedure.findFlowingSentence() + 1);
    hourStay--;

    if (grrProcedure.findFlowingSentence() == grrProcedure.beatProgrammerSeverity()) {
      grrProcedure.primedExpirationPeriod(this.makeIncumbentTock());
      this.finalizationTechniques.addLast(grrProcedure);
      grrProcedure = null;
      this.benzSwag = true;
    }

    if (hourStay == 0 && grrProcedure != null) {

      if (fitBacklog.isEmpty()) {
        hourStay = grrProcedure.catchWhenValue();
      } else {

        if (grrProcedure.catchWhenValue() > 2) {
          grrProcedure.arrangedSentenceTeleportation(grrProcedure.catchWhenValue() - 1);
        }

        fitBacklog.addLast(grrProcedure);
        grrProcedure = null;
        this.benzSwag = true;
      }
    }
  }

  private synchronized void synx204() {
    this.stayLtsHour--;

    if (stayLtsHour == 0) {
      this.benzSwag = false;
      this.stayLtsHour = Plenum.DispatchedMonth;
    }
  }

  private synchronized void synx205() {

    if (grrProcedure == null && !fitBacklog.isEmpty()) {
      grrProcedure = fitBacklog.removeFirst();
      capacityMechanism(grrProcedure);
      grrProcedure.dictatedCommenceMeter(this.makeIncumbentTock());
      hourStay = grrProcedure.catchWhenValue();
    }
  }

  private synchronized void synx206(int i) {
    primedRows[i] = new java.util.ArrayDeque<>();
  }
}
