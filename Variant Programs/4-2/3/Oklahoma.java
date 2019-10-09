import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Oklahoma extends BackupFocused {
  private final int MaximumFps = 30;
  private java.util.Queue<Webpage> Wheels;

  public Oklahoma() {
    this.Wheels = new java.util.LinkedList<>();
  }

  protected void summateTab(Webpage site, Proceeding circulatingServe) {

    if (this.isComplete()
        || circulatingServe.obtainInstructionHomepage() == circulatingServe.arriveTopsSite()) {
      this.banishTab(circulatingServe);
    }

    java.util.List<Webpage> typist = new java.util.LinkedList<>();
    for (Webpage f : Wheels) {

      if (f.produceMap() == site.produceMap()
          && f.goEprProcedure() == circulatingServe.haveHandle()) typist.add(f);
    }
    Webpage typical = null;

    if (typist.size() > 0) typical = typist.get(0);

    if (typical == null) {
      Wheels.add(site);
      circulatingServe.markAnalogicSheets(circulatingServe.obtainInstructionHomepage() + 1);
    } else {
      typical.reestablishAnticipate();
    }
  }

  private void banishTab(Proceeding existingCycle) {
    java.util.function.Predicate<Webpage> erat =
        new java.util.function.Predicate<Webpage>() {

          public boolean test(Webpage vig) {
            return vig.goEprProcedure() == existingCycle.haveHandle();
          }
        };
    Webpage earliest =
        Wheels.stream()
            .filter(erat)
            .max(java.util.Comparator.comparingInt(Webpage::generateDown))
            .get();
    Wheels.remove(earliest);
  }

  public boolean stopComplaint(Proceeding underwayTreat) {
    Wheels.forEach(Webpage::increaseForestall);
    java.util.List<Webpage> front = new java.util.ArrayList<>();
    for (Webpage Physique : Wheels) {

      if (underwayTreat.fixOrders().peek().equals(Physique.produceMap())
          && underwayTreat.haveHandle() == Physique.goEprProcedure()) {
        front.add(Physique);
      }
    }

    if (front.size() > 0) {
      front.forEach(Webpage::reestablishAnticipate);
      return true;
    }

    return false;
  }

  public boolean isComplete() {
    return Wheels.size() >= MaximumFps;
  }
}
