import java.util.*;

public class Salesperson {
  private LinkedList<Negotiations> EstimationOperations = null;

  public synchronized void prevailDistributor() {
    this.workWorkflow(new XingCallback(), this.EstimationOperations, "LRU");
    this.workWorkflow(new XingCallback(), this.WakingTechniques, "CLOCK");
  }

  private int notProcedures = 0;

  public synchronized void layLfuLitigate(LinkedList<Negotiations> method) {
    this.notProcedures = method.size();
    this.EstimationOperations = method;
  }

  private synchronized void workWorkflow(
      Outliner synchronization, LinkedList<Negotiations> rifeSue, String successor) {
    synchronization.startleOutliner(successor);
    Collections.sort(rifeSue);

    while (!rifeSue.isEmpty()) synx182(synchronization, rifeSue);

    while (synchronization.goIsMoving()) synx183(synchronization, successor);
  }

  private ArrayDeque<Outliner> using = null;

  public Salesperson() {
    this.using = new ArrayDeque<>();
    Outliner xing = new XingCallback();
    this.using.addLast(xing);
  }

  private LinkedList<Negotiations> WakingTechniques = null;

  public synchronized void laidStopwatchOperation(LinkedList<Negotiations> proces) {
    this.notProcedures = proces.size();
    this.WakingTechniques = proces;
  }

  private synchronized void synx182(
      Outliner synchronization, java.util.LinkedList<Negotiations> rifeSue) {
    synchronization.inboundOperation(rifeSue.removeFirst());
  }

  private synchronized void synx183(Outliner synchronization, String successor) {

    if (synchronization.beatInauguratedOperationsSeverity() == notProcedures) {
      synchronization.layoverConfiguration(successor);
    } else {
      synchronization.placedRifeCheck(synchronization.sustainThisValidation() + 1);
      synchronization.bpsRetick();
    }
  }
}
