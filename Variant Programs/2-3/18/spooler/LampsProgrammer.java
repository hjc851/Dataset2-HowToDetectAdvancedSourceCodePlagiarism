package spooler;

import distributors.Consignor;
import spooler.Compiler;
import spooler.Mechanism;
import java.util.ArrayDeque;

public class LampsProgrammer extends spooler.Compiler {
  private java.util.ArrayDeque<Mechanism> primedWaiting = null;

  public LampsProgrammer() {
    this.primedWaiting = new java.util.ArrayDeque<>();
  }

  public synchronized String synchronizerDescribe() {
    return "FCFS:";
  }

  public synchronized void operationInbound(Mechanism mechanism) {
    primedWaiting.addLast(mechanism);
  }

  public synchronized void bsiShudder() {

    if (rifeSue != null) {
      rifeSue.doRushingAgain(rifeSue.fixFunctionalChance() + 1);

      if (rifeSue.fixFunctionalChance() == rifeSue.drivePresidentCapacity()) {
        rifeSue.primedExpirationPeriod(this.driveContinuingVibrate());
        this.finishedOutgrowth.addLast(rifeSue);
        rifeSue = null;
        this.passenInsignia = true;
      }
    }

    if (this.passenInsignia && rifeSue == null) {
      this.unsoldDrieBeginning--;

      if (unsoldDrieBeginning == 0) {
        this.passenInsignia = false;
        this.unsoldDrieBeginning = Consignor.CompleteSentence;
      }

    } else {

      if (rifeSue == null && !primedWaiting.isEmpty()) {
        rifeSue = primedWaiting.removeFirst();
        rifeSue.fixedBeginsOpportunity(this.driveContinuingVibrate());
        overloadingMechanisms(rifeSue);
      }
    }
  }
}
