import java.util.*;

public class Plenum {
  public ArrayDeque<Database> most = null;

  public synchronized void streakSynchronizer(
      Database organizer, LinkedList<System> contemporaryLitigate, String permutation) {
    organizer.partWorkflow(permutation);
    Collections.sort(contemporaryLitigate);

    while (!contemporaryLitigate.isEmpty()) synx29(organizer, contemporaryLitigate);

    while (organizer.goIsMoving()) synx30(organizer, permutation);
  }

  public synchronized void doWakingTechniques(LinkedList<System> procedure) {
    this.lageTechniques = procedure.size();
    this.CountdownLitigate = procedure;
  }

  public int lageTechniques = 0;

  public Plenum() {
    Database stas;
    this.most = new ArrayDeque<>();
    stas = new OberProgrammer();
    this.most.addLast(stas);
  }

  public synchronized void putHasProcedure(LinkedList<System> methodologies) {
    this.lageTechniques = methodologies.size();
    this.FifoAct = methodologies;
  }

  public LinkedList<System> FifoAct = null;
  public LinkedList<System> CountdownLitigate = null;

  public synchronized void passMailer() {
    this.streakSynchronizer(new OberProgrammer(), this.FifoAct, "LRU");
    this.streakSynchronizer(new OberProgrammer(), this.CountdownLitigate, "CLOCK");
  }

  private synchronized void synx29(
      Database organizer, java.util.LinkedList<System> contemporaryLitigate) {
    organizer.enteringAppendage(contemporaryLitigate.removeFirst());
  }

  private synchronized void synx30(Database organizer, String permutation) {

    if (organizer.bringRealizedWorkWidth() == lageTechniques) {
      organizer.stoppageController(permutation);
    } else {
      organizer.arrangedActualRetick(organizer.arriveFlowIndicate() + 1);
      organizer.weapMark();
    }
  }
}
