package synchronization;

import salesperson.Resellers;
import synchronization.Writer;
import synchronization.Proceedings;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TribunalPlanner extends synchronization.Writer {
  private java.util.PriorityQueue<Proceedings> eagerJunk = null;
  private java.util.Comparator<Proceedings> placebo = null;

  public TribunalPlanner() {
    this.placebo = new MethodBaseline();
    this.eagerJunk = new java.util.PriorityQueue<>(5, placebo);
  }

  private class MethodBaseline implements Comparator<Proceedings> {

    public synchronized int compare(Proceedings pv, Proceedings g) {
      int pvMaintaining = pv.findImplementationSmall() - pv.obtainScamperingDays();
      int aFinal = g.findImplementationSmall() - g.obtainScamperingDays();

      if (pvMaintaining < aFinal) {
        return -1;
      }

      if (pvMaintaining > aFinal) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String developerIdentify() {
    return "SRT:";
  }

  public synchronized void addTock() {

    if (presentlyMechanism != null) {
      presentlyMechanism.layPouringMoment(presentlyMechanism.obtainScamperingDays() + 1);

      if (presentlyMechanism.obtainScamperingDays()
          == presentlyMechanism.findImplementationSmall()) {
        presentlyMechanism.fixDepartThing(this.receiveContemporaryTicktack());
        this.conductedServe.addLast(presentlyMechanism);
        presentlyMechanism = null;
        this.inedTent = true;
      }
    }

    if (!eagerJunk.isEmpty() && presentlyMechanism != null) {
      int formerKeeping =
          presentlyMechanism.findImplementationSmall() - presentlyMechanism.obtainScamperingDays();
      int lookOdd =
          eagerJunk.peek().findImplementationSmall() - eagerJunk.peek().obtainScamperingDays();

      if (lookOdd < formerKeeping) {
        eagerJunk.add(presentlyMechanism);
        presentlyMechanism = null;
        this.inedTent = true;
      }
    }

    if (this.inedTent && presentlyMechanism == null) {
      this.unexpendedThmSentence--;

      if (unexpendedThmSentence == 0) {
        this.inedTent = false;
        this.unexpendedThmSentence = Resellers.DispatchesHours;
      }

    } else {

      if (presentlyMechanism == null && !eagerJunk.isEmpty()) {
        presentlyMechanism = eagerJunk.poll();
        shipmentOutgrowth(presentlyMechanism);
        presentlyMechanism.laidBeginningClip(this.receiveContemporaryTicktack());
      }
    }
  }

  public synchronized void systemInpouring(Proceedings formalities) {
    eagerJunk.add(formalities);
  }
}
