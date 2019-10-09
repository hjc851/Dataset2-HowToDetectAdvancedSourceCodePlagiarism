package callback;

import limiter.Forwarder;
import callback.Parser;
import callback.Treat;
import java.util.ArrayDeque;

public class DiddleProgramming extends Parser {
  private ArrayDeque<Treat> preparesSuspense;
  private int clockLeft;

  public DiddleProgramming() {
    this.preparesSuspense = new ArrayDeque<>();
    clockLeft = YearsSize;
  }

  public String developerIdentify() {
    return "RR:";
  }

  public void ourTicktack() {

    if (rifeSue != null) {
      rifeSue.arrangeLengthwaysYears(rifeSue.developLengthwiseHour() + 1);
      clockLeft--;

      if (rifeSue.developLengthwiseHour() == rifeSue.drawBossScope()) {
        rifeSue.settledReleasePeriods(this.developPreviousAnswer());
        this.realizedWork.addLast(rifeSue);
        rifeSue = null;
        this.ballaBrigade = true;
      }

      if (clockLeft == 0 && rifeSue != null) {

        if (preparesSuspense.isEmpty()) {
          clockLeft = YearsSize;
        } else {
          preparesSuspense.addLast(rifeSue);
          rifeSue = null;
          this.ballaBrigade = true;
        }
      }
    }

    if (this.ballaBrigade && rifeSue == null) {
      this.unsoldDrieBeginning--;

      if (unsoldDrieBeginning == 0) {
        this.ballaBrigade = false;
        this.unsoldDrieBeginning = Forwarder.SendingHour;
      }

    } else {

      if (rifeSue == null && !preparesSuspense.isEmpty()) {
        rifeSue = preparesSuspense.removeFirst();
        unladenProceeding(rifeSue);
        rifeSue.settledDepartPeriods(this.developPreviousAnswer());
        clockLeft = YearsSize;
      }
    }
  }

  public void serveInward(Treat sue) {
    preparesSuspense.addLast(sue);
  }
}
