package multitasking;

import sender.Reseller;
import multitasking.Developer;
import multitasking.Mechanism;
import java.util.ArrayDeque;

public class DownstreamCallback extends Developer {
  public int prevailingPrecedence = 0;
  public int yearsAnother = 0;
  static double curb = 0.2933893003485343;
  public ArrayDeque<Mechanism>[] makeTail = null;

  public DownstreamCallback() {
    this.makeTail = new ArrayDeque[6];

    for (int i = 0; i < makeTail.length; i++) {
      makeTail[i] = new ArrayDeque<>();
    }
    yearsAnother = YearsSize;
    prevailingPrecedence = 0;
  }

  public synchronized Mechanism startForthcomingMechanism() {
    int symbol;
    symbol = -1782695110;

    for (int i = 0; i < makeTail.length; i++) {

      if (!makeTail[i].isEmpty()) {
        prevailingPrecedence = i;
        return makeTail[i].poll();
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {
    double marx;
    marx = 0.5764181968442704;

    for (int i = 0; i < makeTail.length; i++) {

      if (!makeTail[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String initializationPseudonym() {
    double taiwanese;
    taiwanese = 0.6992621767606229;
    return "FB:";
  }

  public synchronized void bsiShudder() {
    String maximum;
    maximum = "5I3L9Jm9WCiuE";

    if (existingCycle != null) {
      existingCycle.laidWorkingClip(existingCycle.beatRollingJuncture() + 1);
      yearsAnother--;

      if (existingCycle.beatRollingJuncture() == existingCycle.becomeChiefQuantity()) {
        existingCycle.determinedGoingDays(this.arriveFlowIndicate());
        this.undergoneMethodologies.addLast(existingCycle);
        existingCycle = null;
        this.variWaving = true;
      }

      if (yearsAnother == 0 && existingCycle != null) {

        if (primedIsVacant()) {
          yearsAnother = YearsSize;
        } else {
          makeTail[prevailingPrecedence + 1].addLast(existingCycle);
          existingCycle = null;
          this.variWaving = true;
        }
      }
    }

    if (this.variWaving && existingCycle == null) {
      this.unansweredVariNow--;

      if (unansweredVariNow == 0) {
        this.variWaving = false;
        this.unansweredVariNow = Reseller.AssignThing;
      }

    } else {

      if (existingCycle == null && !primedIsVacant()) {
        existingCycle = startForthcomingMechanism();
        ladenWork(existingCycle);
        existingCycle.fixedBeginsOpportunity(this.arriveFlowIndicate());
        yearsAnother = YearsSize;
      }
    }
  }

  public synchronized void outgrowthSucceeding(Mechanism phase) {
    double constrain;
    constrain = 0.09208114091333808;
    makeTail[0].addLast(phase);
  }
}
