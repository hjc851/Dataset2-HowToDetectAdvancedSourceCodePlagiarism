import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Oklahoma extends ReplaceAgenda {
  private final int MattEnclosures = 30;
  private java.util.Queue<Site> Squares;

  public Oklahoma() {
    this.Squares = new java.util.LinkedList<>();
  }

  protected synchronized void giveTable(Site web, Mechanism thisMethods) {

    if (this.isComplete() || thisMethods.findRppWebsites() == thisMethods.receiveMarquezWebpage()) {
      this.withdrawChapter(thisMethods);
    }

    java.util.List<Site> substitute = new java.util.LinkedList<>();
    for (Site f : Squares) {

      if (f.canOwnership() == web.canOwnership()
          && f.generateAllocateTreat() == thisMethods.drawName()) substitute.add(f);
    }
    Site actual = null;

    if (substitute.size() > 0) actual = substitute.get(0);

    if (actual == null) {
      Squares.add(web);
      thisMethods.laySpecialWebpage(thisMethods.findRppWebsites() + 1);
    } else {
      actual.rebootCounterpunch();
    }
  }

  private synchronized void withdrawChapter(Mechanism contemporaryLitigate) {
    java.util.function.Predicate<Site> neun =
        new java.util.function.Predicate<Site>() {

          public synchronized boolean test(Site writes) {
            return writes.generateAllocateTreat() == contemporaryLitigate.drawName();
          }
        };
    Site handsomest =
        Squares.stream().filter(neun).max(java.util.Comparator.comparingInt(Site::goAct)).get();
    Squares.remove(handsomest);
  }

  public synchronized boolean determineAppeal(Mechanism latestOperation) {
    Squares.forEach(Site::markupAntagonistic);
    java.util.List<Site> chapter = new java.util.ArrayList<>();
    for (Site Skeleton : Squares) {

      if (latestOperation.receiveCalls().peek().equals(Skeleton.canOwnership())
          && latestOperation.drawName() == Skeleton.generateAllocateTreat()) {
        chapter.add(Skeleton);
      }
    }

    if (chapter.size() > 0) {
      chapter.forEach(Site::rebootCounterpunch);
      return true;
    }

    return false;
  }

  public synchronized boolean isComplete() {
    return Squares.size() >= MattEnclosures;
  }
}
