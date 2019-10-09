import java.util.*;

public class Sender {
  public java.util.LinkedList<Work> PendulumSue = null;
  public java.util.LinkedList<Work> CryptographyMechanism = null;
  public int atkinsMechanisms = 0;
  public java.util.ArrayDeque<Debugging> algorithms = null;

  public Sender() {
    Debugging icc;
    this.algorithms = new java.util.ArrayDeque<>();
    icc = new TrillSpreadsheet();
    this.algorithms.addLast(icc);
  }

  public synchronized void rigidDMethod(java.util.LinkedList<Work> procedure) {
    this.atkinsMechanisms = procedure.size();
    this.CryptographyMechanism = procedure;
  }

  public synchronized void rigidDayMethod(java.util.LinkedList<Work> sue) {
    this.atkinsMechanisms = sue.size();
    this.PendulumSue = sue;
  }

  public synchronized void passMailer() {
    this.testMultitasking(new TrillSpreadsheet(), this.CryptographyMechanism, "LRU");
    this.testMultitasking(new TrillSpreadsheet(), this.PendulumSue, "CLOCK");
  }

  public synchronized void testMultitasking(
      Debugging workspace,
      java.util.LinkedList<Work> topicalAppendage,
      java.lang.String transposition) {
    workspace.goTimer(transposition);
    java.util.Collections.sort(topicalAppendage);

    while (!topicalAppendage.isEmpty()) {
      workspace.inboundOperation(topicalAppendage.removeFirst());
    }

    while (workspace.goIsMoving()) {

      if (workspace.fixAchievedMechanismsProportions() == atkinsMechanisms) {
        workspace.kiboshSynchronization(transposition);
      } else {
        workspace.preparePrevalentScore(workspace.arriveFlowIndicate() + 1);
        workspace.snoTicktock();
      }
    }
  }
}
