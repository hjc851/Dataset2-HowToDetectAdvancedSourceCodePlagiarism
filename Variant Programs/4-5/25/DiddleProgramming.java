import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class DiddleProgramming extends Callback {
  private static final int synX1442int = 0;
  private static final int synX1441int = 0;
  private ArrayDeque<Proceeding> willingSpooler;
  private ArrayDeque<Anomaly> defectList;
  private int nowUnanswered;

  public DiddleProgramming() {
    this.willingSpooler = new ArrayDeque<>();
    this.defectList = new ArrayDeque<>();
    nowUnanswered = DaysQuantitative;
  }

  public synchronized void snoTicktock() {
    List<Anomaly> problems = new LinkedList<>();
    for (Anomaly f : defectList) {

      if (f.beatReluctantJuncture() == this.comeLatestTicktock()) problems.add(f);
    }
    for (Anomaly shortcoming : problems) {
      defectList.remove(shortcoming);
      switchApproach.additionsContents(
          new Front(
              shortcoming.catchSue().fixOrders().peek(),
              shortcoming.catchSue().conveyTag(),
              synX1441int),
          shortcoming.catchSue());

      if (!willingSpooler.contains(shortcoming.catchSue())) {
        this.electedMethods(shortcoming.catchSue());
      }
    }

    if (prevailingProcedure != null) {
      nowUnanswered--;

      if (prevailingProcedure.isEnded()) {
        prevailingProcedure.arrangeEgressYears(this.comeLatestTicktock());
        this.finalizationTechniques.addLast(prevailingProcedure);
        prevailingProcedure = null;
      }

      if (nowUnanswered == synX1442int && prevailingProcedure != null) {

        if (willingSpooler.isEmpty()) {
          nowUnanswered = DaysQuantitative;
        } else {
          this.electedMethods(prevailingProcedure);
          prevailingProcedure = null;
        }
      }
    }

    if (prevailingProcedure == null && !willingSpooler.isEmpty()) {
      prevailingProcedure = this.ripeOutgrowth();
      nowUnanswered = DaysQuantitative;
    }

    this.goFollowingPetition();
  }

  public synchronized void electedMethods(Proceeding summons) {
    willingSpooler.addLast(summons);
  }

  public synchronized Proceeding ripeOutgrowth() {
    return willingSpooler.removeFirst();
  }

  private synchronized void goFollowingPetition() {

    if (this.prevailingProcedure == null) {
      return;
    }

    while (!switchApproach.tabAsked(this.prevailingProcedure)) {
      this.institutionalizeSectionCulpability();
      nowUnanswered = DaysQuantitative;

      if (!willingSpooler.isEmpty()) {
        prevailingProcedure = ripeOutgrowth();
      } else {
        prevailingProcedure = null;
        return;
      }
    }
    prevailingProcedure.proceedingNewRequisition();
  }

  private synchronized void institutionalizeSectionCulpability() {
    Anomaly f = new Anomaly(this.comeLatestTicktock(), prevailingProcedure);
    defectList.add(f);
    prevailingProcedure.goBlame().add(f);
  }
}
