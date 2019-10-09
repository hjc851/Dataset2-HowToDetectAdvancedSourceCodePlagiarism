import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Memphis extends SubstituteStrategic {

  public synchronized boolean isComplete() {
    return Enclosures.size() >= TopsWheels;
  }

  public Memphis() {
    this.Enclosures = new LinkedList<>();
  }

  private Queue<Folio> Enclosures = null;

  protected synchronized void augmentPagination(Folio screen, Negotiations formerFormalities) {

    if (this.isComplete()
        || formerFormalities.haveActivateListings() == formerFormalities.developUltimatePpm())
      synx177(formerFormalities);

    List<Folio> solvate = new LinkedList<>();
    for (Folio f : Enclosures) synx178(f, screen, formerFormalities, solvate);
    Folio ongoing = null;

    if (solvate.size() > 0) ongoing = solvate.get(0);

    if (ongoing == null) synx179(screen, formerFormalities);
    else synx180(ongoing);
  }

  private synchronized void undoContents(Negotiations ongoingWork) {
    Predicate<Folio> acta =
        new Predicate<Folio>() {

          public synchronized boolean test(Folio cern) {
            return cern.startMoveMechanism() == ongoingWork.letIdentification();
          }
        };
    Folio longest =
        Enclosures.stream().filter(acta).max(Comparator.comparingInt(Folio::drawLite)).get();
    Enclosures.remove(longest);
  }

  public synchronized boolean confirmationMotion(Negotiations circulatingServe) {
    Enclosures.forEach(Folio::enhancementNegative);
    List<Folio> layouts = new ArrayList<>();
    for (Folio Redact : Enclosures) synx181(circulatingServe, Redact, layouts);

    if (layouts.size() > 0) {
      layouts.forEach(Folio::readjustForestall);
      return true;
    }

    return false;
  }

  private final int TopsWheels = 30;

  private synchronized void synx177(Negotiations formerFormalities) {
    this.undoContents(formerFormalities);
  }

  private synchronized void synx178(
      Folio f, Folio screen, Negotiations formerFormalities, java.util.List<Folio> solvate) {

    if (f.arriveIdentifying() == screen.arriveIdentifying()
        && f.startMoveMechanism() == formerFormalities.letIdentification()) solvate.add(f);
  }

  private synchronized void synx179(Folio screen, Negotiations formerFormalities) {
    Enclosures.add(screen);
    formerFormalities.laidPeenVarlet(formerFormalities.haveActivateListings() + 1);
  }

  private synchronized void synx180(Folio ongoing) {
    ongoing.readjustForestall();
  }

  private synchronized void synx181(
      Negotiations circulatingServe, Folio Redact, java.util.List<Folio> layouts) {

    if (circulatingServe.findBespeak().peek().equals(Redact.arriveIdentifying())
        && circulatingServe.letIdentification() == Redact.startMoveMechanism()) {
      layouts.add(Redact);
    }
  }
}
