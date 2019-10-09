package synchronization;

import device.Mailer;
import synchronization.Server;
import synchronization.Cycle;
import java.util.ArrayDeque;

public class ApDeveloper extends synchronization.Server {

  public synchronized void cycleIn(Cycle formalities) {
    setColumns[0].addLast(formalities);
  }

  public ApDeveloper() {
    this.setColumns = new java.util.ArrayDeque[6];

    for (int i = 0; i < setColumns.length; i++) {
      setColumns[i] = new java.util.ArrayDeque<>();
    }
    dayOdd = ClockAmount;
    presentForemost = 0;
  }

  public synchronized String plannerNominate() {
    return "FB:";
  }

  public synchronized void nsoTic() {

    if (presentNegotiations != null) {
      presentNegotiations.orderedFunctionalChance(presentNegotiations.obtainScamperingDays() + 1);
      dayOdd--;

      if (presentNegotiations.obtainScamperingDays() == presentNegotiations.obtainTimeoutLength()) {
        presentNegotiations.arrangeEgressYears(this.receiveContemporaryTicktack());
        this.undergoneMethodologies.addLast(presentNegotiations);
        presentNegotiations = null;
        this.variWaving = true;
      }

      if (dayOdd == 0 && presentNegotiations != null) {

        if (primedIsVacant()) {
          dayOdd = ClockAmount;
        } else {
          setColumns[presentForemost + 1].addLast(presentNegotiations);
          presentNegotiations = null;
          this.variWaving = true;
        }
      }
    }

    if (this.variWaving && presentNegotiations == null) {
      this.unresolvedLeviChance--;

      if (unresolvedLeviChance == 0) {
        this.variWaving = false;
        this.unresolvedLeviChance = Mailer.OfficeJuncture;
      }

    } else {

      if (presentNegotiations == null && !primedIsVacant()) {
        presentNegotiations = goFutureProcedure();
        payloadOperation(presentNegotiations);
        presentNegotiations.orderedOriginateChance(this.receiveContemporaryTicktack());
        dayOdd = ClockAmount;
      }
    }
  }

  public int dayOdd;

  public synchronized boolean primedIsVacant() {

    for (int i = 0; i < setColumns.length; i++) {

      if (!setColumns[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public ArrayDeque<Cycle>[] setColumns;
  public int presentForemost;

  public synchronized synchronization.Cycle goFutureProcedure() {

    for (int i = 0; i < setColumns.length; i++) {

      if (!setColumns[i].isEmpty()) {
        presentForemost = i;
        return setColumns[i].poll();
      }
    }
    return null;
  }
}
