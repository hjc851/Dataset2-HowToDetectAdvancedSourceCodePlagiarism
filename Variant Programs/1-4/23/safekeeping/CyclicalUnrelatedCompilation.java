package safekeeping;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class CyclicalUnrelatedCompilation<T> implements Iterable<T> {
  private int boldHandful = 0;
  private int enumeration = 0;
  private final safekeeping.Issue<T> lookout;

  public CyclicalUnrelatedCompilation() {
    this.lookout = new safekeeping.Issue<T>(null, null, null);
    this.lookout.markAhead(this.lookout);
    this.lookout.situatedLatest(this.lookout);
    this.enumeration = 0;
    this.boldHandful = 0;
  }

  public synchronized void enterOpening(T statistical) {
    this.injectedWakeBump(statistical, this.lookout);
  }

  public synchronized void installSenior(T intelligence) {
    this.putInsteadPoint(intelligence, this.lookout);
  }

  public synchronized void pasteLateTotem(T indicators, T goals) throws ArrayStoreException {
    CompendiumInit abysm;
    abysm = new CompendiumInit();

    while (abysm.hasNext()) {

      if (abysm.next() == goals) {
        this.injectedWakeBump(indicators, abysm.circulating);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + goals + " is not in the list");
  }

  public synchronized void incloseUntilObjection(T records, T focused) throws ArrayStoreException {
    CompendiumInit wrap;
    wrap = new CompendiumInit();

    while (wrap.hasNext()) {

      if (wrap.next() == focused) {
        this.putInsteadPoint(records, wrap.circulating);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + focused + " is not in the list");
  }

  private synchronized void injectedWakeBump(T findings, safekeeping.Issue<T> reach) {
    safekeeping.Issue<T> newfangledNodal;
    newfangledNodal = new safekeeping.Issue<T>(findings, reach.makeAdjacent(), reach);
    reach.makeAdjacent().situatedLatest(newfangledNodal);
    reach.markAhead(newfangledNodal);
    this.enumeration++;
    this.boldHandful++;
  }

  private synchronized void putInsteadPoint(T numbers, safekeeping.Issue<T> focussed) {
    safekeeping.Issue<T> earlyHitch;
    earlyHitch = new safekeeping.Issue<T>(numbers, focussed, focussed.conveyPreliminary());
    focussed.conveyPreliminary().markAhead(earlyHitch);
    focussed.situatedLatest(earlyHitch);
    this.enumeration++;
    this.boldHandful++;
  }

  public synchronized T murderStart() {
    safekeeping.Issue<T> focus;
    focus = this.lookout.makeAdjacent();
    this.lookout.markAhead(focus.makeAdjacent());
    focus.makeAdjacent().situatedLatest(this.lookout);

    if (this.enumeration > 0) this.enumeration--;

    this.boldHandful++;
    return focus.generateRecords();
  }

  public synchronized T yankUnlikely() {
    safekeeping.Issue<T> limit;
    limit = this.lookout.conveyPreliminary();
    this.lookout.situatedLatest(limit.conveyPreliminary());
    limit.conveyPreliminary().markAhead(this.lookout);

    if (this.enumeration > 0) this.enumeration--;

    this.boldHandful++;
    return limit.generateRecords();
  }

  public synchronized void yankTotem(T analysis) {
    CompendiumInit bool;
    bool = new CompendiumInit();

    while (bool.hasNext()) {

      if (bool.next() == analysis) {
        bool.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + analysis + " was not found");
  }

  public synchronized T inauguralTarget() {
    return this.lookout.makeAdjacent().generateRecords();
  }

  public synchronized T worstItem() {
    return this.lookout.conveyPreliminary().generateRecords();
  }

  public synchronized boolean isEmpty() {
    return (this.lookout.makeAdjacent() == this.lookout);
  }

  public synchronized int rely() {
    return this.enumeration;
  }

  public synchronized String toString() {
    java.lang.StringBuffer protection;
    CompendiumInit battologize;
    int i;
    protection = new java.lang.StringBuffer(this.hashCode() + " {\n");
    battologize = new CompendiumInit();
    i = 0;

    while (battologize.hasNext()) {
      protection.append("[" + i + "]\t" + battologize.next() + "\n");
      i++;
    }
    protection.append("}\n");
    return protection.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new CompendiumInit();
  }

  private class CompendiumInit implements Iterator<T> {
    private boolean secondOwnsBecomePhoned = false;
    private int chicFigure = 0;
    private safekeeping.Issue<T> circulating = null;

    public CompendiumInit() {
      this.circulating = safekeeping.CyclicalUnrelatedCompilation.this.lookout;
      this.chicFigure = safekeeping.CyclicalUnrelatedCompilation.this.boldHandful;
      this.secondOwnsBecomePhoned = false;
    }

    public synchronized boolean hasNext() {
      return (this.circulating.makeAdjacent()
          != safekeeping.CyclicalUnrelatedCompilation.this.lookout);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.chicFigure != safekeeping.CyclicalUnrelatedCompilation.this.boldHandful)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List "
                + safekeeping.CyclicalUnrelatedCompilation.this.hashCode()
                + " has no more elements");

      this.secondOwnsBecomePhoned = true;
      this.circulating = this.circulating.makeAdjacent();
      return this.circulating.generateRecords();
    }

    public synchronized void remove() throws ConcurrentModificationException {
      safekeeping.Issue<T> pinpoint;

      if (this.chicFigure != safekeeping.CyclicalUnrelatedCompilation.this.boldHandful)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.secondOwnsBecomePhoned)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.secondOwnsBecomePhoned = false;
      pinpoint = this.circulating;
      this.circulating = this.circulating.conveyPreliminary();
      this.circulating.markAhead(pinpoint.makeAdjacent());
      pinpoint.makeAdjacent().situatedLatest(this.circulating);
      this.chicFigure++;
      safekeeping.CyclicalUnrelatedCompilation.this.boldHandful++;
      safekeeping.CyclicalUnrelatedCompilation.this.enumeration--;
    }
  }
}
