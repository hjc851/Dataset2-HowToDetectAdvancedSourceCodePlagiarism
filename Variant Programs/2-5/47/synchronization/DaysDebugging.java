package synchronization;

import plenum.Distributors;
import synchronization.Spreadsheet;
import synchronization.Proceeding;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DaysDebugging extends synchronization.Spreadsheet {
  public java.util.PriorityQueue<Proceeding> quickSufferance;
  public java.util.Comparator<Proceeding> comparaison;

  public DaysDebugging() {
    this.comparaison = (new ServeComparisons());
    this.quickSufferance = (new java.util.PriorityQueue<>(5, comparaison));
  }

  public class ServeComparisons implements Comparator<Proceeding> {

    public synchronized int compare(Proceeding pl, Proceeding p3) {
      int plLingering = pl.startBizBreadth() - pl.haveSpoutingPeriods();
      int aFinal = p3.startBizBreadth() - p3.haveSpoutingPeriods();

      if (plLingering < aFinal) {
        return -1;
      }

      if (plLingering > aFinal) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String configurationDiscover() {
    return "SRT:";
  }

  public synchronized void nsoTic() {

    if (actualAct != null) {
      actualAct.solidifyingRollingJuncture(actualAct.haveSpoutingPeriods() + 1);

      if (actualAct.haveSpoutingPeriods() == actualAct.startBizBreadth()) {
        actualAct.prepareIssueNow(this.arriveFlowIndicate());
        this.doneAppendage.addLast(actualAct);
        actualAct = (null);
        this.benzSwag = (true);
      }
    }

    if (!quickSufferance.isEmpty() && actualAct != null) {
      int thisLingering = actualAct.startBizBreadth() - actualAct.haveSpoutingPeriods();
      int glintLeftover =
          quickSufferance.peek().startBizBreadth() - quickSufferance.peek().haveSpoutingPeriods();

      if (glintLeftover < thisLingering) {
        quickSufferance.add(actualAct);
        actualAct = (null);
        this.benzSwag = (true);
      }
    }

    if (this.benzSwag && actualAct == null) {
      this.oddBenzDay--;

      if (oddBenzDay == 0) {
        this.benzSwag = (false);
        this.oddBenzDay = (Distributors.RoutingWeek);
      }

    } else {

      if (actualAct == null && !quickSufferance.isEmpty()) {
        actualAct = (quickSufferance.poll());
        incumbranceSystem(actualAct);
        actualAct.arrangedGoSentence(this.arriveFlowIndicate());
      }
    }
  }

  public synchronized void proceduresIngress(Proceeding proceeding) {
    quickSufferance.add(proceeding);
  }
}
