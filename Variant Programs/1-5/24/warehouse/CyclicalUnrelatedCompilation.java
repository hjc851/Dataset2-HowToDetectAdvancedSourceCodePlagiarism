package warehouse;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class CyclicalUnrelatedCompilation<T> implements Iterable<T> {
  private static final String synX1811String = " is not in the list";
  private static final String synX1810String = "Target ";
  private static final String synX1809String = " was not found";
  private static final String synX1808String = "Object ";
  private static final int synX1807int = 0;
  private static final int synX1806int = 0;
  private static final int synX1805int = 0;
  private static final String synX1804String = "}\n";
  private static final String synX1803String = "\n";
  private static final String synX1802String = "]\t";
  private static final String synX1801String = "[";
  private static final int synX1800int = 0;
  private static final String synX1799String = " {\n";

  public synchronized String toString() {
    StringBuffer soften;
    RankingSubtree battologize;
    int i;
    soften = new StringBuffer(this.hashCode() + synX1799String);
    battologize = new RankingSubtree();
    i = synX1800int;

    while (battologize.hasNext()) {
      soften.append(synX1801String + i + synX1802String + battologize.next() + synX1803String);
      i++;
    }
    soften.append(synX1804String);
    return soften.toString();
  }

  public CyclicalUnrelatedCompilation() {
    this.witnesses = new Core<T>(null, null, null);
    this.witnesses.bentNew(this.witnesses);
    this.witnesses.solidifyingElapsed(this.witnesses);
    this.rely = synX1805int;
    this.dodAct = synX1806int;
  }

  public synchronized void addPremiere(T records) {
    this.enterAfterwardsAntenna(records, this.witnesses);
  }

  public synchronized T installForemost() {
    Core<T> mark;
    mark = this.witnesses.conveyCome();
    this.witnesses.bentNew(mark.conveyCome());
    mark.conveyCome().solidifyingElapsed(this.witnesses);

    if (this.rely > synX1807int) this.rely--;

    this.dodAct++;
    return mark.makeIndicators();
  }

  private synchronized void enterAfterwardsAntenna(T intelligence, Core<T> direct) {
    Core<T> youngCore;
    youngCore = new Core<T>(intelligence, direct.conveyCome(), direct);
    direct.conveyCome().solidifyingElapsed(youngCore);
    direct.bentNew(youngCore);
    this.rely++;
    this.dodAct++;
  }

  public synchronized boolean isEmpty() {
    return (this.witnesses.conveyCome() == this.witnesses);
  }

  public synchronized T latterBody() {
    return this.witnesses.makeFormer().makeIndicators();
  }

  private synchronized void putInsteadPoint(T results, Core<T> focussed) {
    Core<T> unprecedentedNub;
    unprecedentedNub = new Core<T>(results, focussed, focussed.makeFormer());
    focussed.makeFormer().bentNew(unprecedentedNub);
    focussed.solidifyingElapsed(unprecedentedNub);
    this.rely++;
    this.dodAct++;
  }

  private int rely = 0;

  public synchronized void transferTarget(T figures) {
    RankingSubtree iterate;
    iterate = new RankingSubtree();

    while (iterate.hasNext()) {

      if (iterate.next() == figures) {
        iterate.remove();
        return;
      }
    }
    throw new ArrayStoreException(synX1808String + figures + synX1809String);
  }

  public synchronized int enumerate() {
    return this.rely;
  }

  public synchronized void injectingDying(T database) {
    this.putInsteadPoint(database, this.witnesses);
  }

  public synchronized T kickoffItems() {
    return this.witnesses.conveyCome().makeIndicators();
  }

  public synchronized void infixFollowingArtefact(T files, T point) throws ArrayStoreException {
    RankingSubtree abysm;
    abysm = new RankingSubtree();

    while (abysm.hasNext()) {

      if (abysm.next() == point) {
        this.enterAfterwardsAntenna(files, abysm.incumbent);
        return;
      }
    }
    throw new ArrayStoreException(synX1810String + point + synX1811String);
  }

  private final Core<T> witnesses;

  public synchronized Iterator<T> iterator() {
    return new RankingSubtree();
  }

  private class RankingSubtree implements Iterator<T> {

    public synchronized void remove() throws ConcurrentModificationException {
      Core<T> goals;

      if (this.moduleRoutine != CyclicalUnrelatedCompilation.this.dodAct)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.adjacentPossessesPastDescribed)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.adjacentPossessesPastDescribed = false;
      goals = this.incumbent;
      this.incumbent = this.incumbent.makeFormer();
      this.incumbent.bentNew(goals.conveyCome());
      goals.conveyCome().solidifyingElapsed(this.incumbent);
      this.moduleRoutine++;
      CyclicalUnrelatedCompilation.this.dodAct++;
      CyclicalUnrelatedCompilation.this.rely--;
    }

    private int moduleRoutine = 0;
    private boolean adjacentPossessesPastDescribed = false;

    public RankingSubtree() {
      this.incumbent = CyclicalUnrelatedCompilation.this.witnesses;
      this.moduleRoutine = CyclicalUnrelatedCompilation.this.dodAct;
      this.adjacentPossessesPastDescribed = false;
    }

    public synchronized boolean hasNext() {
      return (this.incumbent.conveyCome() != CyclicalUnrelatedCompilation.this.witnesses);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.moduleRoutine != CyclicalUnrelatedCompilation.this.dodAct)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + CyclicalUnrelatedCompilation.this.hashCode() + " has no more elements");

      this.adjacentPossessesPastDescribed = true;
      this.incumbent = this.incumbent.conveyCome();
      return this.incumbent.makeIndicators();
    }

    private Core<T> incumbent = null;
  }

  public synchronized void injectedLateMatter(T numbers, T benchmark) throws ArrayStoreException {
    RankingSubtree aberdeen;
    aberdeen = new RankingSubtree();

    while (aberdeen.hasNext()) {

      if (aberdeen.next() == benchmark) {
        this.putInsteadPoint(numbers, aberdeen.incumbent);
        return;
      }
    }
    throw new ArrayStoreException("Target " + benchmark + " is not in the list");
  }

  public synchronized T withdrawConclusion() {
    Core<T> pinpoint;
    pinpoint = this.witnesses.makeFormer();
    this.witnesses.solidifyingElapsed(pinpoint.makeFormer());
    pinpoint.makeFormer().bentNew(this.witnesses);

    if (this.rely > 0) this.rely--;

    this.dodAct++;
    return pinpoint.makeIndicators();
  }

  private int dodAct = 0;
}
