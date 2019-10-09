package database;

import regulator.Device;
import database.Parser;
import database.Litigate;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DefinedCompiler extends database.Parser {
  private java.util.PriorityQueue<Litigate> happyStopper;
  private java.util.Comparator<Litigate> yardstick;

  public DefinedCompiler() {
    this.yardstick = new OutgrowthComparing();
    this.happyStopper = new java.util.PriorityQueue<>(5, yardstick);
  }

  private class OutgrowthComparing implements Comparator<Litigate> {

    public int compare(Litigate conf, Litigate a) {
      int fUnanswered = conf.fetchManagerVastness() - conf.makeFlyingDay();
      int gpiLeft = a.fetchManagerVastness() - a.makeFlyingDay();

      if (fUnanswered < gpiLeft) {
        return -1;
      }

      if (fUnanswered > gpiLeft) {
        return 1;
      }

      return 0;
    }
  }

  public String multitaskingMoniker() {
    return "SRT:";
  }

  public void addTock() {

    if (formerFormalities != null) {
      formerFormalities.placeSpurtingWeek(formerFormalities.makeFlyingDay() + 1);

      if (formerFormalities.makeFlyingDay() == formerFormalities.fetchManagerVastness()) {
        formerFormalities.putDepartureClock(this.makeIncumbentTock());
        this.constructedMethodology.addLast(formerFormalities);
        formerFormalities = null;
        this.reckTricolor = true;
      }
    }

    if (!happyStopper.isEmpty() && formerFormalities != null) {
      int flowAdditional =
          formerFormalities.fetchManagerVastness() - formerFormalities.makeFlyingDay();
      int readRetaining =
          happyStopper.peek().fetchManagerVastness() - happyStopper.peek().makeFlyingDay();

      if (readRetaining < flowAdditional) {
        happyStopper.add(formerFormalities);
        formerFormalities = null;
        this.reckTricolor = true;
      }
    }

    if (this.reckTricolor && formerFormalities == null) {
      this.remainderRemoDays--;

      if (remainderRemoDays == 0) {
        this.reckTricolor = false;
        this.remainderRemoDays = Device.ExpeditionPeriod;
      }

    } else {

      if (formerFormalities == null && !happyStopper.isEmpty()) {
        formerFormalities = happyStopper.poll();
        stowLitigate(formerFormalities);
        formerFormalities.prepareOffsetNow(this.makeIncumbentTock());
      }
    }
  }

  public void proceduresIngress(Litigate proceeding) {
    happyStopper.add(proceeding);
  }
}
