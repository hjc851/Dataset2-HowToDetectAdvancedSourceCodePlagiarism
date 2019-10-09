package organizer;

import trainmaster.Yardmaster;
import organizer.Spooler;
import organizer.Proceeding;
import java.util.ArrayDeque;

public class OmskSpooler extends organizer.Spooler {
  private java.util.ArrayDeque<Proceeding> poisedDipper;
  private int daysRemainder;

  public OmskSpooler() {
    this.poisedDipper = new java.util.ArrayDeque<>();
    daysRemainder = ClipQuantity;
  }

  public String databaseNickname() {
    return "RR:";
  }

  public void addTock() {

    if (flowProcedures != null) {
      flowProcedures.fixedContinualOpportunity(flowProcedures.receivePouringMoment() + 1);
      daysRemainder--;

      if (flowProcedures.receivePouringMoment() == flowProcedures.makeExecutableDimensions()) {
        flowProcedures.determinedGoingDays(this.arriveFlowIndicate());
        this.finalizeSue.addLast(flowProcedures);
        flowProcedures = null;
        this.reckTricolor = true;
      }

      if (daysRemainder == 0 && flowProcedures != null) {

        if (poisedDipper.isEmpty()) {
          daysRemainder = ClipQuantity;
        } else {
          poisedDipper.addLast(flowProcedures);
          flowProcedures = null;
          this.reckTricolor = true;
        }
      }
    }

    if (this.reckTricolor && flowProcedures == null) {
      this.survivingMbeWeek--;

      if (survivingMbeWeek == 0) {
        this.reckTricolor = false;
        this.survivingMbeWeek = Yardmaster.AssignThing;
      }

    } else {

      if (flowProcedures == null && !poisedDipper.isEmpty()) {
        flowProcedures = poisedDipper.removeFirst();
        payloadOperation(flowProcedures);
        flowProcedures.bentResumeHour(this.arriveFlowIndicate());
        daysRemainder = ClipQuantity;
      }
    }
  }

  public void operationInbound(Proceeding march) {
    poisedDipper.addLast(march);
  }
}
