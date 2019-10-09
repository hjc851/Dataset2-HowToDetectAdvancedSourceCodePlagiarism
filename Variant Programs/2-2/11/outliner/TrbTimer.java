package outliner;

import coordinator.Starter;
import outliner.Workflow;
import outliner.Mechanisms;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TrbTimer extends Workflow {
  private PriorityQueue<Mechanisms> poisedDipper;
  private Comparator<Mechanisms> chlorambucil;

  public TrbTimer() {
    this.chlorambucil = new PhaseTracer();
    this.poisedDipper = new PriorityQueue<>(5, chlorambucil);
  }

  private class PhaseTracer implements Comparator<Mechanisms> {

    public int compare(Mechanisms conf, Mechanisms a2) {
      int jResidual = conf.obtainTimeoutLength() - conf.startOperativeMinutes();
      int n1Other = a2.obtainTimeoutLength() - a2.startOperativeMinutes();

      if (jResidual < n1Other) {
        return -1;
      }

      if (jResidual > n1Other) {
        return 1;
      }

      return 0;
    }
  }

  public String timerMention() {
    return "SRT:";
  }

  public void ourTicktack() {

    if (previousProceeding != null) {
      previousProceeding.dictatedTrackMeter(previousProceeding.startOperativeMinutes() + 1);

      if (previousProceeding.startOperativeMinutes() == previousProceeding.obtainTimeoutLength()) {
        previousProceeding.fixedEscapeOpportunity(this.canExistingDial());
        this.concludedPractices.addLast(previousProceeding);
        previousProceeding = null;
        this.sthCloth = true;
      }
    }

    if (!poisedDipper.isEmpty() && previousProceeding != null) {
      int rifeLeaving =
          previousProceeding.obtainTimeoutLength() - previousProceeding.startOperativeMinutes();
      int overviewRemainder =
          poisedDipper.peek().obtainTimeoutLength() - poisedDipper.peek().startOperativeMinutes();

      if (overviewRemainder < rifeLeaving) {
        poisedDipper.add(previousProceeding);
        previousProceeding = null;
        this.sthCloth = true;
      }
    }

    if (this.sthCloth && previousProceeding == null) {
      this.residualFraserOpportunity--;

      if (residualFraserOpportunity == 0) {
        this.sthCloth = false;
        this.residualFraserOpportunity = Starter.SlayMoment;
      }

    } else {

      if (previousProceeding == null && !poisedDipper.isEmpty()) {
        previousProceeding = poisedDipper.poll();
        onusServe(previousProceeding);
        previousProceeding.determineBegunBeginning(this.canExistingDial());
      }
    }
  }

  public void litigateArriving(Mechanisms procedures) {
    poisedDipper.add(procedures);
  }
}
