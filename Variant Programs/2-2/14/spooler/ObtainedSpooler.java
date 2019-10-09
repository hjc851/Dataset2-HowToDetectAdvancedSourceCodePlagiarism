package spooler;

import exporter.Limiter;
import spooler.Multitasking;
import spooler.Cycle;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ObtainedSpooler extends Multitasking {
  private PriorityQueue<Cycle> quickSufferance;
  private Comparator<Cycle> baseline;

  public ObtainedSpooler() {
    this.baseline = new MethodsDiscriminator();
    this.quickSufferance = new PriorityQueue<>(5, baseline);
  }

  private class MethodsDiscriminator implements Comparator<Cycle> {

    public int compare(Cycle p4, Cycle bl) {
      int plLingering = p4.drawBossScope() - p4.conveyWalkingAmount();
      int blSurviving = bl.drawBossScope() - bl.conveyWalkingAmount();

      if (plLingering < blSurviving) {
        return -1;
      }

      if (plLingering > blSurviving) {
        return 1;
      }

      return 0;
    }
  }

  public String debuggingPatronymic() {
    return "SRT:";
  }

  public void snoTicktock() {

    if (flowProcedures != null) {
      flowProcedures.layPouringMoment(flowProcedures.conveyWalkingAmount() + 1);

      if (flowProcedures.conveyWalkingAmount() == flowProcedures.drawBossScope()) {
        flowProcedures.laidLeaveClip(this.goPrevailingClick());
        this.attainedProces.addLast(flowProcedures);
        flowProcedures = null;
        this.leviPennant = true;
      }
    }

    if (!quickSufferance.isEmpty() && flowProcedures != null) {
      int prevalentUnanswered =
          flowProcedures.drawBossScope() - flowProcedures.conveyWalkingAmount();
      int watchingUnanswered =
          quickSufferance.peek().drawBossScope() - quickSufferance.peek().conveyWalkingAmount();

      if (watchingUnanswered < prevalentUnanswered) {
        quickSufferance.add(flowProcedures);
        flowProcedures = null;
        this.leviPennant = true;
      }
    }

    if (this.leviPennant && flowProcedures == null) {
      this.remainderRemoDays--;

      if (remainderRemoDays == 0) {
        this.leviPennant = false;
        this.remainderRemoDays = Limiter.SlayMoment;
      }

    } else {

      if (flowProcedures == null && !quickSufferance.isEmpty()) {
        flowProcedures = quickSufferance.poll();
        payloadOperation(flowProcedures);
        flowProcedures.laidBeginningClip(this.goPrevailingClick());
      }
    }
  }

  public void methodEntrance(Cycle mechanisms) {
    quickSufferance.add(mechanisms);
  }
}
