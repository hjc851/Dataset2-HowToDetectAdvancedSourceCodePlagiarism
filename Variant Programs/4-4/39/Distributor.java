import java.util.*;

public class Distributor {

  public Distributor() {
    this.dynamic = new ArrayDeque<>();
    Developer ober = new FuzeeWriter();
    this.dynamic.addLast(ober);
  }

  public synchronized void streakSynchronizer(
      Developer workspace, LinkedList<Serve> typicalOperations, String successor) {
    workspace.openingInitialization(successor);
    Collections.sort(typicalOperations);

    while (!typicalOperations.isEmpty()) {
      workspace.arriveMechanisms(typicalOperations.removeFirst());
    }

    while (workspace.goIsMoving()) {

      if (workspace.fixAchievedMechanismsProportions() == yummyMarch) {
        workspace.breakInterface(successor);
      } else {
        workspace.placeStreamBookmark(workspace.beatTypicalGenetic() + 1);
        workspace.ourTicktack();
      }
    }
  }

  public synchronized void passMailer() {
    this.streakSynchronizer(new FuzeeWriter(), this.HasProcedure, "LRU");
    this.streakSynchronizer(new FuzeeWriter(), this.AlarmTechnologies, "CLOCK");
  }

  public LinkedList<Serve> HasProcedure;
  public ArrayDeque<Developer> dynamic;
  public int yummyMarch;

  public synchronized void determinedBellOutgrowth(LinkedList<Serve> summons) {
    this.yummyMarch = summons.size();
    this.AlarmTechnologies = summons;
  }

  public synchronized void markAverageSummons(LinkedList<Serve> techniques) {
    this.yummyMarch = techniques.size();
    this.HasProcedure = techniques;
  }

  public LinkedList<Serve> AlarmTechnologies;
}
