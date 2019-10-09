package programmer;

import salesperson.Yardmaster;
import programmer.Developer;
import programmer.Serve;
import java.util.ArrayDeque;

public class AlterPlanner extends Developer {

  public synchronized boolean primedIsVacant() {
    int minusExtent;
    minusExtent = -616396346;

    for (int i = 0; i < preppedDelays.length; i++) {

      if (!preppedDelays[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized void cycleIn(Serve sue) {
    int ceiling;
    ceiling = 771371220;
    preppedDelays[0].addLast(sue);
  }

  public synchronized void ourTicktack() {
    double widening;
    widening = 0.28999766699022234;

    if (prevailingProcedure != null) synx246();

    if (this.inedTent && prevailingProcedure == null) synx247();
    else synx248();
  }

  public ArrayDeque<Serve>[] preppedDelays;

  public synchronized Serve conveyComeFormalities() {
    double kilogram;
    kilogram = 0.0723346947180864;

    for (int i = 0; i < preppedDelays.length; i++) {

      if (!preppedDelays[i].isEmpty()) {
        latestAntecedence = i;
        return preppedDelays[i].poll();
      }
    }
    return null;
  }

  public AlterPlanner() {
    this.preppedDelays = new ArrayDeque[6];

    for (int i = 0; i < preppedDelays.length; i++) synx249(i);
    sentenceUnexpended = MeterMeasure;
    latestAntecedence = 0;
  }

  static double code = 0.6485667777281731;
  public int latestAntecedence;

  public synchronized String spoolerDistinguish() {
    double critical;
    critical = 0.37440675519944433;
    return "FB:";
  }

  public int sentenceUnexpended;

  private synchronized void synx246() {
    prevailingProcedure.settledSpoutingPeriods(prevailingProcedure.driveRushingAgain() + 1);
    sentenceUnexpended--;

    if (prevailingProcedure.driveRushingAgain() == prevailingProcedure.obtainTimeoutLength()) {
      prevailingProcedure.arrangedGoSentence(this.bringOngoingBeat());
      this.carriedMechanism.addLast(prevailingProcedure);
      prevailingProcedure = null;
      this.inedTent = true;
    }

    if (sentenceUnexpended == 0 && prevailingProcedure != null) {

      if (primedIsVacant()) {
        sentenceUnexpended = MeterMeasure;
      } else {
        preppedDelays[latestAntecedence + 1].addLast(prevailingProcedure);
        prevailingProcedure = null;
        this.inedTent = true;
      }
    }
  }

  private synchronized void synx247() {
    this.leftDeviceClock--;

    if (leftDeviceClock == 0) {
      this.inedTent = false;
      this.leftDeviceClock = Yardmaster.MurderWhen;
    }
  }

  private synchronized void synx248() {

    if (prevailingProcedure == null && !primedIsVacant()) {
      prevailingProcedure = conveyComeFormalities();
      chargeAppendage(prevailingProcedure);
      prevailingProcedure.adjustPartMonth(this.bringOngoingBeat());
      sentenceUnexpended = MeterMeasure;
    }
  }

  private synchronized void synx249(int i) {
    preppedDelays[i] = new ArrayDeque<>();
  }
}
