package synchronizer;

import starter.Distributors;
import synchronizer.Writer;
import synchronizer.Summons;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MinimumController extends synchronizer.Writer {
  private java.util.PriorityQueue<Summons> happyStopper;
  private java.util.Comparator<Summons> intercomparison;

  public MinimumController() {
    this.intercomparison = new MarchCompare();
    this.happyStopper = new java.util.PriorityQueue<>(5, intercomparison);
  }

  private class MarchCompare implements Comparator<Summons> {

    public int compare(Summons pv, Summons a3) {
      int piPending = pv.produceVeepDensity() - pv.developLengthwiseHour();
      int hPending = a3.produceVeepDensity() - a3.developLengthwiseHour();

      if (piPending < hPending) {
        return -1;
      }

      if (piPending > hPending) {
        return 1;
      }

      return 0;
    }
  }

  public String debuggingPatronymic() {
    return "SRT:";
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

    if (!happyStopper.isEmpty() && actualAct != null) {
      int topicalFinal = actualAct.produceVeepDensity() - actualAct.developLengthwiseHour();
      int ganderUnexhausted =
          happyStopper.peek().produceVeepDensity() - happyStopper.peek().developLengthwiseHour();

      if (ganderUnexhausted < topicalFinal) {
        happyStopper.add(actualAct);
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

      if (actualAct == null && !happyStopper.isEmpty()) {
        actualAct = happyStopper.poll();
        encumbranceSummons(actualAct);
        actualAct.doRestartAgain(this.catchRifeCheck());
      }
    }
  }

  public void sueNext(Summons serve) {
    happyStopper.add(serve);
  }
}
