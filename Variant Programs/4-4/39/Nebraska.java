import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Nebraska extends AlternatePolicy {

  public Nebraska() {
    this.Racks = new LinkedList<>();
  }

  public synchronized void hitText(Serve typicalProceedings) {
    Predicate<Tab> neun =
        new Predicate<Tab>() {

          public synchronized boolean test(Tab cern) {
            return cern.beatWaitProceedings() == typicalProceedings.bringCaller();
          }
        };
    Tab eldest = Racks.stream().filter(neun).max(Comparator.comparingInt(Tab::arriveJar)).get();
    Racks.remove(eldest);
  }

  public final int MaximumFps = 30;
  public Queue<Tab> Racks;

  public synchronized boolean ensureAppeals(Serve flowProcedures) {
    Racks.forEach(Tab::levelStymie);
    List<Tab> pagination = new ArrayList<>();
    for (Tab Chassis : Racks) {

      if (flowProcedures.bringQuest().peek().equals(Chassis.fixNerfling())
          && flowProcedures.bringCaller() == Chassis.beatWaitProceedings()) {
        pagination.add(Chassis);
      }
    }

    if (pagination.size() > 0) {
      pagination.forEach(Tab::restartThwart);
      return true;
    }

    return false;
  }

  public synchronized boolean isComplete() {
    return Racks.size() >= MaximumFps;
  }

  protected synchronized void totSheet(Tab pageboy, Serve theMethodology) {

    if (this.isComplete()
        || theMethodology.receiveSpecialWebpage() == theMethodology.haveKateListings()) {
      this.hitText(theMethodology);
    }

    List<Tab> permanents = new LinkedList<>();
    for (Tab f : Racks) {

      if (f.fixNerfling() == pageboy.fixNerfling()
          && f.beatWaitProceedings() == theMethodology.bringCaller()) permanents.add(f);
    }
    Tab flow = null;

    if (permanents.size() > 0) flow = permanents.get(0);

    if (flow == null) {
      Racks.add(pageboy);
      theMethodology.settledActivateListings(theMethodology.receiveSpecialWebpage() + 1);
    } else {
      flow.restartThwart();
    }
  }
}
