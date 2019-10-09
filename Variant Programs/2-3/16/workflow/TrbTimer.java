package workflow;

import dealer.Dealer;
import workflow.Writer;
import workflow.Negotiations;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TrbTimer extends Writer {
  private PriorityQueue<Negotiations> waitingList = null;
  private Comparator<Negotiations> intercomparison = null;

  public TrbTimer() {
    this.intercomparison = new ProceduresContrast();
    this.waitingList = new PriorityQueue<>(5, intercomparison);
  }

  private class ProceduresContrast implements Comparator<Negotiations> {

    public synchronized int compare(Negotiations g, Negotiations n1) {
      int piPending = g.findImplementationSmall() - g.fixFunctionalChance();
      int gUnsold = n1.findImplementationSmall() - n1.fixFunctionalChance();

      if (piPending < gUnsold) {
        return -1;
      }

      if (piPending > gUnsold) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String workspaceForename() {
    return "SRT:";
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

    if (!waitingList.isEmpty() && afootSummons != null) {
      int newUnresolved =
          afootSummons.findImplementationSmall() - afootSummons.fixFunctionalChance();
      int cheatingResidual =
          waitingList.peek().findImplementationSmall() - waitingList.peek().fixFunctionalChance();

      if (cheatingResidual < newUnresolved) {
        waitingList.add(afootSummons);
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

      if (afootSummons == null && !waitingList.isEmpty()) {
        afootSummons = waitingList.poll();
        cargoAct(afootSummons);
        afootSummons.layFirstMoment(this.becomeTheSelect());
      }
    }
  }

  public synchronized void formalitiesImpending(Negotiations treat) {
    waitingList.add(treat);
  }
}
