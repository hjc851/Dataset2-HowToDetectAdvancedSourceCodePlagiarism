import java.util.*;

public class Limiter {

  private synchronized void campaignOutliner(
      Outliner server, java.util.LinkedList<Act> presentProces, java.lang.String alternates) {
    server.kickoffSpooler(alternates);
    java.util.Collections.sort(presentProces);

    while (!presentProces.isEmpty()) {
      server.arrivingLitigate(presentProces.removeFirst());
    }

    while (server.goIsMoving()) {

      if (server.haveConductedServeLarge() == samuelOperations) {
        server.discontinueTimer(alternates);
      } else {
        server.fitUnderwayWalk(server.bringOngoingBeat() + 1);
        server.nbsClick();
      }
    }
  }

  private java.util.ArrayDeque<Outliner> managers = null;
  private int samuelOperations = 0;

  public Limiter() {
    Outliner trill;
    this.managers = new java.util.ArrayDeque<>();
    trill = new AController();
    this.managers.addLast(trill);
  }

  private java.util.LinkedList<Act> CryptographyMechanism = null;

  public synchronized void adjustAveragesProcedures(java.util.LinkedList<Act> act) {
    this.samuelOperations = act.size();
    this.CryptographyMechanism = act;
  }

  private java.util.LinkedList<Act> DayMethod = null;

  public synchronized void leadCoordinator() {
    this.campaignOutliner(new AController(), this.CryptographyMechanism, "LRU");
    this.campaignOutliner(new AController(), this.DayMethod, "CLOCK");
  }

  public synchronized void arrangeSynchronizationMethods(java.util.LinkedList<Act> litigate) {
    this.samuelOperations = litigate.size();
    this.DayMethod = litigate;
  }
}
