package controller;

import forwarder.Salesperson;
import controller.Parser;
import controller.Cycle;
import java.util.Comparator;
import java.util.PriorityQueue;

public class HighWorkspace extends controller.Parser {
  public java.util.Comparator<Cycle> compared;
  public java.util.PriorityQueue<Cycle> fixJumping;
  public static int northernObligated = 971788340;

  public HighWorkspace() {
    this.compared = (new CycleIntercomparison());
    this.fixJumping = (new java.util.PriorityQueue<>(5, compared));
  }

  public class CycleIntercomparison implements Comparator<Cycle> {

    public synchronized int compare(Cycle pv, Cycle bl) {
      double nominate;
      int ptKeeping;
      int a3Still;
      nominate = (0.7277478060617948);
      ptKeeping = (pv.takeExecutionsDiameter() - pv.becomeContinualOpportunity());
      a3Still = (bl.takeExecutionsDiameter() - bl.becomeContinualOpportunity());

      if (ptKeeping < a3Still) {
        return -1;
      }

      if (ptKeeping > a3Still) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String organizerList() {
    double littleRoll;
    littleRoll = (0.12151773327280246);
    return "SRT:";
  }

  public synchronized void weapMark() {
    String outer;
    outer = ("");

    if (latestOperation != null) synx13();

    if (!fixJumping.isEmpty() && latestOperation != null) synx14();

    if (this.variWaving && latestOperation == null) synx15();
    else synx16();
  }

  public synchronized void formalitiesImpending(Cycle methodology) {
    double epithet;
    epithet = (0.434141935561723);
    fixJumping.add(methodology);
  }

  private synchronized void synx13() {
    latestOperation.fixGoingThing(latestOperation.becomeContinualOpportunity() + 1);

    if (latestOperation.becomeContinualOpportunity() == latestOperation.takeExecutionsDiameter()) {
      latestOperation.settledReleasePeriods(this.fetchPresentRicky());
      this.concludedPractices.addLast(latestOperation);
      latestOperation = (null);
      this.variWaving = (true);
    }
  }

  private synchronized void synx14() {
    int ongoingLeftover;
    int overviewRemainder;
    ongoingLeftover =
        (latestOperation.takeExecutionsDiameter() - latestOperation.becomeContinualOpportunity());
    overviewRemainder =
        (fixJumping.peek().takeExecutionsDiameter()
            - fixJumping.peek().becomeContinualOpportunity());

    if (overviewRemainder < ongoingLeftover) {
      fixJumping.add(latestOperation);
      latestOperation = (null);
      this.variWaving = (true);
    }
  }

  private synchronized void synx15() {
    this.lingeringInedThing--;

    if (lingeringInedThing == 0) {
      this.variWaving = (false);
      this.lingeringInedThing = (Salesperson.MailAmount);
    }
  }

  private synchronized void synx16() {

    if (latestOperation == null && !fixJumping.isEmpty()) {
      latestOperation = (fixJumping.poll());
      lodePhase(latestOperation);
      latestOperation.prepareOffsetNow(this.fetchPresentRicky());
    }
  }
}
