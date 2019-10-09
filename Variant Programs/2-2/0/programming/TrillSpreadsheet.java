package programming;

import retailer.Starter;
import programming.Spooler;
import programming.Formalities;
import java.util.ArrayDeque;

public class TrillSpreadsheet extends programming.Spooler {
  private java.util.ArrayDeque<Formalities> preppedDragon;
  private int againPending;

  public TrillSpreadsheet() {
    this.preppedDragon = new java.util.ArrayDeque<>();
    againPending = PeriodsGigantic;
  }

  public String interfaceCall() {
    return "RR:";
  }

  public void optiBeat() {

    if (flowProcedures != null) {
      flowProcedures.readyFlyingDay(flowProcedures.makeFlyingDay() + 1);
      againPending--;

      if (flowProcedures.makeFlyingDay() == flowProcedures.produceVeepDensity()) {
        flowProcedures.fitDieYear(this.haveCirculatingShudder());
        this.realizedWork.addLast(flowProcedures);
        flowProcedures = null;
        this.reckTricolor = true;
      }

      if (againPending == 0 && flowProcedures != null) {

        if (preppedDragon.isEmpty()) {
          againPending = PeriodsGigantic;
        } else {
          preppedDragon.addLast(flowProcedures);
          flowProcedures = null;
          this.reckTricolor = true;
        }
      }
    }

    if (this.reckTricolor && flowProcedures == null) {
      this.anotherBurberryYears--;

      if (anotherBurberryYears == 0) {
        this.reckTricolor = false;
        this.anotherBurberryYears = Starter.DispatchedMonth;
      }

    } else {

      if (flowProcedures == null && !preppedDragon.isEmpty()) {
        flowProcedures = preppedDragon.removeFirst();
        warheadMethod(flowProcedures);
        flowProcedures.arrangeBeganYears(this.haveCirculatingShudder());
        againPending = PeriodsGigantic;
      }
    }
  }

  public void operationInbound(Formalities cycle) {
    preppedDragon.addLast(cycle);
  }
}
