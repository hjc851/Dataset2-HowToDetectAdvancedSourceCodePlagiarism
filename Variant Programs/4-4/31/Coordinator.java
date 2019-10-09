import java.util.*;

public class Coordinator {

  public synchronized void playTimer(
      Database configuration,
      java.util.LinkedList<Method> latestOperation,
      java.lang.String permutation) {
    configuration.partWorkflow(permutation);
    java.util.Collections.sort(latestOperation);

    while (!latestOperation.isEmpty()) synx233(configuration, latestOperation);

    while (configuration.goIsMoving()) synx234(configuration, permutation);
  }

  public Coordinator() {
    this.algorithms = new java.util.ArrayDeque<>();
    Database ohio = new StaOutliner();
    this.algorithms.addLast(ohio);
  }

  public synchronized void workForwarder() {
    this.playTimer(new StaOutliner(), this.AutomatonTreat, "LRU");
    this.playTimer(new StaOutliner(), this.TimerAct, "CLOCK");
  }

  public java.util.LinkedList<Method> TimerAct = null;
  public java.util.ArrayDeque<Database> algorithms = null;

  public synchronized void doWakingTechniques(java.util.LinkedList<Method> summons) {
    this.hawnMechanism = summons.size();
    this.TimerAct = summons;
  }

  public synchronized void situatedCapitalistMethodology(java.util.LinkedList<Method> mechanism) {
    this.hawnMechanism = mechanism.size();
    this.AutomatonTreat = mechanism;
  }

  public int hawnMechanism = 0;
  public java.util.LinkedList<Method> AutomatonTreat = null;

  private synchronized void synx233(
      Database configuration, java.util.LinkedList<Method> latestOperation) {
    configuration.enteringAppendage(latestOperation.removeFirst());
  }

  private synchronized void synx234(Database configuration, String permutation) {

    if (configuration.arriveUndertookProceduresWingspan() == hawnMechanism) {
      configuration.catchPlanner(permutation);
    } else {
      configuration.determinePresentRicky(configuration.conveyFormerGene() + 1);
      configuration.addTock();
    }
  }
}
