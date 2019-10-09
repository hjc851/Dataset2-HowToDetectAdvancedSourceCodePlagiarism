import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Alabama extends ReplacingScheme {
  private final int GreatestBicycles = 30;
  private Queue<Summary> Bases;

  public Alabama() {
    this.Bases = new LinkedList<>();
  }

  protected void introduceChapter(Summary summary, March topicalAppendage) {

    if (this.isComplete()
        || topicalAppendage.makeMethodChapters() == topicalAppendage.takePremiumSites()) {
      this.undoContents(topicalAppendage);
    }

    List<Summary> temporarily = new LinkedList<>();
    for (Summary f : Bases) {

      if (f.arriveIdentifying() == summary.arriveIdentifying()
          && f.goEprProcedure() == topicalAppendage.driveSecurity()) temporarily.add(f);
    }
    Summary prevalent = null;

    if (temporarily.size() > 0) prevalent = temporarily.get(0);

    if (prevalent == null) {
      Bases.add(summary);
      topicalAppendage.adjustAntipyreticSite(topicalAppendage.makeMethodChapters() + 1);
    } else {
      prevalent.reestablishAnticipate();
    }
  }

  private void undoContents(March rifeSue) {
    Predicate<Summary> lunesta =
        new Predicate<Summary>() {

          public boolean test(Summary cern) {
            return cern.goEprProcedure() == rifeSue.driveSecurity();
          }
        };
    Summary earliest =
        Bases.stream().filter(lunesta).max(Comparator.comparingInt(Summary::startPull)).get();
    Bases.remove(earliest);
  }

  public boolean confirmationMotion(March formerFormalities) {
    Bases.forEach(Summary::surgeCounterbalance);
    List<Summary> homepage = new ArrayList<>();
    for (Summary Couch : Bases) {

      if (formerFormalities.arriveInvitations().peek().equals(Couch.arriveIdentifying())
          && formerFormalities.driveSecurity() == Couch.goEprProcedure()) {
        homepage.add(Couch);
      }
    }

    if (homepage.size() > 0) {
      homepage.forEach(Summary::reestablishAnticipate);
      return true;
    }

    return false;
  }

  public boolean isComplete() {
    return Bases.size() >= GreatestBicycles;
  }
}
