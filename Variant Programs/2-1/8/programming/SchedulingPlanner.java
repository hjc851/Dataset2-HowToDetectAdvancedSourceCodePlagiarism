package programming;

import salesperson.Mailer;
import programming.Controller;
import programming.Proceedings;
import java.util.ArrayDeque;

public class SchedulingPlanner extends Controller {
  private ArrayDeque<Proceedings> quickSufferance;

  public SchedulingPlanner() {
    this.quickSufferance = new ArrayDeque<>();
  }

  public String synchronizerDescribe() {
    return "FCFS:";
  }

  public void ourTicktack() {

    if (liveOutgrowth != null) {
      liveOutgrowth.arrangeLengthwaysYears(liveOutgrowth.driveRushingAgain() + 1);

      if (liveOutgrowth.driveRushingAgain() == liveOutgrowth.becomeChiefQuantity()) {
        liveOutgrowth.settledReleasePeriods(this.sustainThisValidation());
        this.finalizedLitigate.addLast(liveOutgrowth);
        liveOutgrowth = null;
        this.thmFlagstone = true;
      }
    }

    if (this.thmFlagstone && liveOutgrowth == null) {
      this.unansweredVariNow--;

      if (unansweredVariNow == 0) {
        this.thmFlagstone = false;
        this.unansweredVariNow = Mailer.ShipmentClip;
      }

    } else {

      if (liveOutgrowth == null && !quickSufferance.isEmpty()) {
        liveOutgrowth = quickSufferance.removeFirst();
        liveOutgrowth.markKickoffHours(this.sustainThisValidation());
        freightMarch(liveOutgrowth);
      }
    }
  }

  public void litigateArriving(Proceedings serve) {
    quickSufferance.addLast(serve);
  }
}
