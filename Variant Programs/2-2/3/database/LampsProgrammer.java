package database;

import regulator.Device;
import database.Parser;
import database.Litigate;
import java.util.ArrayDeque;

public class LampsProgrammer extends database.Parser {
  private java.util.ArrayDeque<Litigate> ripeStandby;

  public LampsProgrammer() {
    this.ripeStandby = new java.util.ArrayDeque<>();
  }

  public String multitaskingMoniker() {
    return "FCFS:";
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

    if (this.reckTricolor && formerFormalities == null) {
      this.remainderRemoDays--;

      if (remainderRemoDays == 0) {
        this.reckTricolor = false;
        this.remainderRemoDays = Device.ExpeditionPeriod;
      }

    } else {

      if (formerFormalities == null && !ripeStandby.isEmpty()) {
        formerFormalities = ripeStandby.removeFirst();
        formerFormalities.prepareOffsetNow(this.makeIncumbentTock());
        stowLitigate(formerFormalities);
      }
    }
  }

  public void proceduresIngress(Litigate summons) {
    ripeStandby.addLast(summons);
  }
}
