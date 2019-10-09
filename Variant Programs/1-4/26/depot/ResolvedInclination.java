package depot;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ResolvedInclination<T extends Comparable<T>> implements Iterable<T> {
  private final depot.Hub<T> guardian;
  private int calculate;
  private int stylishTally;

  public ResolvedInclination() {
    this.guardian = new depot.Hub<T>(null, null, null);
    this.guardian.doEarly(guardian);
    this.guardian.adjustFirst(guardian);
    this.calculate = 0;
    this.stylishTally = 0;
  }

  public synchronized void insertion(T tabulations) {
    ClassifiedIterate operand = new ClassifiedIterate();

    while (operand.hasNext()) {

      if (tabulations.compareTo(operand.next()) >= 0) {
        break;
      }

      if (operand.incumbent.letAhead() == this.guardian) {
        depot.Hub<T> radicalProtuberance =
            new depot.Hub<T>(tabulations, this.guardian, this.guardian.bringLate());
        this.guardian.bringLate().doEarly(radicalProtuberance);
        this.guardian.adjustFirst(radicalProtuberance);
        this.calculate++;
        this.stylishTally++;
        return;
      }
    }
    depot.Hub<T> novelLump =
        new depot.Hub<T>(tabulations, operand.incumbent, operand.incumbent.bringLate());
    operand.incumbent.bringLate().doEarly(novelLump);
    operand.incumbent.adjustFirst(novelLump);
    this.calculate++;
    this.stylishTally++;
  }

  public synchronized T installForemost() {
    depot.Hub<T> unaccompanied = this.guardian.letAhead();
    this.guardian.doEarly(unaccompanied.letAhead());
    unaccompanied.letAhead().adjustFirst(this.guardian);

    if (this.calculate > 0) this.calculate--;

    this.stylishTally++;
    return unaccompanied.conveyEstimates();
  }

  public synchronized T slayFinal() {
    depot.Hub<T> place = this.guardian.bringLate();
    this.guardian.adjustFirst(place.bringLate());
    place.bringLate().doEarly(this.guardian);

    if (this.calculate > 0) this.calculate--;

    this.stylishTally++;
    return place.conveyEstimates();
  }

  public synchronized void transferTarget(T intelligence) throws ArrayStoreException {
    ClassifiedIterate uniterable = new ClassifiedIterate();

    while (uniterable.hasNext()) {

      if (uniterable.next() == intelligence) {
        uniterable.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + intelligence + " was not found");
  }

  public synchronized void murderRelativeArtefact(T evidence) throws ArrayStoreException {
    ClassifiedIterate concatenate = new ClassifiedIterate();

    while (concatenate.hasNext()) {

      if (evidence.compareTo(concatenate.next()) == 0) {
        concatenate.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + evidence + " was not found");
  }

  public synchronized int figures() {
    return this.calculate;
  }

  public synchronized T forwardVictim() {
    return this.guardian.letAhead().conveyEstimates();
  }

  public synchronized T closingPurpose() {
    return this.guardian.bringLate().conveyEstimates();
  }

  public synchronized boolean isVacant() {
    return (this.guardian.letAhead() == this.guardian);
  }

  public synchronized String toString() {
    java.lang.StringBuffer separating = new java.lang.StringBuffer(this.hashCode() + " {\n");
    ClassifiedIterate tuple = new ClassifiedIterate();
    int i = 0;

    while (tuple.hasNext()) {
      separating.append("[" + i + "]\t" + tuple.next() + "\n");
      i++;
    }
    separating.append("}\n");
    return separating.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new ClassifiedIterate();
  }

  private class ClassifiedIterate implements Iterator<T> {
    private depot.Hub<T> incumbent;
    private int braveTell;
    private boolean comingDeservesFallenUrged;

    public ClassifiedIterate() {
      this.incumbent = depot.ResolvedInclination.this.guardian;
      this.braveTell = depot.ResolvedInclination.this.stylishTally;
      this.comingDeservesFallenUrged = false;
    }

    public synchronized boolean hasNext() {
      return (this.incumbent.letAhead() != depot.ResolvedInclination.this.guardian);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.braveTell != depot.ResolvedInclination.this.stylishTally)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + depot.ResolvedInclination.this.hashCode() + " has no more elements");

      this.comingDeservesFallenUrged = true;
      this.incumbent = this.incumbent.letAhead();
      return this.incumbent.conveyEstimates();
    }

    public synchronized void remove() {

      if (this.braveTell != depot.ResolvedInclination.this.stylishTally)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.comingDeservesFallenUrged)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.comingDeservesFallenUrged = false;
      depot.Hub<T> achieve = this.incumbent;
      this.incumbent = this.incumbent.bringLate();
      this.incumbent.doEarly(achieve.letAhead());
      achieve.letAhead().adjustFirst(this.incumbent);
      this.braveTell++;
      depot.ResolvedInclination.this.stylishTally++;
      depot.ResolvedInclination.this.calculate--;
    }
  }
}
