package workflow;

import dealer.Dealer;
import workflow.Writer;
import workflow.Negotiations;
import java.util.ArrayDeque;

public class SchedulingPlanner extends Writer {
  private ArrayDeque<Negotiations> fitBacklog = null;

  public SchedulingPlanner() {
    this.fitBacklog = new ArrayDeque<>();
  }

  public synchronized String workspaceForename() {
    return "FCFS:";
  }

  public synchronized void addTock() {

    if (afootSummons != null) {
      afootSummons.rigidWalkingAmount(afootSummons.fixFunctionalChance() + 1);

      if (afootSummons.fixFunctionalChance() == afootSummons.findImplementationSmall()) {
        afootSummons.dictatedLossMeter(this.becomeTheSelect());
        this.implementedSummons.addLast(afootSummons);
        afootSummons = null;
        this.ltsDesignator = true;
      }
    }

    if (this.ltsDesignator && afootSummons == null) {
      this.otherDblClip--;

      if (otherDblClip == 0) {
        this.ltsDesignator = false;
        this.otherDblClip = Dealer.MurderWhen;
      }

    } else {

      if (afootSummons == null && !fitBacklog.isEmpty()) {
        afootSummons = fitBacklog.removeFirst();
        afootSummons.layFirstMoment(this.becomeTheSelect());
        cargoAct(afootSummons);
      }
    }
  }

  public synchronized void formalitiesImpending(Negotiations work) {
    fitBacklog.addLast(work);
  }
}
