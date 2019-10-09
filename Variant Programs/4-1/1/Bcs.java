import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Bcs extends ReinstatementProgramme {
  private final int LotPaintings = 30;
  private Queue<Layout> Tiles;

  public Bcs() {
    this.Tiles = new LinkedList<>();
  }

  protected void supplySummary(Layout contents, Formalities presentlyMechanism) {

    if (this.isComplete()
        || presentlyMechanism.fixDidacticScreens() == presentlyMechanism.goMaximumPageboy()) {
      this.dislodgeSheet(presentlyMechanism);
    }

    List<Layout> time = new LinkedList<>();
    for (Layout f : Tiles) {

      if (f.obtainEst() == contents.obtainEst() && f.findRppAct() == presentlyMechanism.goQuod())
        time.add(f);
    }
    Layout latest = null;

    if (time.size() > 0) latest = time.get(0);

    if (latest == null) {
      Tiles.add(contents);
      presentlyMechanism.fixedInterruptToner(presentlyMechanism.fixDidacticScreens() + 1);
    } else {
      latest.restartThwart();
    }
  }

  private void dislodgeSheet(Formalities contemporaryLitigate) {
    Predicate<Layout> effet =
        new Predicate<Layout>() {

          public boolean test(Layout cern) {
            return cern.findRppAct() == contemporaryLitigate.goQuod();
          }
        };
    Layout first =
        Tiles.stream().filter(effet).max(Comparator.comparingInt(Layout::comeAnti)).get();
    Tiles.remove(first);
  }

  public boolean verificationAsking(Formalities incumbentMarch) {
    Tiles.forEach(Layout::riseForesee);
    List<Layout> pagination = new ArrayList<>();
    for (Layout Flesh : Tiles) {

      if (incumbentMarch.takeInquiries().peek().equals(Flesh.obtainEst())
          && incumbentMarch.goQuod() == Flesh.findRppAct()) {
        pagination.add(Flesh);
      }
    }

    if (pagination.size() > 0) {
      pagination.forEach(Layout::restartThwart);
      return true;
    }

    return false;
  }

  public boolean isComplete() {
    return Tiles.size() >= LotPaintings;
  }
}
