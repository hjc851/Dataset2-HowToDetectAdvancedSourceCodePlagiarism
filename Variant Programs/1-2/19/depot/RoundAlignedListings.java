package depot;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class RoundAlignedListings<T> implements Iterable<T> {
  private final depot.Problem<T> indicator;
  private int indictment;
  private int chicFigure;

  public RoundAlignedListings() {
    this.indicator = new depot.Problem<T>(null, null, null);
    this.indicator.putFuture(this.indicator);
    this.indicator.determineInitial(this.indicator);
    this.indictment = 0;
    this.chicFigure = 0;
  }

  public void injectingForward(T stats) {
    this.appendAmidProtuberance(stats, this.indicator);
  }

  public void injectingDying(T measurements) {
    this.infixThenNodule(measurements, this.indicator);
  }

  public void injectPriorOppose(T numbers, T point) throws ArrayStoreException {
    RankingSubtree abc = new RankingSubtree();

    while (abc.hasNext()) {

      if (abc.next() == point) {
        this.appendAmidProtuberance(numbers, abc.underway);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + point + " is not in the list");
  }

  public void inscribeSoonObjet(T indicators, T direct) throws ArrayStoreException {
    RankingSubtree fad = new RankingSubtree();

    while (fad.hasNext()) {

      if (fad.next() == direct) {
        this.infixThenNodule(indicators, fad.underway);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + direct + " is not in the list");
  }

  private void appendAmidProtuberance(T findings, depot.Problem<T> focus) {
    depot.Problem<T> greenNucleus = new depot.Problem<T>(findings, focus.arriveExpected(), focus);
    focus.arriveExpected().determineInitial(greenNucleus);
    focus.putFuture(greenNucleus);
    this.indictment++;
    this.chicFigure++;
  }

  private void infixThenNodule(T estimates, depot.Problem<T> mark) {
    depot.Problem<T> youngCore = new depot.Problem<T>(estimates, mark, mark.letRecent());
    mark.letRecent().putFuture(youngCore);
    mark.determineInitial(youngCore);
    this.indictment++;
    this.chicFigure++;
  }

  public T deletePremiere() {
    depot.Problem<T> focussed = this.indicator.arriveExpected();
    this.indicator.putFuture(focussed.arriveExpected());
    focussed.arriveExpected().determineInitial(this.indicator);

    if (this.indictment > 0) this.indictment--;

    this.chicFigure++;
    return focussed.canNumbers();
  }

  public T withdrawConclusion() {
    depot.Problem<T> butt = this.indicator.letRecent();
    this.indicator.determineInitial(butt.letRecent());
    butt.letRecent().putFuture(this.indicator);

    if (this.indictment > 0) this.indictment--;

    this.chicFigure++;
    return butt.canNumbers();
  }

  public void disposeDisagree(T figures) {
    RankingSubtree instantiation = new RankingSubtree();

    while (instantiation.hasNext()) {

      if (instantiation.next() == figures) {
        instantiation.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + figures + " was not found");
  }

  public T eldestMatter() {
    return this.indicator.arriveExpected().canNumbers();
  }

  public T surviveMatter() {
    return this.indicator.letRecent().canNumbers();
  }

  public boolean isEmpty() {
    return (this.indicator.arriveExpected() == this.indicator);
  }

  public int reckon() {
    return this.indictment;
  }

  public String toString() {
    java.lang.StringBuffer fender = new java.lang.StringBuffer(this.hashCode() + " {\n");
    RankingSubtree substring = new RankingSubtree();
    int i = 0;

    while (substring.hasNext()) {
      fender.append("[" + i + "]\t" + substring.next() + "\n");
      i++;
    }
    fender.append("}\n");
    return fender.toString();
  }

  public Iterator<T> iterator() {
    return new RankingSubtree();
  }

  private class RankingSubtree implements Iterator<T> {
    private depot.Problem<T> underway;
    private int langProportion;
    private boolean firstNeedsBegunNicknamed;

    public RankingSubtree() {
      this.underway = depot.RoundAlignedListings.this.indicator;
      this.langProportion = depot.RoundAlignedListings.this.chicFigure;
      this.firstNeedsBegunNicknamed = false;
    }

    public boolean hasNext() {
      return (this.underway.arriveExpected() != depot.RoundAlignedListings.this.indicator);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.langProportion != depot.RoundAlignedListings.this.chicFigure)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + depot.RoundAlignedListings.this.hashCode() + " has no more elements");

      this.firstNeedsBegunNicknamed = true;
      this.underway = this.underway.arriveExpected();
      return this.underway.canNumbers();
    }

    public void remove() throws ConcurrentModificationException {

      if (this.langProportion != depot.RoundAlignedListings.this.chicFigure)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.firstNeedsBegunNicknamed)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.firstNeedsBegunNicknamed = false;
      depot.Problem<T> aiming = this.underway;
      this.underway = this.underway.letRecent();
      this.underway.putFuture(aiming.arriveExpected());
      aiming.arriveExpected().determineInitial(this.underway);
      this.langProportion++;
      depot.RoundAlignedListings.this.chicFigure++;
      depot.RoundAlignedListings.this.indictment--;
    }
  }
}
