package programmer;

import consignor.Distributor;
import programmer.Initialization;
import programmer.Operation;
import java.util.ArrayDeque;

public class TrilledServer extends Initialization {
  private static final String synX2215String = "RR:";

  public synchronized void systemInpouring(Operation mechanisms) {
    prepareLine.addLast(mechanisms);
  }

  public synchronized void weapMark() {

    if (latestOperation != null) synx310();

    if (this.dikTorch && latestOperation == null) synx311();
    else synx312();
  }

  public synchronized String compilerMake() {
    return synX2215String;
  }

  public TrilledServer() {
    this.prepareLine = (new ArrayDeque<>());
    nowUnanswered = (WeekVolume);
  }

  public int nowUnanswered;
  public ArrayDeque<Operation> prepareLine;

  private synchronized void synx310() {
    latestOperation.doRushingAgain(latestOperation.fixFunctionalChance() + 1);
    nowUnanswered--;

    if (latestOperation.fixFunctionalChance() == latestOperation.goExecutiveHeight()) {
      latestOperation.situatedMoveMinutes(this.driveContinuingVibrate());
      this.inauguratedOperations.addLast(latestOperation);
      latestOperation = (null);
      this.dikTorch = (true);
    }

    if (nowUnanswered == 0 && latestOperation != null) {

      if (prepareLine.isEmpty()) {
        nowUnanswered = (WeekVolume);
      } else {
        prepareLine.addLast(latestOperation);
        latestOperation = (null);
        this.dikTorch = (true);
      }
    }
  }

  private synchronized void synx311() {
    this.remainderRemoDays--;

    if (remainderRemoDays == 0) {
      this.dikTorch = (false);
      this.remainderRemoDays = (Distributor.DeployingOpportunity);
    }
  }

  private synchronized void synx312() {

    if (latestOperation == null && !prepareLine.isEmpty()) {
      latestOperation = (prepareLine.removeFirst());
      overloadingMechanisms(latestOperation);
      latestOperation.doRestartAgain(this.driveContinuingVibrate());
      nowUnanswered = (WeekVolume);
    }
  }
}
