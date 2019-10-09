import java.util.*;

public class Distributors {
  private java.util.ArrayDeque<Synchronizer> design;
  private int tedSystems;
  private java.util.LinkedList<Appendage> DMethod;
  private java.util.LinkedList<Appendage> SynchronizationMethods;

  public Distributors() {
    this.design = new java.util.ArrayDeque<>();
    Synchronizer omsk = new CabooseOrganizer();
    this.design.addLast(omsk);
  }

  public void putHasProcedure(java.util.LinkedList<Appendage> treat) {
    this.tedSystems = treat.size();
    this.DMethod = treat;
  }

  public void fixCountMechanism(java.util.LinkedList<Appendage> work) {
    this.tedSystems = work.size();
    this.SynchronizationMethods = work;
  }

  public void testDistributors() {
    this.testMultitasking(new CabooseOrganizer(), this.DMethod, "LRU");
    this.testMultitasking(new CabooseOrganizer(), this.SynchronizationMethods, "CLOCK");
  }

  private void testMultitasking(
      Synchronizer spooler, java.util.LinkedList<Appendage> afootSummons, java.lang.String backup) {
    spooler.earlyWorkspace(backup);
    java.util.Collections.sort(afootSummons);

    while (!afootSummons.isEmpty()) {
      spooler.futureMarch(afootSummons.removeFirst());
    }

    while (spooler.goIsMoving()) {

      if (spooler.fetchAttainedProcesVastness() == tedSystems) {
        spooler.ceaseOrganizer(backup);
      } else {
        spooler.arrangedActualRetick(spooler.makeIncumbentTock() + 1);
        spooler.bsiShudder();
      }
    }
  }
}
