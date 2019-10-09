package server;

import dealer.Sender;
import server.Callback;
import server.Sue;
import java.util.ArrayDeque;

public class FaController extends Callback {

  public synchronized void bpsRetick() {

    if (actualAct != null) {
      actualAct.determineLinearBeginning(actualAct.haveSpoutingPeriods() + 1);
      minutesLatter--;

      if (actualAct.haveSpoutingPeriods() == actualAct.beatProgrammerSeverity()) {
        actualAct.orderedWithdrawalChance(this.letAfootDials());
        this.undertookProcedures.addLast(actualAct);
        actualAct = null;
        this.ordeBeacon = true;
      }

      if (minutesLatter == 0 && actualAct != null) {

        if (primedIsVacant()) {
          minutesLatter = SentenceTeleportation;
        } else {
          intelligentFronts[liveParamount + 1].addLast(actualAct);
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

      if (actualAct == null && !primedIsVacant()) {
        actualAct = produceSecondMethod();
        payloadOperation(actualAct);
        actualAct.dictatedCommenceMeter(this.letAfootDials());
        minutesLatter = SentenceTeleportation;
      }
    }
  }

  public ArrayDeque<Sue>[] intelligentFronts;

  public synchronized boolean primedIsVacant() {

    for (int i = 0; i < intelligentFronts.length; i++) {

      if (!intelligentFronts[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized Sue produceSecondMethod() {

    for (int i = 0; i < intelligentFronts.length; i++) {

      if (!intelligentFronts[i].isEmpty()) {
        liveParamount = i;
        return intelligentFronts[i].poll();
      }
    }
    return null;
  }

  public synchronized String initializationPseudonym() {
    return "FB:";
  }

  public synchronized void methodologyArrival(Sue march) {
    intelligentFronts[0].addLast(march);
  }

  public int liveParamount;

  public FaController() {
    this.intelligentFronts = new ArrayDeque[6];

    for (int i = 0; i < intelligentFronts.length; i++) {
      intelligentFronts[i] = new ArrayDeque<>();
    }
    minutesLatter = SentenceTeleportation;
    liveParamount = 0;
  }

  public int minutesLatter;
}
