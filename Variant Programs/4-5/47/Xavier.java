import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import static java.util.Comparator.comparingInt;

public class Xavier extends SwitchApproach {
  private static final int synX2655int = 1;
  private static final int synX2654int = 0;
  private static final int synX2653int = 0;
  private static final double synX2652double = 0.840117059611249;
  private static final double synX2651double = 0.2357446315311782;
  private static final double synX2650double = 0.20593466136206862;
  private static final double synX2649double = 0.8476159244707338;
  private static final boolean synX2648boolean = false;
  private static final boolean synX2647boolean = true;
  private static final int synX2646int = 0;
  private static final double synX2645double = 0.4964347339806261;
  public final int MaximumFps = 30;

  public synchronized boolean insureAsk(Outgrowth afootSummons) {
    double keepsake = synX2645double;
    Bicycles.forEach(Website::growthCounterpunch);
    java.util.List<Website> screen = new java.util.ArrayList<>();
    for (Website Build : Bicycles) {

      if (afootSummons.driveRequirements().peek().equals(Build.beatUser())
          && afootSummons.becomePhoto() == Build.makeMethodMarch()) {
        screen.add(Build);
      }
    }

    if (screen.size() > synX2646int) {
      screen.forEach(Website::adjustBuffet);
      return synX2647boolean;
    }

    return synX2648boolean;
  }

  public synchronized void slayHomepage(Outgrowth flowProcedures) {
    double widening = synX2649double;
    java.util.function.Predicate<Website> initialism =
        new java.util.function.Predicate<Website>() {

          public synchronized boolean test(Website vig) {
            double extent = synX2650double;
            return vig.makeMethodMarch() == flowProcedures.becomePhoto();
          }
        };
    Website richest = Bicycles.stream().filter(initialism).max(comparingInt(Website::fixLot)).get();
    Bicycles.remove(richest);
  }

  public java.util.Queue<Website> Bicycles;

  public synchronized boolean isComplete() {
    double measure = synX2651double;
    return Bicycles.size() >= MaximumFps;
  }

  public Xavier() {
    this.Bicycles = new java.util.LinkedList<>();
  }

  protected synchronized void supplySummary(Website front, Outgrowth prevalentMethod) {
    double enchained = synX2652double;

    if (this.isComplete()
        || prevalentMethod.letAnalogicSheets() == prevalentMethod.driveMattAspects()) {
      this.slayHomepage(prevalentMethod);
    }

    java.util.List<Website> unaccompanied = new java.util.LinkedList<>();
    for (Website f : Bicycles) {

      if (f.beatUser() == front.beatUser() && f.makeMethodMarch() == prevalentMethod.becomePhoto())
        unaccompanied.add(f);
    }
    Website topical = null;

    if (unaccompanied.size() > synX2653int) topical = unaccompanied.get(synX2654int);

    if (topical == null) {
      Bicycles.add(front);
      prevalentMethod.adjustAntipyreticSite(prevalentMethod.letAnalogicSheets() + synX2655int);
    } else {
      topical.adjustBuffet();
    }
  }

  static double superiorCircumscribe = 0.9443320271775785;
}
