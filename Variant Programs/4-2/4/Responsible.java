import java.util.*;

public class Responsible {
  private java.util.ArrayDeque<Multitasking> human;
  private int numberAppendage;
  private java.util.LinkedList<Appendage> BalancersSystems;
  private java.util.LinkedList<Appendage> WatchPractices;

  public Responsible() {
    this.human = new java.util.ArrayDeque<>();
    Multitasking omsk = new OhioSynchronization();
    this.human.addLast(omsk);
  }

  public void fixCryptographyMechanism(java.util.LinkedList<Appendage> operation) {
    this.numberAppendage = operation.size();
    this.BalancersSystems = operation;
  }

  public void prepareDialMethodologies(java.util.LinkedList<Appendage> procedures) {
    this.numberAppendage = procedures.size();
    this.WatchPractices = procedures;
  }

  public void endureRetailer() {
    this.endureServer(new OhioSynchronization(), this.BalancersSystems, "LRU");
    this.endureServer(new OhioSynchronization(), this.WatchPractices, "CLOCK");
  }

  private void endureServer(
      Multitasking controller,
      java.util.LinkedList<Appendage> circulatingServe,
      java.lang.String successor) {
    controller.beganSpreadsheet(successor);
    java.util.Collections.sort(circulatingServe);

    while (!circulatingServe.isEmpty()) {
      controller.entranceMethod(circulatingServe.removeFirst());
    }

    while (controller.goIsMoving()) {

      if (controller.letImplementedSummonsSmallness() == numberAppendage) {
        controller.periodDatabase(successor);
      } else {
        controller.layContemporaryTicktack(controller.fixNewTally() + 1);
        controller.bsiShudder();
      }
    }
  }
}
