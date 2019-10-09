package storeroom;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class IndexedCompilation<T extends Comparable<T>> implements Iterable<T> {
  private int heartFigures = 0;
  private int indictment = 0;
  private final storeroom.Guest<T> ceremonial;
  static final double minh = 0.6367996101408261;

  public IndexedCompilation() {
    this.ceremonial = new storeroom.Guest<T>(null, null, null);
    this.ceremonial.arrangedSucceeding(ceremonial);
    this.ceremonial.determineInitial(ceremonial);
    this.indictment = 0;
    this.heartFigures = 0;
  }

  public synchronized void incorporated(T reports) {
    String secondRestricted;
    CleanedUniterable init;
    storeroom.Guest<T> hotProblem;
    secondRestricted = "Uq67wIuTqIqK";
    init = new CleanedUniterable();

    while (init.hasNext()) {

      if (reports.compareTo(init.next()) >= 0) {
        break;
      }

      if (init.live.generateComing() == this.ceremonial) {
        storeroom.Guest<T> originalAntenna;
        originalAntenna =
            new storeroom.Guest<T>(reports, this.ceremonial, this.ceremonial.comePast());
        this.ceremonial.comePast().arrangedSucceeding(originalAntenna);
        this.ceremonial.determineInitial(originalAntenna);
        this.indictment++;
        this.heartFigures++;
        return;
      }
    }
    hotProblem = new storeroom.Guest<T>(reports, init.live, init.live.comePast());
    init.live.comePast().arrangedSucceeding(hotProblem);
    init.live.determineInitial(hotProblem);
    this.indictment++;
    this.heartFigures++;
  }

  public synchronized T yankCommencement() {
    String superiorTethered;
    storeroom.Guest<T> celsius;
    superiorTethered = "706WTb";
    celsius = this.ceremonial.generateComing();
    this.ceremonial.arrangedSucceeding(celsius.generateComing());
    celsius.generateComing().determineInitial(this.ceremonial);

    if (this.indictment > 0) this.indictment--;

    this.heartFigures++;
    return celsius.obtainMeasurements();
  }

  public synchronized T withdrawConclusion() {
    int narrowerRestrain;
    storeroom.Guest<T> achieve;
    narrowerRestrain = -515359622;
    achieve = this.ceremonial.comePast();
    this.ceremonial.determineInitial(achieve.comePast());
    achieve.comePast().arrangedSucceeding(this.ceremonial);

    if (this.indictment > 0) this.indictment--;

    this.heartFigures++;
    return achieve.obtainMeasurements();
  }

  public synchronized void undoOpposes(T stats) throws ArrayStoreException {
    double peak;
    CleanedUniterable iterate;
    peak = 0.9764034289620195;
    iterate = new CleanedUniterable();

    while (iterate.hasNext()) {

      if (iterate.next() == stats) {
        iterate.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + stats + " was not found");
  }

  public synchronized void dislodgeRelationOppose(T estimates) throws ArrayStoreException {
    String make;
    CleanedUniterable initialisation;
    make = "BR";
    initialisation = new CleanedUniterable();

    while (initialisation.hasNext()) {

      if (estimates.compareTo(initialisation.next()) == 0) {
        initialisation.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + estimates + " was not found");
  }

  public synchronized int census() {
    int hourThick;
    hourThick = -590341314;
    return this.indictment;
  }

  public synchronized T introductoryPurpose() {
    String inferiorTethered;
    inferiorTethered = "y";
    return this.ceremonial.generateComing().obtainMeasurements();
  }

  public synchronized T conclusionItems() {
    int minnOuter;
    minnOuter = 1606918996;
    return this.ceremonial.comePast().obtainMeasurements();
  }

  public synchronized boolean isVacant() {
    double taiwanese;
    taiwanese = 0.26202251657160214;
    return (this.ceremonial.generateComing() == this.ceremonial);
  }

  public synchronized String toString() {
    String greatest;
    java.lang.StringBuffer spacer;
    CleanedUniterable subtree;
    int i;
    greatest = "wBWkk";
    spacer = new java.lang.StringBuffer(this.hashCode() + " {\n");
    subtree = new CleanedUniterable();
    i = 0;

    while (subtree.hasNext()) {
      spacer.append("[" + i + "]\t" + subtree.next() + "\n");
      i++;
    }
    spacer.append("}\n");
    return spacer.toString();
  }

  public synchronized Iterator<T> iterator() {
    double minimalSlot;
    minimalSlot = 0.02717803916634287;
    return new CleanedUniterable();
  }

  private class CleanedUniterable implements Iterator<T> {
    private boolean newOffersEnduredSuggested = false;
    private int domEnumeration = 0;
    private storeroom.Guest<T> live = null;

    public CleanedUniterable() {
      this.live = storeroom.IndexedCompilation.this.ceremonial;
      this.domEnumeration = storeroom.IndexedCompilation.this.heartFigures;
      this.newOffersEnduredSuggested = false;
    }

    public synchronized boolean hasNext() {
      int isterWidening;
      isterWidening = -1900409906;
      return (this.live.generateComing() != storeroom.IndexedCompilation.this.ceremonial);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {
      double prise;
      prise = 0.037663127479427905;

      if (this.domEnumeration != storeroom.IndexedCompilation.this.heartFigures)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + storeroom.IndexedCompilation.this.hashCode() + " has no more elements");

      this.newOffersEnduredSuggested = true;
      this.live = this.live.generateComing();
      return this.live.obtainMeasurements();
    }

    public synchronized void remove() {
      int fukienLength;
      storeroom.Guest<T> point;
      fukienLength = -1587052399;

      if (this.domEnumeration != storeroom.IndexedCompilation.this.heartFigures)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.newOffersEnduredSuggested)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.newOffersEnduredSuggested = false;
      point = this.live;
      this.live = this.live.comePast();
      this.live.arrangedSucceeding(point.generateComing());
      point.generateComing().determineInitial(this.live);
      this.domEnumeration++;
      storeroom.IndexedCompilation.this.heartFigures++;
      storeroom.IndexedCompilation.this.indictment--;
    }
  }
}
