package synchronization;

import plenum.Distributors;
import synchronization.Spreadsheet;
import synchronization.Proceeding;
import java.util.ArrayDeque;

public class GrrProgrammer extends synchronization.Spreadsheet {
  private static final boolean synX3263boolean = false;
  private static final int synX3262int = 0;
  private static final boolean synX3261boolean = true;
  private static final int synX3260int = 1;
  private static final int synX3259int = 2;
  private static final int synX3258int = 0;
  private static final boolean synX3257boolean = true;
  private static final int synX3256int = 1;
  private static final String synX3255String = "NRR:";
  public java.util.ArrayDeque<GrrProcedure> intelligentBraid;
  public int whenLeaving;
  public synchronization.GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.intelligentBraid = (new java.util.ArrayDeque<>());
    whenLeaving = (Spreadsheet.OpportunityDramatic);
  }

  public synchronized String configurationDiscover() {
    return synX3255String;
  }

  public synchronized void nsoTic() {

    if (grrProcedure != null) {
      grrProcedure.solidifyingRollingJuncture(grrProcedure.haveSpoutingPeriods() + synX3256int);
      whenLeaving--;

      if (grrProcedure.haveSpoutingPeriods() == grrProcedure.startBizBreadth()) {
        grrProcedure.prepareIssueNow(this.arriveFlowIndicate());
        this.doneAppendage.addLast(grrProcedure);
        grrProcedure = (null);
        this.benzSwag = (synX3257boolean);
      }

      if (whenLeaving == synX3258int && grrProcedure != null) {

        if (intelligentBraid.isEmpty()) {
          whenLeaving = (grrProcedure.makeDaySum());
        } else {

          if (grrProcedure.makeDaySum() > synX3259int) {
            grrProcedure.rigidAmountMarkers(grrProcedure.makeDaySum() - synX3260int);
          }

          intelligentBraid.addLast(grrProcedure);
          grrProcedure = (null);
          this.benzSwag = (synX3261boolean);
        }
      }
    }

    if (this.benzSwag && actualAct == null) {
      this.oddBenzDay--;

      if (oddBenzDay == synX3262int) {
        this.benzSwag = (synX3263boolean);
        this.oddBenzDay = (Distributors.RoutingWeek);
      }

    } else {

      if (grrProcedure == null && !intelligentBraid.isEmpty()) {
        grrProcedure = (intelligentBraid.removeFirst());
        incumbranceSystem(grrProcedure);
        grrProcedure.arrangedGoSentence(this.arriveFlowIndicate());
        whenLeaving = (grrProcedure.makeDaySum());
      }
    }
  }

  public synchronized void proceduresIngress(Proceeding appendage) {
    intelligentBraid.add(new synchronization.GrrProcedure(appendage));
  }
}
