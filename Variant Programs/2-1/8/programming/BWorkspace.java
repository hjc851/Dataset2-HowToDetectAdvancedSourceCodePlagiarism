package programming;

import salesperson.Mailer;
import programming.Controller;
import programming.Proceedings;
import java.util.ArrayDeque;

public class BWorkspace extends Controller {
  private ArrayDeque<Proceedings> makeRow;
  private int meterLeftover;

  public BWorkspace() {
    this.makeRow = new ArrayDeque<>();
    meterLeftover = MinutesEnormous;
  }

  public String synchronizerDescribe() {
    return "RR:";
  }

  public void ourTicktack() {

    if (liveOutgrowth != null) {
      liveOutgrowth.arrangeLengthwaysYears(liveOutgrowth.driveRushingAgain() + 1);
      meterLeftover--;

      if (liveOutgrowth.driveRushingAgain() == liveOutgrowth.becomeChiefQuantity()) {
        liveOutgrowth.settledReleasePeriods(this.sustainThisValidation());
        this.finalizedLitigate.addLast(liveOutgrowth);
        liveOutgrowth = null;
        this.thmFlagstone = true;
      }

      if (meterLeftover == 0 && liveOutgrowth != null) {

        if (makeRow.isEmpty()) {
          meterLeftover = MinutesEnormous;
        } else {
          makeRow.addLast(liveOutgrowth);
          liveOutgrowth = null;
          this.thmFlagstone = true;
        }
      }
    }

    if (this.thmFlagstone && liveOutgrowth == null) {
      this.unansweredVariNow--;

      if (unansweredVariNow == 0) {
        this.thmFlagstone = false;
        this.unansweredVariNow = Mailer.ShipmentClip;
      }

    } else {

      if (liveOutgrowth == null && !makeRow.isEmpty()) {
        liveOutgrowth = makeRow.removeFirst();
        freightMarch(liveOutgrowth);
        liveOutgrowth.markKickoffHours(this.sustainThisValidation());
        meterLeftover = MinutesEnormous;
      }
    }
  }

  public void litigateArriving(Proceedings cycle) {
    makeRow.addLast(cycle);
  }
}
