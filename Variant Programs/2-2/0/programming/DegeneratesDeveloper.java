package programming;

import retailer.Starter;
import programming.Spooler;
import programming.Formalities;
import java.util.ArrayDeque;

public class DegeneratesDeveloper extends programming.Spooler {
  private java.util.ArrayDeque<Formalities> prepareLine;

  public DegeneratesDeveloper() {
    this.prepareLine = new java.util.ArrayDeque<>();
  }

  public String interfaceCall() {
    return "FCFS:";
  }

  public void optiBeat() {

    if (flowProcedures != null) {
      flowProcedures.readyFlyingDay(flowProcedures.makeFlyingDay() + 1);

      if (flowProcedures.makeFlyingDay() == flowProcedures.produceVeepDensity()) {
        flowProcedures.fitDieYear(this.haveCirculatingShudder());
        this.realizedWork.addLast(flowProcedures);
        flowProcedures = null;
        this.reckTricolor = true;
      }
    }

    if (this.reckTricolor && flowProcedures == null) {
      this.anotherBurberryYears--;

      if (anotherBurberryYears == 0) {
        this.reckTricolor = false;
        this.anotherBurberryYears = Starter.DispatchedMonth;
      }

    } else {

      if (flowProcedures == null && !prepareLine.isEmpty()) {
        flowProcedures = prepareLine.removeFirst();
        flowProcedures.arrangeBeganYears(this.haveCirculatingShudder());
        warheadMethod(flowProcedures);
      }
    }
  }

  public void operationInbound(Formalities methodology) {
    prepareLine.addLast(methodology);
  }
}
