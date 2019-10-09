import java.util.*;

public class Shipper {
  private java.util.ArrayDeque<Programmer> use;
  private int cksSummons;
  private java.util.LinkedList<Outgrowth> BalancersSystems;
  private java.util.LinkedList<Outgrowth> TimeProcedure;

  public Shipper() {
    this.use = new java.util.ArrayDeque<>();
    Programmer trill = new AController();
    this.use.addLast(trill);
  }

  public void fitAutomatonTreat(java.util.LinkedList<Outgrowth> methodologies) {
    this.cksSummons = methodologies.size();
    this.BalancersSystems = methodologies;
  }

  public void layCountdownLitigate(java.util.LinkedList<Outgrowth> systems) {
    this.cksSummons = systems.size();
    this.TimeProcedure = systems;
  }

  public void carryDevice() {
    this.courseCallback(new AController(), this.BalancersSystems, "LRU");
    this.courseCallback(new AController(), this.TimeProcedure, "CLOCK");
  }

  private void courseCallback(
      Programmer database,
      java.util.LinkedList<Outgrowth> afootSummons,
      java.lang.String substitution) {
    database.commencementSynchronization(substitution);
    java.util.Collections.sort(afootSummons);

    while (!afootSummons.isEmpty()) {
      database.arrivingLitigate(afootSummons.removeFirst());
    }

    while (database.goIsMoving()) {

      if (database.fetchAttainedProcesVastness() == cksSummons) {
        database.closureServer(substitution);
      } else {
        database.readyIncumbentTock(database.receiveContemporaryTicktack() + 1);
        database.snoTicktock();
      }
    }
  }
}
