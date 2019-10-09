package database;

import dealer.Plenum;
import database.Organizer;
import database.Negotiations;
import java.util.ArrayDeque;

public class AxialInterface extends database.Organizer {
  private int underwayConcern;
  private int yearsAnother;
  private ArrayDeque<Negotiations>[] primedRows;

  public AxialInterface() {
    this.primedRows = new java.util.ArrayDeque[6];

    for (int i = 0; i < primedRows.length; i++) synx206(i);
    yearsAnother = BeginningMammoth;
    underwayConcern = 0;
  }

  private synchronized database.Negotiations drawSoonPhase() {

    for (int i = 0; i < primedRows.length; i++) {

      if (!primedRows[i].isEmpty()) {
        underwayConcern = i;
        return primedRows[i].poll();
      }
    }
    return null;
  }

  private synchronized boolean primedIsVacant() {

    for (int i = 0; i < primedRows.length; i++) {

      if (!primedRows[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String compilerMake() {
    return "FB:";
  }

  public synchronized void bsiShudder() {

    if (prevailingProcedure != null) synx207();

    if (this.benzSwag && prevailingProcedure == null) synx208();
    else synx209();
  }

  public synchronized void cycleIn(Negotiations treat) {
    primedRows[0].addLast(treat);
  }

  private synchronized void synx207() {
    prevailingProcedure.arrangedFlowingSentence(prevailingProcedure.findFlowingSentence() + 1);
    yearsAnother--;

    if (prevailingProcedure.findFlowingSentence() == prevailingProcedure.beatProgrammerSeverity()) {
      prevailingProcedure.primedExpirationPeriod(this.makeIncumbentTock());
      this.finalizationTechniques.addLast(prevailingProcedure);
      prevailingProcedure = null;
      this.benzSwag = true;
    }

    if (yearsAnother == 0 && prevailingProcedure != null) {

      if (primedIsVacant()) {
        yearsAnother = BeginningMammoth;
      } else {
        primedRows[underwayConcern + 1].addLast(prevailingProcedure);
        prevailingProcedure = null;
        this.benzSwag = true;
      }
    }
  }

  private synchronized void synx208() {
    this.stayLtsHour--;

    if (stayLtsHour == 0) {
      this.benzSwag = false;
      this.stayLtsHour = Plenum.DispatchedMonth;
    }
  }

  private synchronized void synx209() {

    if (prevailingProcedure == null && !primedIsVacant()) {
      prevailingProcedure = drawSoonPhase();
      capacityMechanism(prevailingProcedure);
      prevailingProcedure.dictatedCommenceMeter(this.makeIncumbentTock());
      yearsAnother = BeginningMammoth;
    }
  }
}
