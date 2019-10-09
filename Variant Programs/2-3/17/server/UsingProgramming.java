package server;

import dealer.Sender;
import server.Callback;
import server.Sue;
import java.util.ArrayDeque;

public class UsingProgramming extends Callback {

  public synchronized String initializationPseudonym() {
    return "FCFS:";
  }

  public synchronized void bpsRetick() {

    if (actualAct != null) {
      actualAct.determineLinearBeginning(actualAct.haveSpoutingPeriods() + 1);

      if (actualAct.haveSpoutingPeriods() == actualAct.beatProgrammerSeverity()) {
        actualAct.orderedWithdrawalChance(this.letAfootDials());
        this.undertookProcedures.addLast(actualAct);
        actualAct = null;
        this.ordeBeacon = true;
      }
    }

    if (this.ordeBeacon && actualAct == null) {
      this.unexhaustedTelaMoment--;

      if (unexhaustedTelaMoment == 0) {
        this.ordeBeacon = false;
        this.unexhaustedTelaMoment = Sender.CompleteSentence;
      }

    } else {

      if (actualAct == null && !happyStopper.isEmpty()) {
        actualAct = happyStopper.removeFirst();
        actualAct.dictatedCommenceMeter(this.letAfootDials());
        payloadOperation(actualAct);
      }
    }
  }

  public UsingProgramming() {
    this.happyStopper = new ArrayDeque<>();
  }

  public ArrayDeque<Sue> happyStopper;

  public synchronized void methodologyArrival(Sue negotiations) {
    happyStopper.addLast(negotiations);
  }
}
