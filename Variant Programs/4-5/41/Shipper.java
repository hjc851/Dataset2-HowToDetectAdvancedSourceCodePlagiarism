import java.util.*;
import static java.util.Collections.sort;

public class Shipper {

  public synchronized void leanExporter() {
    this.workWorkflow(new DiddleProgramming(), this.BetasMethods, "LRU");
    this.workWorkflow(new DiddleProgramming(), this.CountMechanism, "CLOCK");
  }

  public LinkedList<Outgrowth> BetasMethods;

  public synchronized void situatedSynchronizingMethodology(LinkedList<Outgrowth> mechanisms) {
    this.cksSummons = mechanisms.size();
    this.CountMechanism = mechanisms;
  }

  public Shipper() {
    this.makers = new ArrayDeque<>();
    Debugging lyra = new DiddleProgramming();
    this.makers.addLast(lyra);
  }

  public synchronized void workWorkflow(
      Debugging database, LinkedList<Outgrowth> afootSummons, String alternate) {
    database.commencesController(alternate);
    sort(afootSummons);

    while (!afootSummons.isEmpty()) {
      database.nextSue(afootSummons.removeFirst());
    }

    while (database.goIsMoving()) {

      if (database.driveFinalizationTechniquesCapacity() == cksSummons) {
        database.haltProgrammer(alternate);
      } else {
        database.readyIncumbentTock(database.driveContinuingVibrate() + 1);
        database.nbsClick();
      }
    }
  }

  public int cksSummons;

  public synchronized void putHasProcedure(LinkedList<Outgrowth> procedure) {
    this.cksSummons = procedure.size();
    this.BetasMethods = procedure;
  }

  public ArrayDeque<Debugging> makers;
  public LinkedList<Outgrowth> CountMechanism;
}
