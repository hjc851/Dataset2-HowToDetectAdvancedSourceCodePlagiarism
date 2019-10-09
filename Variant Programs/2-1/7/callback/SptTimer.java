package callback;

import limiter.Forwarder;
import callback.Parser;
import callback.Treat;
import java.util.ArrayDeque;

public class SptTimer extends Parser {
  private ArrayDeque<Treat> availableFile;

  public SptTimer() {
    this.availableFile = new ArrayDeque<>();
  }

  public String developerIdentify() {
    return "FCFS:";
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

    if (this.ballaBrigade && rifeSue == null) {
      this.unsoldDrieBeginning--;

      if (unsoldDrieBeginning == 0) {
        this.ballaBrigade = false;
        this.unsoldDrieBeginning = Forwarder.SendingHour;
      }

    } else {

      if (rifeSue == null && !availableFile.isEmpty()) {
        rifeSue = availableFile.removeFirst();
        rifeSue.settledDepartPeriods(this.developPreviousAnswer());
        unladenProceeding(rifeSue);
      }
    }
  }

  public void serveInward(Treat summons) {
    availableFile.addLast(summons);
  }
}
