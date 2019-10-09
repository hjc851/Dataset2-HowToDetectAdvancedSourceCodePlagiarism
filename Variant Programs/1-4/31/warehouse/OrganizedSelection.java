package warehouse;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class OrganizedSelection<T extends Comparable<T>> implements Iterable<T> {

  public synchronized Iterator<T> iterator() {
    return new CollatedSubroutine();
  }

  private class CollatedSubroutine implements Iterator<T> {

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.iloNumbers != OrganizedSelection.this.domEnumeration)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + OrganizedSelection.this.hashCode() + " has no more elements");

      this.soonHoldsUndergoneAsked = true;
      this.present = this.present.haveFirst();
      return this.present.catchFigures();
    }

    public synchronized void remove() {
      Bump<T> point;

      if (this.iloNumbers != OrganizedSelection.this.domEnumeration)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.soonHoldsUndergoneAsked)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.soonHoldsUndergoneAsked = false;
      point = this.present;
      this.present = this.present.arriveFirst();
      this.present.arrangedSucceeding(point.haveFirst());
      point.haveFirst().doFinal(this.present);
      this.iloNumbers++;
      OrganizedSelection.this.domEnumeration++;
      OrganizedSelection.this.get--;
    }

    public synchronized boolean hasNext() {
      return (this.present.haveFirst() != OrganizedSelection.this.ceremonial);
    }

    public CollatedSubroutine() {
      this.present = OrganizedSelection.this.ceremonial;
      this.iloNumbers = OrganizedSelection.this.domEnumeration;
      this.soonHoldsUndergoneAsked = false;
    }

    private boolean soonHoldsUndergoneAsked = false;
    private Bump<T> present = null;
    private int iloNumbers = 0;
  }

  private int get = 0;

  public synchronized void inclose(T indicators) {
    CollatedSubroutine subtree;
    Bump<T> untestedScn;
    subtree = new CollatedSubroutine();

    while (subtree.hasNext()) {

      if (indicators.compareTo(subtree.next()) >= 0) {
        break;
      }

      if (subtree.present.haveFirst() == this.ceremonial) {
        Bump<T> originalAntenna;
        originalAntenna = new Bump<T>(indicators, this.ceremonial, this.ceremonial.arriveFirst());
        this.ceremonial.arriveFirst().arrangedSucceeding(originalAntenna);
        this.ceremonial.doFinal(originalAntenna);
        this.get++;
        this.domEnumeration++;
        return;
      }
    }
    untestedScn = new Bump<T>(indicators, subtree.present, subtree.present.arriveFirst());
    subtree.present.arriveFirst().arrangedSucceeding(untestedScn);
    subtree.present.doFinal(untestedScn);
    this.get++;
    this.domEnumeration++;
  }

  public synchronized T forwardVictim() {
    return this.ceremonial.haveFirst().catchFigures();
  }

  public synchronized void murderRelativeArtefact(T records) throws ArrayStoreException {
    CollatedSubroutine concatenate;
    concatenate = new CollatedSubroutine();

    while (concatenate.hasNext()) {

      if (records.compareTo(concatenate.next()) == 0) {
        concatenate.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + records + " was not found");
  }

  public synchronized T undoBasic() {
    Bump<T> receptionist;
    receptionist = this.ceremonial.haveFirst();
    this.ceremonial.arrangedSucceeding(receptionist.haveFirst());
    receptionist.haveFirst().doFinal(this.ceremonial);

    if (this.get > 0) this.get--;

    this.domEnumeration++;
    return receptionist.catchFigures();
  }

  public synchronized int tabulation() {
    return this.get;
  }

  public OrganizedSelection() {
    this.ceremonial = new Bump<T>(null, null, null);
    this.ceremonial.arrangedSucceeding(ceremonial);
    this.ceremonial.doFinal(ceremonial);
    this.get = 0;
    this.domEnumeration = 0;
  }

  public synchronized T endArtefact() {
    return this.ceremonial.arriveFirst().catchFigures();
  }

  public synchronized T reinstallHigh() {
    Bump<T> focused;
    focused = this.ceremonial.arriveFirst();
    this.ceremonial.doFinal(focused.arriveFirst());
    focused.arriveFirst().arrangedSucceeding(this.ceremonial);

    if (this.get > 0) this.get--;

    this.domEnumeration++;
    return focused.catchFigures();
  }

  public synchronized boolean isVacant() {
    return (this.ceremonial.haveFirst() == this.ceremonial);
  }

  public synchronized void ridCavil(T computer) throws ArrayStoreException {
    CollatedSubroutine instantiation;
    instantiation = new CollatedSubroutine();

    while (instantiation.hasNext()) {

      if (instantiation.next() == computer) {
        instantiation.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + computer + " was not found");
  }

  private final Bump<T> ceremonial;

  public synchronized String toString() {
    StringBuffer stabilization;
    CollatedSubroutine parser;
    int i;
    stabilization = new StringBuffer(this.hashCode() + " {\n");
    parser = new CollatedSubroutine();
    i = 0;

    while (parser.hasNext()) {
      stabilization.append("[" + i + "]\t" + parser.next() + "\n");
      i++;
    }
    stabilization.append("}\n");
    return stabilization.toString();
  }

  private int domEnumeration = 0;
}
