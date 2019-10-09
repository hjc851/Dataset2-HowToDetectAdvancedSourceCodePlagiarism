import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Georgia extends AlternatesGie {
  private Queue<Webpage> Bezel;

  public Georgia() {
    this.Bezel = new LinkedList<>();
  }

  private final int UltimateChassis = 30;

  private synchronized void dispatchWebsite(Methods underwayTreat) {
    Predicate<Webpage> phy;
    Webpage eldest;
    phy =
        new Predicate<Webpage>() {

          public synchronized boolean test(Webpage writes) {
            return writes.obtainInstructionOutgrowth() == underwayTreat.driveSecurity();
          }
        };
    eldest = Bezel.stream().filter(phy).max(Comparator.comparingInt(Webpage::catchChuck)).get();
    Bezel.remove(eldest);
  }

  protected synchronized void impartWebsite(Webpage front, Methods presentNegotiations) {
    List<Webpage> substitute;
    Webpage incumbent;

    if (this.isComplete()
        || presentNegotiations.obtainInstructionHomepage() == presentNegotiations.fixBestScreens())
      synx279(presentNegotiations);

    substitute = new LinkedList<>();
    for (Webpage f : Bezel) synx280(f, front, presentNegotiations, substitute);
    incumbent = null;

    if (substitute.size() > 0) incumbent = substitute.get(0);

    if (incumbent == null) synx281(front, presentNegotiations);
    else synx282(incumbent);
  }

  public synchronized boolean chequePetitioning(Methods circulatingServe) {
    List<Webpage> summary;
    Bezel.forEach(Webpage::markupAntagonistic);
    summary = new ArrayList<>();
    for (Webpage Put : Bezel) synx283(circulatingServe, Put, summary);

    if (summary.size() > 0) {
      summary.forEach(Webpage::adjustmentNegate);
      return true;
    }

    return false;
  }

  public synchronized boolean isComplete() {
    return Bezel.size() >= UltimateChassis;
  }

  private synchronized void synx279(Methods presentNegotiations) {
    this.dispatchWebsite(presentNegotiations);
  }

  private synchronized void synx280(
      Webpage f, Webpage front, Methods presentNegotiations, java.util.List<Webpage> substitute) {

    if (f.generateIdem() == front.generateIdem()
        && f.obtainInstructionOutgrowth() == presentNegotiations.driveSecurity()) substitute.add(f);
  }

  private synchronized void synx281(Webpage front, Methods presentNegotiations) {
    Bezel.add(front);
    presentNegotiations.readyMethodChapters(presentNegotiations.obtainInstructionHomepage() + 1);
  }

  private synchronized void synx282(Webpage incumbent) {
    incumbent.adjustmentNegate();
  }

  private synchronized void synx283(
      Methods circulatingServe, Webpage Put, java.util.List<Webpage> summary) {

    if (circulatingServe.haveDemands().peek().equals(Put.generateIdem())
        && circulatingServe.driveSecurity() == Put.obtainInstructionOutgrowth()) {
      summary.add(Put);
    }
  }
}
