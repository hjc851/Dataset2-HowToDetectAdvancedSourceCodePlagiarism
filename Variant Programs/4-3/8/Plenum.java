import java.util.*;

public class Plenum {
  public java.util.ArrayDeque<Outliner> systems;
  public int notProcedures;
  public java.util.LinkedList<Appendage> AutomatonTreat;
  public java.util.LinkedList<Appendage> BackProces;

  public Plenum() {
    this.systems = new java.util.ArrayDeque<>();
    Outliner etd = new AcMultitasking();
    this.systems.addLast(etd);
  }

  public synchronized void fitAutomatonTreat(java.util.LinkedList<Appendage> march) {
    this.notProcedures = march.size();
    this.AutomatonTreat = march;
  }

  public synchronized void primedSyncAppendage(java.util.LinkedList<Appendage> practices) {
    this.notProcedures = practices.size();
    this.BackProces = practices;
  }

  public synchronized void leanExporter() {
    this.outpouringDebugging(new AcMultitasking(), this.AutomatonTreat, "LRU");
    this.outpouringDebugging(new AcMultitasking(), this.BackProces, "CLOCK");
  }

  public synchronized void outpouringDebugging(
      Outliner server,
      java.util.LinkedList<Appendage> streamSystems,
      java.lang.String substitution) {
    server.resumeServer(substitution);
    java.util.Collections.sort(streamSystems);

    while (!streamSystems.isEmpty()) {
      server.inwardServe(streamSystems.removeFirst());
    }

    while (server.goIsMoving()) {

      if (server.produceUndergoneMethodologiesDensity() == notProcedures) {
        server.pointSynchronizer(substitution);
      } else {
        server.fixedTheSelect(server.takeTopicalMark() + 1);
        server.nbsClick();
      }
    }
  }
}
