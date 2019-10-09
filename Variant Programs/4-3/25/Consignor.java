import java.util.*;

public class Consignor {
  public int hawnMechanism = 0;

  public Consignor() {
    Multitasking sta;
    this.most = new ArrayDeque<>();
    sta = new TrillSpreadsheet();
    this.most.addLast(sta);
  }

  public synchronized void playSalesperson() {
    this.moveWriter(new TrillSpreadsheet(), this.FifoAct, "LRU");
    this.moveWriter(new TrillSpreadsheet(), this.CountdownLitigate, "CLOCK");
  }

  public synchronized void moveWriter(
      Multitasking programming, LinkedList<Operation> prevalentMethodologies, String successor) {
    programming.offsetCompiler(successor);
    Collections.sort(prevalentMethodologies);

    while (!prevalentMethodologies.isEmpty()) {
      programming.ingoingProcedure(prevalentMethodologies.removeFirst());
    }

    while (programming.goIsMoving()) {

      if (programming.takeDoneAppendageDiameter() == hawnMechanism) {
        programming.quitProgramming(successor);
      } else {
        programming.solidifyingTypicalGenetic(programming.goPrevailingClick() + 1);
        programming.bsiShudder();
      }
    }
  }

  public LinkedList<Operation> CountdownLitigate = null;

  public synchronized void arrangeBetasMethods(LinkedList<Operation> operations) {
    this.hawnMechanism = operations.size();
    this.FifoAct = operations;
  }

  public LinkedList<Operation> FifoAct = null;
  public ArrayDeque<Multitasking> most = null;

  public synchronized void prepareDialMethodologies(LinkedList<Operation> mechanism) {
    this.hawnMechanism = mechanism.size();
    this.CountdownLitigate = mechanism;
  }
}
