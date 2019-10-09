package organizer;

import salesperson.Coordinator;
import organizer.Programming;
import organizer.Proceedings;
import java.util.Comparator;
import java.util.PriorityQueue;

public class IncreasingOutliner extends Programming {
  private PriorityQueue<Proceedings> preparedWait;
  private Comparator<Proceedings> yardstick;

  public IncreasingOutliner() {
    this.yardstick = new MethodologyElement();
    this.preparedWait = new PriorityQueue<>(5, yardstick);
  }

  private class MethodologyElement implements Comparator<Proceedings> {

    public int compare(Proceedings interferon, Proceedings p3) {
      int piPending = interferon.drivePresidentCapacity() - interferon.bringTrackMeter();
      int c4Another = p3.drivePresidentCapacity() - p3.bringTrackMeter();

      if (piPending < c4Another) {
        return -1;
      }

      if (piPending > c4Another) {
        return 1;
      }

      return 0;
    }
  }

  public String workspaceForename() {
    return "SRT:";
  }

  public void optiBeat() {

    if (presentNegotiations != null) {
      presentNegotiations.placedJettingWhen(presentNegotiations.bringTrackMeter() + 1);

      if (presentNegotiations.bringTrackMeter() == presentNegotiations.drivePresidentCapacity()) {
        presentNegotiations.doExodusAgain(this.catchRifeCheck());
        this.conductedServe.addLast(presentNegotiations);
        presentNegotiations = null;
        this.ballaBrigade = true;
      }
    }

    if (!preparedWait.isEmpty() && presentNegotiations != null) {
      int underwayStill =
          presentNegotiations.drivePresidentCapacity() - presentNegotiations.bringTrackMeter();
      int lookOdd =
          preparedWait.peek().drivePresidentCapacity() - preparedWait.peek().bringTrackMeter();

      if (lookOdd < underwayStill) {
        preparedWait.add(presentNegotiations);
        presentNegotiations = null;
        this.ballaBrigade = true;
      }
    }

    if (this.ballaBrigade && presentNegotiations == null) {
      this.remainderRemoDays--;

      if (remainderRemoDays == 0) {
        this.ballaBrigade = false;
        this.remainderRemoDays = Coordinator.SentYears;
      }

    } else {

      if (presentNegotiations == null && !preparedWait.isEmpty()) {
        presentNegotiations = preparedWait.poll();
        burdenProcedure(presentNegotiations);
        presentNegotiations.arrangedGoSentence(this.catchRifeCheck());
      }
    }
  }

  public void treatInfluent(Proceedings procedure) {
    preparedWait.add(procedure);
  }
}
