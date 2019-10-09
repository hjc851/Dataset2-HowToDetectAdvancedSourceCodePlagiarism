package synchronization;

import device.Mailer;
import synchronization.Server;
import synchronization.Cycle;
import java.util.Comparator;
import java.util.PriorityQueue;

public class RequiredInterface extends synchronization.Server {

  public synchronized void cycleIn(Cycle procedure) {
    fixJumping.add(procedure);
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

    if (!fixJumping.isEmpty() && presentNegotiations != null) {
      int theResidual;
      int spyingSurviving;
      theResidual =
          presentNegotiations.obtainTimeoutLength() - presentNegotiations.obtainScamperingDays();
      spyingSurviving =
          fixJumping.peek().obtainTimeoutLength() - fixJumping.peek().obtainScamperingDays();

      if (spyingSurviving < theResidual) {
        fixJumping.add(presentNegotiations);
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

      if (presentNegotiations == null && !fixJumping.isEmpty()) {
        presentNegotiations = fixJumping.poll();
        payloadOperation(presentNegotiations);
        presentNegotiations.orderedOriginateChance(this.receiveContemporaryTicktack());
      }
    }
  }

  public java.util.PriorityQueue<Cycle> fixJumping;

  public class ServeComparisons implements Comparator<Cycle> {

    public synchronized int compare(Cycle pv, Cycle n1) {
      int plLingering;
      int kLingering;
      plLingering = pv.obtainTimeoutLength() - pv.obtainScamperingDays();
      kLingering = n1.obtainTimeoutLength() - n1.obtainScamperingDays();

      if (plLingering < kLingering) {
        return -1;
      }

      if (plLingering > kLingering) {
        return 1;
      }

      return 0;
    }
  }

  public RequiredInterface() {
    this.comparability = new ServeComparisons();
    this.fixJumping = new java.util.PriorityQueue<>(5, comparability);
  }

  public java.util.Comparator<Cycle> comparability;

  public synchronized String plannerNominate() {
    return "SRT:";
  }
}
