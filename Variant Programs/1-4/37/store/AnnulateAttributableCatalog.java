package store;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class AnnulateAttributableCatalog<T> implements Iterable<T> {
  private int moduleRoutine;
  private int numbers;
  private final store.Lump<T> arbovirus;

  public AnnulateAttributableCatalog() {
    this.arbovirus = new store.Lump<T>(null, null, null);
    this.arbovirus.prepareSecond(this.arbovirus);
    this.arbovirus.laidPast(this.arbovirus);
    this.numbers = 0;
    this.moduleRoutine = 0;
  }

  public synchronized void tuckBeginning(T results) {
    this.putFromPoint(results, this.arbovirus);
  }

  public synchronized void incorporatedGo(T databases) {
    this.encloseAfterGuest(databases, this.arbovirus);
  }

  public synchronized void incorporatedBackArgue(T stats, T quarry) throws ArrayStoreException {
    SelectionInitialisation abysm;
    abysm = new SelectionInitialisation();

    while (abysm.hasNext()) {

      if (abysm.next() == quarry) {
        this.putFromPoint(stats, abysm.underway);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + quarry + " is not in the list");
  }

  public synchronized void injectWithoutOppose(T tabulations, T reach) throws ArrayStoreException {
    SelectionInitialisation abet;
    abet = new SelectionInitialisation();

    while (abet.hasNext()) {

      if (abet.next() == reach) {
        this.encloseAfterGuest(tabulations, abet.underway);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + reach + " is not in the list");
  }

  private synchronized void putFromPoint(T measurements, store.Lump<T> direct) {
    store.Lump<T> radicalProtuberance;
    radicalProtuberance = new store.Lump<T>(measurements, direct.fixAgain(), direct);
    direct.fixAgain().laidPast(radicalProtuberance);
    direct.prepareSecond(radicalProtuberance);
    this.numbers++;
    this.moduleRoutine++;
  }

  private synchronized void encloseAfterGuest(T computer, store.Lump<T> goal) {
    store.Lump<T> earlyHitch;
    earlyHitch = new store.Lump<T>(computer, goal, goal.bringLate());
    goal.bringLate().prepareSecond(earlyHitch);
    goal.laidPast(earlyHitch);
    this.numbers++;
    this.moduleRoutine++;
  }

  public synchronized T eraseFirstborn() {
    store.Lump<T> prey;
    prey = this.arbovirus.fixAgain();
    this.arbovirus.prepareSecond(prey.fixAgain());
    prey.fixAgain().laidPast(this.arbovirus);

    if (this.numbers > 0) this.numbers--;

    this.moduleRoutine++;
    return prey.developInfo();
  }

  public synchronized T takePast() {
    store.Lump<T> focused;
    focused = this.arbovirus.bringLate();
    this.arbovirus.laidPast(focused.bringLate());
    focused.bringLate().prepareSecond(this.arbovirus);

    if (this.numbers > 0) this.numbers--;

    this.moduleRoutine++;
    return focused.developInfo();
  }

  public synchronized void absentAim(T reports) {
    SelectionInitialisation pathname;
    pathname = new SelectionInitialisation();

    while (pathname.hasNext()) {

      if (pathname.next() == reports) {
        pathname.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + reports + " was not found");
  }

  public synchronized T introductoryPurpose() {
    return this.arbovirus.fixAgain().developInfo();
  }

  public synchronized T dyingVictim() {
    return this.arbovirus.bringLate().developInfo();
  }

  public synchronized boolean isEmpty() {
    return (this.arbovirus.fixAgain() == this.arbovirus);
  }

  public synchronized int reckoning() {
    return this.numbers;
  }

  public synchronized String toString() {
    java.lang.StringBuffer reserve;
    SelectionInitialisation parser;
    int i;
    reserve = new java.lang.StringBuffer(this.hashCode() + " {\n");
    parser = new SelectionInitialisation();
    i = 0;

    while (parser.hasNext()) {
      reserve.append("[" + i + "]\t" + parser.next() + "\n");
      i++;
    }
    reserve.append("}\n");
    return reserve.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new SelectionInitialisation();
  }

  private class SelectionInitialisation implements Iterator<T> {
    private boolean succeedingRemainsGottenTermed;
    private int boldlyCaseload;
    private store.Lump<T> underway;

    public SelectionInitialisation() {
      this.underway = store.AnnulateAttributableCatalog.this.arbovirus;
      this.boldlyCaseload = store.AnnulateAttributableCatalog.this.moduleRoutine;
      this.succeedingRemainsGottenTermed = false;
    }

    public synchronized boolean hasNext() {
      return (this.underway.fixAgain() != store.AnnulateAttributableCatalog.this.arbovirus);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.boldlyCaseload != store.AnnulateAttributableCatalog.this.moduleRoutine)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + store.AnnulateAttributableCatalog.this.hashCode() + " has no more elements");

      this.succeedingRemainsGottenTermed = true;
      this.underway = this.underway.fixAgain();
      return this.underway.developInfo();
    }

    public synchronized void remove() throws ConcurrentModificationException {
      store.Lump<T> goals;

      if (this.boldlyCaseload != store.AnnulateAttributableCatalog.this.moduleRoutine)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.succeedingRemainsGottenTermed)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.succeedingRemainsGottenTermed = false;
      goals = this.underway;
      this.underway = this.underway.bringLate();
      this.underway.prepareSecond(goals.fixAgain());
      goals.fixAgain().laidPast(this.underway);
      this.boldlyCaseload++;
      store.AnnulateAttributableCatalog.this.moduleRoutine++;
      store.AnnulateAttributableCatalog.this.numbers--;
    }
  }
}
