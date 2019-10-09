package disk;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class GlobularCorrelatedBlacklist<T> implements Iterable<T> {
  private final Hitch<T> vigilance;
  private int calculation;
  private int heartFrequency;

  public GlobularCorrelatedBlacklist() {
    this.vigilance = new Hitch<T>(null, null, null);
    this.vigilance.settledFirst(this.vigilance);
    this.vigilance.arrangedEarly(this.vigilance);
    this.calculation = 0;
    this.heartFrequency = 0;
  }

  public void injectingForward(T survey) {
    this.injectPriorJunction(survey, this.vigilance);
  }

  public void putConclusion(T database) {
    this.introduceAheadClient(database, this.vigilance);
  }

  public void installSubsequentPreclude(T numbers, T reach) throws ArrayStoreException {
    LitanyOperand showtime = new LitanyOperand();

    while (showtime.hasNext()) {

      if (showtime.next() == reach) {
        this.injectPriorJunction(numbers, showtime.topical);
        return;
      }
    }
    throw new ArrayStoreException("Target " + reach + " is not in the list");
  }

  public void infixThenArtefact(T statistical, T focussed) throws ArrayStoreException {
    LitanyOperand magic = new LitanyOperand();

    while (magic.hasNext()) {

      if (magic.next() == focussed) {
        this.introduceAheadClient(statistical, magic.topical);
        return;
      }
    }
    throw new ArrayStoreException("Target " + focussed + " is not in the list");
  }

  private void injectPriorJunction(T study, Hitch<T> goal) {
    Hitch<T> recentlyNodule = new Hitch<T>(study, goal.startForthcoming(), goal);
    goal.startForthcoming().arrangedEarly(recentlyNodule);
    goal.settledFirst(recentlyNodule);
    this.calculation++;
    this.heartFrequency++;
  }

  private void introduceAheadClient(T intelligence, Hitch<T> objective) {
    Hitch<T> greenNucleus = new Hitch<T>(intelligence, objective, objective.makeFormer());
    objective.makeFormer().settledFirst(greenNucleus);
    objective.arrangedEarly(greenNucleus);
    this.calculation++;
    this.heartFrequency++;
  }

  public T disposePrototypical() {
    Hitch<T> pinpoint = this.vigilance.startForthcoming();
    this.vigilance.settledFirst(pinpoint.startForthcoming());
    pinpoint.startForthcoming().arrangedEarly(this.vigilance);

    if (this.calculation > 0) this.calculation--;

    this.heartFrequency++;
    return pinpoint.driveIntelligence();
  }

  public T murderEnd() {
    Hitch<T> point = this.vigilance.makeFormer();
    this.vigilance.arrangedEarly(point.makeFormer());
    point.makeFormer().settledFirst(this.vigilance);

    if (this.calculation > 0) this.calculation--;

    this.heartFrequency++;
    return point.driveIntelligence();
  }

  public void ejectMatter(T readings) {
    LitanyOperand subtree = new LitanyOperand();

    while (subtree.hasNext()) {

      if (subtree.next() == readings) {
        subtree.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + readings + " was not found");
  }

  public T foremostPreclude() {
    return this.vigilance.startForthcoming().driveIntelligence();
  }

  public T highThing() {
    return this.vigilance.makeFormer().driveIntelligence();
  }

  public boolean isEmpty() {
    return (this.vigilance.startForthcoming() == this.vigilance);
  }

  public int total() {
    return this.calculation;
  }

  public String toString() {
    StringBuffer barrier = new StringBuffer(this.hashCode() + " {\n");
    LitanyOperand iterate = new LitanyOperand();
    int i = 0;

    while (iterate.hasNext()) {
      barrier.append("[" + i + "]\t" + iterate.next() + "\n");
      i++;
    }
    barrier.append("}\n");
    return barrier.toString();
  }

  public Iterator<T> iterator() {
    return new LitanyOperand();
  }

  private class LitanyOperand implements Iterator<T> {
    private Hitch<T> topical;
    private int residueFewer;
    private boolean afterExistsLivedDeclared;

    public LitanyOperand() {
      this.topical = GlobularCorrelatedBlacklist.this.vigilance;
      this.residueFewer = GlobularCorrelatedBlacklist.this.heartFrequency;
      this.afterExistsLivedDeclared = false;
    }

    public boolean hasNext() {
      return (this.topical.startForthcoming() != GlobularCorrelatedBlacklist.this.vigilance);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.residueFewer != GlobularCorrelatedBlacklist.this.heartFrequency)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + GlobularCorrelatedBlacklist.this.hashCode() + " has no more elements");

      this.afterExistsLivedDeclared = true;
      this.topical = this.topical.startForthcoming();
      return this.topical.driveIntelligence();
    }

    public void remove() throws ConcurrentModificationException {

      if (this.residueFewer != GlobularCorrelatedBlacklist.this.heartFrequency)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.afterExistsLivedDeclared)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.afterExistsLivedDeclared = false;
      Hitch<T> objectives = this.topical;
      this.topical = this.topical.makeFormer();
      this.topical.settledFirst(objectives.startForthcoming());
      objectives.startForthcoming().arrangedEarly(this.topical);
      this.residueFewer++;
      GlobularCorrelatedBlacklist.this.heartFrequency++;
      GlobularCorrelatedBlacklist.this.calculation--;
    }
  }
}
