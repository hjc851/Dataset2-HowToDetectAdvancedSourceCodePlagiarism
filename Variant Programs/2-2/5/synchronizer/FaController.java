package synchronizer;

import starter.Distributors;
import synchronizer.Writer;
import synchronizer.Summons;
import java.util.ArrayDeque;

public class FaController extends synchronizer.Writer {
  private ArrayDeque<Summons>[] preppedDelays;
  private int momentUnexhausted;
  private int previousObjective;

  public FaController() {
    this.preppedDelays = new java.util.ArrayDeque[6];

    for (int i = 0; i < preppedDelays.length; i++) {
      preppedDelays[i] = new java.util.ArrayDeque<>();
    }
    momentUnexhausted = DaysQuantitative;
    previousObjective = 0;
  }

  private synchronizer.Summons haveFirstServe() {

    for (int i = 0; i < preppedDelays.length; i++) {

      if (!preppedDelays[i].isEmpty()) {
        previousObjective = i;
        return preppedDelays[i].poll();
      }
    }
    return null;
  }

  private boolean primedIsVacant() {

    for (int i = 0; i < preppedDelays.length; i++) {

      if (!preppedDelays[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public String debuggingPatronymic() {
    return "FB:";
  }

  public void ourTicktack() {

    if (actualAct != null) {
      actualAct.placeSpurtingWeek(actualAct.developLengthwiseHour() + 1);
      momentUnexhausted--;

      if (actualAct.developLengthwiseHour() == actualAct.produceVeepDensity()) {
        actualAct.bentPulloutHour(this.catchRifeCheck());
        this.submittedTechnologies.addLast(actualAct);
        actualAct = null;
        this.burberryTire = true;
      }

      if (momentUnexhausted == 0 && actualAct != null) {

        if (primedIsVacant()) {
          momentUnexhausted = DaysQuantitative;
        } else {
          preppedDelays[previousObjective + 1].addLast(actualAct);
          actualAct = null;
          this.burberryTire = true;
        }
      }
    }

    if (this.burberryTire && actualAct == null) {
      this.leavingBrinWhen--;

      if (leavingBrinWhen == 0) {
        this.burberryTire = false;
        this.leavingBrinWhen = Distributors.AssignThing;
      }

    } else {

      if (actualAct == null && !primedIsVacant()) {
        actualAct = haveFirstServe();
        encumbranceSummons(actualAct);
        actualAct.doRestartAgain(this.catchRifeCheck());
        momentUnexhausted = DaysQuantitative;
      }
    }
  }

  public void sueNext(Summons cycle) {
    preppedDelays[0].addLast(cycle);
  }
}
