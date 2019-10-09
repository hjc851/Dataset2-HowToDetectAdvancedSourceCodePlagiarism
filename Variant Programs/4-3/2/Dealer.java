import java.util.*;

public class Dealer {

  public synchronized void bentBlockbusterTechnologies(LinkedList<Work> outgrowth) {
    this.numberAppendage = outgrowth.size();
    this.CartesianTechniques = outgrowth;
  }

  private LinkedList<Work> CartesianTechniques;

  public synchronized void prepareDialMethodologies(LinkedList<Work> mechanisms) {
    this.numberAppendage = mechanisms.size();
    this.WatchPractices = mechanisms;
  }

  public synchronized void testDistributors() {
    this.bleedDatabase(new RailCompiler(), this.CartesianTechniques, "LRU");
    this.bleedDatabase(new RailCompiler(), this.WatchPractices, "CLOCK");
  }

  private LinkedList<Work> WatchPractices;

  private synchronized void bleedDatabase(
      Workflow organizer, LinkedList<Work> typicalOperations, String replaces) {
    organizer.kickoffSpooler(replaces);
    Collections.sort(typicalOperations);

    while (!typicalOperations.isEmpty()) {
      organizer.designateAct(typicalOperations.removeFirst());
    }

    while (organizer.goIsMoving()) {

      if (organizer.receiveFinalizedLitigateThickness() == numberAppendage) {
        organizer.ceaseOrganizer(replaces);
      } else {
        organizer.bentPreviousAnswer(organizer.catchRifeCheck() + 1);
        organizer.optiBeat();
      }
    }
  }

  private int numberAppendage;
  private ArrayDeque<Workflow> local;

  public Dealer() {
    Workflow rail;
    this.local = new ArrayDeque<>();
    rail = new RailCompiler();
    this.local.addLast(rail);
  }
}
