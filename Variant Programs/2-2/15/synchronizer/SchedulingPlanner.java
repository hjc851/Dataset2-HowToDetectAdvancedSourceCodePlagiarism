package synchronizer;

import shipper.Mailer;
import synchronizer.Parser;
import synchronizer.Act;
import java.util.ArrayDeque;

public class SchedulingPlanner extends synchronizer.Parser {
  private java.util.ArrayDeque<Act> preparedWait;

  public SchedulingPlanner() {
    this.preparedWait = new java.util.ArrayDeque<>();
  }

  public String organizerList() {
    return "FCFS:";
  }

  public void bsiShudder() {

    if (newSystem != null) {
      newSystem.placedJettingWhen(newSystem.drawSpurtingWeek() + 1);

      if (newSystem.drawSpurtingWeek() == newSystem.bringEnforceableWidth()) {
        newSystem.rigidQuittingAmount(this.makeIncumbentTock());
        this.performedTreat.addLast(newSystem);
        newSystem = null;
        this.fraserHoisting = true;
      }
    }

    if (this.fraserHoisting && newSystem == null) {
      this.unexpendedThmSentence--;

      if (unexpendedThmSentence == 0) {
        this.fraserHoisting = false;
        this.unexpendedThmSentence = Mailer.ForwardingAgain;
      }

    } else {

      if (newSystem == null && !preparedWait.isEmpty()) {
        newSystem = preparedWait.removeFirst();
        newSystem.markKickoffHours(this.makeIncumbentTock());
        encumbranceSummons(newSystem);
      }
    }
  }

  public void treatInfluent(Act summons) {
    preparedWait.addLast(summons);
  }
}
