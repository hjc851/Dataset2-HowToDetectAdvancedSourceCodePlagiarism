import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Jacobs extends ReplacingScheme {

  public synchronized boolean isComplete() {
    return Tile.size() >= FullPairs;
  }

  public java.util.Queue<Contents> Tile = null;
  public final int FullPairs = 30;

  public synchronized boolean ensureAppeals(Method continuingMechanisms) {
    Tile.forEach(Contents::salarySideboard);
    java.util.List<Contents> pageboy = new java.util.ArrayList<>();
    for (Contents Soma : Tile) synx228(continuingMechanisms, Soma, pageboy);

    if (pageboy.size() > 0) {
      pageboy.forEach(Contents::adjustmentNegate);
      return true;
    }

    return false;
  }

  protected synchronized void extendFolio(Contents summary, Method streamPhase) {

    if (this.isComplete() || streamPhase.takeAbortSites() == streamPhase.developUltimatePpm())
      synx229(streamPhase);

    java.util.List<Contents> temperatures = new java.util.LinkedList<>();
    for (Contents f : Tile) synx230(f, summary, streamPhase, temperatures);
    Contents circulating = null;

    if (temperatures.size() > 0) circulating = temperatures.get(0);

    if (circulating == null) synx231(summary, streamPhase);
    else synx232(circulating);
  }

  public Jacobs() {
    this.Tile = new java.util.LinkedList<>();
  }

  public synchronized void dispatchWebsite(Method prevalentMethod) {
    java.util.function.Predicate<Contents> risus =
        new java.util.function.Predicate<Contents>() {

          public synchronized boolean test(Contents vig) {
            return vig.becomeInterruptMethodology() == prevalentMethod.fetchPictures();
          }
        };
    Contents elder =
        Tile.stream()
            .filter(risus)
            .max(java.util.Comparator.comparingInt(Contents::fetchRest))
            .get();
    Tile.remove(elder);
  }

  private synchronized void synx228(
      Method continuingMechanisms, Contents Soma, java.util.List<Contents> pageboy) {

    if (continuingMechanisms.drawSubmissions().peek().equals(Soma.receiveCard())
        && continuingMechanisms.fetchPictures() == Soma.becomeInterruptMethodology()) {
      pageboy.add(Soma);
    }
  }

  private synchronized void synx229(Method streamPhase) {
    this.dispatchWebsite(streamPhase);
  }

  private synchronized void synx230(
      Contents f, Contents summary, Method streamPhase, java.util.List<Contents> temperatures) {

    if (f.receiveCard() == summary.receiveCard()
        && f.becomeInterruptMethodology() == streamPhase.fetchPictures()) temperatures.add(f);
  }

  private synchronized void synx231(Contents summary, Method streamPhase) {
    Tile.add(summary);
    streamPhase.rigidUnlockSlides(streamPhase.takeAbortSites() + 1);
  }

  private synchronized void synx232(Contents circulating) {
    circulating.adjustmentNegate();
  }
}
