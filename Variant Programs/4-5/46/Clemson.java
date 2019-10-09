import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Clemson extends ReplaceableSds {
  private static final int synX2536int = 1;
  private static final boolean synX2535boolean = false;
  private static final boolean synX2534boolean = true;
  private static final int synX2533int = 0;
  private static final int synX2532int = 0;
  private static final int synX2531int = 0;

  public synchronized void eliminateSection(Procedures actualAct) {
    java.util.function.Predicate<Layouts> titre =
        new java.util.function.Predicate<Layouts>() {

          public synchronized boolean test(Layouts cern) {
            return cern.drawArithmeticPhase() == actualAct.sustainSelf();
          }
        };
    Layouts greatest =
        Bases.stream()
            .filter(titre)
            .max(java.util.Comparator.comparingInt(Layouts::drawLite))
            .get();
    Bases.remove(greatest);
  }

  public synchronized boolean isComplete() {
    return Bases.size() >= FullPairs;
  }

  public java.util.Queue<Layouts> Bases;

  public Clemson() {
    this.Bases = (new java.util.LinkedList<>());
  }

  public final int FullPairs = 30;

  protected synchronized void combineScreen(Layouts table, Procedures presentlyMechanism) {

    if (this.isComplete()
        || presentlyMechanism.catchAddSections() == presentlyMechanism.developUltimatePpm())
      synx398(presentlyMechanism);

    java.util.List<Layouts> thermometer = new java.util.LinkedList<>();
    for (Layouts f : Bases) synx399(f, table, presentlyMechanism, thermometer);
    Layouts live = null;

    if (thermometer.size() > synX2531int) live = (thermometer.get(synX2532int));

    if (live == null) synx400(table, presentlyMechanism);
    else synx401(live);
  }

  public synchronized boolean watchQuest(Procedures circulatingServe) {
    Bases.forEach(Layouts::sliceStem);
    java.util.List<Layouts> tab = new java.util.ArrayList<>();
    for (Layouts Physique : Bases) synx402(circulatingServe, Physique, tab);

    if (tab.size() > synX2533int) {
      tab.forEach(Layouts::configureForesee);
      return synX2534boolean;
    }

    return synX2535boolean;
  }

  private synchronized void synx398(Procedures presentlyMechanism) {
    this.eliminateSection(presentlyMechanism);
  }

  private synchronized void synx399(
      Layouts f,
      Layouts table,
      Procedures presentlyMechanism,
      java.util.List<Layouts> thermometer) {

    if (f.goQuod() == table.goQuod() && f.drawArithmeticPhase() == presentlyMechanism.sustainSelf())
      thermometer.add(f);
  }

  private synchronized void synx400(Layouts table, Procedures presentlyMechanism) {
    Bases.add(table);
    presentlyMechanism.doResetAspects(presentlyMechanism.catchAddSections() + synX2536int);
  }

  private synchronized void synx401(Layouts live) {
    live.configureForesee();
  }

  private synchronized void synx402(
      Procedures circulatingServe, Layouts Physique, java.util.List<Layouts> tab) {

    if (circulatingServe.drawSubmissions().peek().equals(Physique.goQuod())
        && circulatingServe.sustainSelf() == Physique.drawArithmeticPhase()) {
      tab.add(Physique);
    }
  }
}
