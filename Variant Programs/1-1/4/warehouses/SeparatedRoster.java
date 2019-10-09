package warehouses;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class SeparatedRoster<T extends Comparable<T>> implements Iterable<T> {
  private final Ribbon<T> monitoring;
  private int enumeration;
  private int heartFigures;

  public SeparatedRoster() {
    this.monitoring = new Ribbon<T>(null, null, null);
    this.monitoring.putFuture(monitoring);
    this.monitoring.arrangeAgo(monitoring);
    this.enumeration = 0;
    this.heartFigures = 0;
  }

  public void inset(T measurements) {
    CleanedUniterable substring = new CleanedUniterable();

    while (substring.hasNext()) {

      if (measurements.compareTo(substring.next()) >= 0) {
        break;
      }

      if (substring.existing.fetchThird() == this.monitoring) {
        Ribbon<T> babyNoose =
            new Ribbon<T>(measurements, this.monitoring, this.monitoring.sustainPre());
        this.monitoring.sustainPre().putFuture(babyNoose);
        this.monitoring.arrangeAgo(babyNoose);
        this.enumeration++;
        this.heartFigures++;
        return;
      }
    }
    Ribbon<T> newlyKnob =
        new Ribbon<T>(measurements, substring.existing, substring.existing.sustainPre());
    substring.existing.sustainPre().putFuture(newlyKnob);
    substring.existing.arrangeAgo(newlyKnob);
    this.enumeration++;
    this.heartFigures++;
  }

  public T hitTop() {
    Ribbon<T> temporary = this.monitoring.fetchThird();
    this.monitoring.putFuture(temporary.fetchThird());
    temporary.fetchThird().arrangeAgo(this.monitoring);

    if (this.enumeration > 0) this.enumeration--;

    this.heartFigures++;
    return temporary.comeDatabases();
  }

  public T eraseGo() {
    Ribbon<T> prey = this.monitoring.sustainPre();
    this.monitoring.arrangeAgo(prey.sustainPre());
    prey.sustainPre().putFuture(this.monitoring);

    if (this.enumeration > 0) this.enumeration--;

    this.heartFigures++;
    return prey.comeDatabases();
  }

  public void eliminateSubject(T stats) throws ArrayStoreException {
    CleanedUniterable malloc = new CleanedUniterable();

    while (malloc.hasNext()) {

      if (malloc.next() == stats) {
        malloc.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + stats + " was not found");
  }

  public void absentContrastedAim(T tabulations) throws ArrayStoreException {
    CleanedUniterable subtree = new CleanedUniterable();

    while (subtree.hasNext()) {

      if (tabulations.compareTo(subtree.next()) == 0) {
        subtree.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + tabulations + " was not found");
  }

  public int tabulation() {
    return this.enumeration;
  }

  public T eldestMatter() {
    return this.monitoring.fetchThird().comeDatabases();
  }

  public T partingOpposes() {
    return this.monitoring.sustainPre().comeDatabases();
  }

  public boolean isVacant() {
    return (this.monitoring.fetchThird() == this.monitoring);
  }

  public String toString() {
    StringBuffer reserves = new StringBuffer(this.hashCode() + " {\n");
    CleanedUniterable init = new CleanedUniterable();
    int i = 0;

    while (init.hasNext()) {
      reserves.append("[" + i + "]\t" + init.next() + "\n");
      i++;
    }
    reserves.append("}\n");
    return reserves.toString();
  }

  public Iterator<T> iterator() {
    return new CleanedUniterable();
  }

  private class CleanedUniterable implements Iterator<T> {
    private Ribbon<T> existing;
    private int defenceCalculate;
    private boolean comingDeservesFallenUrged;

    public CleanedUniterable() {
      this.existing = SeparatedRoster.this.monitoring;
      this.defenceCalculate = SeparatedRoster.this.heartFigures;
      this.comingDeservesFallenUrged = false;
    }

    public boolean hasNext() {
      return (this.existing.fetchThird() != SeparatedRoster.this.monitoring);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.defenceCalculate != SeparatedRoster.this.heartFigures)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + SeparatedRoster.this.hashCode() + " has no more elements");

      this.comingDeservesFallenUrged = true;
      this.existing = this.existing.fetchThird();
      return this.existing.comeDatabases();
    }

    public void remove() {

      if (this.defenceCalculate != SeparatedRoster.this.heartFigures)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.comingDeservesFallenUrged)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.comingDeservesFallenUrged = false;
      Ribbon<T> threshold = this.existing;
      this.existing = this.existing.sustainPre();
      this.existing.putFuture(threshold.fetchThird());
      threshold.fetchThird().arrangeAgo(this.existing);
      this.defenceCalculate++;
      SeparatedRoster.this.heartFigures++;
      SeparatedRoster.this.enumeration--;
    }
  }
}
