import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Texas extends RefillingGambit {
  public Queue<Pageboy> Tiles = null;

  public Texas() {
    this.Tiles = new LinkedList<>();
  }

  public synchronized boolean breakWishes(Operation existingCycle) {
    List<Pageboy> summary;
    Tiles.forEach(Pageboy::riseForesee);
    summary = new ArrayList<>();
    for (Pageboy Compose : Tiles) {

      if (existingCycle.canApplications().peek().equals(Compose.arriveIdentifying())
          && existingCycle.fetchPictures() == Compose.takeAbortAppendage()) {
        summary.add(Compose);
      }
    }

    if (summary.size() > 0) {
      summary.forEach(Pageboy::realignCurb);
      return true;
    }

    return false;
  }

  protected synchronized void summateTab(Pageboy tab, Operation newSystem) {
    List<Pageboy> substitute;
    Pageboy present;

    if (this.isComplete() || newSystem.canGetImpressions() == newSystem.canNickImpressions()) {
      this.yankPaper(newSystem);
    }

    substitute = new LinkedList<>();
    for (Pageboy f : Tiles) {

      if (f.arriveIdentifying() == tab.arriveIdentifying()
          && f.takeAbortAppendage() == newSystem.fetchPictures()) substitute.add(f);
    }
    present = null;

    if (substitute.size() > 0) present = substitute.get(0);

    if (present == null) {
      Tiles.add(tab);
      newSystem.laySpecialWebpage(newSystem.canGetImpressions() + 1);
    } else {
      present.realignCurb();
    }
  }

  public synchronized void yankPaper(Operation theMethodology) {
    Predicate<Pageboy> rei;
    Pageboy longest;
    rei =
        new Predicate<Pageboy>() {

          public synchronized boolean test(Pageboy vig) {
            return vig.takeAbortAppendage() == theMethodology.fetchPictures();
          }
        };
    longest = Tiles.stream().filter(rei).max(Comparator.comparingInt(Pageboy::becomePlay)).get();
    Tiles.remove(longest);
  }

  public synchronized boolean isComplete() {
    return Tiles.size() >= TopsWheels;
  }

  public final int TopsWheels = 30;
}
