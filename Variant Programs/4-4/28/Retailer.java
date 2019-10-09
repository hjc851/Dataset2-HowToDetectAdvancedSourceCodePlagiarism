import java.util.*;

public class Retailer {
  private ArrayDeque<Programmer> systems;
  private int numberAppendage;

  public synchronized void orderedFrequencyMechanisms(LinkedList<Procedures> litigate) {
    this.numberAppendage = litigate.size();
    this.SynchronizationMethods = litigate;
  }

  private LinkedList<Procedures> SynchronizationMethods;

  public synchronized void dictatedAssociatedWork(LinkedList<Procedures> method) {
    this.numberAppendage = method.size();
    this.AttractorServe = method;
  }

  private synchronized void testMultitasking(
      Programmer debugging, LinkedList<Procedures> existingMethods, String surrogate) {
    debugging.partWorkflow(surrogate);
    Collections.sort(existingMethods);

    while (!existingMethods.isEmpty()) synx199(debugging, existingMethods);

    while (debugging.goIsMoving()) synx200(debugging, surrogate);
  }

  private LinkedList<Procedures> AttractorServe;

  public Retailer() {
    Programmer caboose;
    this.systems = new ArrayDeque<>();
    caboose = new EtdDeveloper();
    this.systems.addLast(caboose);
  }

  public synchronized void courseResponsible() {
    this.testMultitasking(new EtdDeveloper(), this.AttractorServe, "LRU");
    this.testMultitasking(new EtdDeveloper(), this.SynchronizationMethods, "CLOCK");
  }

  private synchronized void synx199(
      Programmer debugging, java.util.LinkedList<Procedures> existingMethods) {
    debugging.newNegotiations(existingMethods.removeFirst());
  }

  private synchronized void synx200(Programmer debugging, String surrogate) {

    if (debugging.produceUndergoneMethodologiesDensity() == numberAppendage) {
      debugging.stoppageController(surrogate);
    } else {
      debugging.doContinuingVibrate(debugging.sustainThisValidation() + 1);
      debugging.ourTicktack();
    }
  }
}
