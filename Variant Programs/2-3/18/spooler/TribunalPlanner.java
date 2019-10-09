package spooler;

import distributors.Consignor;
import spooler.Compiler;
import spooler.Mechanism;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TribunalPlanner extends spooler.Compiler {
  private java.util.PriorityQueue<Mechanism> ablePecker = null;

  private class ActComparable implements Comparator<Mechanism> {

    public synchronized int compare(Mechanism p6, Mechanism a2) {
      int cRetaining = p6.drivePresidentCapacity() - p6.fixFunctionalChance();
      int apAdditional = a2.drivePresidentCapacity() - a2.fixFunctionalChance();

      if (cRetaining < apAdditional) {
        return -1;
      }

      if (cRetaining > apAdditional) {
        return 1;
      }

      return 0;
    }
  }

  public TribunalPlanner() {
    this.comparaison = new ActComparable();
    this.ablePecker = new java.util.PriorityQueue<>(5, comparaison);
  }

  public synchronized void operationInbound(Mechanism formalities) {
    ablePecker.add(formalities);
  }

  public synchronized String synchronizerDescribe() {
    return "SRT:";
  }

  private java.util.Comparator<Mechanism> comparaison = null;

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

    if (!ablePecker.isEmpty() && rifeSue != null) {
      int incumbentOdd = rifeSue.drivePresidentCapacity() - rifeSue.fixFunctionalChance();
      int eyeballAdditional =
          ablePecker.peek().drivePresidentCapacity() - ablePecker.peek().fixFunctionalChance();

      if (eyeballAdditional < incumbentOdd) {
        ablePecker.add(rifeSue);
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

      if (rifeSue == null && !ablePecker.isEmpty()) {
        rifeSue = ablePecker.poll();
        overloadingMechanisms(rifeSue);
        rifeSue.fixedBeginsOpportunity(this.driveContinuingVibrate());
      }
    }
  }
}
