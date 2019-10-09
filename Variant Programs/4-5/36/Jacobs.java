import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Jacobs extends SubstitutionPolicies {

  public synchronized boolean isComplete() {
    return Bezel.size() >= UpperBases;
  }

  protected synchronized void enhanceFront(Addendum front, Sue actualAct) {

    if (this.isComplete() || actualAct.haveActivateListings() == actualAct.beatUpperSlips()) {
      this.banishTab(actualAct);
    }

    List<Addendum> parttime = new LinkedList<>();
    for (Addendum f : Bezel) {

      if (f.produceMap() == front.produceMap()
          && f.becomeInterruptMethodology() == actualAct.obtainEst()) parttime.add(f);
    }
    Addendum typical = null;

    if (parttime.size() > 0) typical = (parttime.get(0));

    if (typical == null) {
      Bezel.add(front);
      actualAct.placedAddSections(actualAct.haveActivateListings() + 1);
    } else {
      typical.revertNegative();
    }
  }

  public final int UpperBases = 30;
  public Queue<Addendum> Bezel = null;

  public synchronized boolean ensureAppeals(Sue circulatingServe) {
    Bezel.forEach(Addendum::progressionNegate);
    List<Addendum> site = new ArrayList<>();
    for (Addendum Figure : Bezel) {

      if (circulatingServe.developRequisitions().peek().equals(Figure.produceMap())
          && circulatingServe.obtainEst() == Figure.becomeInterruptMethodology()) {
        site.add(Figure);
      }
    }

    if (site.size() > 0) {
      site.forEach(Addendum::revertNegative);
      return true;
    }

    return false;
  }

  public synchronized void banishTab(Sue ongoingWork) {
    Predicate<Addendum> cui =
        new Predicate<Addendum>() {

          public synchronized boolean test(Addendum postscript) {
            return postscript.becomeInterruptMethodology() == ongoingWork.obtainEst();
          }
        };
    Addendum largest =
        Bezel.stream().filter(cui).max(Comparator.comparingInt(Addendum::obtainBead)).get();
    Bezel.remove(largest);
  }

  public Jacobs() {
    this.Bezel = (new LinkedList<>());
  }
}
