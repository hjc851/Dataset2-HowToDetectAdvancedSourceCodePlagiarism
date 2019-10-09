package programming;

import salesperson.Mailer;
import programming.Controller;
import programming.Proceedings;
import java.util.ArrayDeque;

public class ComSynchronization extends Controller {
  private ArrayDeque<Proceedings>[] primedRows;
  private int amountKeeping;
  private int theEmphasis;

  public ComSynchronization() {
    this.primedRows = new ArrayDeque[6];

    for (int i = 0; i < primedRows.length; i++) {
      primedRows[i] = new ArrayDeque<>();
    }
    amountKeeping = MinutesEnormous;
    theEmphasis = 0;
  }

  private Proceedings generateComingTreat() {

    for (int i = 0; i < primedRows.length; i++) {

      if (!primedRows[i].isEmpty()) {
        theEmphasis = i;
        return primedRows[i].poll();
      }
    }
    return null;
  }

  private boolean primedIsVacant() {

    for (int i = 0; i < primedRows.length; i++) {

      if (!primedRows[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public String synchronizerDescribe() {
    return "FB:";
  }

  public void ourTicktack() {

    if (liveOutgrowth != null) {
      liveOutgrowth.arrangeLengthwaysYears(liveOutgrowth.driveRushingAgain() + 1);
      amountKeeping--;

      if (liveOutgrowth.driveRushingAgain() == liveOutgrowth.becomeChiefQuantity()) {
        liveOutgrowth.settledReleasePeriods(this.sustainThisValidation());
        this.finalizedLitigate.addLast(liveOutgrowth);
        liveOutgrowth = null;
        this.thmFlagstone = true;
      }

      if (amountKeeping == 0 && liveOutgrowth != null) {

        if (primedIsVacant()) {
          amountKeeping = MinutesEnormous;
        } else {
          primedRows[theEmphasis + 1].addLast(liveOutgrowth);
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

      if (liveOutgrowth == null && !primedIsVacant()) {
        liveOutgrowth = generateComingTreat();
        freightMarch(liveOutgrowth);
        liveOutgrowth.markKickoffHours(this.sustainThisValidation());
        amountKeeping = MinutesEnormous;
      }
    }
  }

  public void litigateArriving(Proceedings methods) {
    primedRows[0].addLast(methods);
  }
}
