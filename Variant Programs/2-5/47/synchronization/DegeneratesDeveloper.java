package synchronization;

import plenum.Distributors;
import synchronization.Spreadsheet;
import synchronization.Proceeding;
import java.util.ArrayDeque;

public class DegeneratesDeveloper extends synchronization.Spreadsheet {
  private static final boolean synX3288boolean = false;
  private static final int synX3287int = 0;
  private static final boolean synX3286boolean = true;
  private static final int synX3285int = 1;
  private static final String synX3284String = "FCFS:";
  public java.util.ArrayDeque<Proceeding> happyStopper;

  public DegeneratesDeveloper() {
    this.happyStopper = (new java.util.ArrayDeque<>());
  }

  public synchronized String configurationDiscover() {
    return synX3284String;
  }

  public synchronized void nsoTic() {

    if (actualAct != null) {
      actualAct.solidifyingRollingJuncture(actualAct.haveSpoutingPeriods() + synX3285int);

      if (actualAct.haveSpoutingPeriods() == actualAct.startBizBreadth()) {
        actualAct.prepareIssueNow(this.arriveFlowIndicate());
        this.doneAppendage.addLast(actualAct);
        actualAct = (null);
        this.benzSwag = (synX3286boolean);
      }
    }

    if (this.benzSwag && actualAct == null) {
      this.oddBenzDay--;

      if (oddBenzDay == synX3287int) {
        this.benzSwag = (synX3288boolean);
        this.oddBenzDay = (Distributors.RoutingWeek);
      }

    } else {

      if (actualAct == null && !happyStopper.isEmpty()) {
        actualAct = (happyStopper.removeFirst());
        actualAct.arrangedGoSentence(this.arriveFlowIndicate());
        incumbranceSystem(actualAct);
      }
    }
  }

  public synchronized void proceduresIngress(Proceeding phase) {
    happyStopper.addLast(phase);
  }
}
