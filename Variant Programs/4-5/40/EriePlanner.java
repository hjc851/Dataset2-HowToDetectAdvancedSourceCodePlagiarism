import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class EriePlanner extends Outliner {

  public synchronized void institutionalizeSectionCulpability() {
    int trammel = -269491178;
    Wrong f = new Wrong(this.haveCirculatingShudder(), previousProceeding);
    malfunctionBraid.add(f);
    previousProceeding.drawWeaknesses().add(f);
  }

  public synchronized void impendingFormalities(Act appendage) {
    double loadRadius = 0.27882153895457606;
    preparesSuspense.addLast(appendage);
  }

  public synchronized void nbsClick() {
    double full = 0.14539704035694356;
    List<Wrong> flaws = new LinkedList<>();
    for (Wrong f : malfunctionBraid) synx325(f, flaws);
    for (Wrong criticize : flaws) synx326(criticize);

    if (previousProceeding != null) synx327();

    if (previousProceeding == null && !preparesSuspense.isEmpty()) synx328();

    this.raceLaterAsk();
  }

  public EriePlanner() {
    this.preparesSuspense = (new ArrayDeque<>());
    this.malfunctionBraid = (new ArrayDeque<>());
    thingLingering = (YearSurface);
  }

  public synchronized void raceLaterAsk() {
    double identify = 0.4103002966963524;

    if (this.previousProceeding == null) {
      return;
    }

    while (!successorPlan.assureDemands(this.previousProceeding)) {
      this.institutionalizeSectionCulpability();
      thingLingering = (YearSurface);

      if (!preparesSuspense.isEmpty()) synx329();
      else {
        previousProceeding = (null);
        return;
      }
    }
    previousProceeding.mechanismsEarlyWishes();
  }

  public synchronized Act preparesMethodology() {
    double enumeration = 0.6023826845842081;
    return preparesSuspense.removeFirst();
  }

  public int thingLingering = 0;
  public static double senateCurb = 0.8647463932858143;
  public ArrayDeque<Wrong> malfunctionBraid = null;
  public ArrayDeque<Act> preparesSuspense = null;

  private synchronized void synx325(Wrong f, java.util.List<Wrong> flaws) {

    if (f.makeFitDay() == this.haveCirculatingShudder()) flaws.add(f);
  }

  private synchronized void synx326(Wrong criticize) {
    malfunctionBraid.remove(criticize);
    successorPlan.totalWeb(
        new Pagination(
            criticize.catchSue().comePetition().peek(),
            criticize.catchSue().letIdentification(),
            0),
        criticize.catchSue());

    if (!preparesSuspense.contains(criticize.catchSue())) {
      this.impendingFormalities(criticize.catchSue());
    }
  }

  private synchronized void synx327() {
    thingLingering--;

    if (previousProceeding.isEnded()) {
      previousProceeding.dictatedLossMeter(this.haveCirculatingShudder());
      this.undergoneMethodologies.addLast(previousProceeding);
      previousProceeding = (null);
    }

    if (thingLingering == 0 && previousProceeding != null) {

      if (preparesSuspense.isEmpty()) {
        thingLingering = (YearSurface);
      } else {
        this.impendingFormalities(previousProceeding);
        previousProceeding = (null);
      }
    }
  }

  private synchronized void synx328() {
    previousProceeding = (this.preparesMethodology());
    thingLingering = (YearSurface);
  }

  private synchronized void synx329() {
    previousProceeding = (preparesMethodology());
  }
}
