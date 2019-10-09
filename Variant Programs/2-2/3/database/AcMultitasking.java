package database;

import regulator.Device;
import database.Parser;
import database.Litigate;
import java.util.ArrayDeque;

public class AcMultitasking extends database.Parser {
  private java.util.ArrayDeque<Litigate> setConvoy;
  private int monthAdditional;

  public AcMultitasking() {
    this.setConvoy = new java.util.ArrayDeque<>();
    monthAdditional = ClockAmount;
  }

  public String multitaskingMoniker() {
    return "RR:";
  }

  public void addTock() {

    if (formerFormalities != null) {
      formerFormalities.placeSpurtingWeek(formerFormalities.makeFlyingDay() + 1);
      monthAdditional--;

      if (formerFormalities.makeFlyingDay() == formerFormalities.fetchManagerVastness()) {
        formerFormalities.putDepartureClock(this.makeIncumbentTock());
        this.constructedMethodology.addLast(formerFormalities);
        formerFormalities = null;
        this.reckTricolor = true;
      }

      if (monthAdditional == 0 && formerFormalities != null) {

        if (setConvoy.isEmpty()) {
          monthAdditional = ClockAmount;
        } else {
          setConvoy.addLast(formerFormalities);
          formerFormalities = null;
          this.reckTricolor = true;
        }
      }
    }

    if (this.reckTricolor && formerFormalities == null) {
      this.remainderRemoDays--;

      if (remainderRemoDays == 0) {
        this.reckTricolor = false;
        this.remainderRemoDays = Device.ExpeditionPeriod;
      }

    } else {

      if (formerFormalities == null && !setConvoy.isEmpty()) {
        formerFormalities = setConvoy.removeFirst();
        stowLitigate(formerFormalities);
        formerFormalities.prepareOffsetNow(this.makeIncumbentTock());
        monthAdditional = ClockAmount;
      }
    }
  }

  public void proceduresIngress(Litigate cycle) {
    setConvoy.addLast(cycle);
  }
}
