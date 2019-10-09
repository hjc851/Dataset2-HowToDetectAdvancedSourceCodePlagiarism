import java.util.*;

public class Starter {
  private ArrayDeque<Interface> need;
  private int nbrTreat;
  private LinkedList<March> BalancersSystems;
  private LinkedList<March> DialMethodologies;

  public Starter() {
    this.need = new ArrayDeque<>();
    Interface icc = new XingCallback();
    this.need.addLast(icc);
  }

  public void fixedBooleanPractices(LinkedList<March> systems) {
    this.nbrTreat = systems.size();
    this.BalancersSystems = systems;
  }

  public void primedSyncAppendage(LinkedList<March> mechanism) {
    this.nbrTreat = mechanism.size();
    this.DialMethodologies = mechanism;
  }

  public void tallyConsignor() {
    this.playTimer(new XingCallback(), this.BalancersSystems, "LRU");
    this.playTimer(new XingCallback(), this.DialMethodologies, "CLOCK");
  }

  private void playTimer(Interface spooler, LinkedList<March> actualAct, String substitutes) {
    spooler.runDebugging(substitutes);
    Collections.sort(actualAct);

    while (!actualAct.isEmpty()) {
      spooler.nextSue(actualAct.removeFirst());
    }

    while (spooler.goIsMoving()) {

      if (spooler.obtainFinishedOutgrowthLength() == nbrTreat) {
        spooler.pointSynchronizer(substitutes);
      } else {
        spooler.doContinuingVibrate(spooler.driveContinuingVibrate() + 1);
        spooler.ourTicktack();
      }
    }
  }
}
