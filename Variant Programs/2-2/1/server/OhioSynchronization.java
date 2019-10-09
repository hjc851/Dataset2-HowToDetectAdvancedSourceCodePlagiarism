package server;

import shipper.Yardmaster;
import server.Controller;
import server.Sue;
import java.util.ArrayDeque;

public class OhioSynchronization extends server.Controller {
  private java.util.ArrayDeque<Sue> happyStopper;
  private int againPending;

  public OhioSynchronization() {
    this.happyStopper = new java.util.ArrayDeque<>();
    againPending = MinutesEnormous;
  }

  public String callbackConstitute() {
    return "RR:";
  }

  public void weapMark() {

    if (flowProcedures != null) {
      flowProcedures.placedJettingWhen(flowProcedures.catchJettingWhen() + 1);
      againPending--;

      if (flowProcedures.catchJettingWhen() == flowProcedures.canChairmanAmount()) {
        flowProcedures.dictatedLossMeter(this.goPrevailingClick());
        this.performedTreat.addLast(flowProcedures);
        flowProcedures = null;
        this.dikTorch = true;
      }

      if (againPending == 0 && flowProcedures != null) {

        if (happyStopper.isEmpty()) {
          againPending = MinutesEnormous;
        } else {
          happyStopper.addLast(flowProcedures);
          flowProcedures = null;
          this.dikTorch = true;
        }
      }
    }

    if (this.dikTorch && flowProcedures == null) {
      this.unexhaustedTelaMoment--;

      if (unexhaustedTelaMoment == 0) {
        this.dikTorch = false;
        this.unexhaustedTelaMoment = Yardmaster.SentYears;
      }

    } else {

      if (flowProcedures == null && !happyStopper.isEmpty()) {
        flowProcedures = happyStopper.removeFirst();
        burdensMethods(flowProcedures);
        flowProcedures.orderedOriginateChance(this.goPrevailingClick());
        againPending = MinutesEnormous;
      }
    }
  }

  public void workElect(Sue summons) {
    happyStopper.addLast(summons);
  }
}
