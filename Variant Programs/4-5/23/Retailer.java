import java.util.*;
import static java.util.Collections.sort;

public class Retailer {
  public LinkedList<Phase> SynchServe = null;
  public LinkedList<Phase> AverageSummons = null;
  public int namOperation = 0;
  public ArrayDeque<Organizer> systems = null;

  public Retailer() {
    Organizer rail;
    this.systems = (new ArrayDeque<>());
    rail = (new XingCallback());
    this.systems.addLast(rail);
  }

  public synchronized void dictatedAssociatedWork(LinkedList<Phase> practices) {
    this.namOperation = (practices.size());
    this.AverageSummons = (practices);
  }

  public synchronized void rigidDayMethod(LinkedList<Phase> mechanism) {
    this.namOperation = (mechanism.size());
    this.SynchServe = (mechanism);
  }

  public synchronized void goTrainmaster() {
    this.leanController(new XingCallback(), this.AverageSummons, "LRU");
    this.leanController(new XingCallback(), this.SynchServe, "CLOCK");
  }

  public synchronized void leanController(
      Organizer multitasking, LinkedList<Phase> thePractices, String substitute) {
    multitasking.begunMultitasking(substitute);
    sort(thePractices);

    while (!thePractices.isEmpty()) {
      multitasking.mortarProceedings(thePractices.removeFirst());
    }

    while (multitasking.goIsMoving()) {

      if (multitasking.haveConductedServeLarge() == namOperation) {
        multitasking.kiboshSynchronization(substitute);
      } else {
        multitasking.situatedPresentlyMarch(multitasking.haveCirculatingShudder() + 1);
        multitasking.bpsRetick();
      }
    }
  }
}
