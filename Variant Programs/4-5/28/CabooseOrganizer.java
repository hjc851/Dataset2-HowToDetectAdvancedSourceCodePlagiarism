import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class CabooseOrganizer extends Timer {
  private static final int synX1648int = 0;
  private static final int synX1647int = 0;
  public int weekSurviving = 0;

  public synchronized void nextSue(Methods outgrowth) {
    poisedDipper.addLast(outgrowth);
  }

  public synchronized void addTock() {
    List<Liability> flaw;
    flaw = new LinkedList<>();
    for (Liability f : culpabilityConvoy) synx189(f, flaw);
    for (Liability problem : flaw) synx190(problem);

    if (contemporaryLitigate != null) synx191();

    if (contemporaryLitigate == null && !poisedDipper.isEmpty()) synx192();

    this.goFollowingPetition();
  }

  public synchronized void goFollowingPetition() {

    if (this.contemporaryLitigate == null) {
      return;
    }

    while (!understudyStrategize.curbCalls(this.contemporaryLitigate)) {
      this.mailedFolioLiability();
      weekSurviving = MeterMeasure;

      if (!poisedDipper.isEmpty()) synx193();
      else {
        contemporaryLitigate = null;
        return;
      }
    }
    contemporaryLitigate.mechanismsEarlyWishes();
  }

  public ArrayDeque<Liability> culpabilityConvoy = null;

  public CabooseOrganizer() {
    this.poisedDipper = new ArrayDeque<>();
    this.culpabilityConvoy = new ArrayDeque<>();
    weekSurviving = MeterMeasure;
  }

  public synchronized void mailedFolioLiability() {
    Liability f;
    f = new Liability(this.obtainLiveTic(), contemporaryLitigate);
    culpabilityConvoy.add(f);
    contemporaryLitigate.becomeLapses().add(f);
  }

  public ArrayDeque<Methods> poisedDipper = null;

  public synchronized Methods eagerCycle() {
    return poisedDipper.removeFirst();
  }

  private synchronized void synx189(Liability f, java.util.List<Liability> flaw) {

    if (f.letAvailableHours() == this.obtainLiveTic()) flaw.add(f);
  }

  private synchronized void synx190(Liability problem) {
    culpabilityConvoy.remove(problem);
    understudyStrategize.incorporateFootnote(
        new Web(
            problem.canCycle().fixOrders().peek(), problem.canCycle().produceMap(), synX1647int),
        problem.canCycle());

    if (!poisedDipper.contains(problem.canCycle())) {
      this.nextSue(problem.canCycle());
    }
  }

  private synchronized void synx191() {
    weekSurviving--;

    if (contemporaryLitigate.isEnded()) {
      contemporaryLitigate.fixedEscapeOpportunity(this.obtainLiveTic());
      this.achievedMechanisms.addLast(contemporaryLitigate);
      contemporaryLitigate = null;
    }

    if (weekSurviving == synX1648int && contemporaryLitigate != null) {

      if (poisedDipper.isEmpty()) {
        weekSurviving = MeterMeasure;
      } else {
        this.nextSue(contemporaryLitigate);
        contemporaryLitigate = null;
      }
    }
  }

  private synchronized void synx192() {
    contemporaryLitigate = this.eagerCycle();
    weekSurviving = MeterMeasure;
  }

  private synchronized void synx193() {
    contemporaryLitigate = eagerCycle();
  }
}
