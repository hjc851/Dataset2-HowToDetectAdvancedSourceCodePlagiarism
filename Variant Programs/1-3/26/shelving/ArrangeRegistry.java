package shelving;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ArrangeRegistry<T extends Comparable<T>> implements Iterable<T> {

  public synchronized void slayEquatedArtifact(T analysis) throws ArrayStoreException {
    CategorizedRecursion struct;
    struct = new CategorizedRecursion();

    while (struct.hasNext()) {

      if (analysis.compareTo(struct.next()) == 0) {
        struct.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + analysis + " was not found");
  }

  public synchronized int reckon() {
    return this.census;
  }

  public synchronized String toString() {
    StringBuffer fender;
    CategorizedRecursion operand;
    int i;
    fender = new StringBuffer(this.hashCode() + " {\n");
    operand = new CategorizedRecursion();
    i = 0;

    while (operand.hasNext()) {
      fender.append("[" + i + "]\t" + operand.next() + "\n");
      i++;
    }
    fender.append("}\n");
    return fender.toString();
  }

  public synchronized T slayFinal() {
    Ganglion<T> mark;
    mark = this.watch.sustainPre();
    this.watch.determinedPremature(mark.sustainPre());
    mark.sustainPre().dictatedClose(this.watch);

    if (this.census > 0) this.census--;

    this.braveTell++;
    return mark.fetchTabulations();
  }

  public class CategorizedRecursion implements Iterator<T> {

    public synchronized boolean hasNext() {
      return (this.typical.catchUpcoming() != ArrangeRegistry.this.watch);
    }

    public CategorizedRecursion() {
      this.typical = ArrangeRegistry.this.watch;
      this.moduleTabulation = ArrangeRegistry.this.braveTell;
      this.lastBoastsRemainedLabeled = false;
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.moduleTabulation != ArrangeRegistry.this.braveTell)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + ArrangeRegistry.this.hashCode() + " has no more elements");

      this.lastBoastsRemainedLabeled = true;
      this.typical = this.typical.catchUpcoming();
      return this.typical.fetchTabulations();
    }

    public synchronized void remove() {
      Ganglion<T> quarry;

      if (this.moduleTabulation != ArrangeRegistry.this.braveTell)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.lastBoastsRemainedLabeled)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.lastBoastsRemainedLabeled = false;
      quarry = this.typical;
      this.typical = this.typical.sustainPre();
      this.typical.dictatedClose(quarry.catchUpcoming());
      quarry.catchUpcoming().determinedPremature(this.typical);
      this.moduleTabulation++;
      ArrangeRegistry.this.braveTell++;
      ArrangeRegistry.this.census--;
    }

    public boolean lastBoastsRemainedLabeled;
    public Ganglion<T> typical;
    public int moduleTabulation;
  }

  public synchronized T dismantleFreshman() {
    Ganglion<T> thermostat;
    thermostat = this.watch.catchUpcoming();
    this.watch.dictatedClose(thermostat.catchUpcoming());
    thermostat.catchUpcoming().determinedPremature(this.watch);

    if (this.census > 0) this.census--;

    this.braveTell++;
    return thermostat.fetchTabulations();
  }

  public ArrangeRegistry() {
    this.watch = new Ganglion<T>(null, null, null);
    this.watch.dictatedClose(watch);
    this.watch.determinedPremature(watch);
    this.census = 0;
    this.braveTell = 0;
  }

  public int braveTell;

  public synchronized void banishElement(T records) throws ArrayStoreException {
    CategorizedRecursion substring;
    substring = new CategorizedRecursion();

    while (substring.hasNext()) {

      if (substring.next() == records) {
        substring.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + records + " was not found");
  }

  public synchronized void embed(T study) {
    CategorizedRecursion initialize;
    Ganglion<T> recentlyNodule;
    initialize = new CategorizedRecursion();

    while (initialize.hasNext()) {

      if (study.compareTo(initialize.next()) >= 0) {
        break;
      }

      if (initialize.typical.catchUpcoming() == this.watch) {
        Ganglion<T> radicalProtuberance;
        radicalProtuberance = new Ganglion<T>(study, this.watch, this.watch.sustainPre());
        this.watch.sustainPre().dictatedClose(radicalProtuberance);
        this.watch.determinedPremature(radicalProtuberance);
        this.census++;
        this.braveTell++;
        return;
      }
    }
    recentlyNodule = new Ganglion<T>(study, initialize.typical, initialize.typical.sustainPre());
    initialize.typical.sustainPre().dictatedClose(recentlyNodule);
    initialize.typical.determinedPremature(recentlyNodule);
    this.census++;
    this.braveTell++;
  }

  public synchronized T topObjection() {
    return this.watch.catchUpcoming().fetchTabulations();
  }

  public int census;

  public synchronized T surviveMatter() {
    return this.watch.sustainPre().fetchTabulations();
  }

  public synchronized Iterator<T> iterator() {
    return new CategorizedRecursion();
  }

  public final Ganglion<T> watch;

  public synchronized boolean isVacant() {
    return (this.watch.catchUpcoming() == this.watch);
  }
}
