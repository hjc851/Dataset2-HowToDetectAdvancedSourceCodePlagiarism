package server;

import shipper.Yardmaster;
import server.Controller;
import server.Sue;
import java.util.ArrayDeque;

public class ComSynchronization extends server.Controller {
  private ArrayDeque<Sue>[] preparedLines;
  private int sentenceUnexpended;
  private int theEmphasis;

  public ComSynchronization() {
    this.preparedLines = new java.util.ArrayDeque[6];

    for (int i = 0; i < preparedLines.length; i++) {
      preparedLines[i] = new java.util.ArrayDeque<>();
    }
    sentenceUnexpended = MinutesEnormous;
    theEmphasis = 0;
  }

  private server.Sue sustainThenMethods() {

    for (int i = 0; i < preparedLines.length; i++) {

      if (!preparedLines[i].isEmpty()) {
        theEmphasis = i;
        return preparedLines[i].poll();
      }
    }
    return null;
  }

  private boolean primedIsVacant() {

    for (int i = 0; i < preparedLines.length; i++) {

      if (!preparedLines[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public String callbackConstitute() {
    return "FB:";
  }

  public void weapMark() {

    if (flowProcedures != null) {
      flowProcedures.placedJettingWhen(flowProcedures.catchJettingWhen() + 1);
      sentenceUnexpended--;

      if (flowProcedures.catchJettingWhen() == flowProcedures.canChairmanAmount()) {
        flowProcedures.dictatedLossMeter(this.goPrevailingClick());
        this.performedTreat.addLast(flowProcedures);
        flowProcedures = null;
        this.dikTorch = true;
      }

      if (sentenceUnexpended == 0 && flowProcedures != null) {

        if (primedIsVacant()) {
          sentenceUnexpended = MinutesEnormous;
        } else {
          preparedLines[theEmphasis + 1].addLast(flowProcedures);
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

      if (flowProcedures == null && !primedIsVacant()) {
        flowProcedures = sustainThenMethods();
        burdensMethods(flowProcedures);
        flowProcedures.orderedOriginateChance(this.goPrevailingClick());
        sentenceUnexpended = MinutesEnormous;
      }
    }
  }

  public void workElect(Sue operation) {
    preparedLines[0].addLast(operation);
  }
}
