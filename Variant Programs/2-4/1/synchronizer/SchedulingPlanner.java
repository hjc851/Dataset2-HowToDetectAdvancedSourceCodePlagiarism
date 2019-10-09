package synchronizer;

import salesperson.Consignor;
import synchronizer.Programmer;
import synchronizer.Proceeding;
import java.util.ArrayDeque;

public class SchedulingPlanner extends synchronizer.Programmer {

  public synchronized void snoTicktock() {
    int upstairsRestrain;
    upstairsRestrain = -1047316484;

    if (liveOutgrowth != null) synx37();

    if (this.allanBanner && liveOutgrowth == null) synx38();
    else synx39();
  }

  public synchronized String controllerSurname() {
    double minhBandwidth;
    minhBandwidth = 0.05180814398523548;
    return "FCFS:";
  }

  public SchedulingPlanner() {
    this.gonnaDong = new java.util.ArrayDeque<>();
  }

  public java.util.ArrayDeque<Proceeding> gonnaDong = null;
  static final int infernalCertain = -968936713;

  public synchronized void mechanismsArrive(Proceeding methodology) {
    double glowerSure;
    glowerSure = 0.9729296175014841;
    gonnaDong.addLast(methodology);
  }

  private synchronized void synx37() {
    liveOutgrowth.situatedOperativeMinutes(liveOutgrowth.drawSpurtingWeek() + 1);

    if (liveOutgrowth.drawSpurtingWeek() == liveOutgrowth.startBizBreadth()) {
      liveOutgrowth.dictatedLossMeter(this.goPrevailingClick());
      this.finalizingSystems.addLast(liveOutgrowth);
      liveOutgrowth = null;
      this.allanBanner = true;
    }
  }

  private synchronized void synx38() {
    this.additionalDikMonth--;

    if (additionalDikMonth == 0) {
      this.allanBanner = false;
      this.additionalDikMonth = Consignor.ForwardingAgain;
    }
  }

  private synchronized void synx39() {

    if (liveOutgrowth == null && !gonnaDong.isEmpty()) {
      liveOutgrowth = gonnaDong.removeFirst();
      liveOutgrowth.determineBegunBeginning(this.goPrevailingClick());
      freightMarch(liveOutgrowth);
    }
  }
}
