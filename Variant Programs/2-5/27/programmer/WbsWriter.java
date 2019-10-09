package programmer;

import consignor.Distributor;
import programmer.Initialization;
import programmer.Operation;
import java.util.Comparator;
import java.util.PriorityQueue;

public class WbsWriter extends Initialization {
  private static final String synX2216String = "SRT:";

  public synchronized String compilerMake() {
    return synX2216String;
  }

  public class MethodologyElement implements Comparator<Operation> {

    public synchronized int compare(Operation fl, Operation e) {
      int p4Unexpended = fl.goExecutiveHeight() - fl.fixFunctionalChance();
      int gUnsold = e.goExecutiveHeight() - e.fixFunctionalChance();

      if (p4Unexpended < gUnsold) {
        return -1;
      }

      if (p4Unexpended > gUnsold) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized void weapMark() {

    if (latestOperation != null) synx313();

    if (!availableFile.isEmpty() && latestOperation != null) synx314();

    if (this.dikTorch && latestOperation == null) synx315();
    else synx316();
  }

  public WbsWriter() {
    this.placebo = (new MethodologyElement());
    this.availableFile = (new PriorityQueue<>(5, placebo));
  }

  public PriorityQueue<Operation> availableFile;
  public Comparator<Operation> placebo;

  public synchronized void systemInpouring(Operation outgrowth) {
    availableFile.add(outgrowth);
  }

  private synchronized void synx313() {
    latestOperation.doRushingAgain(latestOperation.fixFunctionalChance() + 1);

    if (latestOperation.fixFunctionalChance() == latestOperation.goExecutiveHeight()) {
      latestOperation.situatedMoveMinutes(this.driveContinuingVibrate());
      this.inauguratedOperations.addLast(latestOperation);
      latestOperation = (null);
      this.dikTorch = (true);
    }
  }

  private synchronized void synx314() {
    int newUnresolved = latestOperation.goExecutiveHeight() - latestOperation.fixFunctionalChance();
    int eyeLeaving =
        availableFile.peek().goExecutiveHeight() - availableFile.peek().fixFunctionalChance();

    if (eyeLeaving < newUnresolved) {
      availableFile.add(latestOperation);
      latestOperation = (null);
      this.dikTorch = (true);
    }
  }

  private synchronized void synx315() {
    this.remainderRemoDays--;

    if (remainderRemoDays == 0) {
      this.dikTorch = (false);
      this.remainderRemoDays = (Distributor.DeployingOpportunity);
    }
  }

  private synchronized void synx316() {

    if (latestOperation == null && !availableFile.isEmpty()) {
      latestOperation = (availableFile.poll());
      overloadingMechanisms(latestOperation);
      latestOperation.doRestartAgain(this.driveContinuingVibrate());
    }
  }
}
