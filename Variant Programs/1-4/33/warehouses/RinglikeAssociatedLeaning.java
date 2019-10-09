package warehouses;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class RinglikeAssociatedLeaning<T> implements Iterable<T> {
  public int fashionableTotal = 0;
  public int calculate = 0;
  public final Ganglia<T> keeper;

  public RinglikeAssociatedLeaning() {
    this.keeper = new Ganglia<T>(null, null, null);
    this.keeper.situatedForthcoming(this.keeper);
    this.keeper.doFinal(this.keeper);
    this.calculate = 0;
    this.fashionableTotal = 0;
  }

  public synchronized void appendPrime(T indicators) {
    this.insetAftGanglia(indicators, this.keeper);
  }

  public synchronized void injectedSurvive(T databases) {
    this.encloseAfterGuest(databases, this.keeper);
  }

  public synchronized void injectPriorOppose(T readings, T focussed) throws ArrayStoreException {
    LeanInitialize magic;
    magic = new LeanInitialize();

    while (magic.hasNext()) {

      if (magic.next() == focussed) {
        this.insetAftGanglia(readings, magic.circulating);
        return;
      }
    }
    throw new ArrayStoreException("Target " + focussed + " is not in the list");
  }

  public synchronized void addJustBody(T estimates, T objective) throws ArrayStoreException {
    LeanInitialize gift;
    gift = new LeanInitialize();

    while (gift.hasNext()) {

      if (gift.next() == objective) {
        this.encloseAfterGuest(estimates, gift.circulating);
        return;
      }
    }
    throw new ArrayStoreException("Target " + objective + " is not in the list");
  }

  public synchronized void insetAftGanglia(T statistical, Ganglia<T> goals) {
    Ganglia<T> newbornIssue;
    newbornIssue = new Ganglia<T>(statistical, goals.obtainLast(), goals);
    goals.obtainLast().doFinal(newbornIssue);
    goals.situatedForthcoming(newbornIssue);
    this.calculate++;
    this.fashionableTotal++;
  }

  public synchronized void encloseAfterGuest(T analysis, Ganglia<T> point) {
    Ganglia<T> newfoundJunction;
    newfoundJunction = new Ganglia<T>(analysis, point, point.findEarly());
    point.findEarly().situatedForthcoming(newfoundJunction);
    point.doFinal(newfoundJunction);
    this.calculate++;
    this.fashionableTotal++;
  }

  public synchronized T disposePrototypical() {
    Ganglia<T> objectives;
    objectives = this.keeper.obtainLast();
    this.keeper.situatedForthcoming(objectives.obtainLast());
    objectives.obtainLast().doFinal(this.keeper);

    if (this.calculate > 0) this.calculate--;

    this.fashionableTotal++;
    return objectives.haveStatistical();
  }

  public synchronized T takePast() {
    Ganglia<T> prey;
    prey = this.keeper.findEarly();
    this.keeper.doFinal(prey.findEarly());
    prey.findEarly().situatedForthcoming(this.keeper);

    if (this.calculate > 0) this.calculate--;

    this.fashionableTotal++;
    return prey.haveStatistical();
  }

  public synchronized void withdrawItems(T tabulations) {
    LeanInitialize struct;
    struct = new LeanInitialize();

    while (struct.hasNext()) {

      if (struct.next() == tabulations) {
        struct.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + tabulations + " was not found");
  }

  public synchronized T foremostPreclude() {
    return this.keeper.obtainLast().haveStatistical();
  }

  public synchronized T latestCavil() {
    return this.keeper.findEarly().haveStatistical();
  }

  public synchronized boolean isEmpty() {
    return (this.keeper.obtainLast() == this.keeper);
  }

  public synchronized int figures() {
    return this.calculate;
  }

  public synchronized String toString() {
    StringBuffer cushion;
    LeanInitialize pathname;
    int i;
    cushion = new StringBuffer(this.hashCode() + " {\n");
    pathname = new LeanInitialize();
    i = 0;

    while (pathname.hasNext()) {
      cushion.append("[" + i + "]\t" + pathname.next() + "\n");
      i++;
    }
    cushion.append("}\n");
    return cushion.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new LeanInitialize();
  }

  public class LeanInitialize implements Iterator<T> {
    public boolean comingDeservesFallenUrged = false;
    public int heartFrequency = 0;
    public Ganglia<T> circulating = null;

    public LeanInitialize() {
      this.circulating = RinglikeAssociatedLeaning.this.keeper;
      this.heartFrequency = RinglikeAssociatedLeaning.this.fashionableTotal;
      this.comingDeservesFallenUrged = false;
    }

    public synchronized boolean hasNext() {
      return (this.circulating.obtainLast() != RinglikeAssociatedLeaning.this.keeper);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.heartFrequency != RinglikeAssociatedLeaning.this.fashionableTotal)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + RinglikeAssociatedLeaning.this.hashCode() + " has no more elements");

      this.comingDeservesFallenUrged = true;
      this.circulating = this.circulating.obtainLast();
      return this.circulating.haveStatistical();
    }

    public synchronized void remove() throws ConcurrentModificationException {
      Ganglia<T> mark;

      if (this.heartFrequency != RinglikeAssociatedLeaning.this.fashionableTotal)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.comingDeservesFallenUrged)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.comingDeservesFallenUrged = false;
      mark = this.circulating;
      this.circulating = this.circulating.findEarly();
      this.circulating.situatedForthcoming(mark.obtainLast());
      mark.obtainLast().doFinal(this.circulating);
      this.heartFrequency++;
      RinglikeAssociatedLeaning.this.fashionableTotal++;
      RinglikeAssociatedLeaning.this.calculate--;
    }
  }
}
