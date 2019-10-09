package organizer;

import trainmaster.Yardmaster;
import organizer.Spooler;
import organizer.Proceeding;
import java.util.ArrayDeque;

public class ApDeveloper extends organizer.Spooler {
  private ArrayDeque<Proceeding>[] primedRows;
  private int dayOdd;
  private int previousObjective;

  public ApDeveloper() {
    this.primedRows = new java.util.ArrayDeque[6];

    for (int i = 0; i < primedRows.length; i++) {
      primedRows[i] = new java.util.ArrayDeque<>();
    }
    dayOdd = ClipQuantity;
    previousObjective = 0;
  }

  private organizer.Proceeding fetchThirdNegotiations() {

    for (int i = 0; i < primedRows.length; i++) {

      if (!primedRows[i].isEmpty()) {
        previousObjective = i;
        return primedRows[i].poll();
      }
    }
    return null;
  }

  private boolean primedIsVacant() {

    for (int i = 0; i < primedRows.length; i++) {

      if (!primedRows[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public String databaseNickname() {
    return "FB:";
  }

  public void addTock() {

    if (flowProcedures != null) {
      flowProcedures.fixedContinualOpportunity(flowProcedures.receivePouringMoment() + 1);
      dayOdd--;

      if (flowProcedures.receivePouringMoment() == flowProcedures.makeExecutableDimensions()) {
        flowProcedures.determinedGoingDays(this.arriveFlowIndicate());
        this.finalizeSue.addLast(flowProcedures);
        flowProcedures = null;
        this.reckTricolor = true;
      }

      if (dayOdd == 0 && flowProcedures != null) {

        if (primedIsVacant()) {
          dayOdd = ClipQuantity;
        } else {
          primedRows[previousObjective + 1].addLast(flowProcedures);
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

      if (flowProcedures == null && !primedIsVacant()) {
        flowProcedures = fetchThirdNegotiations();
        payloadOperation(flowProcedures);
        flowProcedures.bentResumeHour(this.arriveFlowIndicate());
        dayOdd = ClipQuantity;
      }
    }
  }

  public void operationInbound(Proceeding summons) {
    primedRows[0].addLast(summons);
  }
}
