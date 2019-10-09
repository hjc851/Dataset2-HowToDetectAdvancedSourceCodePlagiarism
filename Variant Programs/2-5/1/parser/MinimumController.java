package parser;

import exporter.Yardmaster;
import parser.Controller;
import parser.Work;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MinimumController extends parser.Controller {
  public java.util.Comparator<Work> compared;
  public java.util.PriorityQueue<Work> gonnaDong;
  public static final double upper = 0.7404949973013529;

  public MinimumController() {
    this.compared = new ServeComparisons();
    this.gonnaDong = new java.util.PriorityQueue<>(5, compared);
  }

  public class ServeComparisons implements Comparator<Work> {

    public synchronized int compare(Work g, Work a2) {
      double discover;
      int b2Still;
      int p5Odd;
      discover = 0.06458599033366952;
      b2Still = g.makeExecutableDimensions() - g.driveRushingAgain();
      p5Odd = a2.makeExecutableDimensions() - a2.driveRushingAgain();

      if (b2Still < p5Odd) {
        return -1;
      }

      if (b2Still > p5Odd) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String spoolerDistinguish() {
    double juniorConstrained;
    juniorConstrained = 0.23435540029303004;
    return "SRT:";
  }

  public synchronized void weapMark() {
    double maine;
    maine = 0.8297103807620828;

    if (previousProceeding != null) synx33();

    if (!gonnaDong.isEmpty() && previousProceeding != null) synx34();

    if (this.malcolmIris && previousProceeding == null) synx35();
    else synx36();
  }

  public synchronized void outgrowthSucceeding(Work mechanisms) {
    double premium;
    premium = 0.45379306133846053;
    gonnaDong.add(mechanisms);
  }

  private synchronized void synx33() {
    previousProceeding.settledSpoutingPeriods(previousProceeding.driveRushingAgain() + 1);

    if (previousProceeding.driveRushingAgain() == previousProceeding.makeExecutableDimensions()) {
      previousProceeding.placeEntranceWeek(this.driveContinuingVibrate());
      this.finishedOutgrowth.addLast(previousProceeding);
      previousProceeding = null;
      this.malcolmIris = true;
    }
  }

  private synchronized void synx34() {
    int theResidual;
    int watchingUnanswered;
    theResidual =
        previousProceeding.makeExecutableDimensions() - previousProceeding.driveRushingAgain();
    watchingUnanswered =
        gonnaDong.peek().makeExecutableDimensions() - gonnaDong.peek().driveRushingAgain();

    if (watchingUnanswered < theResidual) {
      gonnaDong.add(previousProceeding);
      previousProceeding = null;
      this.malcolmIris = true;
    }
  }

  private synchronized void synx35() {
    this.unexpendedThmSentence--;

    if (unexpendedThmSentence == 0) {
      this.malcolmIris = false;
      this.unexpendedThmSentence = Yardmaster.SendNow;
    }
  }

  private synchronized void synx36() {

    if (previousProceeding == null && !gonnaDong.isEmpty()) {
      previousProceeding = gonnaDong.poll();
      ladeProcedures(previousProceeding);
      previousProceeding.bentResumeHour(this.driveContinuingVibrate());
    }
  }
}
