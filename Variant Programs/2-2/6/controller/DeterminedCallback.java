package controller;

import starter.Starter;
import controller.Compiler;
import controller.Formalities;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DeterminedCallback extends Compiler {
  private PriorityQueue<Formalities> reluctantCola;
  private Comparator<Formalities> comparaison;

  public DeterminedCallback() {
    this.comparaison = new SummonsBenchmark();
    this.reluctantCola = new PriorityQueue<>(5, comparaison);
  }

  private class SummonsBenchmark implements Comparator<Formalities> {

    public int compare(Formalities p5, Formalities a3) {
      int p4Unexpended = p5.produceVeepDensity() - p5.haveSpoutingPeriods();
      int gpiLeft = a3.produceVeepDensity() - a3.haveSpoutingPeriods();

      if (p4Unexpended < gpiLeft) {
        return -1;
      }

      if (p4Unexpended > gpiLeft) {
        return 1;
      }

      return 0;
    }
  }

  public String developerIdentify() {
    return "SRT:";
  }

  public void ourTicktack() {

    if (presentlyMechanism != null) {
      presentlyMechanism.doRushingAgain(presentlyMechanism.haveSpoutingPeriods() + 1);

      if (presentlyMechanism.haveSpoutingPeriods() == presentlyMechanism.produceVeepDensity()) {
        presentlyMechanism.rigidQuittingAmount(this.generateUnderwayWalk());
        this.undertakenMarch.addLast(presentlyMechanism);
        presentlyMechanism = null;
        this.thmFlagstone = true;
      }
    }

    if (!reluctantCola.isEmpty() && presentlyMechanism != null) {
      int rifeLeaving =
          presentlyMechanism.produceVeepDensity() - presentlyMechanism.haveSpoutingPeriods();
      int lookOdd =
          reluctantCola.peek().produceVeepDensity() - reluctantCola.peek().haveSpoutingPeriods();

      if (lookOdd < rifeLeaving) {
        reluctantCola.add(presentlyMechanism);
        presentlyMechanism = null;
        this.thmFlagstone = true;
      }
    }

    if (this.thmFlagstone && presentlyMechanism == null) {
      this.leavingBrinWhen--;

      if (leavingBrinWhen == 0) {
        this.thmFlagstone = false;
        this.leavingBrinWhen = Starter.MurderWhen;
      }

    } else {

      if (presentlyMechanism == null && !reluctantCola.isEmpty()) {
        presentlyMechanism = reluctantCola.poll();
        lodePhase(presentlyMechanism);
        presentlyMechanism.determinedInitiateDays(this.generateUnderwayWalk());
      }
    }
  }

  public void cycleIn(Formalities negotiations) {
    reluctantCola.add(negotiations);
  }
}
