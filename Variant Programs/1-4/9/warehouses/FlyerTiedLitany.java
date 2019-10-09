package warehouses;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class FlyerTiedLitany<T> implements Iterable<T> {
  private final Nucleus<T> witness;

  public synchronized int tally() {
    return this.tabulation;
  }

  public synchronized T premierOppose() {
    return this.witness.makeAdjacent().comeDatabases();
  }

  public synchronized T eliminateLowest() {
    Nucleus<T> objective = this.witness.arriveFirst();
    this.witness.rigidPreliminary(objective.arriveFirst());
    objective.arriveFirst().markAhead(this.witness);

    if (this.tabulation > 0) this.tabulation--;

    this.domNumeral++;
    return objective.comeDatabases();
  }

  private int domNumeral = 0;

  public synchronized String toString() {
    StringBuffer separating = new StringBuffer(this.hashCode() + " {\n");
    CatalogPathname tuple = new CatalogPathname();
    int i = 0;

    while (tuple.hasNext()) {
      separating.append("[" + i + "]\t" + tuple.next() + "\n");
      i++;
    }
    separating.append("}\n");
    return separating.toString();
  }

  public synchronized void dispatchItem(T files) {
    CatalogPathname malloc = new CatalogPathname();

    while (malloc.hasNext()) {

      if (malloc.next() == files) {
        malloc.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + files + " was not found");
  }

  public synchronized T eradicateForward() {
    Nucleus<T> aiming = this.witness.makeAdjacent();
    this.witness.markAhead(aiming.makeAdjacent());
    aiming.makeAdjacent().rigidPreliminary(this.witness);

    if (this.tabulation > 0) this.tabulation--;

    this.domNumeral++;
    return aiming.comeDatabases();
  }

  public synchronized void insertionOldest(T figures) {
    this.injectedWakeBump(figures, this.witness);
  }

  public FlyerTiedLitany() {
    this.witness = new Nucleus<T>(null, null, null);
    this.witness.markAhead(this.witness);
    this.witness.rigidPreliminary(this.witness);
    this.tabulation = 0;
    this.domNumeral = 0;
  }

  public synchronized void injectedWakeMatter(T estimates, T focused) throws ArrayStoreException {
    CatalogPathname abcs = new CatalogPathname();

    while (abcs.hasNext()) {

      if (abcs.next() == focused) {
        this.injectedWakeBump(estimates, abcs.existing);
        return;
      }
    }
    throw new ArrayStoreException("Target " + focused + " is not in the list");
  }

  private int tabulation = 0;

  public synchronized T laterTarget() {
    return this.witness.arriveFirst().comeDatabases();
  }

  private synchronized void injectedWakeBump(T information, Nucleus<T> objectives) {
    Nucleus<T> newfangledNodal = new Nucleus<T>(information, objectives.makeAdjacent(), objectives);
    objectives.makeAdjacent().rigidPreliminary(newfangledNodal);
    objectives.markAhead(newfangledNodal);
    this.tabulation++;
    this.domNumeral++;
  }

  private synchronized void injectingAgoNoose(T indicators, Nucleus<T> prey) {
    Nucleus<T> novelLump = new Nucleus<T>(indicators, prey, prey.arriveFirst());
    prey.arriveFirst().markAhead(novelLump);
    prey.rigidPreliminary(novelLump);
    this.tabulation++;
    this.domNumeral++;
  }

  public synchronized Iterator<T> iterator() {
    return new CatalogPathname();
  }

  public synchronized void enterLaterArtifact(T computer, T priority) throws ArrayStoreException {
    CatalogPathname abc = new CatalogPathname();

    while (abc.hasNext()) {

      if (abc.next() == priority) {
        this.injectingAgoNoose(computer, abc.existing);
        return;
      }
    }
    throw new ArrayStoreException("Target " + priority + " is not in the list");
  }

  public synchronized boolean isEmpty() {
    return (this.witness.makeAdjacent() == this.witness);
  }

  private class CatalogPathname implements Iterator<T> {

    public synchronized boolean hasNext() {
      return (this.existing.makeAdjacent() != FlyerTiedLitany.this.witness);
    }

    public CatalogPathname() {
      this.existing = FlyerTiedLitany.this.witness;
      this.daringMany = FlyerTiedLitany.this.domNumeral;
      this.aheadFeelsKeptDemanded = false;
    }

    private int daringMany = 0;
    private Nucleus<T> existing = null;
    private boolean aheadFeelsKeptDemanded = false;

    public synchronized void remove() throws ConcurrentModificationException {

      if (this.daringMany != FlyerTiedLitany.this.domNumeral)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.aheadFeelsKeptDemanded)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.aheadFeelsKeptDemanded = false;
      Nucleus<T> goal = this.existing;
      this.existing = this.existing.arriveFirst();
      this.existing.markAhead(goal.makeAdjacent());
      goal.makeAdjacent().rigidPreliminary(this.existing);
      this.daringMany++;
      FlyerTiedLitany.this.domNumeral++;
      FlyerTiedLitany.this.tabulation--;
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.daringMany != FlyerTiedLitany.this.domNumeral)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + FlyerTiedLitany.this.hashCode() + " has no more elements");

      this.aheadFeelsKeptDemanded = true;
      this.existing = this.existing.makeAdjacent();
      return this.existing.comeDatabases();
    }
  }

  public synchronized void injectFinish(T evidence) {
    this.injectingAgoNoose(evidence, this.witness);
  }
}
