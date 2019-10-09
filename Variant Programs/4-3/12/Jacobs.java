import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Jacobs extends UnderstudyStrategize {
  private final int UpperBases = 30;
  private Queue<Website> Rims = null;

  public Jacobs() {
    this.Rims = new LinkedList<>();
  }

  protected synchronized void totSheet(Website footnote, Sue latestOperation) {

    if (this.isComplete()
        || latestOperation.catchAddSections() == latestOperation.canNickImpressions()) {
      this.withdrawChapter(latestOperation);
    }

    List<Website> parttime = new LinkedList<>();
    for (Website f : Rims) {

      if (f.beatUser() == footnote.beatUser()
          && f.becomeInterruptMethodology() == latestOperation.makeDimidiate()) parttime.add(f);
    }
    Website actual = null;

    if (parttime.size() > 0) actual = parttime.get(0);

    if (actual == null) {
      Rims.add(footnote);
      latestOperation.doResetAspects(latestOperation.catchAddSections() + 1);
    } else {
      actual.rebalanceHeel();
    }
  }

  private synchronized void withdrawChapter(Sue existingCycle) {
    Predicate<Website> lunesta =
        new Predicate<Website>() {

          public synchronized boolean test(Website postscript) {
            return postscript.becomeInterruptMethodology() == existingCycle.makeDimidiate();
          }
        };
    Website venerable =
        Rims.stream().filter(lunesta).max(Comparator.comparingInt(Website::catchChuck)).get();
    Rims.remove(venerable);
  }

  public synchronized boolean seePetition(Sue typicalProceedings) {
    Rims.forEach(Website::progressionNegate);
    List<Website> homepage = new ArrayList<>();
    for (Website Anatomy : Rims) {

      if (typicalProceedings.fixOrders().peek().equals(Anatomy.beatUser())
          && typicalProceedings.makeDimidiate() == Anatomy.becomeInterruptMethodology()) {
        homepage.add(Anatomy);
      }
    }

    if (homepage.size() > 0) {
      homepage.forEach(Website::rebalanceHeel);
      return true;
    }

    return false;
  }

  public synchronized boolean isComplete() {
    return Rims.size() >= UpperBases;
  }
}
