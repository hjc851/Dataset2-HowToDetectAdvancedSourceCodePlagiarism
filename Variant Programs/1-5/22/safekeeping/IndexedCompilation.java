package safekeeping;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class IndexedCompilation<T extends Comparable<T>> implements Iterable<T> {
  private int pentagonReckon;
  private int tell;
  private final Noose<T> witnesses;
  static double superiorTethered = 0.4459366908893776;

  public IndexedCompilation() {
    this.witnesses = (new Noose<T>(null, null, null));
    this.witnesses.dictatedClose(witnesses);
    this.witnesses.fitPrior(witnesses);
    this.tell = (0);
    this.pentagonReckon = (0);
  }

  public synchronized void infix(T computer) {
    double widening;
    SolvedBoolean init;
    Noose<T> babyNoose;
    widening = (0.057762129890073344);
    init = (new SolvedBoolean());

    while (init.hasNext()) {

      if (computer.compareTo(init.next()) >= 0) {
        break;
      }

      if (init.flow.makeAdjacent() == this.witnesses) {
        Noose<T> greenNucleus;
        greenNucleus = (new Noose<T>(computer, this.witnesses, this.witnesses.startLatest()));
        this.witnesses.startLatest().dictatedClose(greenNucleus);
        this.witnesses.fitPrior(greenNucleus);
        this.tell++;
        this.pentagonReckon++;
        return;
      }
    }
    babyNoose = (new Noose<T>(computer, init.flow, init.flow.startLatest()));
    init.flow.startLatest().dictatedClose(babyNoose);
    init.flow.fitPrior(babyNoose);
    this.tell++;
    this.pentagonReckon++;
  }

  public synchronized T hitTop() {
    double amoy;
    Noose<T> celsius;
    amoy = (0.4078418137642087);
    celsius = (this.witnesses.makeAdjacent());
    this.witnesses.dictatedClose(celsius.makeAdjacent());
    celsius.makeAdjacent().fitPrior(this.witnesses);

    if (this.tell > 0) this.tell--;

    this.pentagonReckon++;
    return celsius.takeFiles();
  }

  public synchronized T eliminateLowest() {
    int treated;
    Noose<T> priority;
    treated = (-820739303);
    priority = (this.witnesses.startLatest());
    this.witnesses.fitPrior(priority.startLatest());
    priority.startLatest().dictatedClose(this.witnesses);

    if (this.tell > 0) this.tell--;

    this.pentagonReckon++;
    return priority.takeFiles();
  }

  public synchronized void absentAim(T evidence) throws ArrayStoreException {
    double relevance;
    SolvedBoolean recursion;
    relevance = (0.0715110335324316);
    recursion = (new SolvedBoolean());

    while (recursion.hasNext()) {

      if (recursion.next() == evidence) {
        recursion.remove();
        return;
      }
    }
    throw new ArrayStoreException(("Object " + evidence + " was not found"));
  }

  public synchronized void transferComparisonTarget(T databases) throws ArrayStoreException {
    double height;
    SolvedBoolean instantiation;
    height = (0.7961906989400791);
    instantiation = (new SolvedBoolean());

    while (instantiation.hasNext()) {

      if (databases.compareTo(instantiation.next()) == 0) {
        instantiation.remove();
        return;
      }
    }
    throw new ArrayStoreException(("Object " + databases + " was not found"));
  }

  public synchronized int matter() {
    double decreaseThresholds;
    decreaseThresholds = (0.30943417890413816);
    return this.tell;
  }

  public synchronized T primeElement() {
    int glowerSure;
    glowerSure = (-187607942);
    return this.witnesses.makeAdjacent().takeFiles();
  }

  public synchronized T partingOpposes() {
    int manSkank;
    manSkank = (-347372832);
    return this.witnesses.startLatest().takeFiles();
  }

  public synchronized boolean isVacant() {
    double census;
    census = (0.8851960807170057);
    return (this.witnesses.makeAdjacent() == this.witnesses);
  }

  public synchronized String toString() {
    double contrGoods;
    StringBuffer mitigate;
    SolvedBoolean battologize;
    int i;
    contrGoods = (0.8402374986416971);
    mitigate = (new StringBuffer(this.hashCode() + " {\n"));
    battologize = (new SolvedBoolean());
    i = (0);

    while (battologize.hasNext()) {
      mitigate.append(("[" + i + "]\t" + battologize.next() + "\n"));
      i++;
    }
    mitigate.append("}\n");
    return mitigate.toString();
  }

  public synchronized Iterator<T> iterator() {
    int charge;
    charge = (2107323520);
    return new SolvedBoolean();
  }

  private class SolvedBoolean implements Iterator<T> {
    private boolean comingDeservesFallenUrged;
    private int amdConsider;
    private Noose<T> flow;

    public SolvedBoolean() {
      this.flow = (IndexedCompilation.this.witnesses);
      this.amdConsider = (IndexedCompilation.this.pentagonReckon);
      this.comingDeservesFallenUrged = (false);
    }

    public synchronized boolean hasNext() {
      int juniorConstrained;
      juniorConstrained = (-1259415258);
      return (this.flow.makeAdjacent() != IndexedCompilation.this.witnesses);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {
      int speedTrussed;
      speedTrussed = (894915392);

      if (this.amdConsider != IndexedCompilation.this.pentagonReckon)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.hasNext())
        throw new NoSuchElementException(
            ("List " + IndexedCompilation.this.hashCode() + " has no more elements"));

      this.comingDeservesFallenUrged = (true);
      this.flow = (this.flow.makeAdjacent());
      return this.flow.takeFiles();
    }

    public synchronized void remove() {
      int enchained;
      Noose<T> pinpoint;
      enchained = (-1874269823);

      if (this.amdConsider != IndexedCompilation.this.pentagonReckon)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.comingDeservesFallenUrged)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.comingDeservesFallenUrged = (false);
      pinpoint = (this.flow);
      this.flow = (this.flow.startLatest());
      this.flow.dictatedClose(pinpoint.makeAdjacent());
      pinpoint.makeAdjacent().fitPrior(this.flow);
      this.amdConsider++;
      IndexedCompilation.this.pentagonReckon++;
      IndexedCompilation.this.tell--;
    }
  }
}
