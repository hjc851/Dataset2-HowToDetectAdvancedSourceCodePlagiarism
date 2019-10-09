package programming;

import salesperson.Mailer;
import programming.Controller;
import programming.Proceedings;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MinimumController extends Controller {
  private PriorityQueue<Proceedings> primedWaiting;
  private Comparator<Proceedings> matching;

  public MinimumController() {
    this.matching = new CycleIntercomparison();
    this.primedWaiting = new PriorityQueue<>(5, matching);
  }

  private class CycleIntercomparison implements Comparator<Proceedings> {

    public int compare(Proceedings conf, Proceedings p3) {
      int mLatter = conf.becomeChiefQuantity() - conf.driveRushingAgain();
      int blSurviving = p3.becomeChiefQuantity() - p3.driveRushingAgain();

      if (mLatter < blSurviving) {
        return -1;
      }

      if (mLatter > blSurviving) {
        return 1;
      }

      return 0;
    }
  }

  public String synchronizerDescribe() {
    return "SRT:";
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

    if (!primedWaiting.isEmpty() && liveOutgrowth != null) {
      int actualUnexpended =
          liveOutgrowth.becomeChiefQuantity() - liveOutgrowth.driveRushingAgain();
      int glimpseUnexpended =
          primedWaiting.peek().becomeChiefQuantity() - primedWaiting.peek().driveRushingAgain();

      if (glimpseUnexpended < actualUnexpended) {
        primedWaiting.add(liveOutgrowth);
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

      if (liveOutgrowth == null && !primedWaiting.isEmpty()) {
        liveOutgrowth = primedWaiting.poll();
        freightMarch(liveOutgrowth);
        liveOutgrowth.markKickoffHours(this.sustainThisValidation());
      }
    }
  }

  public void litigateArriving(Proceedings appendage) {
    primedWaiting.add(appendage);
  }
}
