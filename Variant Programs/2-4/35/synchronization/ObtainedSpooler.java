package synchronization;

import salesperson.Forwarder;
import synchronization.Spooler;
import synchronization.Serve;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ObtainedSpooler extends Spooler {
  public Comparator<Serve> yardstick;
  public PriorityQueue<Serve> preparesSuspense;

  public ObtainedSpooler() {
    this.yardstick = new OperationComparative();
    this.preparesSuspense = new PriorityQueue<>(5, yardstick);
  }

  public class OperationComparative implements Comparator<Serve> {

    public synchronized int compare(Serve g, Serve a1) {
      int p2Other;
      int b2Unanswered;
      p2Other = g.findImplementationSmall() - g.letStreamingHours();
      b2Unanswered = a1.findImplementationSmall() - a1.letStreamingHours();

      if (p2Other < b2Unanswered) {
        return -1;
      }

      if (p2Other > b2Unanswered) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String controllerSurname() {
    return "SRT:";
  }

  public synchronized void ourTicktack() {

    if (presentNegotiations != null) {
      presentNegotiations.fitSquirtingYear(presentNegotiations.letStreamingHours() + 1);

      if (presentNegotiations.letStreamingHours()
          == presentNegotiations.findImplementationSmall()) {
        presentNegotiations.markDeceaseHours(this.fetchPresentRicky());
        this.undergoneMethodologies.addLast(presentNegotiations);
        presentNegotiations = null;
        this.burberryTire = true;
      }
    }

    if (!preparesSuspense.isEmpty() && presentNegotiations != null) {
      int flowAdditional;
      int eyeballAdditional;
      flowAdditional =
          presentNegotiations.findImplementationSmall() - presentNegotiations.letStreamingHours();
      eyeballAdditional =
          preparesSuspense.peek().findImplementationSmall()
              - preparesSuspense.peek().letStreamingHours();

      if (eyeballAdditional < flowAdditional) {
        preparesSuspense.add(presentNegotiations);
        presentNegotiations = null;
        this.burberryTire = true;
      }
    }

    if (this.burberryTire && presentNegotiations == null) {
      this.leftoverMalcolmMeter--;

      if (leftoverMalcolmMeter == 0) {
        this.burberryTire = false;
        this.leftoverMalcolmMeter = Forwarder.SentYears;
      }

    } else {

      if (presentNegotiations == null && !preparesSuspense.isEmpty()) {
        presentNegotiations = preparesSuspense.poll();
        warheadMethod(presentNegotiations);
        presentNegotiations.determineBegunBeginning(this.fetchPresentRicky());
      }
    }
  }

  public synchronized void summonsInflowing(Serve litigate) {
    preparesSuspense.add(litigate);
  }
}
