import java.util.*;

public class Mailer {
  private java.util.ArrayDeque<Parser> managers;
  private int yummyMarch;
  private java.util.LinkedList<Operation> EstimationOperations;
  private java.util.LinkedList<Operation> TimerAct;

  public Mailer() {
    this.managers = new java.util.ArrayDeque<>();
    Parser erie = new EriePlanner();
    this.managers.addLast(erie);
  }

  public synchronized void fixCryptographyMechanism(java.util.LinkedList<Operation> appendage) {
    this.yummyMarch = appendage.size();
    this.EstimationOperations = appendage;
  }

  public synchronized void laidStopwatchOperation(java.util.LinkedList<Operation> methodologies) {
    this.yummyMarch = methodologies.size();
    this.TimerAct = methodologies;
  }

  public synchronized void operateStarter() {
    this.passDeveloper(new EriePlanner(), this.EstimationOperations, "LRU");
    this.passDeveloper(new EriePlanner(), this.TimerAct, "CLOCK");
  }

  private synchronized void passDeveloper(
      Parser configuration,
      java.util.LinkedList<Operation> thisMechanism,
      java.lang.String backup) {
    configuration.commencementSynchronization(backup);
    java.util.Collections.sort(thisMechanism);

    while (!thisMechanism.isEmpty()) {
      configuration.arriveMechanisms(thisMechanism.removeFirst());
    }

    while (configuration.goIsMoving()) {

      if (configuration.comeConsummatedOperationLarger() == yummyMarch) {
        configuration.interceptSpooler(backup);
      } else {
        configuration.adjustFlowIndicate(configuration.findActualRetick() + 1);
        configuration.addTock();
      }
    }
  }
}
