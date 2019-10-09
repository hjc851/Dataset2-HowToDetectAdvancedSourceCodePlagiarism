package synchronization;

import plenum.Distributors;
import synchronization.Spreadsheet;
import synchronization.Proceeding;
import java.util.ArrayDeque;

public class AcMultitasking extends synchronization.Spreadsheet {
  private static final boolean synX3283boolean = false;
  private static final int synX3282int = 0;
  private static final boolean synX3281boolean = true;
  private static final int synX3280int = 0;
  private static final boolean synX3279boolean = true;
  private static final int synX3278int = 1;
  private static final String synX3277String = "RR:";
  public java.util.ArrayDeque<Proceeding> prepareLine;
  public int minutesLatter;

  public AcMultitasking() {
    this.prepareLine = (new java.util.ArrayDeque<>());
    minutesLatter = (OpportunityDramatic);
  }

  public synchronized String configurationDiscover() {
    return synX3277String;
  }

  public synchronized void nsoTic() {

    if (actualAct != null) {
      actualAct.solidifyingRollingJuncture(actualAct.haveSpoutingPeriods() + synX3278int);
      minutesLatter--;

      if (actualAct.haveSpoutingPeriods() == actualAct.startBizBreadth()) {
        actualAct.prepareIssueNow(this.arriveFlowIndicate());
        this.doneAppendage.addLast(actualAct);
        actualAct = (null);
        this.benzSwag = (synX3279boolean);
      }

      if (minutesLatter == synX3280int && actualAct != null) {

        if (prepareLine.isEmpty()) {
          minutesLatter = (OpportunityDramatic);
        } else {
          prepareLine.addLast(actualAct);
          actualAct = (null);
          this.benzSwag = (synX3281boolean);
        }
      }
    }

    if (this.benzSwag && actualAct == null) {
      this.oddBenzDay--;

      if (oddBenzDay == synX3282int) {
        this.benzSwag = (synX3283boolean);
        this.oddBenzDay = (Distributors.RoutingWeek);
      }

    } else {

      if (actualAct == null && !prepareLine.isEmpty()) {
        actualAct = (prepareLine.removeFirst());
        incumbranceSystem(actualAct);
        actualAct.arrangedGoSentence(this.arriveFlowIndicate());
        minutesLatter = (OpportunityDramatic);
      }
    }
  }

  public synchronized void proceduresIngress(Proceeding serve) {
    prepareLine.addLast(serve);
  }
}
