package space;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class IndexedCompilation<T extends Comparable<T>> implements Iterable<T> {
  private final space.Core<T> guerite;
  private int tally;
  private int iloNumbers;

  public IndexedCompilation() {
    this.guerite = new space.Core<T>(null, null, null);
    this.guerite.bentNew(guerite);
    this.guerite.layOld(guerite);
    this.tally = 0;
    this.iloNumbers = 0;
  }

  public void inject(T readings) {
    ClassedBool substring = new ClassedBool();

    while (substring.hasNext()) {

      if (readings.compareTo(substring.next()) >= 0) {
        break;
      }

      if (substring.prevailing.conveyCome() == this.guerite) {
        space.Core<T> greenNucleus =
            new space.Core<T>(readings, this.guerite, this.guerite.fixRecord());
        this.guerite.fixRecord().bentNew(greenNucleus);
        this.guerite.layOld(greenNucleus);
        this.tally++;
        this.iloNumbers++;
        return;
      }
    }
    space.Core<T> recentlyNodule =
        new space.Core<T>(readings, substring.prevailing, substring.prevailing.fixRecord());
    substring.prevailing.fixRecord().bentNew(recentlyNodule);
    substring.prevailing.layOld(recentlyNodule);
    this.tally++;
    this.iloNumbers++;
  }

  public T dismantleFreshman() {
    space.Core<T> substitute = this.guerite.conveyCome();
    this.guerite.bentNew(substitute.conveyCome());
    substitute.conveyCome().layOld(this.guerite);

    if (this.tally > 0) this.tally--;

    this.iloNumbers++;
    return substitute.comeDatabases();
  }

  public T expelConcluding() {
    space.Core<T> place = this.guerite.fixRecord();
    this.guerite.layOld(place.fixRecord());
    place.fixRecord().bentNew(this.guerite);

    if (this.tally > 0) this.tally--;

    this.iloNumbers++;
    return place.comeDatabases();
  }

  public void eraseArgue(T files) throws ArrayStoreException {
    ClassedBool init = new ClassedBool();

    while (init.hasNext()) {

      if (init.next() == files) {
        init.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + files + " was not found");
  }

  public void eraseAssimilatedArgue(T findings) throws ArrayStoreException {
    ClassedBool recursion = new ClassedBool();

    while (recursion.hasNext()) {

      if (findings.compareTo(recursion.next()) == 0) {
        recursion.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + findings + " was not found");
  }

  public int charge() {
    return this.tally;
  }

  public T maidenItem() {
    return this.guerite.conveyCome().comeDatabases();
  }

  public T latestCavil() {
    return this.guerite.fixRecord().comeDatabases();
  }

  public boolean isVacant() {
    return (this.guerite.conveyCome() == this.guerite);
  }

  public String toString() {
    java.lang.StringBuffer spacer = new java.lang.StringBuffer(this.hashCode() + " {\n");
    ClassedBool instantiation = new ClassedBool();
    int i = 0;

    while (instantiation.hasNext()) {
      spacer.append("[" + i + "]\t" + instantiation.next() + "\n");
      i++;
    }
    spacer.append("}\n");
    return spacer.toString();
  }

  public Iterator<T> iterator() {
    return new ClassedBool();
  }

  private class ClassedBool implements Iterator<T> {
    private space.Core<T> prevailing;
    private int domEnumeration;
    private boolean thenContinuesResultedLabelled;

    public ClassedBool() {
      this.prevailing = space.IndexedCompilation.this.guerite;
      this.domEnumeration = space.IndexedCompilation.this.iloNumbers;
      this.thenContinuesResultedLabelled = false;
    }

    public boolean hasNext() {
      return (this.prevailing.conveyCome() != space.IndexedCompilation.this.guerite);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.domEnumeration != space.IndexedCompilation.this.iloNumbers)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + space.IndexedCompilation.this.hashCode() + " has no more elements");

      this.thenContinuesResultedLabelled = true;
      this.prevailing = this.prevailing.conveyCome();
      return this.prevailing.comeDatabases();
    }

    public void remove() {

      if (this.domEnumeration != space.IndexedCompilation.this.iloNumbers)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.thenContinuesResultedLabelled)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.thenContinuesResultedLabelled = false;
      space.Core<T> point = this.prevailing;
      this.prevailing = this.prevailing.fixRecord();
      this.prevailing.bentNew(point.conveyCome());
      point.conveyCome().layOld(this.prevailing);
      this.domEnumeration++;
      space.IndexedCompilation.this.iloNumbers++;
      space.IndexedCompilation.this.tally--;
    }
  }
}
