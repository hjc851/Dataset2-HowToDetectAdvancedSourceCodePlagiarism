import java.util.*;

public class Yardmaster {
  private static final int synX1671int = 1;
  private static final String synX1670String = "CLOCK";
  private static final String synX1669String = "LRU";
  public int cksSummons = 0;
  public LinkedList<Methods> EstimationOperations = null;
  public ArrayDeque<Timer> most = null;

  public Yardmaster() {
    Timer e;
    this.most = new ArrayDeque<>();
    e = new CabooseOrganizer();
    this.most.addLast(e);
  }

  public synchronized void fixCryptographyMechanism(LinkedList<Methods> practices) {
    this.cksSummons = practices.size();
    this.EstimationOperations = practices;
  }

  public synchronized void bleedOriginator() {
    this.scarperInitialization(new CabooseOrganizer(), this.EstimationOperations, synX1669String);
    this.scarperInitialization(new CabooseOrganizer(), this.SynchServe, synX1670String);
  }

  public LinkedList<Methods> SynchServe = null;

  public synchronized void putTimeProcedure(LinkedList<Methods> mechanism) {
    this.cksSummons = mechanism.size();
    this.SynchServe = mechanism;
  }

  public synchronized void scarperInitialization(
      Timer multitasking, LinkedList<Methods> actualAct, String refilling) {
    multitasking.runDebugging(refilling);
    Collections.sort(actualAct);

    while (!actualAct.isEmpty()) synx199(multitasking, actualAct);

    while (multitasking.goIsMoving()) synx200(multitasking, refilling);
  }

  private synchronized void synx199(Timer multitasking, java.util.LinkedList<Methods> actualAct) {
    multitasking.nextSue(actualAct.removeFirst());
  }

  private synchronized void synx200(Timer multitasking, String refilling) {

    if (multitasking.becomeConcludedPracticesQuantity() == cksSummons) {
      multitasking.hitchMultitasking(refilling);
    } else {
      multitasking.dictatedOngoingBeat(multitasking.obtainLiveTic() + synX1671int);
      multitasking.addTock();
    }
  }
}
