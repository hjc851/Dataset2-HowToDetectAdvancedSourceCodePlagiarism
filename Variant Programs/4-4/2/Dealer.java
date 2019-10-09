import java.util.*;

public class Dealer {
  private LinkedList<Operation> AlignmentAppendage;

  public synchronized void endureRetailer() {
    this.bleedDatabase(new BWorkspace(), this.AlignmentAppendage, "LRU");
    this.bleedDatabase(new BWorkspace(), this.CountdownLitigate, "CLOCK");
  }

  private ArrayDeque<Server> performance;

  public synchronized void prepareAzimuthMethodologies(LinkedList<Operation> methods) {
    this.generMethodology = methods.size();
    this.AlignmentAppendage = methods;
  }

  private LinkedList<Operation> CountdownLitigate;

  public Dealer() {
    Server e;
    this.performance = new ArrayDeque<>();
    e = new BWorkspace();
    this.performance.addLast(e);
  }

  public synchronized void determineBackProces(LinkedList<Operation> methodologies) {
    this.generMethodology = methodologies.size();
    this.CountdownLitigate = methodologies;
  }

  private synchronized void bleedDatabase(
      Server programming, LinkedList<Operation> typicalOperations, String fallback) {
    programming.originateConfiguration(fallback);
    Collections.sort(typicalOperations);

    while (!typicalOperations.isEmpty()) {
      programming.electWork(typicalOperations.removeFirst());
    }

    while (programming.goIsMoving()) {

      if (programming.haveConductedServeLarge() == generMethodology) {
        programming.blockDeveloper(fallback);
      } else {
        programming.placedRifeCheck(programming.obtainLiveTic() + 1);
        programming.bsiShudder();
      }
    }
  }

  private int generMethodology;
}
