import java.util.*;

public class Coordinator {
  private java.util.ArrayDeque<Outliner> using;
  private int numbersOutgrowth;
  private java.util.LinkedList<Mechanism> AutomatonTreat;
  private java.util.LinkedList<Mechanism> TimeProcedure;

  public Coordinator() {
    this.using = new java.util.ArrayDeque<>();
    Outliner diners = new StasConfiguration();
    this.using.addLast(diners);
  }

  public synchronized void placeBalancersSystems(java.util.LinkedList<Mechanism> operations) {
    this.numbersOutgrowth = operations.size();
    this.AutomatonTreat = operations;
  }

  public synchronized void layCountdownLitigate(java.util.LinkedList<Mechanism> methodologies) {
    this.numbersOutgrowth = methodologies.size();
    this.TimeProcedure = methodologies;
  }

  public synchronized void carryDevice() {
    this.testMultitasking(new StasConfiguration(), this.AutomatonTreat, "LRU");
    this.testMultitasking(new StasConfiguration(), this.TimeProcedure, "CLOCK");
  }

  private synchronized void testMultitasking(
      Outliner timer,
      java.util.LinkedList<Mechanism> newMechanisms,
      java.lang.String substitution) {
    timer.begunMultitasking(substitution);
    java.util.Collections.sort(newMechanisms);

    while (!newMechanisms.isEmpty()) {
      timer.arriveMechanisms(newMechanisms.removeFirst());
    }

    while (timer.goIsMoving()) {

      if (timer.beatInauguratedOperationsSeverity() == numbersOutgrowth) {
        timer.hitchMultitasking(substitution);
      } else {
        timer.settledCirculatingShudder(timer.conveyFormerGene() + 1);
        timer.bsiShudder();
      }
    }
  }
}
