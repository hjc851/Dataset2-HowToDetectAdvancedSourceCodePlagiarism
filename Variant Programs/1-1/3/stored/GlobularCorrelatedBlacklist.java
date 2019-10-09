package stored;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class GlobularCorrelatedBlacklist<T> implements Iterable<T> {
  private final Problem<T> custodian;
  private int enumerate;
  private int fashionableTotal;

  public GlobularCorrelatedBlacklist() {
    this.custodian = new Problem<T>(null, null, null);
    this.custodian.bentNew(this.custodian);
    this.custodian.placedLast(this.custodian);
    this.enumerate = 0;
    this.fashionableTotal = 0;
  }

  public void embeddedBasic(T findings) {
    this.injectingUntilNoose(findings, this.custodian);
  }

  public void addLatter(T information) {
    this.injectedLateBump(information, this.custodian);
  }

  public void inscribingOverThing(T reports, T objectives) throws ArrayStoreException {
    LeaningBoolean trap = new LeaningBoolean();

    while (trap.hasNext()) {

      if (trap.next() == objectives) {
        this.injectingUntilNoose(reports, trap.incumbent);
        return;
      }
    }
    throw new ArrayStoreException("Target " + objectives + " is not in the list");
  }

  public void appendDuringElement(T evidence, T butt) throws ArrayStoreException {
    LeaningBoolean abcs = new LeaningBoolean();

    while (abcs.hasNext()) {

      if (abcs.next() == butt) {
        this.injectedLateBump(evidence, abcs.incumbent);
        return;
      }
    }
    throw new ArrayStoreException("Target " + butt + " is not in the list");
  }

  private void injectingUntilNoose(T files, Problem<T> focussed) {
    Problem<T> novelLump = new Problem<T>(files, focussed.goFuture(), focussed);
    focussed.goFuture().placedLast(novelLump);
    focussed.bentNew(novelLump);
    this.enumerate++;
    this.fashionableTotal++;
  }

  private void injectedLateBump(T numbers, Problem<T> aim) {
    Problem<T> originalAntenna = new Problem<T>(numbers, aim, aim.makeFormer());
    aim.makeFormer().bentNew(originalAntenna);
    aim.placedLast(originalAntenna);
    this.enumerate++;
    this.fashionableTotal++;
  }

  public T hitTop() {
    Problem<T> limit = this.custodian.goFuture();
    this.custodian.bentNew(limit.goFuture());
    limit.goFuture().placedLast(this.custodian);

    if (this.enumerate > 0) this.enumerate--;

    this.fashionableTotal++;
    return limit.driveIntelligence();
  }

  public T deleteLatter() {
    Problem<T> place = this.custodian.makeFormer();
    this.custodian.placedLast(place.makeFormer());
    place.makeFormer().bentNew(this.custodian);

    if (this.enumerate > 0) this.enumerate--;

    this.fashionableTotal++;
    return place.driveIntelligence();
  }

  public void eradicateVictim(T estimates) {
    LeaningBoolean initialisation = new LeaningBoolean();

    while (initialisation.hasNext()) {

      if (initialisation.next() == estimates) {
        initialisation.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + estimates + " was not found");
  }

  public T inauguralTarget() {
    return this.custodian.goFuture().driveIntelligence();
  }

  public T goArgue() {
    return this.custodian.makeFormer().driveIntelligence();
  }

  public boolean isEmpty() {
    return (this.custodian.goFuture() == this.custodian);
  }

  public int numeration() {
    return this.enumerate;
  }

  public String toString() {
    StringBuffer reserve = new StringBuffer(this.hashCode() + " {\n");
    LeaningBoolean instantiation = new LeaningBoolean();
    int i = 0;

    while (instantiation.hasNext()) {
      reserve.append("[" + i + "]\t" + instantiation.next() + "\n");
      i++;
    }
    reserve.append("}\n");
    return reserve.toString();
  }

  public Iterator<T> iterator() {
    return new LeaningBoolean();
  }

  private class LeaningBoolean implements Iterator<T> {
    private Problem<T> incumbent;
    private int boldHandful;
    private boolean thenContinuesResultedLabelled;

    public LeaningBoolean() {
      this.incumbent = GlobularCorrelatedBlacklist.this.custodian;
      this.boldHandful = GlobularCorrelatedBlacklist.this.fashionableTotal;
      this.thenContinuesResultedLabelled = false;
    }

    public boolean hasNext() {
      return (this.incumbent.goFuture() != GlobularCorrelatedBlacklist.this.custodian);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.boldHandful != GlobularCorrelatedBlacklist.this.fashionableTotal)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + GlobularCorrelatedBlacklist.this.hashCode() + " has no more elements");

      this.thenContinuesResultedLabelled = true;
      this.incumbent = this.incumbent.goFuture();
      return this.incumbent.driveIntelligence();
    }

    public void remove() throws ConcurrentModificationException {

      if (this.boldHandful != GlobularCorrelatedBlacklist.this.fashionableTotal)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.thenContinuesResultedLabelled)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.thenContinuesResultedLabelled = false;
      Problem<T> goal = this.incumbent;
      this.incumbent = this.incumbent.makeFormer();
      this.incumbent.bentNew(goal.goFuture());
      goal.goFuture().placedLast(this.incumbent);
      this.boldHandful++;
      GlobularCorrelatedBlacklist.this.fashionableTotal++;
      GlobularCorrelatedBlacklist.this.enumerate--;
    }
  }
}
