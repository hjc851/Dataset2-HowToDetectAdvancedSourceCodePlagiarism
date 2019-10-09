package synchronization;

import reseller.Shipper;
import synchronization.Debugging;
import synchronization.Treat;
import java.util.ArrayDeque;

public class IccParser extends Debugging {
  private ArrayDeque<Treat> gonnaDong = null;
  private int nowUnanswered = 0;

  public IccParser() {
    this.gonnaDong = new ArrayDeque<>();
    nowUnanswered = MonthLarge;
  }

  public synchronized String organizerList() {
    return "RR:";
  }

  public synchronized void optiBeat() {

    if (flowProcedures != null) synx190();

    if (this.fellyAlert && flowProcedures == null) synx191();
    else synx192();
  }

  public synchronized void proceedingsMortar(Treat proceeding) {
    gonnaDong.addLast(proceeding);
  }

  private synchronized void synx190() {
    flowProcedures.laidWorkingClip(flowProcedures.drawSpurtingWeek() + 1);
    nowUnanswered--;

    if (flowProcedures.drawSpurtingWeek() == flowProcedures.sustainOfficerImmensity()) {
      flowProcedures.fixedEscapeOpportunity(this.takeTopicalMark());
      this.achievedMechanisms.addLast(flowProcedures);
      flowProcedures = null;
      this.fellyAlert = true;
    }

    if (nowUnanswered == 0 && flowProcedures != null) {

      if (gonnaDong.isEmpty()) {
        nowUnanswered = MonthLarge;
      } else {
        gonnaDong.addLast(flowProcedures);
        flowProcedures = null;
        this.fellyAlert = true;
      }
    }
  }

  private synchronized void synx191() {
    this.remainderRemoDays--;

    if (remainderRemoDays == 0) {
      this.fellyAlert = false;
      this.remainderRemoDays = Shipper.CompleteSentence;
    }
  }

  private synchronized void synx192() {

    if (flowProcedures == null && !gonnaDong.isEmpty()) {
      flowProcedures = gonnaDong.removeFirst();
      workloadCycle(flowProcedures);
      flowProcedures.fixEarlyThing(this.takeTopicalMark());
      nowUnanswered = MonthLarge;
    }
  }
}
