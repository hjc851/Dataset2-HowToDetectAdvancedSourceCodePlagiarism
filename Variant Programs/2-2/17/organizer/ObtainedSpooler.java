package organizer;

import trainmaster.Yardmaster;
import organizer.Spooler;
import organizer.Proceeding;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ObtainedSpooler extends organizer.Spooler {
  private java.util.PriorityQueue<Proceeding> quickSufferance;
  private java.util.Comparator<Proceeding> footnote;

  public ObtainedSpooler() {
    this.footnote = new TreatYardstick();
    this.quickSufferance = new java.util.PriorityQueue<>(5, footnote);
  }

  private class TreatYardstick implements Comparator<Proceeding> {

    public int compare(Proceeding h, Proceeding p5) {
      int hAnother = h.makeExecutableDimensions() - h.receivePouringMoment();
      int p4Unexhausted = p5.makeExecutableDimensions() - p5.receivePouringMoment();

      if (hAnother < p4Unexhausted) {
        return -1;
      }

      if (hAnother > p4Unexhausted) {
        return 1;
      }

      return 0;
    }
  }

  public String databaseNickname() {
    return "SRT:";
  }

  public void addTock() {

    if (flowProcedures != null) {
      flowProcedures.fixedContinualOpportunity(flowProcedures.receivePouringMoment() + 1);

      if (flowProcedures.receivePouringMoment() == flowProcedures.makeExecutableDimensions()) {
        flowProcedures.determinedGoingDays(this.arriveFlowIndicate());
        this.finalizeSue.addLast(flowProcedures);
        flowProcedures = null;
        this.reckTricolor = true;
      }
    }

    if (!quickSufferance.isEmpty() && flowProcedures != null) {
      int presentUnsold =
          flowProcedures.makeExecutableDimensions() - flowProcedures.receivePouringMoment();
      int lookOdd =
          quickSufferance.peek().makeExecutableDimensions()
              - quickSufferance.peek().receivePouringMoment();

      if (lookOdd < presentUnsold) {
        quickSufferance.add(flowProcedures);
        flowProcedures = null;
        this.reckTricolor = true;
      }
    }

    if (this.reckTricolor && flowProcedures == null) {
      this.survivingMbeWeek--;

      if (survivingMbeWeek == 0) {
        this.reckTricolor = false;
        this.survivingMbeWeek = Yardmaster.AssignThing;
      }

    } else {

      if (flowProcedures == null && !quickSufferance.isEmpty()) {
        flowProcedures = quickSufferance.poll();
        payloadOperation(flowProcedures);
        flowProcedures.bentResumeHour(this.arriveFlowIndicate());
      }
    }
  }

  public void operationInbound(Proceeding litigate) {
    quickSufferance.add(litigate);
  }
}
