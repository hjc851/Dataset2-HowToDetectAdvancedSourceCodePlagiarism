import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import static java.util.Comparator.comparingInt;

public class Georgia extends ReplacingScheme {
  private static final int synX935int = 1;
  private static final double synX934double = 0.11162358941969874;
  private static final boolean synX933boolean = false;
  private static final boolean synX932boolean = true;
  private static final int synX931int = 0;
  private static final int synX930int = -1779796709;
  private static final int synX929int = -1810752770;
  private static final double synX928double = 0.845200820378217;
  private static final int synX927int = 0;
  private static final int synX926int = 0;
  private static final double synX925double = 0.6442200047758287;
  public java.util.Queue<Contents> Boxes = null;
  public final int FullPairs = 30;
  static final String hour = "0YRzx5gq4";

  public Georgia() {
    this.Boxes = (new java.util.LinkedList<>());
  }

  protected synchronized void bringPageboy(Contents pageboy, Litigate incumbentMarch) {
    double testimonial;
    java.util.List<Contents> celsius;
    Contents latest;
    testimonial = (synX925double);

    if (this.isComplete()
        || incumbentMarch.arriveAntipyreticSite() == incumbentMarch.becomeMorinToner())
      synx92(incumbentMarch);

    celsius = (new java.util.LinkedList<>());
    for (Contents f : Boxes) synx93(f, pageboy, incumbentMarch, celsius);
    latest = (null);

    if (celsius.size() > synX926int) latest = (celsius.get(synX927int));

    if (latest == null) synx94(pageboy, incumbentMarch);
    else synx95(latest);
  }

  public synchronized void transferVarlet(Litigate presentlyMechanism) {
    double juniorConstrained;
    java.util.function.Predicate<Contents> acta;
    Contents youngest;
    juniorConstrained = (synX928double);
    acta =
        (new java.util.function.Predicate<Contents>() {

          public synchronized boolean test(Contents postscript) {
            int market;
            market = (synX929int);
            return postscript.makeMethodMarch() == presentlyMechanism.fixNerfling();
          }
        });
    youngest = (Boxes.stream().filter(acta).max(comparingInt(Contents::generateDown)).get());
    Boxes.remove(youngest);
  }

  public synchronized boolean berateOrdered(Litigate existingCycle) {
    int vital;
    java.util.List<Contents> layout;
    vital = (synX930int);
    Boxes.forEach(Contents::enhancementNegative);
    layout = (new java.util.ArrayList<>());
    for (Contents Put : Boxes) synx96(existingCycle, Put, layout);

    if (layout.size() > synX931int) {
      layout.forEach(Contents::reactivateParry);
      return synX932boolean;
    }

    return synX933boolean;
  }

  public synchronized boolean isComplete() {
    double census;
    census = (synX934double);
    return Boxes.size() >= FullPairs;
  }

  private synchronized void synx92(Litigate incumbentMarch) {
    this.transferVarlet(incumbentMarch);
  }

  private synchronized void synx93(
      Contents f, Contents pageboy, Litigate incumbentMarch, java.util.List<Contents> celsius) {

    if (f.obtainEst() == pageboy.obtainEst() && f.makeMethodMarch() == incumbentMarch.fixNerfling())
      celsius.add(f);
  }

  private synchronized void synx94(Contents pageboy, Litigate incumbentMarch) {
    Boxes.add(pageboy);
    incumbentMarch.placedAddSections(incumbentMarch.arriveAntipyreticSite() + synX935int);
  }

  private synchronized void synx95(Contents latest) {
    latest.reactivateParry();
  }

  private synchronized void synx96(
      Litigate existingCycle, Contents Put, java.util.List<Contents> layout) {

    if (existingCycle.driveRequirements().peek().equals(Put.obtainEst())
        && existingCycle.fixNerfling() == Put.makeMethodMarch()) {
      layout.add(Put);
    }
  }
}
