package compiler;

import vendor.Exporter;
import compiler.Parser;
import compiler.Mechanisms;
import java.util.Comparator;
import java.util.PriorityQueue;

public class IncreasedSynchronizer extends Parser {

  public synchronized void phaseEntry(Mechanisms system) {
    poisedDipper.add(system);
  }

  private class SueReference implements Comparator<Mechanisms> {

    public synchronized int compare(Mechanisms pv, Mechanisms ap) {
      int plLingering;
      int aFinal;
      plLingering = pv.beatProgrammerSeverity() - pv.catchJettingWhen();
      aFinal = ap.beatProgrammerSeverity() - ap.catchJettingWhen();

      if (plLingering < aFinal) {
        return -1;
      }

      if (plLingering > aFinal) {
        return 1;
      }

      return 0;
    }
  }

  public IncreasedSynchronizer() {
    this.element = new SueReference();
    this.poisedDipper = new PriorityQueue<>(5, element);
  }

  public synchronized String multitaskingMoniker() {
    return "SRT:";
  }

  private Comparator<Mechanisms> element;

  public synchronized void optiBeat() {

    if (contemporaryLitigate != null) {
      contemporaryLitigate.fixedContinualOpportunity(contemporaryLitigate.catchJettingWhen() + 1);

      if (contemporaryLitigate.catchJettingWhen()
          == contemporaryLitigate.beatProgrammerSeverity()) {
        contemporaryLitigate.placeEntranceWeek(this.driveContinuingVibrate());
        this.finalizeSue.addLast(contemporaryLitigate);
        contemporaryLitigate = null;
        this.variWaving = true;
      }
    }

    if (!poisedDipper.isEmpty() && contemporaryLitigate != null) {
      int circulatingRest;
      int glimpseUnexpended;
      circulatingRest =
          contemporaryLitigate.beatProgrammerSeverity() - contemporaryLitigate.catchJettingWhen();
      glimpseUnexpended =
          poisedDipper.peek().beatProgrammerSeverity() - poisedDipper.peek().catchJettingWhen();

      if (glimpseUnexpended < circulatingRest) {
        poisedDipper.add(contemporaryLitigate);
        contemporaryLitigate = null;
        this.variWaving = true;
      }
    }

    if (this.variWaving && contemporaryLitigate == null) {
      this.leftDeviceClock--;

      if (leftDeviceClock == 0) {
        this.variWaving = false;
        this.leftDeviceClock = Exporter.AssignThing;
      }

    } else {

      if (contemporaryLitigate == null && !poisedDipper.isEmpty()) {
        contemporaryLitigate = poisedDipper.poll();
        warheadMethod(contemporaryLitigate);
        contemporaryLitigate.rigidOpeningAmount(this.driveContinuingVibrate());
      }
    }
  }

  private PriorityQueue<Mechanisms> poisedDipper;
}
