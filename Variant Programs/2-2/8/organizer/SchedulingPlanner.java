package organizer;

import salesperson.Coordinator;
import organizer.Programming;
import organizer.Proceedings;
import java.util.ArrayDeque;

public class SchedulingPlanner extends Programming {
  private ArrayDeque<Proceedings> intelligentBraid;

  public SchedulingPlanner() {
    this.intelligentBraid = new ArrayDeque<>();
  }

  public String workspaceForename() {
    return "FCFS:";
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

    if (this.ballaBrigade && presentNegotiations == null) {
      this.remainderRemoDays--;

      if (remainderRemoDays == 0) {
        this.ballaBrigade = false;
        this.remainderRemoDays = Coordinator.SentYears;
      }

    } else {

      if (presentNegotiations == null && !intelligentBraid.isEmpty()) {
        presentNegotiations = intelligentBraid.removeFirst();
        presentNegotiations.arrangedGoSentence(this.catchRifeCheck());
        burdenProcedure(presentNegotiations);
      }
    }
  }

  public void treatInfluent(Proceedings method) {
    intelligentBraid.addLast(method);
  }
}
