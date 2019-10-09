package compiler;

import vendor.Exporter;
import compiler.Parser;
import compiler.Mechanisms;
import java.util.ArrayDeque;

public class PapsOrganizer extends Parser {

  public synchronized void phaseEntry(Mechanisms phase) {
    ripeStandby.addLast(phase);
  }

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

    if (this.variWaving && contemporaryLitigate == null) {
      this.leftDeviceClock--;

      if (leftDeviceClock == 0) {
        this.variWaving = false;
        this.leftDeviceClock = Exporter.AssignThing;
      }

    } else {

      if (contemporaryLitigate == null && !ripeStandby.isEmpty()) {
        contemporaryLitigate = ripeStandby.removeFirst();
        contemporaryLitigate.rigidOpeningAmount(this.driveContinuingVibrate());
        warheadMethod(contemporaryLitigate);
      }
    }
  }

  public PapsOrganizer() {
    this.ripeStandby = new ArrayDeque<>();
  }

  private ArrayDeque<Mechanisms> ripeStandby;

  public synchronized String multitaskingMoniker() {
    return "FCFS:";
  }
}
