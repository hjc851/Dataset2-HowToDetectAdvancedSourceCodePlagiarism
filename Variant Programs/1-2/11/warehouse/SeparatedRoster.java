package warehouse;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class SeparatedRoster<T extends Comparable<T>> implements Iterable<T> {
  private final Point<T> watch;
  private int calculation;
  private int braveTell;

  public SeparatedRoster() {
    this.watch = new Point<T>(null, null, null);
    this.watch.determineThird(watch);
    this.watch.orderedRecord(watch);
    this.calculation = 0;
    this.braveTell = 0;
  }

  public void inclose(T survey) {
    ConsultedConst iterate = new ConsultedConst();

    while (iterate.hasNext()) {

      if (survey.compareTo(iterate.next()) >= 0) {
        break;
      }

      if (iterate.ongoing.canNow() == this.watch) {
        Point<T> otherEntanglement = new Point<T>(survey, this.watch, this.watch.obtainPremature());
        this.watch.obtainPremature().determineThird(otherEntanglement);
        this.watch.orderedRecord(otherEntanglement);
        this.calculation++;
        this.braveTell++;
        return;
      }
    }
    Point<T> novelLump = new Point<T>(survey, iterate.ongoing, iterate.ongoing.obtainPremature());
    iterate.ongoing.obtainPremature().determineThird(novelLump);
    iterate.ongoing.orderedRecord(novelLump);
    this.calculation++;
    this.braveTell++;
  }

  public T undoBasic() {
    Point<T> solvate = this.watch.canNow();
    this.watch.determineThird(solvate.canNow());
    solvate.canNow().orderedRecord(this.watch);

    if (this.calculation > 0) this.calculation--;

    this.braveTell++;
    return solvate.conveyEstimates();
  }

  public T eraseGo() {
    Point<T> limit = this.watch.obtainPremature();
    this.watch.orderedRecord(limit.obtainPremature());
    limit.obtainPremature().determineThird(this.watch);

    if (this.calculation > 0) this.calculation--;

    this.braveTell++;
    return limit.conveyEstimates();
  }

  public void dispatchItem(T evidence) throws ArrayStoreException {
    ConsultedConst inode = new ConsultedConst();

    while (inode.hasNext()) {

      if (inode.next() == evidence) {
        inode.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + evidence + " was not found");
  }

  public void murderRelativeArtefact(T databases) throws ArrayStoreException {
    ConsultedConst subtree = new ConsultedConst();

    while (subtree.hasNext()) {

      if (databases.compareTo(subtree.next()) == 0) {
        subtree.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + databases + " was not found");
  }

  public int total() {
    return this.calculation;
  }

  public T prototypicalDisagree() {
    return this.watch.canNow().conveyEstimates();
  }

  public T latterBody() {
    return this.watch.obtainPremature().conveyEstimates();
  }

  public boolean isVacant() {
    return (this.watch.canNow() == this.watch);
  }

  public String toString() {
    StringBuffer absorb = new StringBuffer(this.hashCode() + " {\n");
    ConsultedConst subroutine = new ConsultedConst();
    int i = 0;

    while (subroutine.hasNext()) {
      absorb.append("[" + i + "]\t" + subroutine.next() + "\n");
      i++;
    }
    absorb.append("}\n");
    return absorb.toString();
  }

  public Iterator<T> iterator() {
    return new ConsultedConst();
  }

  private class ConsultedConst implements Iterator<T> {
    private Point<T> ongoing;
    private int fashionableNumber;
    private boolean expectedGetsRisenCharacterized;

    public ConsultedConst() {
      this.ongoing = SeparatedRoster.this.watch;
      this.fashionableNumber = SeparatedRoster.this.braveTell;
      this.expectedGetsRisenCharacterized = false;
    }

    public boolean hasNext() {
      return (this.ongoing.canNow() != SeparatedRoster.this.watch);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.fashionableNumber != SeparatedRoster.this.braveTell)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + SeparatedRoster.this.hashCode() + " has no more elements");

      this.expectedGetsRisenCharacterized = true;
      this.ongoing = this.ongoing.canNow();
      return this.ongoing.conveyEstimates();
    }

    public void remove() {

      if (this.fashionableNumber != SeparatedRoster.this.braveTell)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.expectedGetsRisenCharacterized)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.expectedGetsRisenCharacterized = false;
      Point<T> direct = this.ongoing;
      this.ongoing = this.ongoing.obtainPremature();
      this.ongoing.determineThird(direct.canNow());
      direct.canNow().orderedRecord(this.ongoing);
      this.fashionableNumber++;
      SeparatedRoster.this.braveTell++;
      SeparatedRoster.this.calculation--;
    }
  }
}
