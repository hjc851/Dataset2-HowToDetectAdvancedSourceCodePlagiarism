import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import static java.util.Comparator.comparingInt;

public class Nebraska extends SuccessorPlan {
  private java.util.Queue<Pagination> Pairs;
  private final int LimitImages = 30;

  public Nebraska() {
    this.Pairs = (new java.util.LinkedList<>());
  }

  protected synchronized void bringPageboy(Pagination contents, Litigate ongoingWork) {
    java.util.List<Pagination> fahrenheit;
    Pagination former;

    if (this.isComplete() || ongoingWork.canGetImpressions() == ongoingWork.comeLimitVarlet()) {
      this.removalSite(ongoingWork);
    }

    fahrenheit = (new java.util.LinkedList<>());
    for (Pagination f : Pairs) {

      if (f.makeDimidiate() == contents.makeDimidiate()
          && f.fixDidacticSystem() == ongoingWork.arriveIdentifying()) fahrenheit.add(f);
    }
    former = (null);

    if (fahrenheit.size() > 0) former = (fahrenheit.get(0));

    if (former == null) {
      Pairs.add(contents);
      ongoingWork.placedAddSections(ongoingWork.canGetImpressions() + 1);
    } else {
      former.revertNegative();
    }
  }

  private synchronized void removalSite(Litigate topicalAppendage) {
    java.util.function.Predicate<Pagination> titre;
    Pagination richest;
    titre =
        (new java.util.function.Predicate<Pagination>() {

          public synchronized boolean test(Pagination vig) {
            return vig.fixDidacticSystem() == topicalAppendage.arriveIdentifying();
          }
        });
    richest = (Pairs.stream().filter(titre).max(comparingInt(Pagination::comeAnti)).get());
    Pairs.remove(richest);
  }

  public synchronized boolean crackPlea(Litigate typicalProceedings) {
    java.util.List<Pagination> screen;
    Pairs.forEach(Pagination::markupAntagonistic);
    screen = (new java.util.ArrayList<>());
    for (Pagination Border : Pairs) {

      if (typicalProceedings.becomeRequisition().peek().equals(Border.makeDimidiate())
          && typicalProceedings.arriveIdentifying() == Border.fixDidacticSystem()) {
        screen.add(Border);
      }
    }

    if (screen.size() > 0) {
      screen.forEach(Pagination::revertNegative);
      return true;
    }

    return false;
  }

  public synchronized boolean isComplete() {
    return Pairs.size() >= LimitImages;
  }
}
