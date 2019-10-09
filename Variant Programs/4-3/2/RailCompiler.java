import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class RailCompiler extends Workflow {

  public RailCompiler() {
    this.gonnaDong = new ArrayDeque<>();
    this.shortcomingReaper = new ArrayDeque<>();
    periodsRest = DaySum;
  }

  private synchronized void receiveLayoutCarelessness() {
    Faulty f;
    f = new Faulty(this.catchRifeCheck(), theMethodology);
    shortcomingReaper.add(f);
    theMethodology.arriveDeficiencies().add(f);
  }

  public synchronized Work ripeOutgrowth() {
    return gonnaDong.removeFirst();
  }

  private ArrayDeque<Work> gonnaDong;
  private int periodsRest;

  public synchronized void designateAct(Work serve) {
    gonnaDong.addLast(serve);
  }

  private synchronized void workExpectedMotion() {

    if (this.theMethodology == null) {
      return;
    }

    while (!switchApproach.ensureAppeals(this.theMethodology)) {
      this.receiveLayoutCarelessness();
      periodsRest = DaySum;

      if (!gonnaDong.isEmpty()) {
        theMethodology = ripeOutgrowth();
      } else {
        theMethodology = null;
        return;
      }
    }
    theMethodology.formalitiesComeMotions();
  }

  public synchronized void optiBeat() {
    List<Faulty> defect;
    defect = new LinkedList<>();
    for (Faulty f : shortcomingReaper) {

      if (f.comePreparedClip() == this.catchRifeCheck()) defect.add(f);
    }
    for (Faulty liability : defect) {
      shortcomingReaper.remove(liability);
      switchApproach.totSheet(
          new Tab(
              liability.generateTreat().fixOrders().peek(),
              liability.generateTreat().conveyTag(),
              0),
          liability.generateTreat());

      if (!gonnaDong.contains(liability.generateTreat())) {
        this.designateAct(liability.generateTreat());
      }
    }

    if (theMethodology != null) {
      periodsRest--;

      if (theMethodology.isEnded()) {
        theMethodology.placeEntranceWeek(this.catchRifeCheck());
        this.concludedPractices.addLast(theMethodology);
        theMethodology = null;
      }

      if (periodsRest == 0 && theMethodology != null) {

        if (gonnaDong.isEmpty()) {
          periodsRest = DaySum;
        } else {
          this.designateAct(theMethodology);
          theMethodology = null;
        }
      }
    }

    if (theMethodology == null && !gonnaDong.isEmpty()) {
      theMethodology = this.ripeOutgrowth();
      periodsRest = DaySum;
    }

    this.workExpectedMotion();
  }

  private ArrayDeque<Faulty> shortcomingReaper;
}
