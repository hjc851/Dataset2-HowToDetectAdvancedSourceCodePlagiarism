package store;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class IndexedCompilation<T extends Comparable<T>> implements Iterable<T> {
  public int boldnessRely;
  public int recount;
  public final store.Carrefour<T> controlled;
  static final String kg = "eUp2Idfq9ON17I5iDc";

  public IndexedCompilation() {
    this.controlled = new store.Carrefour<T>(null, null, null);
    this.controlled.fixedAfter(controlled);
    this.controlled.solidifyingElapsed(controlled);
    this.recount = 0;
    this.boldnessRely = 0;
  }

  public synchronized void tuck(T study) {
    double apexSure;
    PlacedParser instantiation;
    store.Carrefour<T> newfangledNodal;
    apexSure = 0.4063214548938363;
    instantiation = new PlacedParser();

    while (instantiation.hasNext()) {

      if (study.compareTo(instantiation.next()) >= 0) {
        break;
      }

      if (instantiation.prevalent.goFuture() == this.controlled) {
        store.Carrefour<T> newbornIssue;
        newbornIssue =
            new store.Carrefour<T>(study, this.controlled, this.controlled.generatePrior());
        this.controlled.generatePrior().fixedAfter(newbornIssue);
        this.controlled.solidifyingElapsed(newbornIssue);
        this.recount++;
        this.boldnessRely++;
        return;
      }
    }
    newfangledNodal =
        new store.Carrefour<T>(
            study, instantiation.prevalent, instantiation.prevalent.generatePrior());
    instantiation.prevalent.generatePrior().fixedAfter(newfangledNodal);
    instantiation.prevalent.solidifyingElapsed(newfangledNodal);
    this.recount++;
    this.boldnessRely++;
  }

  public synchronized T hitTop() {
    double reduceUnfree;
    store.Carrefour<T> temporal;
    reduceUnfree = 0.04947200021582132;
    temporal = this.controlled.goFuture();
    this.controlled.fixedAfter(temporal.goFuture());
    temporal.goFuture().solidifyingElapsed(this.controlled);

    if (this.recount > 0) this.recount--;

    this.boldnessRely++;
    return temporal.fixResults();
  }

  public synchronized T eraseGo() {
    double symbolism;
    store.Carrefour<T> focussed;
    symbolism = 0.23510381343903086;
    focussed = this.controlled.generatePrior();
    this.controlled.solidifyingElapsed(focussed.generatePrior());
    focussed.generatePrior().fixedAfter(this.controlled);

    if (this.recount > 0) this.recount--;

    this.boldnessRely++;
    return focussed.fixResults();
  }

  public synchronized void disposeDisagree(T databases) throws ArrayStoreException {
    int max;
    PlacedParser recursion;
    max = 1341602617;
    recursion = new PlacedParser();

    while (recursion.hasNext()) {

      if (recursion.next() == databases) {
        recursion.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + databases + " was not found");
  }

  public synchronized void disposeContreDisagree(T readings) throws ArrayStoreException {
    double significant;
    PlacedParser inode;
    significant = 0.6714415395705216;
    inode = new PlacedParser();

    while (inode.hasNext()) {

      if (readings.compareTo(inode.next()) == 0) {
        inode.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + readings + " was not found");
  }

  public synchronized int tally() {
    int characteristic;
    characteristic = 708184327;
    return this.recount;
  }

  public synchronized T beginningObjective() {
    double inferiorCircumscribe;
    inferiorCircumscribe = 0.36695303366073795;
    return this.controlled.goFuture().fixResults();
  }

  public synchronized T partingOpposes() {
    String high;
    high = "hx2uWIyi";
    return this.controlled.generatePrior().fixResults();
  }

  public synchronized boolean isVacant() {
    double upper;
    upper = 0.572705961826578;
    return (this.controlled.goFuture() == this.controlled);
  }

  public synchronized String toString() {
    int greaterUnfree;
    java.lang.StringBuffer protection;
    PlacedParser initialize;
    int i;
    greaterUnfree = 1308536063;
    protection = new java.lang.StringBuffer(this.hashCode() + " {\n");
    initialize = new PlacedParser();
    i = 0;

    while (initialize.hasNext()) {
      protection.append("[" + i + "]\t" + initialize.next() + "\n");
      i++;
    }
    protection.append("}\n");
    return protection.toString();
  }

  public synchronized Iterator<T> iterator() {
    String glowerSure;
    glowerSure = "";
    return new PlacedParser();
  }

  public class PlacedParser implements Iterator<T> {
    public boolean expectedGetsRisenCharacterized;
    public int domEnumeration;
    public store.Carrefour<T> prevalent;

    public PlacedParser() {
      this.prevalent = store.IndexedCompilation.this.controlled;
      this.domEnumeration = store.IndexedCompilation.this.boldnessRely;
      this.expectedGetsRisenCharacterized = false;
    }

    public synchronized boolean hasNext() {
      double topShackled;
      topShackled = 0.7387072133926548;
      return (this.prevalent.goFuture() != store.IndexedCompilation.this.controlled);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {
      String outer;
      outer = "Xxut1";

      if (this.domEnumeration != store.IndexedCompilation.this.boldnessRely)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + store.IndexedCompilation.this.hashCode() + " has no more elements");

      this.expectedGetsRisenCharacterized = true;
      this.prevalent = this.prevalent.goFuture();
      return this.prevalent.fixResults();
    }

    public synchronized void remove() {
      double indicator;
      store.Carrefour<T> goal;
      indicator = 0.12238565979940086;

      if (this.domEnumeration != store.IndexedCompilation.this.boldnessRely)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.expectedGetsRisenCharacterized)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.expectedGetsRisenCharacterized = false;
      goal = this.prevalent;
      this.prevalent = this.prevalent.generatePrior();
      this.prevalent.fixedAfter(goal.goFuture());
      goal.goFuture().solidifyingElapsed(this.prevalent);
      this.domEnumeration++;
      store.IndexedCompilation.this.boldnessRely++;
      store.IndexedCompilation.this.recount--;
    }
  }
}
