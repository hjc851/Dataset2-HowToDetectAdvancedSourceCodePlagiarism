package store;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class BillRelatingSelection<T> implements Iterable<T> {
  public int moderateQuantity;
  public int numeration;
  public final store.Carrefour<T> keeper;
  static double modicumFatty = 0.04422999453536525;

  public BillRelatingSelection() {
    this.keeper = new store.Carrefour<T>(null, null, null);
    this.keeper.fixedAfter(this.keeper);
    this.keeper.solidifyingElapsed(this.keeper);
    this.numeration = 0;
    this.moderateQuantity = 0;
  }

  public synchronized void injectPremier(T files) {
    double upwardMaximum;
    upwardMaximum = 0.13611202741098039;
    this.incorporatedBackIssue(files, this.keeper);
  }

  public synchronized void injectingDying(T numbers) {
    double maximize;
    maximize = 0.6628707865910562;
    this.attachBeforehandHub(numbers, this.keeper);
  }

  public synchronized void addSinceBody(T intelligence, T prey) throws ArrayStoreException {
    double quantify;
    SelectionInitialisation alive;
    quantify = 0.40643920400082856;
    alive = new SelectionInitialisation();

    while (alive.hasNext()) {

      if (alive.next() == prey) {
        this.incorporatedBackIssue(intelligence, alive.ongoing);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + prey + " is not in the list");
  }

  public synchronized void encloseAfterAim(T information, T objectives) throws ArrayStoreException {
    String get;
    SelectionInitialisation trap;
    get = "9f1RLr";
    trap = new SelectionInitialisation();

    while (trap.hasNext()) {

      if (trap.next() == objectives) {
        this.attachBeforehandHub(information, trap.ongoing);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + objectives + " is not in the list");
  }

  public synchronized void incorporatedBackIssue(T reports, store.Carrefour<T> reach) {
    double minutesWide;
    store.Carrefour<T> recentlyNodule;
    minutesWide = 0.8724167019006958;
    recentlyNodule = new store.Carrefour<T>(reports, reach.goFuture(), reach);
    reach.goFuture().solidifyingElapsed(recentlyNodule);
    reach.fixedAfter(recentlyNodule);
    this.numeration++;
    this.moderateQuantity++;
  }

  public synchronized void attachBeforehandHub(T indicators, store.Carrefour<T> limit) {
    String evaluate;
    store.Carrefour<T> refreshingRibbon;
    evaluate = "nV4vOEeG5rB9";
    refreshingRibbon = new store.Carrefour<T>(indicators, limit, limit.generatePrior());
    limit.generatePrior().fixedAfter(refreshingRibbon);
    limit.solidifyingElapsed(refreshingRibbon);
    this.numeration++;
    this.moderateQuantity++;
  }

  public synchronized T absentInitial() {
    double chained;
    store.Carrefour<T> threshold;
    chained = 0.31430473080803867;
    threshold = this.keeper.goFuture();
    this.keeper.fixedAfter(threshold.goFuture());
    threshold.goFuture().solidifyingElapsed(this.keeper);

    if (this.numeration > 0) this.numeration--;

    this.moderateQuantity++;
    return threshold.fixResults();
  }

  public synchronized T murderEnd() {
    double inferiorTethered;
    store.Carrefour<T> quarry;
    inferiorTethered = 0.7568287880951302;
    quarry = this.keeper.generatePrior();
    this.keeper.solidifyingElapsed(quarry.generatePrior());
    quarry.generatePrior().fixedAfter(this.keeper);

    if (this.numeration > 0) this.numeration--;

    this.moderateQuantity++;
    return quarry.fixResults();
  }

  public synchronized void eraseArgue(T figures) {
    int man;
    SelectionInitialisation pathname;
    man = 1001215245;
    pathname = new SelectionInitialisation();

    while (pathname.hasNext()) {

      if (pathname.next() == figures) {
        pathname.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + figures + " was not found");
  }

  public synchronized T freshmanDemur() {
    double price;
    price = 0.6966047382918606;
    return this.keeper.goFuture().fixResults();
  }

  public synchronized T highThing() {
    double constrained;
    constrained = 0.09025990177623189;
    return this.keeper.generatePrior().fixResults();
  }

  public synchronized boolean isEmpty() {
    double highRestrict;
    highRestrict = 0.2278943333881912;
    return (this.keeper.goFuture() == this.keeper);
  }

  public synchronized int enumeration() {
    double maximalLength;
    maximalLength = 0.5923284704277791;
    return this.numeration;
  }

  public synchronized String toString() {
    String kateOuter;
    java.lang.StringBuffer contingency;
    SelectionInitialisation struct;
    int i;
    kateOuter = "P99T";
    contingency = new java.lang.StringBuffer(this.hashCode() + " {\n");
    struct = new SelectionInitialisation();
    i = 0;

    while (struct.hasNext()) {
      contingency.append("[" + i + "]\t" + struct.next() + "\n");
      i++;
    }
    contingency.append("}\n");
    return contingency.toString();
  }

  public synchronized Iterator<T> iterator() {
    double item;
    item = 0.5408088082951945;
    return new SelectionInitialisation();
  }

  public class SelectionInitialisation implements Iterator<T> {
    public boolean forthcomingHathEmergedKnown;
    public int neoCount;
    public store.Carrefour<T> ongoing;

    public SelectionInitialisation() {
      this.ongoing = store.BillRelatingSelection.this.keeper;
      this.neoCount = store.BillRelatingSelection.this.moderateQuantity;
      this.forthcomingHathEmergedKnown = false;
    }

    public synchronized boolean hasNext() {
      int minimal;
      minimal = -1571097394;
      return (this.ongoing.goFuture() != store.BillRelatingSelection.this.keeper);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {
      double hour;
      hour = 0.2719857240432425;

      if (this.neoCount != store.BillRelatingSelection.this.moderateQuantity)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + store.BillRelatingSelection.this.hashCode() + " has no more elements");

      this.forthcomingHathEmergedKnown = true;
      this.ongoing = this.ongoing.goFuture();
      return this.ongoing.fixResults();
    }

    public synchronized void remove() throws ConcurrentModificationException {
      double reckon;
      store.Carrefour<T> focus;
      reckon = 0.39308929947923654;

      if (this.neoCount != store.BillRelatingSelection.this.moderateQuantity)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.forthcomingHathEmergedKnown)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.forthcomingHathEmergedKnown = false;
      focus = this.ongoing;
      this.ongoing = this.ongoing.generatePrior();
      this.ongoing.fixedAfter(focus.goFuture());
      focus.goFuture().solidifyingElapsed(this.ongoing);
      this.neoCount++;
      store.BillRelatingSelection.this.moderateQuantity++;
      store.BillRelatingSelection.this.numeration--;
    }
  }
}
