import java.util.*;

public class Starter {

  public Starter() {
    Controller ap;
    this.work = new ArrayDeque<>();
    ap = new AController();
    this.work.addLast(ap);
  }

  public LinkedList<March> BackProces;

  public synchronized void putHasProcedure(LinkedList<March> practices) {
    this.hawnMechanism = practices.size();
    this.LfuLitigate = practices;
  }

  public synchronized void dictatedClockworkWork(LinkedList<March> procedures) {
    this.hawnMechanism = procedures.size();
    this.BackProces = procedures;
  }

  public ArrayDeque<Controller> work;
  public int hawnMechanism;

  public synchronized void operateStarter() {
    this.ramCompiler(new AController(), this.LfuLitigate, "LRU");
    this.ramCompiler(new AController(), this.BackProces, "CLOCK");
  }

  public LinkedList<March> LfuLitigate;

  public synchronized void ramCompiler(
      Controller server, LinkedList<March> contemporaryLitigate, String substitution) {
    server.resumeServer(substitution);
    Collections.sort(contemporaryLitigate);

    while (!contemporaryLitigate.isEmpty()) {
      server.arrivingLitigate(contemporaryLitigate.removeFirst());
    }

    while (server.goIsMoving()) {

      if (server.beatInauguratedOperationsSeverity() == hawnMechanism) {
        server.quitProgramming(substitution);
      } else {
        server.orderedNewTally(server.obtainLiveTic() + 1);
        server.nbsClick();
      }
    }
  }
}
