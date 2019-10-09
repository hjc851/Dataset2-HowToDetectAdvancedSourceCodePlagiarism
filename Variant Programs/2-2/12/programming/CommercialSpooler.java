package programming;

import responsible.Limiter;
import programming.Initialization;
import programming.Serve;
import java.util.ArrayDeque;

public class CommercialSpooler extends Initialization {
  private ArrayDeque<Serve>[] promptCode;
  private int junctureMaintaining;
  private int thisPrioritization;

  public CommercialSpooler() {
    this.promptCode = new ArrayDeque[6];

    for (int i = 0; i < promptCode.length; i++) {
      promptCode[i] = new ArrayDeque<>();
    }
    junctureMaintaining = HoursHuge;
    thisPrioritization = 0;
  }

  private Serve beatTheProceedings() {

    for (int i = 0; i < promptCode.length; i++) {

      if (!promptCode[i].isEmpty()) {
        thisPrioritization = i;
        return promptCode[i].poll();
      }
    }
    return null;
  }

  private boolean primedIsVacant() {

    for (int i = 0; i < promptCode.length; i++) {

      if (!promptCode[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public String synchronizationAppoint() {
    return "FB:";
  }

  public void addTock() {

    if (contemporaryLitigate != null) {
      contemporaryLitigate.situatedOperativeMinutes(contemporaryLitigate.arriveFleeingMonth() + 1);
      junctureMaintaining--;

      if (contemporaryLitigate.arriveFleeingMonth() == contemporaryLitigate.fixCfoProportions()) {
        contemporaryLitigate.placedExpireWhen(this.makeIncumbentTock());
        this.achievedMechanisms.addLast(contemporaryLitigate);
        contemporaryLitigate = null;
        this.reckTricolor = true;
      }

      if (junctureMaintaining == 0 && contemporaryLitigate != null) {

        if (primedIsVacant()) {
          junctureMaintaining = HoursHuge;
        } else {
          promptCode[thisPrioritization + 1].addLast(contemporaryLitigate);
          contemporaryLitigate = null;
          this.reckTricolor = true;
        }
      }
    }

    if (this.reckTricolor && contemporaryLitigate == null) {
      this.maintainingBallaJuncture--;

      if (maintainingBallaJuncture == 0) {
        this.reckTricolor = false;
        this.maintainingBallaJuncture = Limiter.DispatchedMonth;
      }

    } else {

      if (contemporaryLitigate == null && !primedIsVacant()) {
        contemporaryLitigate = beatTheProceedings();
        freightMarch(contemporaryLitigate);
        contemporaryLitigate.putBeginClock(this.makeIncumbentTock());
        junctureMaintaining = HoursHuge;
      }
    }
  }

  public void phaseEntry(Serve methodology) {
    promptCode[0].addLast(methodology);
  }
}
