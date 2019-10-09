package callback;

import limiter.Forwarder;
import callback.Parser;
import callback.Treat;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TreatedSynchronization extends Parser {
  private PriorityQueue<Treat> makeRow;
  private Comparator<Treat> comparable;

  public TreatedSynchronization() {
    this.comparable = new OperationComparative();
    this.makeRow = new PriorityQueue<>(5, comparable);
  }

  private class OperationComparative implements Comparator<Treat> {

    public int compare(Treat h, Treat n) {
      int atRest = h.drawBossScope() - h.developLengthwiseHour();
      int ribuloseRemainder = n.drawBossScope() - n.developLengthwiseHour();

      if (atRest < ribuloseRemainder) {
        return -1;
      }

      if (atRest > ribuloseRemainder) {
        return 1;
      }

      return 0;
    }
  }

  public String developerIdentify() {
    return "SRT:";
  }

  public void ourTicktack() {

    if (rifeSue != null) {
      rifeSue.arrangeLengthwaysYears(rifeSue.developLengthwiseHour() + 1);

      if (rifeSue.developLengthwiseHour() == rifeSue.drawBossScope()) {
        rifeSue.settledReleasePeriods(this.developPreviousAnswer());
        this.realizedWork.addLast(rifeSue);
        rifeSue = null;
        this.ballaBrigade = true;
      }
    }

    if (!makeRow.isEmpty() && rifeSue != null) {
      int theResidual = rifeSue.drawBossScope() - rifeSue.developLengthwiseHour();
      int sneakPending = makeRow.peek().drawBossScope() - makeRow.peek().developLengthwiseHour();

      if (sneakPending < theResidual) {
        makeRow.add(rifeSue);
        rifeSue = null;
        this.ballaBrigade = true;
      }
    }

    if (this.ballaBrigade && rifeSue == null) {
      this.unsoldDrieBeginning--;

      if (unsoldDrieBeginning == 0) {
        this.ballaBrigade = false;
        this.unsoldDrieBeginning = Forwarder.SendingHour;
      }

    } else {

      if (rifeSue == null && !makeRow.isEmpty()) {
        rifeSue = makeRow.poll();
        unladenProceeding(rifeSue);
        rifeSue.settledDepartPeriods(this.developPreviousAnswer());
      }
    }
  }

  public void serveInward(Treat negotiations) {
    makeRow.add(negotiations);
  }
}
