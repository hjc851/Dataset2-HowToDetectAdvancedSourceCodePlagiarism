import java.util.*;

public class Regulator {
  public java.util.LinkedList<Mechanism> WakingTechniques = null;
  public java.util.LinkedList<Mechanism> AzimuthMethodologies = null;
  public int tedSystems = 0;
  public java.util.ArrayDeque<Programmer> local = null;

  public Regulator() {
    Programmer stas;
    this.local = new java.util.ArrayDeque<>();
    stas = new FDebugging();
    this.local.addLast(stas);
  }

  public synchronized void situatedCapitalistMethodology(java.util.LinkedList<Mechanism> treat) {
    this.tedSystems = treat.size();
    this.AzimuthMethodologies = treat;
  }

  public synchronized void layCountdownLitigate(java.util.LinkedList<Mechanism> method) {
    this.tedSystems = method.size();
    this.WakingTechniques = method;
  }

  public synchronized void scarperCaller() {
    this.carryParser(new FDebugging(), this.AzimuthMethodologies, "LRU");
    this.carryParser(new FDebugging(), this.WakingTechniques, "CLOCK");
  }

  public synchronized void carryParser(
      Programmer developer,
      java.util.LinkedList<Mechanism> streamSystems,
      java.lang.String transposition) {
    developer.departParser(transposition);
    java.util.Collections.sort(streamSystems);

    while (!streamSystems.isEmpty()) {
      developer.succeedingOutgrowth(streamSystems.removeFirst());
    }

    while (developer.goIsMoving()) {

      if (developer.becomeConcludedPracticesQuantity() == tedSystems) {
        developer.periodDatabase(transposition);
      } else {
        developer.determinePresentRicky(developer.comeLatestTicktock() + 1);
        developer.snoTicktock();
      }
    }
  }
}
