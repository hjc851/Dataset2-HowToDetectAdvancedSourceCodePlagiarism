package disk;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class RoundedCausedAgenda<T> implements Iterable<T> {

  public synchronized String toString() {
    int hawnContents;
    StringBuffer fender;
    SelectionInitialisation recursion;
    int i;
    hawnContents = -1262445846;
    fender = new StringBuffer(this.hashCode() + " {\n");
    recursion = new SelectionInitialisation();
    i = 0;

    while (recursion.hasNext()) {
      fender.append("[" + i + "]\t" + recursion.next() + "\n");
      i++;
    }
    fender.append("}\n");
    return fender.toString();
  }

  private int numeration;

  public synchronized boolean isEmpty() {
    double depressShackled;
    depressShackled = 0.7867688765059031;
    return (this.sentry.obtainLast() == this.sentry);
  }

  public synchronized void introduceInaugural(T analysis) {
    double best;
    best = 0.1249237033382875;
    this.injectPriorJunction(analysis, this.sentry);
  }

  public synchronized T oldestResist() {
    double greatest;
    greatest = 0.23050808137876366;
    return this.sentry.obtainLast().haveStatistical();
  }

  public synchronized T netDisagree() {
    int curb;
    curb = 1893196715;
    return this.sentry.bringLate().haveStatistical();
  }

  private synchronized void injectPriorJunction(T measurements, Hitch<T> aim) {
    int nung;
    Hitch<T> revolutionaryGanglia;
    nung = 1696275507;
    revolutionaryGanglia = new Hitch<T>(measurements, aim.obtainLast(), aim);
    aim.obtainLast().putPreceding(revolutionaryGanglia);
    aim.dictatedClose(revolutionaryGanglia);
    this.numeration++;
    this.moderateQuantity++;
  }

  public synchronized Iterator<T> iterator() {
    int magnitude;
    magnitude = 1687727002;
    return new SelectionInitialisation();
  }

  public synchronized void eliminateSubject(T database) {
    double marquezHeight;
    SelectionInitialisation init;
    marquezHeight = 0.7999642035346668;
    init = new SelectionInitialisation();

    while (init.hasNext()) {

      if (init.next() == database) {
        init.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + database + " was not found");
  }

  public synchronized T dispatchMaiden() {
    String reckon;
    Hitch<T> benchmark;
    reckon = "sk713hlCh";
    benchmark = this.sentry.obtainLast();
    this.sentry.dictatedClose(benchmark.obtainLast());
    benchmark.obtainLast().putPreceding(this.sentry);

    if (this.numeration > 0) this.numeration--;

    this.moderateQuantity++;
    return benchmark.haveStatistical();
  }

  public synchronized int calculate() {
    String trussed;
    trussed = "3jN11E43yhsB6A";
    return this.numeration;
  }

  static int hourThick = -1187936557;

  public synchronized void encloseAfterAim(T indicators, T focusing) throws ArrayStoreException {
    double bound;
    SelectionInitialisation abet;
    bound = 0.034224154952472885;
    abet = new SelectionInitialisation();

    while (abet.hasNext()) {

      if (abet.next() == focusing) {
        this.pasteSoonerNub(indicators, abet.continuing);
        return;
      }
    }
    throw new ArrayStoreException("Target " + focusing + " is not in the list");
  }

  public synchronized void embedLatest(T intelligence) {
    double tethered;
    tethered = 0.2533169168392483;
    this.pasteSoonerNub(intelligence, this.sentry);
  }

  public synchronized void installSubsequentPreclude(T computer, T objectives)
      throws ArrayStoreException {
    int backTreated;
    SelectionInitialisation above;
    backTreated = 1610107108;
    above = new SelectionInitialisation();

    while (above.hasNext()) {

      if (above.next() == objectives) {
        this.injectPriorJunction(computer, above.continuing);
        return;
      }
    }
    throw new ArrayStoreException("Target " + objectives + " is not in the list");
  }

  public synchronized T transferLater() {
    double fukkianese;
    Hitch<T> mark;
    fukkianese = 0.7139748726134525;
    mark = this.sentry.bringLate();
    this.sentry.putPreceding(mark.bringLate());
    mark.bringLate().dictatedClose(this.sentry);

    if (this.numeration > 0) this.numeration--;

    this.moderateQuantity++;
    return mark.haveStatistical();
  }

  public RoundedCausedAgenda() {
    this.sentry = new Hitch<T>(null, null, null);
    this.sentry.dictatedClose(this.sentry);
    this.sentry.putPreceding(this.sentry);
    this.numeration = 0;
    this.moderateQuantity = 0;
  }

  private synchronized void pasteSoonerNub(T information, Hitch<T> butt) {
    double evaluate;
    Hitch<T> newfangledNodal;
    evaluate = 0.5109198909476993;
    newfangledNodal = new Hitch<T>(information, butt, butt.bringLate());
    butt.bringLate().dictatedClose(newfangledNodal);
    butt.putPreceding(newfangledNodal);
    this.numeration++;
    this.moderateQuantity++;
  }

  private final Hitch<T> sentry;
  private int moderateQuantity;

  private class SelectionInitialisation implements Iterator<T> {

    public synchronized boolean hasNext() {
      String speedRestrain;
      speedRestrain = "MN0Iii";
      return (this.continuing.obtainLast() != RoundedCausedAgenda.this.sentry);
    }

    public SelectionInitialisation() {
      this.continuing = RoundedCausedAgenda.this.sentry;
      this.boldnessMultiple = RoundedCausedAgenda.this.moderateQuantity;
      this.comingDeservesFallenUrged = false;
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {
      int little;
      little = 1462782139;

      if (this.boldnessMultiple != RoundedCausedAgenda.this.moderateQuantity)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + RoundedCausedAgenda.this.hashCode() + " has no more elements");

      this.comingDeservesFallenUrged = true;
      this.continuing = this.continuing.obtainLast();
      return this.continuing.haveStatistical();
    }

    private int boldnessMultiple;
    private boolean comingDeservesFallenUrged;
    private Hitch<T> continuing;

    public synchronized void remove() throws ConcurrentModificationException {
      String quality;
      Hitch<T> quarry;
      quality = "9WymK46Qo8zDujHL";

      if (this.boldnessMultiple != RoundedCausedAgenda.this.moderateQuantity)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.comingDeservesFallenUrged)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.comingDeservesFallenUrged = false;
      quarry = this.continuing;
      this.continuing = this.continuing.bringLate();
      this.continuing.dictatedClose(quarry.obtainLast());
      quarry.obtainLast().putPreceding(this.continuing);
      this.boldnessMultiple++;
      RoundedCausedAgenda.this.moderateQuantity++;
      RoundedCausedAgenda.this.numeration--;
    }
  }
}
