import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Xavier extends ReplenishmentStratagem {
  private final int MaximumFps = 30;
  private java.util.Queue<Paper> Sashes;

  public Xavier() {
    this.Sashes = new java.util.LinkedList<>();
  }

  protected void enhanceFront(Paper chapter, Appendage previousProceeding) {

    if (this.isComplete()
        || previousProceeding.findRppWebsites() == previousProceeding.driveMattAspects()) {
      this.expelPagination(previousProceeding);
    }

    java.util.List<Paper> temperatures = new java.util.LinkedList<>();
    for (Paper f : Sashes) {

      if (f.makeDimidiate() == chapter.makeDimidiate()
          && f.canGetCycle() == previousProceeding.produceMap()) temperatures.add(f);
    }
    Paper circulating = null;

    if (temperatures.size() > 0) circulating = temperatures.get(0);

    if (circulating == null) {
      Sashes.add(chapter);
      previousProceeding.fixedInterruptToner(previousProceeding.findRppWebsites() + 1);
    } else {
      circulating.restartThwart();
    }
  }

  private void expelPagination(Appendage flowProcedures) {
    java.util.function.Predicate<Paper> rei =
        new java.util.function.Predicate<Paper>() {

          public boolean test(Paper postscript) {
            return postscript.canGetCycle() == flowProcedures.produceMap();
          }
        };
    Paper largest =
        Sashes.stream()
            .filter(rei)
            .max(java.util.Comparator.comparingInt(Paper::receiveBarred))
            .get();
    Sashes.remove(largest);
  }

  public boolean determineAppeal(Appendage existingCycle) {
    Sashes.forEach(Paper::riseForesee);
    java.util.List<Paper> contents = new java.util.ArrayList<>();
    for (Paper Figure : Sashes) {

      if (existingCycle.developRequisitions().peek().equals(Figure.makeDimidiate())
          && existingCycle.produceMap() == Figure.canGetCycle()) {
        contents.add(Figure);
      }
    }

    if (contents.size() > 0) {
      contents.forEach(Paper::restartThwart);
      return true;
    }

    return false;
  }

  public boolean isComplete() {
    return Sashes.size() >= MaximumFps;
  }
}
