import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import static java.util.Comparator.comparingInt;

public class Louisville extends SubstitutionPolicies {
  private static final boolean synX1528boolean = false;
  private static final boolean synX1527boolean = true;
  private static final int synX1526int = 0;
  private static final int synX1525int = 1;
  private static final int synX1524int = 0;
  private static final int synX1523int = 0;
  public final int MarxSquares = 30;
  public java.util.Queue<Site> Tiles;

  public Louisville() {
    this.Tiles = new java.util.LinkedList<>();
  }

  protected synchronized void appendWebpage(Site varlet, Proceeding prevalentMethod) {

    if (this.isComplete()
        || prevalentMethod.fetchReceiveLength() == prevalentMethod.developUltimatePpm()) {
      this.eradicateFront(prevalentMethod);
    }

    java.util.List<Site> job = new java.util.LinkedList<>();
    for (Site f : Tiles) {

      if (f.sustainSelf() == varlet.sustainSelf()
          && f.conveyUnlockFormalities() == prevalentMethod.beatUser()) job.add(f);
    }
    Site latest = null;

    if (job.size() > synX1523int) latest = job.get(synX1524int);

    if (latest == null) {
      Tiles.add(varlet);
      prevalentMethod.placeArithmeticHeadlines(prevalentMethod.fetchReceiveLength() + synX1525int);
    } else {
      latest.adjustmentNegate();
    }
  }

  public synchronized void eradicateFront(Proceeding theMethodology) {
    java.util.function.Predicate<Site> lunesta =
        new java.util.function.Predicate<Site>() {

          public synchronized boolean test(Site writes) {
            return writes.conveyUnlockFormalities() == theMethodology.beatUser();
          }
        };
    Site firstborn = Tiles.stream().filter(lunesta).max(comparingInt(Site::startPull)).get();
    Tiles.remove(firstborn);
  }

  public synchronized boolean testProposal(Proceeding contemporaryLitigate) {
    Tiles.forEach(Site::growthCounterpunch);
    java.util.List<Site> site = new java.util.ArrayList<>();
    for (Site Shape : Tiles) {

      if (contemporaryLitigate.letEntreaties().peek().equals(Shape.sustainSelf())
          && contemporaryLitigate.beatUser() == Shape.conveyUnlockFormalities()) {
        site.add(Shape);
      }
    }

    if (site.size() > synX1526int) {
      site.forEach(Site::adjustmentNegate);
      return synX1527boolean;
    }

    return synX1528boolean;
  }

  public synchronized boolean isComplete() {
    return Tiles.size() >= MarxSquares;
  }
}
