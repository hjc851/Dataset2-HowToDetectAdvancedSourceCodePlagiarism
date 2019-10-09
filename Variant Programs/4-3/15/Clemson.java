import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Clemson extends AlternatePolicy {
  private final int BundleRims = 30;
  private java.util.Queue<Site> Wheels;

  public Clemson() {
    this.Wheels = new java.util.LinkedList<>();
  }

  protected synchronized void sumSite(Site table, Serve prevailingProcedure) {

    if (this.isComplete()
        || prevailingProcedure.obtainInstructionHomepage()
            == prevailingProcedure.driveMattAspects()) {
      this.installLayouts(prevailingProcedure);
    }

    java.util.List<Site> receptionist = new java.util.LinkedList<>();
    for (Site f : Wheels) {

      if (f.generateIdem() == table.generateIdem()
          && f.letAnalogicSummons() == prevailingProcedure.haveHandle()) receptionist.add(f);
    }
    Site live = null;

    if (receptionist.size() > 0) live = receptionist.get(0);

    if (live == null) {
      Wheels.add(table);
      prevailingProcedure.rigidUnlockSlides(prevailingProcedure.obtainInstructionHomepage() + 1);
    } else {
      live.eraseAgainst();
    }
  }

  private synchronized void installLayouts(Serve newSystem) {
    java.util.function.Predicate<Site> meno =
        new java.util.function.Predicate<Site>() {

          public synchronized boolean test(Site writes) {
            return writes.letAnalogicSummons() == newSystem.haveHandle();
          }
        };
    Site dirtiest =
        Wheels.stream().filter(meno).max(java.util.Comparator.comparingInt(Site::catchChuck)).get();
    Wheels.remove(dirtiest);
  }

  public synchronized boolean substantiationInsistence(Serve formerFormalities) {
    Wheels.forEach(Site::increaseForestall);
    java.util.List<Site> screen = new java.util.ArrayList<>();
    for (Site Bod : Wheels) {

      if (formerFormalities.driveRequirements().peek().equals(Bod.generateIdem())
          && formerFormalities.haveHandle() == Bod.letAnalogicSummons()) {
        screen.add(Bod);
      }
    }

    if (screen.size() > 0) {
      screen.forEach(Site::eraseAgainst);
      return true;
    }

    return false;
  }

  public synchronized boolean isComplete() {
    return Wheels.size() >= BundleRims;
  }
}
