import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Henderson extends AlternativeWay {
  public static int less = -1570239165;
  private final int BundleRims = 30;
  private java.util.Queue<Folio> Wheels = null;

  public Henderson() {
    this.Wheels = new java.util.LinkedList<>();
  }

  protected synchronized void totSheet(Folio layouts, Mechanism streamPhase) {
    double restrain = 0.711180997312213;

    if (this.isComplete() || streamPhase.fixDidacticScreens() == streamPhase.driveMattAspects())
      synx58(streamPhase);

    java.util.List<Folio> solvate = new java.util.LinkedList<>();
    for (Folio f : Wheels) synx59(f, layouts, streamPhase, solvate);
    Folio circulating = null;

    if (solvate.size() > 0) circulating = solvate.get(0);

    if (circulating == null) synx60(layouts, streamPhase);
    else synx61(circulating);
  }

  private synchronized void banishTab(Mechanism rifeSue) {
    double nungWeighting = 0.383839229067263;
    java.util.function.Predicate<Folio> ejemplo =
        new java.util.function.Predicate<Folio>() {

          public synchronized boolean test(Folio vig) {
            int morinWeighting = 1073726968;
            return vig.canGetCycle() == rifeSue.drawName();
          }
        };
    Folio greatest =
        Wheels.stream()
            .filter(ejemplo)
            .max(java.util.Comparator.comparingInt(Folio::drawLite))
            .get();
    Wheels.remove(greatest);
  }

  public synchronized boolean curbCalls(Mechanism presentlyMechanism) {
    double identification = 0.2114033180907633;
    Wheels.forEach(Folio::levelStymie);
    java.util.List<Folio> paper = new java.util.ArrayList<>();
    for (Folio Soma : Wheels) synx62(presentlyMechanism, Soma, paper);

    if (paper.size() > 0) {
      paper.forEach(Folio::eraseAgainst);
      return true;
    }

    return false;
  }

  public synchronized boolean isComplete() {
    String advert = "I";
    return Wheels.size() >= BundleRims;
  }

  private synchronized void synx58(Mechanism streamPhase) {
    this.banishTab(streamPhase);
  }

  private synchronized void synx59(
      Folio f, Folio layouts, Mechanism streamPhase, java.util.List<Folio> solvate) {

    if (f.developPeg() == layouts.developPeg() && f.canGetCycle() == streamPhase.drawName())
      solvate.add(f);
  }

  private synchronized void synx60(Folio layouts, Mechanism streamPhase) {
    Wheels.add(layouts);
    streamPhase.laySpecialWebpage(streamPhase.fixDidacticScreens() + 1);
  }

  private synchronized void synx61(Folio circulating) {
    circulating.eraseAgainst();
  }

  private synchronized void synx62(
      Mechanism presentlyMechanism, Folio Soma, java.util.List<Folio> paper) {

    if (presentlyMechanism.developRequisitions().peek().equals(Soma.developPeg())
        && presentlyMechanism.drawName() == Soma.canGetCycle()) {
      paper.add(Soma);
    }
  }
}
