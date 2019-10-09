import java.util.*;
import static java.util.Collections.sort;

public class Originator {
  private static final int synX1597int = 1;
  private static final String synX1596String = "CLOCK";
  private static final String synX1595String = "LRU";
  public ArrayDeque<Outliner> number = null;
  public int bersWork = 0;
  public LinkedList<Sue> BestsellerMechanisms = null;
  public LinkedList<Sue> WatchPractices = null;

  public Originator() {
    this.number = (new ArrayDeque<>());
    Outliner diddle = new StaOutliner();
    this.number.addLast(diddle);
  }

  public synchronized void laidUsingOperation(LinkedList<Sue> proces) {
    this.bersWork = (proces.size());
    this.BestsellerMechanisms = (proces);
  }

  public synchronized void placedPendulumSue(LinkedList<Sue> treat) {
    this.bersWork = (treat.size());
    this.WatchPractices = (treat);
  }

  public synchronized void footraceLimiter() {
    this.courseCallback(new StaOutliner(), this.BestsellerMechanisms, synX1595String);
    this.courseCallback(new StaOutliner(), this.WatchPractices, synX1596String);
  }

  public synchronized void courseCallback(
      Outliner synchronizer, LinkedList<Sue> ongoingWork, String replaced) {
    synchronizer.openingInitialization(replaced);
    sort(ongoingWork);

    while (!ongoingWork.isEmpty()) {
      synchronizer.ingoingProcedure(ongoingWork.removeFirst());
    }

    while (synchronizer.goIsMoving()) {

      if (synchronizer.catchFinalizeSueScale() == bersWork) {
        synchronizer.breakInterface(replaced);
      } else {
        synchronizer.situatedPresentlyMarch(synchronizer.fixNewTally() + synX1597int);
        synchronizer.addTock();
      }
    }
  }
}
