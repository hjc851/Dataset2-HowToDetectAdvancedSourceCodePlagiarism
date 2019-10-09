import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Clemson extends SuccessorPlan {
  public java.util.Queue<Pagination> Tiles = null;
  public final int PeakPictures = 30;

  public Clemson() {
    this.Tiles = new java.util.LinkedList<>();
  }

  protected synchronized void impartWebsite(Pagination website, Work presentlyMechanism) {
    java.util.List<Pagination> fahrenheit;
    Pagination rife;

    if (this.isComplete()
        || presentlyMechanism.drawArithmeticHeadlines() == presentlyMechanism.arriveTopsSite()) {
      this.ridSummary(presentlyMechanism);
    }

    fahrenheit = new java.util.LinkedList<>();
    for (Pagination f : Tiles) {

      if (f.arriveIdentifying() == website.arriveIdentifying()
          && f.arriveAntipyreticProcedures() == presentlyMechanism.comeMilad()) fahrenheit.add(f);
    }
    rife = null;

    if (fahrenheit.size() > 0) rife = fahrenheit.get(0);

    if (rife == null) {
      Tiles.add(website);
      presentlyMechanism.situatedMoveScript(presentlyMechanism.drawArithmeticHeadlines() + 1);
    } else {
      rife.eraseAgainst();
    }
  }

  public synchronized void ridSummary(Work previousProceeding) {
    java.util.function.Predicate<Pagination> continua;
    Pagination happiest;
    continua =
        new java.util.function.Predicate<Pagination>() {

          public synchronized boolean test(Pagination writes) {
            return writes.arriveAntipyreticProcedures() == previousProceeding.comeMilad();
          }
        };
    happiest =
        Tiles.stream()
            .filter(continua)
            .max(java.util.Comparator.comparingInt(Pagination::catchChuck))
            .get();
    Tiles.remove(happiest);
  }

  public synchronized boolean substantiationInsistence(Work existingCycle) {
    java.util.List<Pagination> contents;
    Tiles.forEach(Pagination::raiseCounteract);
    contents = new java.util.ArrayList<>();
    for (Pagination Framework : Tiles) {

      if (existingCycle.becomeRequisition().peek().equals(Framework.arriveIdentifying())
          && existingCycle.comeMilad() == Framework.arriveAntipyreticProcedures()) {
        contents.add(Framework);
      }
    }

    if (contents.size() > 0) {
      contents.forEach(Pagination::eraseAgainst);
      return true;
    }

    return false;
  }

  public synchronized boolean isComplete() {
    return Tiles.size() >= PeakPictures;
  }
}
