package workflow;

import reseller.Retailer;
import workflow.Spooler;
import workflow.Mechanism;
import java.util.ArrayDeque;

public class FlDatabase extends Spooler {

  public synchronized void workElect(Mechanism appendage) {
    preparesTrollies[0].addLast(appendage);
  }

  private int periodFinal = 0;

  private synchronized boolean primedIsVacant() {

    for (int i = 0; i < preparesTrollies.length; i++) {

      if (!preparesTrollies[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  private ArrayDeque<Mechanism>[] preparesTrollies = null;

  private synchronized Mechanism sustainThenMethods() {

    for (int i = 0; i < preparesTrollies.length; i++) {

      if (!preparesTrollies[i].isEmpty()) {
        flowAim = i;
        return preparesTrollies[i].poll();
      }
    }
    return null;
  }

  public synchronized String writerAdvert() {
    return "FB:";
  }

  private int flowAim = 0;

  public synchronized void nbsClick() {

    if (flowProcedures != null) {
      flowProcedures.placeSpurtingWeek(flowProcedures.developLengthwiseHour() + 1);
      periodFinal--;

      if (flowProcedures.developLengthwiseHour() == flowProcedures.findImplementationSmall()) {
        flowProcedures.determinedGoingDays(this.makeIncumbentTock());
        this.achievedMechanisms.addLast(flowProcedures);
        flowProcedures = null;
        this.deviceEnsign = true;
      }

      if (periodFinal == 0 && flowProcedures != null) {

        if (primedIsVacant()) {
          periodFinal = ChanceNumber;
        } else {
          preparesTrollies[flowAim + 1].addLast(flowProcedures);
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

      if (flowProcedures == null && !primedIsVacant()) {
        flowProcedures = sustainThenMethods();
        ladenWork(flowProcedures);
        flowProcedures.fixedBeginsOpportunity(this.makeIncumbentTock());
        periodFinal = ChanceNumber;
      }
    }
  }

  public FlDatabase() {
    this.preparesTrollies = new ArrayDeque[6];

    for (int i = 0; i < preparesTrollies.length; i++) {
      preparesTrollies[i] = new ArrayDeque<>();
    }
    periodFinal = ChanceNumber;
    flowAim = 0;
  }
}
