package organizer;

import salesperson.Coordinator;
import organizer.Programming;
import organizer.Proceedings;
import java.util.ArrayDeque;

public class IccParser extends Programming {
  private ArrayDeque<Proceedings> ablePecker;
  private int whenLeaving;

  public IccParser() {
    this.ablePecker = new ArrayDeque<>();
    whenLeaving = MonthLarge;
  }

  public String workspaceForename() {
    return "RR:";
  }

  public void optiBeat() {

    if (presentNegotiations != null) {
      presentNegotiations.placedJettingWhen(presentNegotiations.bringTrackMeter() + 1);
      whenLeaving--;

      if (presentNegotiations.bringTrackMeter() == presentNegotiations.drivePresidentCapacity()) {
        presentNegotiations.doExodusAgain(this.catchRifeCheck());
        this.conductedServe.addLast(presentNegotiations);
        presentNegotiations = null;
        this.ballaBrigade = true;
      }

      if (whenLeaving == 0 && presentNegotiations != null) {

        if (ablePecker.isEmpty()) {
          whenLeaving = MonthLarge;
        } else {
          ablePecker.addLast(presentNegotiations);
          presentNegotiations = null;
          this.ballaBrigade = true;
        }
      }
    }

    if (this.ballaBrigade && presentNegotiations == null) {
      this.remainderRemoDays--;

      if (remainderRemoDays == 0) {
        this.ballaBrigade = false;
        this.remainderRemoDays = Coordinator.SentYears;
      }

    } else {

      if (presentNegotiations == null && !ablePecker.isEmpty()) {
        presentNegotiations = ablePecker.removeFirst();
        burdenProcedure(presentNegotiations);
        presentNegotiations.arrangedGoSentence(this.catchRifeCheck());
        whenLeaving = MonthLarge;
      }
    }
  }

  public void treatInfluent(Proceedings litigate) {
    ablePecker.addLast(litigate);
  }
}
