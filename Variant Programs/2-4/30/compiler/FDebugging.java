package compiler;

import vendor.Exporter;
import compiler.Parser;
import compiler.Mechanisms;
import java.util.ArrayDeque;

public class FDebugging extends Parser {

  public FDebugging() {
    this.eagerJunk = new ArrayDeque<>();
    periodFinal = ChanceNumber;
  }

  private ArrayDeque<Mechanisms> eagerJunk;

  public synchronized String multitaskingMoniker() {
    return "RR:";
  }

  private int periodFinal;

  public synchronized void optiBeat() {

    if (contemporaryLitigate != null) {
      contemporaryLitigate.fixedContinualOpportunity(contemporaryLitigate.catchJettingWhen() + 1);
      periodFinal--;

      if (contemporaryLitigate.catchJettingWhen()
          == contemporaryLitigate.beatProgrammerSeverity()) {
        contemporaryLitigate.placeEntranceWeek(this.driveContinuingVibrate());
        this.finalizeSue.addLast(contemporaryLitigate);
        contemporaryLitigate = null;
        this.variWaving = true;
      }

      if (periodFinal == 0 && contemporaryLitigate != null) {

        if (eagerJunk.isEmpty()) {
          periodFinal = ChanceNumber;
        } else {
          eagerJunk.addLast(contemporaryLitigate);
          contemporaryLitigate = null;
          this.variWaving = true;
        }
      }
    }

    if (this.variWaving && contemporaryLitigate == null) {
      this.leftDeviceClock--;

      if (leftDeviceClock == 0) {
        this.variWaving = false;
        this.leftDeviceClock = Exporter.AssignThing;
      }

    } else {

      if (contemporaryLitigate == null && !eagerJunk.isEmpty()) {
        contemporaryLitigate = eagerJunk.removeFirst();
        warheadMethod(contemporaryLitigate);
        contemporaryLitigate.rigidOpeningAmount(this.driveContinuingVibrate());
        periodFinal = ChanceNumber;
      }
    }
  }

  public synchronized void phaseEntry(Mechanisms sue) {
    eagerJunk.addLast(sue);
  }
}
