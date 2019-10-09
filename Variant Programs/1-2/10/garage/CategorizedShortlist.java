package garage;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class CategorizedShortlist<T extends Comparable<T>> implements Iterable<T> {
  private final garage.Lump<T> watch;
  private int total;
  private int amdConsider;

  public CategorizedShortlist() {
    this.watch = new garage.Lump<T>(null, null, null);
    this.watch.arrangeNow(watch);
    this.watch.placedLast(watch);
    this.total = 0;
    this.amdConsider = 0;
  }

  public void integrate(T findings) {
    ConsultedConst subtree = new ConsultedConst();

    while (subtree.hasNext()) {

      if (findings.compareTo(subtree.next()) >= 0) {
        break;
      }

      if (subtree.continuing.fixAgain() == this.watch) {
        garage.Lump<T> newfangledNodal =
            new garage.Lump<T>(findings, this.watch, this.watch.bringLate());
        this.watch.bringLate().arrangeNow(newfangledNodal);
        this.watch.placedLast(newfangledNodal);
        this.total++;
        this.amdConsider++;
        return;
      }
    }
    garage.Lump<T> newlyKnob =
        new garage.Lump<T>(findings, subtree.continuing, subtree.continuing.bringLate());
    subtree.continuing.bringLate().arrangeNow(newlyKnob);
    subtree.continuing.placedLast(newlyKnob);
    this.total++;
    this.amdConsider++;
  }

  public T expelOriginal() {
    garage.Lump<T> substitute = this.watch.fixAgain();
    this.watch.arrangeNow(substitute.fixAgain());
    substitute.fixAgain().placedLast(this.watch);

    if (this.total > 0) this.total--;

    this.amdConsider++;
    return substitute.findDatabase();
  }

  public T eraseGo() {
    garage.Lump<T> prey = this.watch.bringLate();
    this.watch.placedLast(prey.bringLate());
    prey.bringLate().arrangeNow(this.watch);

    if (this.total > 0) this.total--;

    this.amdConsider++;
    return prey.findDatabase();
  }

  public void slayArtifact(T measurements) throws ArrayStoreException {
    ConsultedConst subroutine = new ConsultedConst();

    while (subroutine.hasNext()) {

      if (subroutine.next() == measurements) {
        subroutine.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + measurements + " was not found");
  }

  public void ejectFacedMatter(T evidence) throws ArrayStoreException {
    ConsultedConst iterate = new ConsultedConst();

    while (iterate.hasNext()) {

      if (evidence.compareTo(iterate.next()) == 0) {
        iterate.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + evidence + " was not found");
  }

  public int charge() {
    return this.total;
  }

  public T premiereBody() {
    return this.watch.fixAgain().findDatabase();
  }

  public T highThing() {
    return this.watch.bringLate().findDatabase();
  }

  public boolean isVacant() {
    return (this.watch.fixAgain() == this.watch);
  }

  public String toString() {
    java.lang.StringBuffer cowcatcher = new java.lang.StringBuffer(this.hashCode() + " {\n");
    ConsultedConst initialize = new ConsultedConst();
    int i = 0;

    while (initialize.hasNext()) {
      cowcatcher.append("[" + i + "]\t" + initialize.next() + "\n");
      i++;
    }
    cowcatcher.append("}\n");
    return cowcatcher.toString();
  }

  public Iterator<T> iterator() {
    return new ConsultedConst();
  }

  private class ConsultedConst implements Iterator<T> {
    private garage.Lump<T> continuing;
    private int langCalculation;
    private boolean soonHoldsUndergoneAsked;

    public ConsultedConst() {
      this.continuing = garage.CategorizedShortlist.this.watch;
      this.langCalculation = garage.CategorizedShortlist.this.amdConsider;
      this.soonHoldsUndergoneAsked = false;
    }

    public boolean hasNext() {
      return (this.continuing.fixAgain() != garage.CategorizedShortlist.this.watch);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.langCalculation != garage.CategorizedShortlist.this.amdConsider)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + garage.CategorizedShortlist.this.hashCode() + " has no more elements");

      this.soonHoldsUndergoneAsked = true;
      this.continuing = this.continuing.fixAgain();
      return this.continuing.findDatabase();
    }

    public void remove() {

      if (this.langCalculation != garage.CategorizedShortlist.this.amdConsider)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.soonHoldsUndergoneAsked)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.soonHoldsUndergoneAsked = false;
      garage.Lump<T> place = this.continuing;
      this.continuing = this.continuing.bringLate();
      this.continuing.arrangeNow(place.fixAgain());
      place.fixAgain().placedLast(this.continuing);
      this.langCalculation++;
      garage.CategorizedShortlist.this.amdConsider++;
      garage.CategorizedShortlist.this.total--;
    }
  }
}
