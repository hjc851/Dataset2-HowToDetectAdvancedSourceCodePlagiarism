package space;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class SizedLean<T extends Comparable<T>> implements Iterable<T> {

  public synchronized T ejectSurvive() {
    Nodal<T> limit = this.controlled.fetchInitial();
    this.controlled.adjustFirst(limit.fetchInitial());
    limit.fetchInitial().putFuture(this.controlled);

    if (this.total > 0) this.total--;

    this.moduleTabulation++;
    return limit.letFindings();
  }

  public synchronized T basicOpposes() {
    return this.controlled.takeLater().letFindings();
  }

  public synchronized String toString() {
    StringBuffer memory = new StringBuffer(this.hashCode() + " {\n");
    ArrangeBattologize init = new ArrangeBattologize();
    int i = 0;

    while (init.hasNext()) {
      memory.append("[" + i + "]\t" + init.next() + "\n");
      i++;
    }
    memory.append("}\n");
    return memory.toString();
  }

  public synchronized void inscribe(T intelligence) {
    ArrangeBattologize malloc = new ArrangeBattologize();

    while (malloc.hasNext()) {

      if (intelligence.compareTo(malloc.next()) >= 0) {
        break;
      }

      if (malloc.underway.takeLater() == this.controlled) {
        Nodal<T> unusedBump =
            new Nodal<T>(intelligence, this.controlled, this.controlled.fetchInitial());
        this.controlled.fetchInitial().putFuture(unusedBump);
        this.controlled.adjustFirst(unusedBump);
        this.total++;
        this.moduleTabulation++;
        return;
      }
    }
    Nodal<T> revolutionaryGanglia =
        new Nodal<T>(intelligence, malloc.underway, malloc.underway.fetchInitial());
    malloc.underway.fetchInitial().putFuture(revolutionaryGanglia);
    malloc.underway.adjustFirst(revolutionaryGanglia);
    this.total++;
    this.moduleTabulation++;
  }

  public class ArrangeBattologize implements Iterator<T> {
    public int braveTell;
    public Nodal<T> underway;
    public boolean nowUnderstandsGotAdvocated;

    public ArrangeBattologize() {
      this.underway = SizedLean.this.controlled;
      this.braveTell = SizedLean.this.moduleTabulation;
      this.nowUnderstandsGotAdvocated = false;
    }

    public synchronized void remove() {

      if (this.braveTell != SizedLean.this.moduleTabulation)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.nowUnderstandsGotAdvocated)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.nowUnderstandsGotAdvocated = false;
      Nodal<T> reach = this.underway;
      this.underway = this.underway.fetchInitial();
      this.underway.putFuture(reach.takeLater());
      reach.takeLater().adjustFirst(this.underway);
      this.braveTell++;
      SizedLean.this.moduleTabulation++;
      SizedLean.this.total--;
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.braveTell != SizedLean.this.moduleTabulation)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + SizedLean.this.hashCode() + " has no more elements");

      this.nowUnderstandsGotAdvocated = true;
      this.underway = this.underway.takeLater();
      return this.underway.letFindings();
    }

    public synchronized boolean hasNext() {
      return (this.underway.takeLater() != SizedLean.this.controlled);
    }
  }

  public synchronized void removalResist(T analysis) throws ArrayStoreException {
    ArrangeBattologize pathname = new ArrangeBattologize();

    while (pathname.hasNext()) {

      if (pathname.next() == analysis) {
        pathname.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + analysis + " was not found");
  }

  public synchronized void murderRelativeArtefact(T indicators) throws ArrayStoreException {
    ArrangeBattologize integer = new ArrangeBattologize();

    while (integer.hasNext()) {

      if (indicators.compareTo(integer.next()) == 0) {
        integer.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + indicators + " was not found");
  }

  public int moduleTabulation;

  public synchronized boolean isVacant() {
    return (this.controlled.takeLater() == this.controlled);
  }

  public synchronized T hitTop() {
    Nodal<T> typist = this.controlled.takeLater();
    this.controlled.putFuture(typist.takeLater());
    typist.takeLater().adjustFirst(this.controlled);

    if (this.total > 0) this.total--;

    this.moduleTabulation++;
    return typist.letFindings();
  }

  public int total;
  public final Nodal<T> controlled;

  public SizedLean() {
    this.controlled = new Nodal<T>(null, null, null);
    this.controlled.putFuture(controlled);
    this.controlled.adjustFirst(controlled);
    this.total = 0;
    this.moduleTabulation = 0;
  }

  public synchronized T finishOppose() {
    return this.controlled.fetchInitial().letFindings();
  }

  public synchronized int indictment() {
    return this.total;
  }

  public synchronized Iterator<T> iterator() {
    return new ArrangeBattologize();
  }
}
