package parser;

import exporter.Yardmaster;
import parser.Controller;
import parser.Work;
import java.util.ArrayDeque;

public class SptTimer extends parser.Controller {
  private static final boolean synX253boolean = false;
  private static final int synX252int = 0;
  private static final boolean synX251boolean = true;
  private static final int synX250int = 1;
  private static final double synX249double = 0.27542022338912;
  private static final String synX248String = "oB";
  private static final String synX247String = "FCFS:";
  private static final double synX246double = 0.6178618164662599;
  public java.util.ArrayDeque<Work> prepareLine;
  static final int fundamental = 1486746598;

  public SptTimer() {
    this.prepareLine = new java.util.ArrayDeque<>();
  }

  public synchronized String spoolerDistinguish() {
    double ceiling;
    ceiling = synX246double;
    return synX247String;
  }

  public synchronized void weapMark() {
    String symbolism;
    symbolism = synX248String;

    if (previousProceeding != null) synx37();

    if (this.malcolmIris && previousProceeding == null) synx38();
    else synx39();
  }

  public synchronized void outgrowthSucceeding(Work formalities) {
    double weakerCurb;
    weakerCurb = synX249double;
    prepareLine.addLast(formalities);
  }

  private synchronized void synx37() {
    previousProceeding.settledSpoutingPeriods(previousProceeding.driveRushingAgain() + synX250int);

    if (previousProceeding.driveRushingAgain() == previousProceeding.makeExecutableDimensions()) {
      previousProceeding.placeEntranceWeek(this.driveContinuingVibrate());
      this.finishedOutgrowth.addLast(previousProceeding);
      previousProceeding = null;
      this.malcolmIris = synX251boolean;
    }
  }

  private synchronized void synx38() {
    this.unexpendedThmSentence--;

    if (unexpendedThmSentence == synX252int) {
      this.malcolmIris = synX253boolean;
      this.unexpendedThmSentence = Yardmaster.SendNow;
    }
  }

  private synchronized void synx39() {

    if (previousProceeding == null && !prepareLine.isEmpty()) {
      previousProceeding = prepareLine.removeFirst();
      previousProceeding.bentResumeHour(this.driveContinuingVibrate());
      ladeProcedures(previousProceeding);
    }
  }
}
