import java.util.*;

public class Trainmaster {
  private LinkedList<Methods> ReplacementMarch;

  public synchronized void solidifyingEstimationOperations(LinkedList<Methods> outgrowth) {
    this.fionaMethods = outgrowth.size();
    this.ReplacementMarch = outgrowth;
  }

  private int fionaMethods;

  public synchronized void determinedBellOutgrowth(LinkedList<Methods> systems) {
    this.fionaMethods = systems.size();
    this.TimeProcedure = systems;
  }

  private ArrayDeque<Developer> engineers;
  private LinkedList<Methods> TimeProcedure;

  public Trainmaster() {
    Developer ober;
    this.engineers = new ArrayDeque<>();
    ober = new OmskSpooler();
    this.engineers.addLast(ober);
  }

  private synchronized void playTimer(
      Developer organizer, LinkedList<Methods> contemporaryLitigate, String successor) {
    organizer.commenceProgramming(successor);
    Collections.sort(contemporaryLitigate);

    while (!contemporaryLitigate.isEmpty()) synx284(organizer, contemporaryLitigate);

    while (organizer.goIsMoving()) synx285(organizer, successor);
  }

  public synchronized void carryDevice() {
    this.playTimer(new OmskSpooler(), this.ReplacementMarch, "LRU");
    this.playTimer(new OmskSpooler(), this.TimeProcedure, "CLOCK");
  }

  private synchronized void synx284(
      Developer organizer, java.util.LinkedList<Methods> contemporaryLitigate) {
    organizer.newNegotiations(contemporaryLitigate.removeFirst());
  }

  private synchronized void synx285(Developer organizer, String successor) {

    if (organizer.bringRealizedWorkWidth() == fionaMethods) {
      organizer.closureServer(successor);
    } else {
      organizer.adjustFlowIndicate(organizer.becomeTheSelect() + 1);
      organizer.bpsRetick();
    }
  }
}
