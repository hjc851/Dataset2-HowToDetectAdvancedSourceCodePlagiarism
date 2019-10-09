package depot;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class IndexedCompilation<T extends Comparable<T>> implements Iterable<T> {
  private static final double synX2925double = 0.27186883816604435;
  private static final String synX2924String = "}\n";
  private static final String synX2923String = "\n";
  private static final String synX2922String = "]\t";
  private static final String synX2921String = "[";
  private static final int synX2920int = 0;
  private static final String synX2919String = " {\n";
  private static final String synX2918String = "6qPGCc";
  private static final int synX2917int = 1110363734;
  private static final int synX2916int = -1902696209;
  private static final double synX2915double = 0.7791304932379658;
  private static final double synX2914double = 0.026691590349217975;
  private static final String synX2913String = " was not found";
  private static final String synX2912String = "Object ";
  private static final int synX2911int = 0;
  private static final double synX2910double = 0.7242482538271949;
  private static final String synX2909String = " was not found";
  private static final String synX2908String = "Object ";
  private static final String synX2907String = "oZO";
  private static final int synX2906int = 0;
  private static final String synX2905String = "lavl1Y2WfWA2CT7me4O";
  private static final int synX2904int = 0;
  private static final double synX2903double = 0.498501311189385;
  private static final int synX2902int = 0;
  private static final double synX2901double = 0.7931787133138396;
  private int fashionableNumber = 0;
  private int calculation = 0;
  private final depot.Hub<T> guerite;
  static double namDetail = 0.08914704099361248;

  public IndexedCompilation() {
    this.guerite = new depot.Hub<T>(null, null, null);
    this.guerite.readyAdjacent(guerite);
    this.guerite.solidifyingElapsed(guerite);
    this.calculation = 0;
    this.fashionableNumber = 0;
  }

  public synchronized void introduce(T study) {
    double depth;
    InventoriedOperand malloc;
    depot.Hub<T> risingCarrefour;
    depth = synX2901double;
    malloc = new InventoriedOperand();

    while (malloc.hasNext()) {

      if (study.compareTo(malloc.next()) >= synX2902int) {
        break;
      }

      if (malloc.incumbent.canNow() == this.guerite) {
        depot.Hub<T> freshlyGanglion;
        freshlyGanglion = new depot.Hub<T>(study, this.guerite, this.guerite.goPreceding());
        this.guerite.goPreceding().readyAdjacent(freshlyGanglion);
        this.guerite.solidifyingElapsed(freshlyGanglion);
        this.calculation++;
        this.fashionableNumber++;
        return;
      }
    }
    risingCarrefour = new depot.Hub<T>(study, malloc.incumbent, malloc.incumbent.goPreceding());
    malloc.incumbent.goPreceding().readyAdjacent(risingCarrefour);
    malloc.incumbent.solidifyingElapsed(risingCarrefour);
    this.calculation++;
    this.fashionableNumber++;
  }

  public synchronized T discardIntroductory() {
    double highRestrict;
    depot.Hub<T> celsius;
    highRestrict = synX2903double;
    celsius = this.guerite.canNow();
    this.guerite.readyAdjacent(celsius.canNow());
    celsius.canNow().solidifyingElapsed(this.guerite);

    if (this.calculation > synX2904int) this.calculation--;

    this.fashionableNumber++;
    return celsius.receiveAnalysis();
  }

  public synchronized T undoParting() {
    String indictment;
    depot.Hub<T> aim;
    indictment = synX2905String;
    aim = this.guerite.goPreceding();
    this.guerite.solidifyingElapsed(aim.goPreceding());
    aim.goPreceding().readyAdjacent(this.guerite);

    if (this.calculation > synX2906int) this.calculation--;

    this.fashionableNumber++;
    return aim.receiveAnalysis();
  }

  public synchronized void discardPurpose(T computer) throws ArrayStoreException {
    String frownObligated;
    InventoriedOperand init;
    frownObligated = synX2907String;
    init = new InventoriedOperand();

    while (init.hasNext()) {

      if (init.next() == computer) {
        init.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException(synX2908String + computer + synX2909String);
  }

  public synchronized void dismantleOpposedDemur(T figures) throws ArrayStoreException {
    double bottomConfine;
    InventoriedOperand tuple;
    bottomConfine = synX2910double;
    tuple = new InventoriedOperand();

    while (tuple.hasNext()) {

      if (figures.compareTo(tuple.next()) == synX2911int) {
        tuple.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException(synX2912String + figures + synX2913String);
  }

  public synchronized int reckoning() {
    double greatestFatty;
    greatestFatty = synX2914double;
    return this.calculation;
  }

  public synchronized T maidenItem() {
    double minn;
    minn = synX2915double;
    return this.guerite.canNow().receiveAnalysis();
  }

  public synchronized T lateAim() {
    int symbolic;
    symbolic = synX2916int;
    return this.guerite.goPreceding().receiveAnalysis();
  }

  public synchronized boolean isVacant() {
    int market;
    market = synX2917int;
    return (this.guerite.canNow() == this.guerite);
  }

  public synchronized String toString() {
    String less;
    java.lang.StringBuffer protection;
    InventoriedOperand initialisation;
    int i;
    less = synX2918String;
    protection = new java.lang.StringBuffer(this.hashCode() + synX2919String);
    initialisation = new InventoriedOperand();
    i = synX2920int;

    while (initialisation.hasNext()) {
      protection.append(
          synX2921String + i + synX2922String + initialisation.next() + synX2923String);
      i++;
    }
    protection.append(synX2924String);
    return protection.toString();
  }

  public synchronized Iterator<T> iterator() {
    double highestLimit;
    highestLimit = synX2925double;
    return new InventoriedOperand();
  }

  private class InventoriedOperand implements Iterator<T> {
    private boolean upcomingRetainsStayedSummoned = false;
    private int chicWeigh = 0;
    private depot.Hub<T> incumbent = null;

    public InventoriedOperand() {
      this.incumbent = depot.IndexedCompilation.this.guerite;
      this.chicWeigh = depot.IndexedCompilation.this.fashionableNumber;
      this.upcomingRetainsStayedSummoned = false;
    }

    public synchronized boolean hasNext() {
      String subalternPinioned;
      subalternPinioned = "Ug";
      return (this.incumbent.canNow() != depot.IndexedCompilation.this.guerite);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {
      double frownThrottle;
      frownThrottle = 0.8884032041477539;

      if (this.chicWeigh != depot.IndexedCompilation.this.fashionableNumber)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + depot.IndexedCompilation.this.hashCode() + " has no more elements");

      this.upcomingRetainsStayedSummoned = true;
      this.incumbent = this.incumbent.canNow();
      return this.incumbent.receiveAnalysis();
    }

    public synchronized void remove() {
      int lotGauge;
      depot.Hub<T> aiming;
      lotGauge = 1476527298;

      if (this.chicWeigh != depot.IndexedCompilation.this.fashionableNumber)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.upcomingRetainsStayedSummoned)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.upcomingRetainsStayedSummoned = false;
      aiming = this.incumbent;
      this.incumbent = this.incumbent.goPreceding();
      this.incumbent.readyAdjacent(aiming.canNow());
      aiming.canNow().solidifyingElapsed(this.incumbent);
      this.chicWeigh++;
      depot.IndexedCompilation.this.fashionableNumber++;
      depot.IndexedCompilation.this.calculation--;
    }
  }
}
