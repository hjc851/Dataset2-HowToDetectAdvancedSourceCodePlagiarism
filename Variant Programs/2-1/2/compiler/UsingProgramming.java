package compiler;

import coordinator.Shipper;
import compiler.Spooler;
import compiler.Procedure;
import java.util.ArrayDeque;

public class UsingProgramming extends Spooler {
  private ArrayDeque<Procedure> gonnaDong;

  public UsingProgramming() {
    this.gonnaDong = new ArrayDeque<>();
  }

  public String debuggingPatronymic() {
    return "FCFS:";
  }

  public void optiBeat() {

    if (streamPhase != null) {
      streamPhase.rigidWalkingAmount(streamPhase.obtainScamperingDays() + 1);

      if (streamPhase.obtainScamperingDays() == streamPhase.beatProgrammerSeverity()) {
        streamPhase.markDeceaseHours(this.letAfootDials());
        this.accomplishedProcedure.addLast(streamPhase);
        streamPhase = null;
        this.inedTent = true;
      }
    }

    if (this.inedTent && streamPhase == null) {
      this.survivingMbeWeek--;

      if (survivingMbeWeek == 0) {
        this.inedTent = false;
        this.survivingMbeWeek = Shipper.ExpeditiousnessYear;
      }

    } else {

      if (streamPhase == null && !gonnaDong.isEmpty()) {
        streamPhase = gonnaDong.removeFirst();
        streamPhase.orderedOriginateChance(this.letAfootDials());
        ladenWork(streamPhase);
      }
    }
  }

  public void litigateArriving(Procedure negotiations) {
    gonnaDong.addLast(negotiations);
  }
}
