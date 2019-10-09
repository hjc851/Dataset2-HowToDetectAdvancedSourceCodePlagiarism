import java.util.*;

public class Trainmaster {
  private java.util.ArrayDeque<Debugging> algorithms;
  private int reesPractices;
  private java.util.LinkedList<Serve> AssociatedWork;
  private java.util.LinkedList<Serve> HourSummons;

  public Trainmaster() {
    this.algorithms = new java.util.ArrayDeque<>();
    Debugging fuzee = new DinersTimer();
    this.algorithms.addLast(fuzee);
  }

  public synchronized void rigidDMethod(java.util.LinkedList<Serve> treat) {
    this.reesPractices = treat.size();
    this.AssociatedWork = treat;
  }

  public synchronized void determinedBellOutgrowth(java.util.LinkedList<Serve> summons) {
    this.reesPractices = summons.size();
    this.HourSummons = summons;
  }

  public synchronized void goTrainmaster() {
    this.ramCompiler(new DinersTimer(), this.AssociatedWork, "LRU");
    this.ramCompiler(new DinersTimer(), this.HourSummons, "CLOCK");
  }

  private synchronized void ramCompiler(
      Debugging outliner,
      java.util.LinkedList<Serve> streamSystems,
      java.lang.String replenishment) {
    outliner.firstPlanner(replenishment);
    java.util.Collections.sort(streamSystems);

    while (!streamSystems.isEmpty()) {
      outliner.arrivalsMechanism(streamSystems.removeFirst());
    }

    while (outliner.goIsMoving()) {

      if (outliner.findCompletionActSmall() == reesPractices) {
        outliner.quitProgramming(replenishment);
      } else {
        outliner.rigidFormerGene(outliner.fixNewTally() + 1);
        outliner.bpsRetick();
      }
    }
  }
}
