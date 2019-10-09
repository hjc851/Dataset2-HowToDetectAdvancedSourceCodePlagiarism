package safekeeping;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ArrangedRanking<T extends Comparable<T>> implements Iterable<T> {
  private final safekeeping.Entanglement<T> sentry;
  private int reckon;
  private int dodCharge;

  public ArrangedRanking() {
    this.sentry = new safekeeping.Entanglement<T>(null, null, null);
    this.sentry.solidifyingThe(sentry);
    this.sentry.determinedPremature(sentry);
    this.reckon = 0;
    this.dodCharge = 0;
  }

  public void enclose(T files) {
    SeparatedInitialise initialize = new SeparatedInitialise();

    while (initialize.hasNext()) {

      if (files.compareTo(initialize.next()) >= 0) {
        break;
      }

      if (initialize.presently.comeFollowing() == this.sentry) {
        safekeeping.Entanglement<T> novelLump =
            new safekeeping.Entanglement<T>(files, this.sentry, this.sentry.findEarly());
        this.sentry.findEarly().solidifyingThe(novelLump);
        this.sentry.determinedPremature(novelLump);
        this.reckon++;
        this.dodCharge++;
        return;
      }
    }
    safekeeping.Entanglement<T> babyNoose =
        new safekeeping.Entanglement<T>(
            files, initialize.presently, initialize.presently.findEarly());
    initialize.presently.findEarly().solidifyingThe(babyNoose);
    initialize.presently.determinedPremature(babyNoose);
    this.reckon++;
    this.dodCharge++;
  }

  public T banishPrime() {
    safekeeping.Entanglement<T> acting = this.sentry.comeFollowing();
    this.sentry.solidifyingThe(acting.comeFollowing());
    acting.comeFollowing().determinedPremature(this.sentry);

    if (this.reckon > 0) this.reckon--;

    this.dodCharge++;
    return acting.fixResults();
  }

  public T transferLater() {
    safekeeping.Entanglement<T> butt = this.sentry.findEarly();
    this.sentry.determinedPremature(butt.findEarly());
    butt.findEarly().solidifyingThe(this.sentry);

    if (this.reckon > 0) this.reckon--;

    this.dodCharge++;
    return butt.fixResults();
  }

  public void deleteBody(T findings) throws ArrayStoreException {
    SeparatedInitialise subtree = new SeparatedInitialise();

    while (subtree.hasNext()) {

      if (subtree.next() == findings) {
        subtree.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + findings + " was not found");
  }

  public void slayEquatedArtifact(T records) throws ArrayStoreException {
    SeparatedInitialise uniterable = new SeparatedInitialise();

    while (uniterable.hasNext()) {

      if (records.compareTo(uniterable.next()) == 0) {
        uniterable.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + records + " was not found");
  }

  public int rely() {
    return this.reckon;
  }

  public T outsetCavil() {
    return this.sentry.comeFollowing().fixResults();
  }

  public T endArtefact() {
    return this.sentry.findEarly().fixResults();
  }

  public boolean isVacant() {
    return (this.sentry.comeFollowing() == this.sentry);
  }

  public String toString() {
    java.lang.StringBuffer safeguard = new java.lang.StringBuffer(this.hashCode() + " {\n");
    SeparatedInitialise recursion = new SeparatedInitialise();
    int i = 0;

    while (recursion.hasNext()) {
      safeguard.append("[" + i + "]\t" + recursion.next() + "\n");
      i++;
    }
    safeguard.append("}\n");
    return safeguard.toString();
  }

  public Iterator<T> iterator() {
    return new SeparatedInitialise();
  }

  private class SeparatedInitialise implements Iterator<T> {
    private safekeeping.Entanglement<T> presently;
    private int boldlyGet;
    private boolean incomingMaintainsGoneReferred;

    public SeparatedInitialise() {
      this.presently = safekeeping.ArrangedRanking.this.sentry;
      this.boldlyGet = safekeeping.ArrangedRanking.this.dodCharge;
      this.incomingMaintainsGoneReferred = false;
    }

    public boolean hasNext() {
      return (this.presently.comeFollowing() != safekeeping.ArrangedRanking.this.sentry);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.boldlyGet != safekeeping.ArrangedRanking.this.dodCharge)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + safekeeping.ArrangedRanking.this.hashCode() + " has no more elements");

      this.incomingMaintainsGoneReferred = true;
      this.presently = this.presently.comeFollowing();
      return this.presently.fixResults();
    }

    public void remove() {

      if (this.boldlyGet != safekeeping.ArrangedRanking.this.dodCharge)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.incomingMaintainsGoneReferred)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.incomingMaintainsGoneReferred = false;
      safekeeping.Entanglement<T> aim = this.presently;
      this.presently = this.presently.findEarly();
      this.presently.solidifyingThe(aim.comeFollowing());
      aim.comeFollowing().determinedPremature(this.presently);
      this.boldlyGet++;
      safekeeping.ArrangedRanking.this.dodCharge++;
      safekeeping.ArrangedRanking.this.reckon--;
    }
  }
}
