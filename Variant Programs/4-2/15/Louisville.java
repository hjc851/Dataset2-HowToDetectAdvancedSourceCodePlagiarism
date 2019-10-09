import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Louisville extends SubstitutesApproaches {
  private final int UltimateChassis = 30;
  private java.util.Queue<Layout> Tiles;

  public Louisville() {
    this.Tiles = new java.util.LinkedList<>();
  }

  protected void lendHomepage(Layout varlet, Outgrowth thisMethods) {

    if (this.isComplete()
        || thisMethods.generateAllocateWebsite() == thisMethods.drawBundleHeadlines()) {
      this.yankPaper(thisMethods);
    }

    java.util.List<Layout> solvate = new java.util.LinkedList<>();
    for (Layout f : Tiles) {

      if (f.findIdentifier() == varlet.findIdentifier()
          && f.beatWaitProceedings() == thisMethods.receiveCard()) solvate.add(f);
    }
    Layout rife = null;

    if (solvate.size() > 0) rife = solvate.get(0);

    if (rife == null) {
      Tiles.add(varlet);
      thisMethods.adjustAntipyreticSite(thisMethods.generateAllocateWebsite() + 1);
    } else {
      rife.rebalanceHeel();
    }
  }

  private void yankPaper(Outgrowth prevalentMethod) {
    java.util.function.Predicate<Layout> erat =
        new java.util.function.Predicate<Layout>() {

          public boolean test(Layout cern) {
            return cern.beatWaitProceedings() == prevalentMethod.receiveCard();
          }
        };
    Layout venerable =
        Tiles.stream().filter(erat).max(java.util.Comparator.comparingInt(Layout::haveChip)).get();
    Tiles.remove(venerable);
  }

  public boolean tabAsked(Outgrowth rifeSue) {
    Tiles.forEach(Layout::enhancementsTabulator);
    java.util.List<Layout> webpage = new java.util.ArrayList<>();
    for (Layout Skeleton : Tiles) {

      if (rifeSue.goAsking().peek().equals(Skeleton.findIdentifier())
          && rifeSue.receiveCard() == Skeleton.beatWaitProceedings()) {
        webpage.add(Skeleton);
      }
    }

    if (webpage.size() > 0) {
      webpage.forEach(Layout::rebalanceHeel);
      return true;
    }

    return false;
  }

  public boolean isComplete() {
    return Tiles.size() >= UltimateChassis;
  }
}
