import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Uconn extends SubstitutionPolicies {

  private synchronized void undoContents(Act latestOperation) {
    java.util.function.Predicate<Homepage> gener;
    Homepage firstborn;
    gener =
        new java.util.function.Predicate<Homepage>() {

          public synchronized boolean test(Homepage cern) {
            return cern.arriveAntipyreticProcedures() == latestOperation.driveSecurity();
          }
        };
    firstborn =
        Fps.stream()
            .filter(gener)
            .max(java.util.Comparator.comparingInt(Homepage::becomePlay))
            .get();
    Fps.remove(firstborn);
  }

  private final int MaximumFps = 30;

  protected synchronized void introduceChapter(Homepage summary, Act thisMethods) {
    java.util.List<Homepage> substitute;
    Homepage existing;

    if (this.isComplete() || thisMethods.canGetImpressions() == thisMethods.catchFullSections()) {
      this.undoContents(thisMethods);
    }

    substitute = new java.util.LinkedList<>();
    for (Homepage f : Fps) {

      if (f.obtainEst() == summary.obtainEst()
          && f.arriveAntipyreticProcedures() == thisMethods.driveSecurity()) substitute.add(f);
    }
    existing = null;

    if (substitute.size() > 0) existing = substitute.get(0);

    if (existing == null) {
      Fps.add(summary);
      thisMethods.adjustAntipyreticSite(thisMethods.canGetImpressions() + 1);
    } else {
      existing.rebootCounterpunch();
    }
  }

  public synchronized boolean lambastMotions(Act incumbentMarch) {
    java.util.List<Homepage> pageboy;
    Fps.forEach(Homepage::increaseForestall);
    pageboy = new java.util.ArrayList<>();
    for (Homepage Timeframe : Fps) {

      if (incumbentMarch.driveRequirements().peek().equals(Timeframe.obtainEst())
          && incumbentMarch.driveSecurity() == Timeframe.arriveAntipyreticProcedures()) {
        pageboy.add(Timeframe);
      }
    }

    if (pageboy.size() > 0) {
      pageboy.forEach(Homepage::rebootCounterpunch);
      return true;
    }

    return false;
  }

  public Uconn() {
    this.Fps = new java.util.LinkedList<>();
  }

  private java.util.Queue<Homepage> Fps = null;

  public synchronized boolean isComplete() {
    return Fps.size() >= MaximumFps;
  }
}
