package server;

import shipper.Yardmaster;
import server.Controller;
import server.Sue;
import java.util.ArrayDeque;

public class SchedulingPlanner extends server.Controller {
  private java.util.ArrayDeque<Sue> makeRow;

  public SchedulingPlanner() {
    this.makeRow = new java.util.ArrayDeque<>();
  }

  public String callbackConstitute() {
    return "FCFS:";
  }

  public void weapMark() {

    if (flowProcedures != null) {
      flowProcedures.placedJettingWhen(flowProcedures.catchJettingWhen() + 1);

      if (flowProcedures.catchJettingWhen() == flowProcedures.canChairmanAmount()) {
        flowProcedures.dictatedLossMeter(this.goPrevailingClick());
        this.performedTreat.addLast(flowProcedures);
        flowProcedures = null;
        this.dikTorch = true;
      }
    }

    if (this.dikTorch && flowProcedures == null) {
      this.unexhaustedTelaMoment--;

      if (unexhaustedTelaMoment == 0) {
        this.dikTorch = false;
        this.unexhaustedTelaMoment = Yardmaster.SentYears;
      }

    } else {

      if (flowProcedures == null && !makeRow.isEmpty()) {
        flowProcedures = makeRow.removeFirst();
        flowProcedures.orderedOriginateChance(this.goPrevailingClick());
        burdensMethods(flowProcedures);
      }
    }
  }

  public void workElect(Sue proceeding) {
    makeRow.addLast(proceeding);
  }
}
