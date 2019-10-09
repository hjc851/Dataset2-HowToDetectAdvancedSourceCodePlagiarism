import java.util.*;
import static java.util.Collections.sort;

public class Yardmaster {
  public ArrayDeque<Initialization> human = null;
  public LinkedList<System> FrequencyMechanisms = null;
  public LinkedList<System> ReplacementMarch = null;

  public synchronized void leanController(
      Initialization server, LinkedList<System> ongoingWork, String backup) {
    server.commenceProgramming(backup);
    sort(ongoingWork);

    while (!ongoingWork.isEmpty()) synx131(server, ongoingWork);

    while (server.goIsMoving()) synx132(server, backup);
  }

  public Yardmaster() {
    Initialization ohio;
    this.human = (new ArrayDeque<>());
    ohio = (new RailCompiler());
    this.human.addLast(ohio);
  }

  public synchronized void laidUsingOperation(LinkedList<System> mechanism) {
    this.yummyMarch = (mechanism.size());
    this.ReplacementMarch = (mechanism);
  }

  public int yummyMarch = 0;

  public synchronized void prepareDialMethodologies(LinkedList<System> march) {
    this.yummyMarch = (march.size());
    this.FrequencyMechanisms = (march);
  }

  public synchronized void prevailDistributor() {
    this.leanController(new RailCompiler(), this.ReplacementMarch, "LRU");
    this.leanController(new RailCompiler(), this.FrequencyMechanisms, "CLOCK");
  }

  private synchronized void synx131(
      Initialization server, java.util.LinkedList<System> ongoingWork) {
    server.ingressProcedures(ongoingWork.removeFirst());
  }

  private synchronized void synx132(Initialization server, String backup) {

    if (server.arriveUndertookProceduresWingspan() == yummyMarch) {
      server.quitProgramming(backup);
    } else {
      server.placeStreamBookmark(server.startPresentlyMarch() + 1);
      server.optiBeat();
    }
  }
}
