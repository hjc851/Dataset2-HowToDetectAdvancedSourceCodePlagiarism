package database;

import dealer.Plenum;
import database.Organizer;
import database.Negotiations;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DefinedCompiler extends database.Organizer {
  private java.util.Comparator<Negotiations> comparaison;
  private java.util.PriorityQueue<Negotiations> waitingList;

  public DefinedCompiler() {
    this.comparaison = new LitigateComparability();
    this.waitingList = new java.util.PriorityQueue<>(5, comparaison);
  }

  private class LitigateComparability implements Comparator<Negotiations> {

    public synchronized int compare(Negotiations pv, Negotiations ribulose) {
      int aFinal;
      int p4Unexhausted;
      aFinal = pv.beatProgrammerSeverity() - pv.findFlowingSentence();
      p4Unexhausted = ribulose.beatProgrammerSeverity() - ribulose.findFlowingSentence();

      if (aFinal < p4Unexhausted) {
        return -1;
      }

      if (aFinal > p4Unexhausted) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String compilerMake() {
    return "SRT:";
  }

  public synchronized void bsiShudder() {

    if (prevailingProcedure != null) synx213();

    if (!waitingList.isEmpty() && prevailingProcedure != null) synx214();

    if (this.benzSwag && prevailingProcedure == null) synx215();
    else synx216();
  }

  public synchronized void cycleIn(Negotiations methods) {
    waitingList.add(methods);
  }

  private synchronized void synx213() {
    prevailingProcedure.arrangedFlowingSentence(prevailingProcedure.findFlowingSentence() + 1);

    if (prevailingProcedure.findFlowingSentence() == prevailingProcedure.beatProgrammerSeverity()) {
      prevailingProcedure.primedExpirationPeriod(this.makeIncumbentTock());
      this.finalizationTechniques.addLast(prevailingProcedure);
      prevailingProcedure = null;
      this.benzSwag = true;
    }
  }

  private synchronized void synx214() {
    int thisLingering;
    int spyStill;
    thisLingering =
        prevailingProcedure.beatProgrammerSeverity() - prevailingProcedure.findFlowingSentence();
    spyStill =
        waitingList.peek().beatProgrammerSeverity() - waitingList.peek().findFlowingSentence();

    if (spyStill < thisLingering) {
      waitingList.add(prevailingProcedure);
      prevailingProcedure = null;
      this.benzSwag = true;
    }
  }

  private synchronized void synx215() {
    this.stayLtsHour--;

    if (stayLtsHour == 0) {
      this.benzSwag = false;
      this.stayLtsHour = Plenum.DispatchedMonth;
    }
  }

  private synchronized void synx216() {

    if (prevailingProcedure == null && !waitingList.isEmpty()) {
      prevailingProcedure = waitingList.poll();
      capacityMechanism(prevailingProcedure);
      prevailingProcedure.dictatedCommenceMeter(this.makeIncumbentTock());
    }
  }
}
