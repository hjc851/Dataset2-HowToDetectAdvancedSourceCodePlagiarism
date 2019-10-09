package storing;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class RingedInfluencedRoster<T> implements Iterable<T> {
  public int defencePercentage;
  public int charge;
  public final Problem<T> scout;
  static double secondLeap = 0.33973603443329803;

  public RingedInfluencedRoster() {
    this.scout = new Problem<T>(null, null, null);
    this.scout.markAhead(this.scout);
    this.scout.fixedPredecessor(this.scout);
    this.charge = 0;
    this.defencePercentage = 0;
  }

  public synchronized void introduceInaugural(T reports) {
    String chthonianConfine;
    chthonianConfine = "uQDqZFGnzwr8gay8";
    this.embedDuringScn(reports, this.scout);
  }

  public synchronized void attachLowest(T measurements) {
    int surname;
    surname = 914480713;
    this.embeddedUnlessLump(measurements, this.scout);
  }

  public synchronized void insertionWhenResist(T stats, T objective) throws ArrayStoreException {
    double northRestriction;
    CompendiumInit abet;
    northRestriction = 0.5269952698148319;
    abet = new CompendiumInit();

    while (abet.hasNext()) {

      if (abet.next() == objective) {
        this.embedDuringScn(stats, abet.incumbent);
        return;
      }
    }
    throw new ArrayStoreException("Target " + objective + " is not in the list");
  }

  public synchronized void introduceAheadTarget(T survey, T focused) throws ArrayStoreException {
    int rolled;
    CompendiumInit magic;
    rolled = -523434649;
    magic = new CompendiumInit();

    while (magic.hasNext()) {

      if (magic.next() == focused) {
        this.embeddedUnlessLump(survey, magic.incumbent);
        return;
      }
    }
    throw new ArrayStoreException("Target " + focused + " is not in the list");
  }

  public synchronized void embedDuringScn(T results, Problem<T> threshold) {
    int manSkank;
    Problem<T> newfoundJunction;
    manSkank = -679330827;
    newfoundJunction = new Problem<T>(results, threshold.startForthcoming(), threshold);
    threshold.startForthcoming().fixedPredecessor(newfoundJunction);
    threshold.markAhead(newfoundJunction);
    this.charge++;
    this.defencePercentage++;
  }

  public synchronized void embeddedUnlessLump(T computer, Problem<T> benchmark) {
    double operative;
    Problem<T> revolutionaryGanglia;
    operative = 0.702069065524849;
    revolutionaryGanglia = new Problem<T>(computer, benchmark, benchmark.startLatest());
    benchmark.startLatest().markAhead(revolutionaryGanglia);
    benchmark.fixedPredecessor(revolutionaryGanglia);
    this.charge++;
    this.defencePercentage++;
  }

  public synchronized T eraseFirstborn() {
    double calculate;
    Problem<T> mark;
    calculate = 0.3494129573032164;
    mark = this.scout.startForthcoming();
    this.scout.markAhead(mark.startForthcoming());
    mark.startForthcoming().fixedPredecessor(this.scout);

    if (this.charge > 0) this.charge--;

    this.defencePercentage++;
    return mark.fixResults();
  }

  public synchronized T discardClosing() {
    String peak;
    Problem<T> focus;
    peak = "vpmzC9n2KR";
    focus = this.scout.startLatest();
    this.scout.fixedPredecessor(focus.startLatest());
    focus.startLatest().markAhead(this.scout);

    if (this.charge > 0) this.charge--;

    this.defencePercentage++;
    return focus.fixResults();
  }

  public synchronized void eliminateSubject(T records) {
    double maximalLength;
    CompendiumInit operand;
    maximalLength = 0.932912429463236;
    operand = new CompendiumInit();

    while (operand.hasNext()) {

      if (operand.next() == records) {
        operand.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + records + " was not found");
  }

  public synchronized T startArtefact() {
    double destined;
    destined = 0.6112963167778335;
    return this.scout.startForthcoming().fixResults();
  }

  public synchronized T finishOppose() {
    int appoint;
    appoint = 1757805723;
    return this.scout.startLatest().fixResults();
  }

  public synchronized boolean isEmpty() {
    double contrGoods;
    contrGoods = 0.27499090995611086;
    return (this.scout.startForthcoming() == this.scout);
  }

  public synchronized int tally() {
    double ids;
    ids = 0.2565672847975954;
    return this.charge;
  }

  public synchronized String toString() {
    String essential;
    StringBuffer mitigate;
    CompendiumInit struct;
    int i;
    essential = "981x4kmnVNQEq00Heu";
    mitigate = new StringBuffer(this.hashCode() + " {\n");
    struct = new CompendiumInit();
    i = 0;

    while (struct.hasNext()) {
      mitigate.append("[" + i + "]\t" + struct.next() + "\n");
      i++;
    }
    mitigate.append("}\n");
    return mitigate.toString();
  }

  public synchronized Iterator<T> iterator() {
    String fukkianese;
    fukkianese = "hS4KE2FNuzYaBP";
    return new CompendiumInit();
  }

  public class CompendiumInit implements Iterator<T> {
    public boolean againOwesArisenChristened;
    public int boldnessMultiple;
    public Problem<T> incumbent;

    public CompendiumInit() {
      this.incumbent = RingedInfluencedRoster.this.scout;
      this.boldnessMultiple = RingedInfluencedRoster.this.defencePercentage;
      this.againOwesArisenChristened = false;
    }

    public synchronized boolean hasNext() {
      String curveGauge;
      curveGauge = "X";
      return (this.incumbent.startForthcoming() != RingedInfluencedRoster.this.scout);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {
      int cardinal;
      cardinal = 2138391239;

      if (this.boldnessMultiple != RingedInfluencedRoster.this.defencePercentage)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + RingedInfluencedRoster.this.hashCode() + " has no more elements");

      this.againOwesArisenChristened = true;
      this.incumbent = this.incumbent.startForthcoming();
      return this.incumbent.fixResults();
    }

    public synchronized void remove() throws ConcurrentModificationException {
      double upper;
      Problem<T> pinpoint;
      upper = 0.06160699741882869;

      if (this.boldnessMultiple != RingedInfluencedRoster.this.defencePercentage)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.againOwesArisenChristened)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.againOwesArisenChristened = false;
      pinpoint = this.incumbent;
      this.incumbent = this.incumbent.startLatest();
      this.incumbent.markAhead(pinpoint.startForthcoming());
      pinpoint.startForthcoming().fixedPredecessor(this.incumbent);
      this.boldnessMultiple++;
      RingedInfluencedRoster.this.defencePercentage++;
      RingedInfluencedRoster.this.charge--;
    }
  }
}
