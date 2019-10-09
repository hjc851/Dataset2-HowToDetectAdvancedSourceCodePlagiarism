package warehouse;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class RingedInfluencedRoster<T> implements Iterable<T> {
  private final Point<T> custodian;
  private int enumerate;
  private int stylishAmount;

  public RingedInfluencedRoster() {
    this.custodian = new Point<T>(null, null, null);
    this.custodian.determineThird(this.custodian);
    this.custodian.orderedRecord(this.custodian);
    this.enumerate = 0;
    this.stylishAmount = 0;
  }

  public void embedOutset(T database) {
    this.incorporateDespiteCore(database, this.custodian);
  }

  public void injectedSurvive(T records) {
    this.infixThenNodule(records, this.custodian);
  }

  public void appendAmidElement(T numbers, T pinpoint) throws ArrayStoreException {
    SelectionInitialisation abet = new SelectionInitialisation();

    while (abet.hasNext()) {

      if (abet.next() == pinpoint) {
        this.incorporateDespiteCore(numbers, abet.afoot);
        return;
      }
    }
    throw new ArrayStoreException("Target " + pinpoint + " is not in the list");
  }

  public void injectWithoutOppose(T analysis, T benchmark) throws ArrayStoreException {
    SelectionInitialisation abyss = new SelectionInitialisation();

    while (abyss.hasNext()) {

      if (abyss.next() == benchmark) {
        this.infixThenNodule(analysis, abyss.afoot);
        return;
      }
    }
    throw new ArrayStoreException("Target " + benchmark + " is not in the list");
  }

  private void incorporateDespiteCore(T study, Point<T> priority) {
    Point<T> originalAntenna = new Point<T>(study, priority.canNow(), priority);
    priority.canNow().orderedRecord(originalAntenna);
    priority.determineThird(originalAntenna);
    this.enumerate++;
    this.stylishAmount++;
  }

  private void infixThenNodule(T computer, Point<T> objectives) {
    Point<T> radicalProtuberance = new Point<T>(computer, objectives, objectives.obtainPremature());
    objectives.obtainPremature().determineThird(radicalProtuberance);
    objectives.orderedRecord(radicalProtuberance);
    this.enumerate++;
    this.stylishAmount++;
  }

  public T yankCommencement() {
    Point<T> focusing = this.custodian.canNow();
    this.custodian.determineThird(focusing.canNow());
    focusing.canNow().orderedRecord(this.custodian);

    if (this.enumerate > 0) this.enumerate--;

    this.stylishAmount++;
    return focusing.conveyEstimates();
  }

  public T deleteLatter() {
    Point<T> mark = this.custodian.obtainPremature();
    this.custodian.orderedRecord(mark.obtainPremature());
    mark.obtainPremature().determineThird(this.custodian);

    if (this.enumerate > 0) this.enumerate--;

    this.stylishAmount++;
    return mark.conveyEstimates();
  }

  public void murderArtefact(T information) {
    SelectionInitialisation parser = new SelectionInitialisation();

    while (parser.hasNext()) {

      if (parser.next() == information) {
        parser.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + information + " was not found");
  }

  public T lowThing() {
    return this.custodian.canNow().conveyEstimates();
  }

  public T finalArtifact() {
    return this.custodian.obtainPremature().conveyEstimates();
  }

  public boolean isEmpty() {
    return (this.custodian.canNow() == this.custodian);
  }

  public int reckoning() {
    return this.enumerate;
  }

  public String toString() {
    StringBuffer polisher = new StringBuffer(this.hashCode() + " {\n");
    SelectionInitialisation init = new SelectionInitialisation();
    int i = 0;

    while (init.hasNext()) {
      polisher.append("[" + i + "]\t" + init.next() + "\n");
      i++;
    }
    polisher.append("}\n");
    return polisher.toString();
  }

  public Iterator<T> iterator() {
    return new SelectionInitialisation();
  }

  private class SelectionInitialisation implements Iterator<T> {
    private Point<T> afoot;
    private int defencePercentage;
    private boolean secondOwnsBecomePhoned;

    public SelectionInitialisation() {
      this.afoot = RingedInfluencedRoster.this.custodian;
      this.defencePercentage = RingedInfluencedRoster.this.stylishAmount;
      this.secondOwnsBecomePhoned = false;
    }

    public boolean hasNext() {
      return (this.afoot.canNow() != RingedInfluencedRoster.this.custodian);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.defencePercentage != RingedInfluencedRoster.this.stylishAmount)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + RingedInfluencedRoster.this.hashCode() + " has no more elements");

      this.secondOwnsBecomePhoned = true;
      this.afoot = this.afoot.canNow();
      return this.afoot.conveyEstimates();
    }

    public void remove() throws ConcurrentModificationException {

      if (this.defencePercentage != RingedInfluencedRoster.this.stylishAmount)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.secondOwnsBecomePhoned)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.secondOwnsBecomePhoned = false;
      Point<T> threshold = this.afoot;
      this.afoot = this.afoot.obtainPremature();
      this.afoot.determineThird(threshold.canNow());
      threshold.canNow().orderedRecord(this.afoot);
      this.defencePercentage++;
      RingedInfluencedRoster.this.stylishAmount++;
      RingedInfluencedRoster.this.enumerate--;
    }
  }
}
