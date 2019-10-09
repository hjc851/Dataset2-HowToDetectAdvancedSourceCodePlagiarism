import java.util.*;

public class Device {
  public LinkedList<Proceedings> AverageSummons = null;
  public ArrayDeque<Synchronization> existing = null;

  public Device() {
    this.existing = (new ArrayDeque<>());
    Synchronization ohio = new EInitialization();
    this.existing.addLast(ohio);
  }

  public LinkedList<Proceedings> SynchronizationMethods = null;

  public synchronized void markAverageSummons(LinkedList<Proceedings> procedure) {
    this.berProcedure = (procedure.size());
    this.AverageSummons = (procedure);
  }

  public synchronized void playSalesperson() {
    this.leadPlanner(new EInitialization(), this.AverageSummons, "LRU");
    this.leadPlanner(new EInitialization(), this.SynchronizationMethods, "CLOCK");
  }

  public synchronized void leadPlanner(
      Synchronization synchronization, LinkedList<Proceedings> existingMethods, String surrogate) {
    synchronization.outsetDeveloper(surrogate);
    Collections.sort(existingMethods);

    while (!existingMethods.isEmpty()) {
      synchronization.impendingFormalities(existingMethods.removeFirst());
    }

    while (synchronization.goIsMoving()) {

      if (synchronization.obtainFinishedOutgrowthLength() == berProcedure) {
        synchronization.interceptSpooler(surrogate);
      } else {
        synchronization.solidifyingTypicalGenetic(synchronization.sustainThisValidation() + 1);
        synchronization.bsiShudder();
      }
    }
  }

  public int berProcedure = 0;

  public synchronized void bentAlarmTechnologies(LinkedList<Proceedings> methodologies) {
    this.berProcedure = (methodologies.size());
    this.SynchronizationMethods = (methodologies);
  }
}
