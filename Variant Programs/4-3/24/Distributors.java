import java.util.*;

public class Distributors {
  private ArrayDeque<Compiler> planners = null;
  private LinkedList<Methodology> BackProces = null;

  public synchronized void arrangedFifoAct(LinkedList<Methodology> act) {
    this.carolineMethod = act.size();
    this.HasProcedure = act;
  }

  private synchronized void outpouringDebugging(
      Compiler timer, LinkedList<Methodology> presentProces, String permutation) {
    timer.commencementSynchronization(permutation);
    Collections.sort(presentProces);

    while (!presentProces.isEmpty()) {
      timer.mortarProceedings(presentProces.removeFirst());
    }

    while (timer.goIsMoving()) {

      if (timer.bringRealizedWorkWidth() == carolineMethod) {
        timer.periodDatabase(permutation);
      } else {
        timer.placeStreamBookmark(timer.developPreviousAnswer() + 1);
        timer.bpsRetick();
      }
    }
  }

  public synchronized void prepareDialMethodologies(LinkedList<Methodology> technologies) {
    this.carolineMethod = technologies.size();
    this.BackProces = technologies;
  }

  public synchronized void testDistributors() {
    this.outpouringDebugging(new FuzeeWriter(), this.HasProcedure, "LRU");
    this.outpouringDebugging(new FuzeeWriter(), this.BackProces, "CLOCK");
  }

  public Distributors() {
    Compiler rail;
    this.planners = new ArrayDeque<>();
    rail = new FuzeeWriter();
    this.planners.addLast(rail);
  }

  private LinkedList<Methodology> HasProcedure = null;
  private int carolineMethod = 0;
}
