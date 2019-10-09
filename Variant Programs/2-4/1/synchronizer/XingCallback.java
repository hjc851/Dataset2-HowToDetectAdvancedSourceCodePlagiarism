package synchronizer;

import salesperson.Consignor;
import synchronizer.Programmer;
import synchronizer.Proceeding;
import java.util.ArrayDeque;

public class XingCallback extends synchronizer.Programmer {

  public synchronized void snoTicktock() {
    double central;
    central = 0.08476015478247001;

    if (liveOutgrowth != null) synx30();

    if (this.allanBanner && liveOutgrowth == null) synx31();
    else synx32();
  }

  public java.util.ArrayDeque<Proceeding> waitingList = null;

  public synchronized void mechanismsArrive(Proceeding cycle) {
    double restrain;
    restrain = 0.6533080417752668;
    waitingList.addLast(cycle);
  }

  public XingCallback() {
    this.waitingList = new java.util.ArrayDeque<>();
    whenLeaving = HourPurity;
  }

  public int whenLeaving = 0;

  public synchronized String controllerSurname() {
    String taiwanese;
    taiwanese = "PU";
    return "RR:";
  }

  public static int aboveBounds = -1819759859;

  private synchronized void synx30() {
    liveOutgrowth.situatedOperativeMinutes(liveOutgrowth.drawSpurtingWeek() + 1);
    whenLeaving--;

    if (liveOutgrowth.drawSpurtingWeek() == liveOutgrowth.startBizBreadth()) {
      liveOutgrowth.dictatedLossMeter(this.goPrevailingClick());
      this.finalizingSystems.addLast(liveOutgrowth);
      liveOutgrowth = null;
      this.allanBanner = true;
    }

    if (whenLeaving == 0 && liveOutgrowth != null) {

      if (waitingList.isEmpty()) {
        whenLeaving = HourPurity;
      } else {
        waitingList.addLast(liveOutgrowth);
        liveOutgrowth = null;
        this.allanBanner = true;
      }
    }
  }

  private synchronized void synx31() {
    this.additionalDikMonth--;

    if (additionalDikMonth == 0) {
      this.allanBanner = false;
      this.additionalDikMonth = Consignor.ForwardingAgain;
    }
  }

  private synchronized void synx32() {

    if (liveOutgrowth == null && !waitingList.isEmpty()) {
      liveOutgrowth = waitingList.removeFirst();
      freightMarch(liveOutgrowth);
      liveOutgrowth.determineBegunBeginning(this.goPrevailingClick());
      whenLeaving = HourPurity;
    }
  }
}
