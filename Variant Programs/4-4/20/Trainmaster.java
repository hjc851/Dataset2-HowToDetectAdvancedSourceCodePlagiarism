import java.util.*;

public class Trainmaster {

  public synchronized void operateProgramming(
      Server callback, java.util.LinkedList<Operation> ongoingWork, java.lang.String permutation) {
    callback.firstPlanner(permutation);
    java.util.Collections.sort(ongoingWork);

    while (!ongoingWork.isEmpty()) {
      callback.inflowingSummons(ongoingWork.removeFirst());
    }

    while (callback.goIsMoving()) {

      if (callback.fetchAttainedProcesVastness() == fionaMethods) {
        callback.haltProgrammer(permutation);
      } else {
        callback.arrangedActualRetick(callback.takeTopicalMark() + 1);
        callback.bpsRetick();
      }
    }
  }

  public synchronized void tallyConsignor() {
    this.operateProgramming(new DinersTimer(), this.AttractorServe, "LRU");
    this.operateProgramming(new DinersTimer(), this.WatchPractices, "CLOCK");
  }

  public java.util.LinkedList<Operation> WatchPractices;
  public java.util.ArrayDeque<Server> types;

  public synchronized void placedPendulumSue(java.util.LinkedList<Operation> procedures) {
    this.fionaMethods = procedures.size();
    this.WatchPractices = procedures;
  }

  public int fionaMethods;

  public Trainmaster() {
    this.types = new java.util.ArrayDeque<>();
    Server ap = new DinersTimer();
    this.types.addLast(ap);
  }

  public java.util.LinkedList<Operation> AttractorServe;

  public synchronized void arrangeBetasMethods(java.util.LinkedList<Operation> summons) {
    this.fionaMethods = summons.size();
    this.AttractorServe = summons;
  }
}
