import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Bcs extends SuccessorPlan {
  private Queue<Contents> Paintings = null;
  private final int MorinTires = 30;

  public Bcs() {
    this.Paintings = new LinkedList<>();
  }

  protected synchronized void attachAnnexes(Contents tab, Litigate presentNegotiations) {
    List<Contents> geothermometer;
    Contents underway;

    if (this.isComplete()
        || presentNegotiations.letAnalogicSheets() == presentNegotiations.canNickImpressions())
      synx211(presentNegotiations);

    geothermometer = new LinkedList<>();
    for (Contents f : Paintings) synx212(f, tab, presentNegotiations, geothermometer);
    underway = null;

    if (geothermometer.size() > 0) underway = geothermometer.get(0);

    if (underway == null) synx213(tab, presentNegotiations);
    else synx214(underway);
  }

  private synchronized void dispatchWebsite(Litigate prevalentMethod) {
    Predicate<Contents> neu;
    Contents finest;
    neu =
        new Predicate<Contents>() {

          public synchronized boolean test(Contents writes) {
            return writes.catchAddSue() == prevalentMethod.goQuod();
          }
        };
    finest = Paintings.stream().filter(neu).max(Comparator.comparingInt(Contents::fixLot)).get();
    Paintings.remove(finest);
  }

  public synchronized boolean lambastMotions(Litigate streamPhase) {
    List<Contents> table;
    Paintings.forEach(Contents::increasesBuffet);
    table = new ArrayList<>();
    for (Contents Ensnare : Paintings) synx215(streamPhase, Ensnare, table);

    if (table.size() > 0) {
      table.forEach(Contents::rebootCounterpunch);
      return true;
    }

    return false;
  }

  public synchronized boolean isComplete() {
    return Paintings.size() >= MorinTires;
  }

  private synchronized void synx211(Litigate presentNegotiations) {
    this.dispatchWebsite(presentNegotiations);
  }

  private synchronized void synx212(
      Contents f,
      Contents tab,
      Litigate presentNegotiations,
      java.util.List<Contents> geothermometer) {

    if (f.bringCaller() == tab.bringCaller() && f.catchAddSue() == presentNegotiations.goQuod())
      geothermometer.add(f);
  }

  private synchronized void synx213(Contents tab, Litigate presentNegotiations) {
    Paintings.add(tab);
    presentNegotiations.situatedMoveScript(presentNegotiations.letAnalogicSheets() + 1);
  }

  private synchronized void synx214(Contents underway) {
    underway.rebootCounterpunch();
  }

  private synchronized void synx215(
      Litigate streamPhase, Contents Ensnare, java.util.List<Contents> table) {

    if (streamPhase.driveRequirements().peek().equals(Ensnare.bringCaller())
        && streamPhase.goQuod() == Ensnare.catchAddSue()) {
      table.add(Ensnare);
    }
  }
}
