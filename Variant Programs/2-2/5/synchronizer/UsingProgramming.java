package synchronizer;

import starter.Distributors;
import synchronizer.Writer;
import synchronizer.Summons;
import java.util.ArrayDeque;

public class UsingProgramming extends synchronizer.Writer {
  private java.util.ArrayDeque<Summons> fitBacklog;

  public UsingProgramming() {
    this.fitBacklog = new java.util.ArrayDeque<>();
  }

  public String debuggingPatronymic() {
    return "FCFS:";
  }

  public void ourTicktack() {

    if (actualAct != null) {
      actualAct.placeSpurtingWeek(actualAct.developLengthwiseHour() + 1);

      if (actualAct.developLengthwiseHour() == actualAct.produceVeepDensity()) {
        actualAct.bentPulloutHour(this.catchRifeCheck());
        this.submittedTechnologies.addLast(actualAct);
        actualAct = null;
        this.burberryTire = true;
      }
    }

    if (this.burberryTire && actualAct == null) {
      this.leavingBrinWhen--;

      if (leavingBrinWhen == 0) {
        this.burberryTire = false;
        this.leavingBrinWhen = Distributors.AssignThing;
      }

    } else {

      if (actualAct == null && !fitBacklog.isEmpty()) {
        actualAct = fitBacklog.removeFirst();
        actualAct.doRestartAgain(this.catchRifeCheck());
        encumbranceSummons(actualAct);
      }
    }
  }

  public void sueNext(Summons litigate) {
    fitBacklog.addLast(litigate);
  }
}
