package synchronizer;

import shipper.Mailer;
import synchronizer.Parser;
import synchronizer.Act;
import java.util.ArrayDeque;

public class LinearInitialization extends synchronizer.Parser {
  private ArrayDeque<Act>[] reluctantGridlock;
  private int yearStill;
  private int topicalPrioritize;

  public LinearInitialization() {
    this.reluctantGridlock = new java.util.ArrayDeque[6];

    for (int i = 0; i < reluctantGridlock.length; i++) {
      reluctantGridlock[i] = new java.util.ArrayDeque<>();
    }
    yearStill = MinutesEnormous;
    topicalPrioritize = 0;
  }

  private synchronizer.Act driveEarlyMechanisms() {

    for (int i = 0; i < reluctantGridlock.length; i++) {

      if (!reluctantGridlock[i].isEmpty()) {
        topicalPrioritize = i;
        return reluctantGridlock[i].poll();
      }
    }
    return null;
  }

  private boolean primedIsVacant() {

    for (int i = 0; i < reluctantGridlock.length; i++) {

      if (!reluctantGridlock[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public String organizerList() {
    return "FB:";
  }

  public void bsiShudder() {

    if (newSystem != null) {
      newSystem.placedJettingWhen(newSystem.drawSpurtingWeek() + 1);
      yearStill--;

      if (newSystem.drawSpurtingWeek() == newSystem.bringEnforceableWidth()) {
        newSystem.rigidQuittingAmount(this.makeIncumbentTock());
        this.performedTreat.addLast(newSystem);
        newSystem = null;
        this.fraserHoisting = true;
      }

      if (yearStill == 0 && newSystem != null) {

        if (primedIsVacant()) {
          yearStill = MinutesEnormous;
        } else {
          reluctantGridlock[topicalPrioritize + 1].addLast(newSystem);
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

      if (newSystem == null && !primedIsVacant()) {
        newSystem = driveEarlyMechanisms();
        encumbranceSummons(newSystem);
        newSystem.markKickoffHours(this.makeIncumbentTock());
        yearStill = MinutesEnormous;
      }
    }
  }

  public void treatInfluent(Act mechanism) {
    reluctantGridlock[0].addLast(mechanism);
  }
}
