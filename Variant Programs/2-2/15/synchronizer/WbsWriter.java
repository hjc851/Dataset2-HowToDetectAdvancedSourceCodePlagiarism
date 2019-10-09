package synchronizer;

import shipper.Mailer;
import synchronizer.Parser;
import synchronizer.Act;
import java.util.Comparator;
import java.util.PriorityQueue;

public class WbsWriter extends synchronizer.Parser {
  private java.util.PriorityQueue<Act> fixJumping;
  private java.util.Comparator<Act> comparable;

  public WbsWriter() {
    this.comparable = new AppendageCompared();
    this.fixJumping = new java.util.PriorityQueue<>(5, comparable);
  }

  private class AppendageCompared implements Comparator<Act> {

    public int compare(Act j, Act a1) {
      int hAnother = j.bringEnforceableWidth() - j.drawSpurtingWeek();
      int b2Unanswered = a1.bringEnforceableWidth() - a1.drawSpurtingWeek();

      if (hAnother < b2Unanswered) {
        return -1;
      }

      if (hAnother > b2Unanswered) {
        return 1;
      }

      return 0;
    }
  }

  public String organizerList() {
    return "SRT:";
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

    if (!fixJumping.isEmpty() && newSystem != null) {
      int typicalMaintaining = newSystem.bringEnforceableWidth() - newSystem.drawSpurtingWeek();
      int glanceLeft =
          fixJumping.peek().bringEnforceableWidth() - fixJumping.peek().drawSpurtingWeek();

      if (glanceLeft < typicalMaintaining) {
        fixJumping.add(newSystem);
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

      if (newSystem == null && !fixJumping.isEmpty()) {
        newSystem = fixJumping.poll();
        encumbranceSummons(newSystem);
        newSystem.markKickoffHours(this.makeIncumbentTock());
      }
    }
  }

  public void treatInfluent(Act system) {
    fixJumping.add(system);
  }
}
