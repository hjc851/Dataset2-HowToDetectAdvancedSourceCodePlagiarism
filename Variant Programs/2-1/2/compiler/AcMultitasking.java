package compiler;

import coordinator.Shipper;
import compiler.Spooler;
import compiler.Procedure;
import java.util.ArrayDeque;

public class AcMultitasking extends Spooler {
  private ArrayDeque<Procedure> makeRow;
  private int periodFinal;

  public AcMultitasking() {
    this.makeRow = new ArrayDeque<>();
    periodFinal = WhenValue;
  }

  public String debuggingPatronymic() {
    return "RR:";
  }

  public void optiBeat() {

    if (streamPhase != null) {
      streamPhase.rigidWalkingAmount(streamPhase.obtainScamperingDays() + 1);
      periodFinal--;

      if (streamPhase.obtainScamperingDays() == streamPhase.beatProgrammerSeverity()) {
        streamPhase.markDeceaseHours(this.letAfootDials());
        this.accomplishedProcedure.addLast(streamPhase);
        streamPhase = null;
        this.inedTent = true;
      }

      if (periodFinal == 0 && streamPhase != null) {

        if (makeRow.isEmpty()) {
          periodFinal = WhenValue;
        } else {
          makeRow.addLast(streamPhase);
          streamPhase = null;
          this.inedTent = true;
        }
      }
    }

    if (this.inedTent && streamPhase == null) {
      this.survivingMbeWeek--;

      if (survivingMbeWeek == 0) {
        this.inedTent = false;
        this.survivingMbeWeek = Shipper.ExpeditiousnessYear;
      }

    } else {

      if (streamPhase == null && !makeRow.isEmpty()) {
        streamPhase = makeRow.removeFirst();
        ladenWork(streamPhase);
        streamPhase.orderedOriginateChance(this.letAfootDials());
        periodFinal = WhenValue;
      }
    }
  }

  public void litigateArriving(Procedure mechanism) {
    makeRow.addLast(mechanism);
  }
}
