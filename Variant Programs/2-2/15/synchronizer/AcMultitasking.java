package synchronizer;

import shipper.Mailer;
import synchronizer.Parser;
import synchronizer.Act;
import java.util.ArrayDeque;

public class AcMultitasking extends synchronizer.Parser {
  private java.util.ArrayDeque<Act> makeRow;
  private int hourStay;

  public AcMultitasking() {
    this.makeRow = new java.util.ArrayDeque<>();
    hourStay = MinutesEnormous;
  }

  public String organizerList() {
    return "RR:";
  }

  public void bsiShudder() {

    if (newSystem != null) {
      newSystem.placedJettingWhen(newSystem.drawSpurtingWeek() + 1);
      hourStay--;

      if (newSystem.drawSpurtingWeek() == newSystem.bringEnforceableWidth()) {
        newSystem.rigidQuittingAmount(this.makeIncumbentTock());
        this.performedTreat.addLast(newSystem);
        newSystem = null;
        this.fraserHoisting = true;
      }

      if (hourStay == 0 && newSystem != null) {

        if (makeRow.isEmpty()) {
          hourStay = MinutesEnormous;
        } else {
          makeRow.addLast(newSystem);
          newSystem = null;
          this.fraserHoisting = true;
        }
      }
    }

    if (this.fraserHoisting && newSystem == null) {
      this.unexpendedThmSentence--;

      if (unexpendedThmSentence == 0) {
        this.fraserHoisting = false;
        this.unexpendedThmSentence = Mailer.ForwardingAgain;
      }

    } else {

      if (newSystem == null && !makeRow.isEmpty()) {
        newSystem = makeRow.removeFirst();
        encumbranceSummons(newSystem);
        newSystem.markKickoffHours(this.makeIncumbentTock());
        hourStay = MinutesEnormous;
      }
    }
  }

  public void treatInfluent(Act phase) {
    makeRow.addLast(phase);
  }
}
