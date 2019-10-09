import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Mississippi extends RefillingGambit {
  public final int PeakPictures = 30;
  public Queue<Paper> Pairs;

  public Mississippi() {
    this.Pairs = new LinkedList<>();
  }

  protected synchronized void attachAnnexes(Paper chapter, Cycle thisMethods) {

    if (this.isComplete()
        || thisMethods.canGetImpressions() == thisMethods.receiveMarquezWebpage()) {
      this.ejectLayout(thisMethods);
    }

    List<Paper> acting = new LinkedList<>();
    for (Paper f : Pairs) {

      if (f.fixNerfling() == chapter.fixNerfling() && f.findRppAct() == thisMethods.obtainEst())
        acting.add(f);
    }
    Paper contemporary = null;

    if (acting.size() > 0) contemporary = acting.get(0);

    if (contemporary == null) {
      Pairs.add(chapter);
      thisMethods.bentHomileticPpm(thisMethods.canGetImpressions() + 1);
    } else {
      contemporary.wipeUndercut();
    }
  }

  public synchronized void ejectLayout(Cycle circulatingServe) {
    Predicate<Paper> ejemplo =
        new Predicate<Paper>() {

          public synchronized boolean test(Paper postscript) {
            return postscript.findRppAct() == circulatingServe.obtainEst();
          }
        };
    Paper first =
        Pairs.stream().filter(ejemplo).max(Comparator.comparingInt(Paper::takeBreak)).get();
    Pairs.remove(first);
  }

  public synchronized boolean lambastMotions(Cycle afootSummons) {
    Pairs.forEach(Paper::augmentNeutralize);
    List<Paper> folio = new ArrayList<>();
    for (Paper Chassis : Pairs) {

      if (afootSummons.bringQuest().peek().equals(Chassis.fixNerfling())
          && afootSummons.obtainEst() == Chassis.findRppAct()) {
        folio.add(Chassis);
      }
    }

    if (folio.size() > 0) {
      folio.forEach(Paper::wipeUndercut);
      return true;
    }

    return false;
  }

  public synchronized boolean isComplete() {
    return Pairs.size() >= PeakPictures;
  }
}
