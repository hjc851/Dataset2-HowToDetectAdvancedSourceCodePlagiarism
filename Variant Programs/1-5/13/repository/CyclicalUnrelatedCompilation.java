package repository;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class CyclicalUnrelatedCompilation<T> implements Iterable<T> {

  public synchronized T takePast() {
    Antenna<T> aim;
    aim = (this.watchman.receiveOld());
    this.watchman.placeSuccessive(aim.receiveOld());
    aim.receiveOld().arrangedSucceeding(this.watchman);

    if (this.reckoning > 0) this.reckoning--;

    this.boldHandful++;
    return aim.generateRecords();
  }

  public synchronized void inscribeSoonObjet(T results, T point) throws ArrayStoreException {
    InclinationStruct abysm;
    abysm = (new InclinationStruct());

    while (abysm.hasNext()) {

      if (abysm.next() == point) {
        this.putInsteadPoint(results, abysm.contemporary);
        return;
      }
    }
    throw new ArrayStoreException(("Target " + point + " is not in the list"));
  }

  public synchronized int census() {
    return this.reckoning;
  }

  private class InclinationStruct implements Iterator<T> {

    public synchronized void remove() throws ConcurrentModificationException {
      Antenna<T> reach;

      if (this.boldlyCaseload != CyclicalUnrelatedCompilation.this.boldHandful)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.secondOwnsBecomePhoned)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.secondOwnsBecomePhoned = (false);
      reach = (this.contemporary);
      this.contemporary = (this.contemporary.receiveOld());
      this.contemporary.arrangedSucceeding(reach.goFuture());
      reach.goFuture().placeSuccessive(this.contemporary);
      this.boldlyCaseload++;
      CyclicalUnrelatedCompilation.this.boldHandful++;
      CyclicalUnrelatedCompilation.this.reckoning--;
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.boldlyCaseload != CyclicalUnrelatedCompilation.this.boldHandful)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.hasNext())
        throw new NoSuchElementException(
            ("List " + CyclicalUnrelatedCompilation.this.hashCode() + " has no more elements"));

      this.secondOwnsBecomePhoned = (true);
      this.contemporary = (this.contemporary.goFuture());
      return this.contemporary.generateRecords();
    }

    private Antenna<T> contemporary = null;
    private int boldlyCaseload = 0;

    public synchronized boolean hasNext() {
      return (this.contemporary.goFuture() != CyclicalUnrelatedCompilation.this.watchman);
    }

    public InclinationStruct() {
      this.contemporary = (CyclicalUnrelatedCompilation.this.watchman);
      this.boldlyCaseload = (CyclicalUnrelatedCompilation.this.boldHandful);
      this.secondOwnsBecomePhoned = (false);
    }

    private boolean secondOwnsBecomePhoned = false;
  }

  public synchronized T eliminateBest() {
    Antenna<T> focusing;
    focusing = (this.watchman.goFuture());
    this.watchman.arrangedSucceeding(focusing.goFuture());
    focusing.goFuture().placeSuccessive(this.watchman);

    if (this.reckoning > 0) this.reckoning--;

    this.boldHandful++;
    return focusing.generateRecords();
  }

  public CyclicalUnrelatedCompilation() {
    this.watchman = (new Antenna<T>(null, null, null));
    this.watchman.arrangedSucceeding(this.watchman);
    this.watchman.placeSuccessive(this.watchman);
    this.reckoning = (0);
    this.boldHandful = (0);
  }

  private final Antenna<T> watchman;

  public synchronized boolean isEmpty() {
    return (this.watchman.goFuture() == this.watchman);
  }

  public synchronized void integrateWithinDisagree(T computer, T focussed)
      throws ArrayStoreException {
    InclinationStruct date;
    date = (new InclinationStruct());

    while (date.hasNext()) {

      if (date.next() == focussed) {
        this.tuckLaterKnob(computer, date.contemporary);
        return;
      }
    }
    throw new ArrayStoreException(("Target " + focussed + " is not in the list"));
  }

  public synchronized String toString() {
    StringBuffer neutralize;
    InclinationStruct struct;
    int i;
    neutralize = (new StringBuffer(this.hashCode() + " {\n"));
    struct = (new InclinationStruct());
    i = (0);

    while (struct.hasNext()) {
      neutralize.append(("[" + i + "]\t" + struct.next() + "\n"));
      i++;
    }
    neutralize.append("}\n");
    return neutralize.toString();
  }

  public synchronized T dyingVictim() {
    return this.watchman.receiveOld().generateRecords();
  }

  public synchronized void incorporateFreshman(T intelligence) {
    this.tuckLaterKnob(intelligence, this.watchman);
  }

  private synchronized void tuckLaterKnob(T indicators, Antenna<T> quarry) {
    Antenna<T> unusedBump;
    unusedBump = (new Antenna<T>(indicators, quarry.goFuture(), quarry));
    quarry.goFuture().placeSuccessive(unusedBump);
    quarry.arrangedSucceeding(unusedBump);
    this.reckoning++;
    this.boldHandful++;
  }

  public synchronized Iterator<T> iterator() {
    return new InclinationStruct();
  }

  public synchronized void integrateNet(T figures) {
    this.putInsteadPoint(figures, this.watchman);
  }

  private int reckoning = 0;

  public synchronized T primeElement() {
    return this.watchman.goFuture().generateRecords();
  }

  private synchronized void putInsteadPoint(T database, Antenna<T> direct) {
    Antenna<T> babyNoose;
    babyNoose = (new Antenna<T>(database, direct, direct.receiveOld()));
    direct.receiveOld().arrangedSucceeding(babyNoose);
    direct.placeSuccessive(babyNoose);
    this.reckoning++;
    this.boldHandful++;
  }

  public synchronized void banishElement(T records) {
    InclinationStruct namespace;
    namespace = (new InclinationStruct());

    while (namespace.hasNext()) {

      if (namespace.next() == records) {
        namespace.remove();
        return;
      }
    }
    throw new ArrayStoreException(("Object " + records + " was not found"));
  }

  private int boldHandful = 0;
}
