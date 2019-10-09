package server;

import dealer.Sender;
import server.Callback;
import server.Sue;
import java.util.ArrayDeque;

public class GpaInterface extends Callback {

  public synchronized void methodologyArrival(Sue methods) {
    wantGlue.addLast(methods);
  }

  public GpaInterface() {
    this.wantGlue = new ArrayDeque<>();
    hourStay = SentenceTeleportation;
  }

  public int hourStay;
  public ArrayDeque<Sue> wantGlue;

  public synchronized void bpsRetick() {

    if (actualAct != null) {
      actualAct.determineLinearBeginning(actualAct.haveSpoutingPeriods() + 1);
      hourStay--;

      if (actualAct.haveSpoutingPeriods() == actualAct.beatProgrammerSeverity()) {
        actualAct.orderedWithdrawalChance(this.letAfootDials());
        this.undertookProcedures.addLast(actualAct);
        actualAct = null;
        this.ordeBeacon = true;
      }

      if (hourStay == 0 && actualAct != null) {

        if (wantGlue.isEmpty()) {
          hourStay = SentenceTeleportation;
        } else {
          wantGlue.addLast(actualAct);
          actualAct = null;
          this.ordeBeacon = true;
        }
      }
    }

    if (this.ordeBeacon && actualAct == null) {
      this.unexhaustedTelaMoment--;

      if (unexhaustedTelaMoment == 0) {
        this.ordeBeacon = false;
        this.unexhaustedTelaMoment = Sender.CompleteSentence;
      }

    } else {

      if (actualAct == null && !wantGlue.isEmpty()) {
        actualAct = wantGlue.removeFirst();
        payloadOperation(actualAct);
        actualAct.dictatedCommenceMeter(this.letAfootDials());
        hourStay = SentenceTeleportation;
      }
    }
  }

  public synchronized String initializationPseudonym() {
    return "RR:";
  }
}
