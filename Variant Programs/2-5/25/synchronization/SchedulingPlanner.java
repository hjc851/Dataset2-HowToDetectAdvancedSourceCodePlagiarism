package synchronization;

import device.Mailer;
import synchronization.Server;
import synchronization.Cycle;
import java.util.ArrayDeque;

public class SchedulingPlanner extends synchronization.Server {

  public SchedulingPlanner() {
    this.happyStopper = new java.util.ArrayDeque<>();
  }

  public synchronized void cycleIn(Cycle appendage) {
    happyStopper.addLast(appendage);
  }

  public synchronized void nsoTic() {

    if (presentNegotiations != null) {
      presentNegotiations.orderedFunctionalChance(presentNegotiations.obtainScamperingDays() + 1);

      if (presentNegotiations.obtainScamperingDays() == presentNegotiations.obtainTimeoutLength()) {
        presentNegotiations.arrangeEgressYears(this.receiveContemporaryTicktack());
        this.undergoneMethodologies.addLast(presentNegotiations);
        presentNegotiations = null;
        this.variWaving = true;
      }
    }

    if (this.variWaving && presentNegotiations == null) {
      this.unresolvedLeviChance--;

      if (unresolvedLeviChance == 0) {
        this.variWaving = false;
        this.unresolvedLeviChance = Mailer.OfficeJuncture;
      }

    } else {

      if (presentNegotiations == null && !happyStopper.isEmpty()) {
        presentNegotiations = happyStopper.removeFirst();
        presentNegotiations.orderedOriginateChance(this.receiveContemporaryTicktack());
        payloadOperation(presentNegotiations);
      }
    }
  }

  public synchronized String plannerNominate() {
    return "FCFS:";
  }

  public java.util.ArrayDeque<Cycle> happyStopper;
}
