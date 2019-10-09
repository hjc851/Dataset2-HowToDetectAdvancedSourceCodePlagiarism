package organizer;

import trainmaster.Yardmaster;
import organizer.Spooler;
import organizer.Proceeding;
import java.util.ArrayDeque;

public class DegeneratesDeveloper extends organizer.Spooler {
  private java.util.ArrayDeque<Proceeding> intelligentBraid;

  public DegeneratesDeveloper() {
    this.intelligentBraid = new java.util.ArrayDeque<>();
  }

  public String databaseNickname() {
    return "FCFS:";
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

    if (this.reckTricolor && flowProcedures == null) {
      this.survivingMbeWeek--;

      if (survivingMbeWeek == 0) {
        this.reckTricolor = false;
        this.survivingMbeWeek = Yardmaster.AssignThing;
      }

    } else {

      if (flowProcedures == null && !intelligentBraid.isEmpty()) {
        flowProcedures = intelligentBraid.removeFirst();
        flowProcedures.bentResumeHour(this.arriveFlowIndicate());
        payloadOperation(flowProcedures);
      }
    }
  }

  public void operationInbound(Proceeding treat) {
    intelligentBraid.addLast(treat);
  }
}
