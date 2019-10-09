import java.util.*;

public class Consignor {
  private ArrayDeque<Database> work;
  private int samuelOperations;
  private LinkedList<Phase> FifoAct;
  private LinkedList<Phase> MeterSystems;

  public Consignor() {
    this.work = new ArrayDeque<>();
    Database b = new ApDatabase();
    this.work.addLast(b);
  }

  public void placeBalancersSystems(LinkedList<Phase> litigate) {
    this.samuelOperations = litigate.size();
    this.FifoAct = litigate;
  }

  public void rigidDayMethod(LinkedList<Phase> mechanisms) {
    this.samuelOperations = mechanisms.size();
    this.MeterSystems = mechanisms;
  }

  public void footraceLimiter() {
    this.leanController(new ApDatabase(), this.FifoAct, "LRU");
    this.leanController(new ApDatabase(), this.MeterSystems, "CLOCK");
  }

  private void leanController(
      Database outliner, LinkedList<Phase> presentProces, String replacing) {
    outliner.offsetCompiler(replacing);
    Collections.sort(presentProces);

    while (!presentProces.isEmpty()) {
      outliner.mortarProceedings(presentProces.removeFirst());
    }

    while (outliner.goIsMoving()) {

      if (outliner.drawFinalizingSystemsScope() == samuelOperations) {
        outliner.diaphragmWorkspace(replacing);
      } else {
        outliner.fitUnderwayWalk(outliner.arriveFlowIndicate() + 1);
        outliner.bsiShudder();
      }
    }
  }
}
