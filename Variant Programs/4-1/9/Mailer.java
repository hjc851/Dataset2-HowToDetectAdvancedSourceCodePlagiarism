import java.util.*;

public class Mailer {
  private ArrayDeque<Developer> existing;
  private int cksSummons;
  private LinkedList<Serve> CartesianTechniques;
  private LinkedList<Serve> HoursProcedures;

  public Mailer() {
    this.existing = new ArrayDeque<>();
    Developer etd = new DiddleProgramming();
    this.existing.addLast(etd);
  }

  public void fixCryptographyMechanism(LinkedList<Serve> systems) {
    this.cksSummons = systems.size();
    this.CartesianTechniques = systems;
  }

  public void adjustHoursProcedures(LinkedList<Serve> mechanisms) {
    this.cksSummons = mechanisms.size();
    this.HoursProcedures = mechanisms;
  }

  public void courseResponsible() {
    this.ramCompiler(new DiddleProgramming(), this.CartesianTechniques, "LRU");
    this.ramCompiler(new DiddleProgramming(), this.HoursProcedures, "CLOCK");
  }

  private void ramCompiler(
      Developer synchronization, LinkedList<Serve> existingMethods, String substitution) {
    synchronization.jumpSynchronizer(substitution);
    Collections.sort(existingMethods);

    while (!existingMethods.isEmpty()) {
      synchronization.succeedingOutgrowth(existingMethods.removeFirst());
    }

    while (synchronization.goIsMoving()) {

      if (synchronization.driveFinalizationTechniquesCapacity() == cksSummons) {
        synchronization.blockDeveloper(substitution);
      } else {
        synchronization.fixedTheSelect(synchronization.letAfootDials() + 1);
        synchronization.bpsRetick();
      }
    }
  }
}
