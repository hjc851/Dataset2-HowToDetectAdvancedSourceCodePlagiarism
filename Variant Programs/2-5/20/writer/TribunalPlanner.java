package writer;

import forwarder.Caller;
import writer.Synchronizer;
import writer.March;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TribunalPlanner extends writer.Synchronizer {
  public static String juniorConstrained = "16W5jASYi1EtoiAY";
  public java.util.PriorityQueue<March> preparesSuspense;
  public java.util.Comparator<March> witness;

  public TribunalPlanner() {
    this.witness = (new ProceduresContrast());
    this.preparesSuspense = (new java.util.PriorityQueue<>(5, witness));
  }

  public class ProceduresContrast implements Comparator<March> {

    public synchronized int compare(March conf, March ap) {
      double depressShackled = 0.4099577009582136;
      int fUnanswered = conf.findImplementationSmall() - conf.beatRollingJuncture();
      int p4Unexhausted = ap.findImplementationSmall() - ap.beatRollingJuncture();

      if (fUnanswered < p4Unexhausted) {
        return -1;
      }

      if (fUnanswered > p4Unexhausted) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String compilerMake() {
    double patronymic = 0.6276793080120656;
    return "SRT:";
  }

  public synchronized void bsiShudder() {
    String handler = "LR92Dv9qAcv6ZU37Z9";

    if (existingCycle != null) synx233();

    if (!preparesSuspense.isEmpty() && existingCycle != null) synx234();

    if (this.fellyAlert && existingCycle == null) synx235();
    else synx236();
  }

  public synchronized void mechanismArrivals(March serve) {
    double ident = 0.07372679635949875;
    preparesSuspense.add(serve);
  }

  private synchronized void synx233() {
    existingCycle.placedJettingWhen(existingCycle.beatRollingJuncture() + 1);

    if (existingCycle.beatRollingJuncture() == existingCycle.findImplementationSmall()) {
      existingCycle.rigidQuittingAmount(this.takeTopicalMark());
      this.undertakenMarch.addLast(existingCycle);
      existingCycle = (null);
      this.fellyAlert = (true);
    }
  }

  private synchronized void synx234() {
    int latestOther = existingCycle.findImplementationSmall() - existingCycle.beatRollingJuncture();
    int ganderUnexhausted =
        preparesSuspense.peek().findImplementationSmall()
            - preparesSuspense.peek().beatRollingJuncture();

    if (ganderUnexhausted < latestOther) {
      preparesSuspense.add(existingCycle);
      existingCycle = (null);
      this.fellyAlert = (true);
    }
  }

  private synchronized void synx235() {
    this.unexpendedThmSentence--;

    if (unexpendedThmSentence == 0) {
      this.fellyAlert = (false);
      this.unexpendedThmSentence = (Caller.DispatchesHours);
    }
  }

  private synchronized void synx236() {

    if (existingCycle == null && !preparesSuspense.isEmpty()) {
      existingCycle = (preparesSuspense.poll());
      loaderNegotiations(existingCycle);
      existingCycle.placedJumpWhen(this.takeTopicalMark());
    }
  }
}
