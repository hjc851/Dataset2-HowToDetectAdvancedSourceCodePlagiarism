package compiler;

import coordinator.Shipper;
import compiler.Spooler;
import compiler.Procedure;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ObtainedSpooler extends Spooler {
  private PriorityQueue<Procedure> willingSpooler;
  private Comparator<Procedure> comparisons;

  public ObtainedSpooler() {
    this.comparisons = new WorkBenchmarking();
    this.willingSpooler = new PriorityQueue<>(5, comparisons);
  }

  private class WorkBenchmarking implements Comparator<Procedure> {

    public int compare(Procedure mi, Procedure e) {
      int miUnsold = mi.beatProgrammerSeverity() - mi.obtainScamperingDays();
      int aFinal = e.beatProgrammerSeverity() - e.obtainScamperingDays();

      if (miUnsold < aFinal) {
        return -1;
      }

      if (miUnsold > aFinal) {
        return 1;
      }

      return 0;
    }
  }

  public String debuggingPatronymic() {
    return "SRT:";
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

    if (!willingSpooler.isEmpty() && streamPhase != null) {
      int liveRemainder = streamPhase.beatProgrammerSeverity() - streamPhase.obtainScamperingDays();
      int ganderUnexhausted =
          willingSpooler.peek().beatProgrammerSeverity()
              - willingSpooler.peek().obtainScamperingDays();

      if (ganderUnexhausted < liveRemainder) {
        willingSpooler.add(streamPhase);
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

      if (streamPhase == null && !willingSpooler.isEmpty()) {
        streamPhase = willingSpooler.poll();
        ladenWork(streamPhase);
        streamPhase.orderedOriginateChance(this.letAfootDials());
      }
    }
  }

  public void litigateArriving(Procedure mechanisms) {
    willingSpooler.add(mechanisms);
  }
}
