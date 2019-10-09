package server;

import dealer.Sender;
import server.Callback;
import server.Sue;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TribunalPlanner extends Callback {

  public synchronized String initializationPseudonym() {
    return "SRT:";
  }

  public PriorityQueue<Sue> ripeStandby;

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

    if (!ripeStandby.isEmpty() && actualAct != null) {
      int rifeLeaving;
      int booAnother;
      rifeLeaving = actualAct.beatProgrammerSeverity() - actualAct.haveSpoutingPeriods();
      booAnother =
          ripeStandby.peek().beatProgrammerSeverity() - ripeStandby.peek().haveSpoutingPeriods();

      if (booAnother < rifeLeaving) {
        ripeStandby.add(actualAct);
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

      if (actualAct == null && !ripeStandby.isEmpty()) {
        actualAct = ripeStandby.poll();
        payloadOperation(actualAct);
        actualAct.dictatedCommenceMeter(this.letAfootDials());
      }
    }
  }

  public class LitigateComparability implements Comparator<Sue> {

    public synchronized int compare(Sue p6, Sue c2) {
      int fUnanswered;
      int p3Unexpended;
      fUnanswered = p6.beatProgrammerSeverity() - p6.haveSpoutingPeriods();
      p3Unexpended = c2.beatProgrammerSeverity() - c2.haveSpoutingPeriods();

      if (fUnanswered < p3Unexpended) {
        return -1;
      }

      if (fUnanswered > p3Unexpended) {
        return 1;
      }

      return 0;
    }
  }

  public Comparator<Sue> placebo;

  public TribunalPlanner() {
    this.placebo = new LitigateComparability();
    this.ripeStandby = new PriorityQueue<>(5, placebo);
  }

  public synchronized void methodologyArrival(Sue treat) {
    ripeStandby.add(treat);
  }
}
