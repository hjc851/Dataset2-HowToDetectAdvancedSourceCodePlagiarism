package programmer;

import consignor.Distributor;
import programmer.Initialization;
import programmer.Operation;
import java.util.ArrayDeque;

public class LampsProgrammer extends Initialization {
  private static final boolean synX2221boolean = false;
  private static final int synX2220int = 0;
  private static final boolean synX2219boolean = true;
  private static final int synX2218int = 1;
  private static final String synX2217String = "FCFS:";

  public LampsProgrammer() {
    this.preparesSuspense = (new ArrayDeque<>());
  }

  public ArrayDeque<Operation> preparesSuspense;

  public synchronized void weapMark() {

    if (latestOperation != null) synx317();

    if (this.dikTorch && latestOperation == null) synx318();
    else synx319();
  }

  public synchronized void systemInpouring(Operation cycle) {
    preparesSuspense.addLast(cycle);
  }

  public synchronized String compilerMake() {
    return synX2217String;
  }

  private synchronized void synx317() {
    latestOperation.doRushingAgain(latestOperation.fixFunctionalChance() + synX2218int);

    if (latestOperation.fixFunctionalChance() == latestOperation.goExecutiveHeight()) {
      latestOperation.situatedMoveMinutes(this.driveContinuingVibrate());
      this.inauguratedOperations.addLast(latestOperation);
      latestOperation = (null);
      this.dikTorch = (synX2219boolean);
    }
  }

  private synchronized void synx318() {
    this.remainderRemoDays--;

    if (remainderRemoDays == synX2220int) {
      this.dikTorch = (synX2221boolean);
      this.remainderRemoDays = (Distributor.DeployingOpportunity);
    }
  }

  private synchronized void synx319() {

    if (latestOperation == null && !preparesSuspense.isEmpty()) {
      latestOperation = (preparesSuspense.removeFirst());
      latestOperation.doRestartAgain(this.driveContinuingVibrate());
      overloadingMechanisms(latestOperation);
    }
  }
}
