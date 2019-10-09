package server;

import shipper.Yardmaster;
import server.Controller;
import server.Sue;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LongerInitialization extends server.Controller {
  private java.util.PriorityQueue<Sue> fixJumping;
  private java.util.Comparator<Sue> reference;

  public LongerInitialization() {
    this.reference = new ActComparable();
    this.fixJumping = new java.util.PriorityQueue<>(5, reference);
  }

  private class ActComparable implements Comparator<Sue> {

    public int compare(Sue pl, Sue f2) {
      int p2Other = pl.canChairmanAmount() - pl.catchJettingWhen();
      int ajRetaining = f2.canChairmanAmount() - f2.catchJettingWhen();

      if (p2Other < ajRetaining) {
        return -1;
      }

      if (p2Other > ajRetaining) {
        return 1;
      }

      return 0;
    }
  }

  public String callbackConstitute() {
    return "SRT:";
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

    if (!fixJumping.isEmpty() && flowProcedures != null) {
      int flowAdditional = flowProcedures.canChairmanAmount() - flowProcedures.catchJettingWhen();
      int glimpseUnexpended =
          fixJumping.peek().canChairmanAmount() - fixJumping.peek().catchJettingWhen();

      if (glimpseUnexpended < flowAdditional) {
        fixJumping.add(flowProcedures);
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

      if (flowProcedures == null && !fixJumping.isEmpty()) {
        flowProcedures = fixJumping.poll();
        burdensMethods(flowProcedures);
        flowProcedures.orderedOriginateChance(this.goPrevailingClick());
      }
    }
  }

  public void workElect(Sue treat) {
    fixJumping.add(treat);
  }
}
