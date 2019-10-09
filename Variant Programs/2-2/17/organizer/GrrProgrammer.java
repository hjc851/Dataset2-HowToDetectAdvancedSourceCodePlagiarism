package organizer;

import trainmaster.Yardmaster;
import organizer.Spooler;
import organizer.Proceeding;
import java.util.ArrayDeque;

public class GrrProgrammer extends organizer.Spooler {
  private java.util.ArrayDeque<GrrProcedure> preparedWait;
  private int againPending;
  private organizer.GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.preparedWait = new java.util.ArrayDeque<>();
    againPending = Spooler.ClipQuantity;
  }

  public String databaseNickname() {
    return "NRR:";
  }

  public void addTock() {

    if (grrProcedure != null) {
      grrProcedure.fixedContinualOpportunity(grrProcedure.receivePouringMoment() + 1);
      againPending--;

      if (grrProcedure.receivePouringMoment() == grrProcedure.makeExecutableDimensions()) {
        grrProcedure.determinedGoingDays(this.arriveFlowIndicate());
        this.finalizeSue.addLast(grrProcedure);
        grrProcedure = null;
        this.reckTricolor = true;
      }

      if (againPending == 0 && grrProcedure != null) {

        if (preparedWait.isEmpty()) {
          againPending = grrProcedure.catchWhenValue();
        } else {

          if (grrProcedure.catchWhenValue() > 2) {
            grrProcedure.putClockAmount(grrProcedure.catchWhenValue() - 1);
          }

          preparedWait.addLast(grrProcedure);
          grrProcedure = null;
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

      if (grrProcedure == null && !preparedWait.isEmpty()) {
        grrProcedure = preparedWait.removeFirst();
        payloadOperation(grrProcedure);
        grrProcedure.bentResumeHour(this.arriveFlowIndicate());
        againPending = grrProcedure.catchWhenValue();
      }
    }
  }

  public void operationInbound(Proceeding cycle) {
    preparedWait.add(new organizer.GrrProcedure(cycle));
  }
}
