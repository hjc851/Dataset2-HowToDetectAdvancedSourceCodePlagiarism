package shelving;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ArrangeRegistry<T extends Comparable<T>> implements Iterable<T> {
  private final Junction<T> scout;
  private int total;
  private int modeMatter;

  public ArrangeRegistry() {
    this.scout = new Junction<T>(null, null, null);
    this.scout.fixThen(scout);
    this.scout.laidPast(scout);
    this.total = 0;
    this.modeMatter = 0;
  }

  public void tuck(T study) {
    CategorizedRecursion pathname = new CategorizedRecursion();

    while (pathname.hasNext()) {

      if (study.compareTo(pathname.next()) >= 0) {
        break;
      }

      if (pathname.prevailing.letAhead() == this.scout) {
        Junction<T> untriedHub = new Junction<T>(study, this.scout, this.scout.receiveOld());
        this.scout.receiveOld().fixThen(untriedHub);
        this.scout.laidPast(untriedHub);
        this.total++;
        this.modeMatter++;
        return;
      }
    }
    Junction<T> youngCore =
        new Junction<T>(study, pathname.prevailing, pathname.prevailing.receiveOld());
    pathname.prevailing.receiveOld().fixThen(youngCore);
    pathname.prevailing.laidPast(youngCore);
    this.total++;
    this.modeMatter++;
  }

  public T takeBeginning() {
    Junction<T> temporary = this.scout.letAhead();
    this.scout.fixThen(temporary.letAhead());
    temporary.letAhead().laidPast(this.scout);

    if (this.total > 0) this.total--;

    this.modeMatter++;
    return temporary.canNumbers();
  }

  public T reinstallHigh() {
    Junction<T> prey = this.scout.receiveOld();
    this.scout.laidPast(prey.receiveOld());
    prey.receiveOld().fixThen(this.scout);

    if (this.total > 0) this.total--;

    this.modeMatter++;
    return prey.canNumbers();
  }

  public void removalResist(T reports) throws ArrayStoreException {
    CategorizedRecursion tuple = new CategorizedRecursion();

    while (tuple.hasNext()) {

      if (tuple.next() == reports) {
        tuple.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + reports + " was not found");
  }

  public void absentContrastedAim(T numbers) throws ArrayStoreException {
    CategorizedRecursion init = new CategorizedRecursion();

    while (init.hasNext()) {

      if (numbers.compareTo(init.next()) == 0) {
        init.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + numbers + " was not found");
  }

  public int number() {
    return this.total;
  }

  public T basicOpposes() {
    return this.scout.letAhead().canNumbers();
  }

  public T partingOpposes() {
    return this.scout.receiveOld().canNumbers();
  }

  public boolean isVacant() {
    return (this.scout.letAhead() == this.scout);
  }

  public String toString() {
    StringBuffer absorber = new StringBuffer(this.hashCode() + " {\n");
    CategorizedRecursion recursion = new CategorizedRecursion();
    int i = 0;

    while (recursion.hasNext()) {
      absorber.append("[" + i + "]\t" + recursion.next() + "\n");
      i++;
    }
    absorber.append("}\n");
    return absorber.toString();
  }

  public Iterator<T> iterator() {
    return new CategorizedRecursion();
  }

  private class CategorizedRecursion implements Iterator<T> {
    private Junction<T> prevailing;
    private int domEnumeration;
    private boolean succeedingRemainsGottenTermed;

    public CategorizedRecursion() {
      this.prevailing = ArrangeRegistry.this.scout;
      this.domEnumeration = ArrangeRegistry.this.modeMatter;
      this.succeedingRemainsGottenTermed = false;
    }

    public boolean hasNext() {
      return (this.prevailing.letAhead() != ArrangeRegistry.this.scout);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.domEnumeration != ArrangeRegistry.this.modeMatter)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + ArrangeRegistry.this.hashCode() + " has no more elements");

      this.succeedingRemainsGottenTermed = true;
      this.prevailing = this.prevailing.letAhead();
      return this.prevailing.canNumbers();
    }

    public void remove() {

      if (this.domEnumeration != ArrangeRegistry.this.modeMatter)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.succeedingRemainsGottenTermed)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.succeedingRemainsGottenTermed = false;
      Junction<T> pinpoint = this.prevailing;
      this.prevailing = this.prevailing.receiveOld();
      this.prevailing.fixThen(pinpoint.letAhead());
      pinpoint.letAhead().laidPast(this.prevailing);
      this.domEnumeration++;
      ArrangeRegistry.this.modeMatter++;
      ArrangeRegistry.this.total--;
    }
  }
}
