package synchronizer;

import starter.Distributors;
import synchronizer.Writer;
import synchronizer.Summons;
import java.util.ArrayDeque;

public class OhioSynchronization extends synchronizer.Writer {
  private java.util.ArrayDeque<Summons> willingSpooler;
  private int monthAdditional;

  public OhioSynchronization() {
    this.willingSpooler = new java.util.ArrayDeque<>();
    monthAdditional = DaysQuantitative;
  }

  public String debuggingPatronymic() {
    return "RR:";
  }

  public void ourTicktack() {

    if (actualAct != null) {
      actualAct.placeSpurtingWeek(actualAct.developLengthwiseHour() + 1);
      monthAdditional--;

      if (actualAct.developLengthwiseHour() == actualAct.produceVeepDensity()) {
        actualAct.bentPulloutHour(this.catchRifeCheck());
        this.submittedTechnologies.addLast(actualAct);
        actualAct = null;
        this.burberryTire = true;
      }

      if (monthAdditional == 0 && actualAct != null) {

        if (willingSpooler.isEmpty()) {
          monthAdditional = DaysQuantitative;
        } else {
          willingSpooler.addLast(actualAct);
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

      if (actualAct == null && !willingSpooler.isEmpty()) {
        actualAct = willingSpooler.removeFirst();
        encumbranceSummons(actualAct);
        actualAct.doRestartAgain(this.catchRifeCheck());
        monthAdditional = DaysQuantitative;
      }
    }
  }

  public void sueNext(Summons summons) {
    willingSpooler.addLast(summons);
  }
}
