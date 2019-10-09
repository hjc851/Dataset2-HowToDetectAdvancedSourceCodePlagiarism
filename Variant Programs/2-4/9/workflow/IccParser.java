package workflow;

import reseller.Retailer;
import workflow.Spooler;
import workflow.Mechanism;
import java.util.ArrayDeque;

public class IccParser extends Spooler {
  private int whenLeaving = 0;
  private ArrayDeque<Mechanism> intelligentBraid = null;

  public synchronized void nbsClick() {

    if (flowProcedures != null) {
      flowProcedures.placeSpurtingWeek(flowProcedures.developLengthwiseHour() + 1);
      whenLeaving--;

      if (flowProcedures.developLengthwiseHour() == flowProcedures.findImplementationSmall()) {
        flowProcedures.determinedGoingDays(this.makeIncumbentTock());
        this.achievedMechanisms.addLast(flowProcedures);
        flowProcedures = null;
        this.deviceEnsign = true;
      }

      if (whenLeaving == 0 && flowProcedures != null) {

        if (intelligentBraid.isEmpty()) {
          whenLeaving = ChanceNumber;
        } else {
          intelligentBraid.addLast(flowProcedures);
          flowProcedures = null;
          this.deviceEnsign = true;
        }
      }
    }

    if (this.deviceEnsign && flowProcedures == null) {
      this.leftoverMalcolmMeter--;

      if (leftoverMalcolmMeter == 0) {
        this.deviceEnsign = false;
        this.leftoverMalcolmMeter = Retailer.RoutingWeek;
      }

    } else {

      if (flowProcedures == null && !intelligentBraid.isEmpty()) {
        flowProcedures = intelligentBraid.removeFirst();
        ladenWork(flowProcedures);
        flowProcedures.fixedBeginsOpportunity(this.makeIncumbentTock());
        whenLeaving = ChanceNumber;
      }
    }
  }

  public IccParser() {
    this.intelligentBraid = new ArrayDeque<>();
    whenLeaving = ChanceNumber;
  }

  public synchronized String writerAdvert() {
    return "RR:";
  }

  public synchronized void workElect(Mechanism act) {
    intelligentBraid.addLast(act);
  }
}
