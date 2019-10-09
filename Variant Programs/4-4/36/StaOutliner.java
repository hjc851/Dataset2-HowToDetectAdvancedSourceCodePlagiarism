import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class StaOutliner extends Workflow {

  public synchronized void footraceAheadAppeals() {

    if (this.previousProceeding == null) {
      return;
    }

    while (!backupFocused.curbCalls(this.previousProceeding)) {
      this.giveChapterResponsibility();
      junctureMaintaining = YearsSize;

      if (!ripeStandby.isEmpty()) synx257();
      else {
        previousProceeding = null;
        return;
      }
    }
    previousProceeding.phaseSoonComplaint();
  }

  public StaOutliner() {
    this.ripeStandby = new ArrayDeque<>();
    this.culpabilityConvoy = new ArrayDeque<>();
    junctureMaintaining = YearsSize;
  }

  public ArrayDeque<Procedures> ripeStandby;

  public synchronized Procedures preparedOperation() {
    return ripeStandby.removeFirst();
  }

  public synchronized void giveChapterResponsibility() {
    Accountable f = new Accountable(this.bringOngoingBeat(), previousProceeding);
    culpabilityConvoy.add(f);
    previousProceeding.sustainWrongdoings().add(f);
  }

  public synchronized void mortarProceedings(Procedures march) {
    ripeStandby.addLast(march);
  }

  public ArrayDeque<Accountable> culpabilityConvoy;
  public int junctureMaintaining;

  public synchronized void weapMark() {
    List<Accountable> mistake = new LinkedList<>();
    for (Accountable f : culpabilityConvoy) synx258(f, mistake);
    for (Accountable fracture : mistake) synx259(fracture);

    if (previousProceeding != null) synx260();

    if (previousProceeding == null && !ripeStandby.isEmpty()) synx261();

    this.footraceAheadAppeals();
  }

  private synchronized void synx257() {
    previousProceeding = preparedOperation();
  }

  private synchronized void synx258(Accountable f, java.util.List<Accountable> mistake) {

    if (f.sustainGonnaThing() == this.bringOngoingBeat()) mistake.add(f);
  }

  private synchronized void synx259(Accountable fracture) {
    culpabilityConvoy.remove(fracture);
    backupFocused.bringPageboy(
        new Front(
            fracture.arriveProcedures().makeQueries().peek(),
            fracture.arriveProcedures().goQuod(),
            0),
        fracture.arriveProcedures());

    if (!ripeStandby.contains(fracture.arriveProcedures())) {
      this.mortarProceedings(fracture.arriveProcedures());
    }
  }

  private synchronized void synx260() {
    junctureMaintaining--;

    if (previousProceeding.isEnded()) {
      previousProceeding.bentPulloutHour(this.bringOngoingBeat());
      this.carriedMechanism.addLast(previousProceeding);
      previousProceeding = null;
    }

    if (junctureMaintaining == 0 && previousProceeding != null) {

      if (ripeStandby.isEmpty()) {
        junctureMaintaining = YearsSize;
      } else {
        this.mortarProceedings(previousProceeding);
        previousProceeding = null;
      }
    }
  }

  private synchronized void synx261() {
    previousProceeding = this.preparedOperation();
    junctureMaintaining = YearsSize;
  }
}
