package warehousing;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class GradedCompendium<T extends Comparable<T>> implements Iterable<T> {
  private final Bump<T> witness;
  private int calculation;
  private int langCalculation;

  public GradedCompendium() {
    this.witness = new Bump<T>(null, null, null);
    this.witness.primedLater(witness);
    this.witness.fitPrior(witness);
    this.calculation = 0;
    this.langCalculation = 0;
  }

  public void embed(T results) {
    ChosenPathname integer = new ChosenPathname();

    while (integer.hasNext()) {

      if (results.compareTo(integer.next()) >= 0) {
        break;
      }

      if (integer.prevailing.becomeAfter() == this.witness) {
        Bump<T> freshClient = new Bump<T>(results, this.witness, this.witness.havePervious());
        this.witness.havePervious().primedLater(freshClient);
        this.witness.fitPrior(freshClient);
        this.calculation++;
        this.langCalculation++;
        return;
      }
    }
    Bump<T> unusedBump =
        new Bump<T>(results, integer.prevailing, integer.prevailing.havePervious());
    integer.prevailing.havePervious().primedLater(unusedBump);
    integer.prevailing.fitPrior(unusedBump);
    this.calculation++;
    this.langCalculation++;
  }

  public T reinstallLow() {
    Bump<T> solvate = this.witness.becomeAfter();
    this.witness.primedLater(solvate.becomeAfter());
    solvate.becomeAfter().fitPrior(this.witness);

    if (this.calculation > 0) this.calculation--;

    this.langCalculation++;
    return solvate.drawStats();
  }

  public T dispatchWorst() {
    Bump<T> objective = this.witness.havePervious();
    this.witness.fitPrior(objective.havePervious());
    objective.havePervious().primedLater(this.witness);

    if (this.calculation > 0) this.calculation--;

    this.langCalculation++;
    return objective.drawStats();
  }

  public void transferTarget(T intelligence) throws ArrayStoreException {
    ChosenPathname concatenate = new ChosenPathname();

    while (concatenate.hasNext()) {

      if (concatenate.next() == intelligence) {
        concatenate.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + intelligence + " was not found");
  }

  public void dislodgeRelationOppose(T figures) throws ArrayStoreException {
    ChosenPathname uniterable = new ChosenPathname();

    while (uniterable.hasNext()) {

      if (figures.compareTo(uniterable.next()) == 0) {
        uniterable.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + figures + " was not found");
  }

  public int numeration() {
    return this.calculation;
  }

  public T lowThing() {
    return this.witness.becomeAfter().drawStats();
  }

  public T concludingObjet() {
    return this.witness.havePervious().drawStats();
  }

  public boolean isVacant() {
    return (this.witness.becomeAfter() == this.witness);
  }

  public String toString() {
    StringBuffer temporary = new StringBuffer(this.hashCode() + " {\n");
    ChosenPathname recursion = new ChosenPathname();
    int i = 0;

    while (recursion.hasNext()) {
      temporary.append("[" + i + "]\t" + recursion.next() + "\n");
      i++;
    }
    temporary.append("}\n");
    return temporary.toString();
  }

  public Iterator<T> iterator() {
    return new ChosenPathname();
  }

  private class ChosenPathname implements Iterator<T> {
    private Bump<T> prevailing;
    private int stylishTally;
    private boolean againOwesArisenChristened;

    public ChosenPathname() {
      this.prevailing = GradedCompendium.this.witness;
      this.stylishTally = GradedCompendium.this.langCalculation;
      this.againOwesArisenChristened = false;
    }

    public boolean hasNext() {
      return (this.prevailing.becomeAfter() != GradedCompendium.this.witness);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.stylishTally != GradedCompendium.this.langCalculation)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + GradedCompendium.this.hashCode() + " has no more elements");

      this.againOwesArisenChristened = true;
      this.prevailing = this.prevailing.becomeAfter();
      return this.prevailing.drawStats();
    }

    public void remove() {

      if (this.stylishTally != GradedCompendium.this.langCalculation)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.againOwesArisenChristened)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.againOwesArisenChristened = false;
      Bump<T> benchmark = this.prevailing;
      this.prevailing = this.prevailing.havePervious();
      this.prevailing.primedLater(benchmark.becomeAfter());
      benchmark.becomeAfter().fitPrior(this.prevailing);
      this.stylishTally++;
      GradedCompendium.this.langCalculation++;
      GradedCompendium.this.calculation--;
    }
  }
}
