package cache;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class AnnulatedAffiliatedPlaylist<T> implements Iterable<T> {
  private int moduleRoutine = 0;
  private int numeration = 0;
  private final cache.Ribbon<T> watch;

  public AnnulatedAffiliatedPlaylist() {
    this.watch = new cache.Ribbon<T>(null, null, null);
    this.watch.orderedAgain(this.watch);
    this.watch.prepareCurrent(this.watch);
    this.numeration = 0;
    this.moduleRoutine = 0;
  }

  public synchronized void putKickoff(T tabulations) {
    this.inscribeWhileRibbon(tabulations, this.watch);
  }

  public synchronized void inscribingHigh(T database) {
    this.injectedLateBump(database, this.watch);
  }

  public synchronized void infixFollowingArtefact(T findings, T aim) throws ArrayStoreException {
    ListingsInstantiation above;
    above = new ListingsInstantiation();

    while (above.hasNext()) {

      if (above.next() == aim) {
        this.inscribeWhileRibbon(findings, above.existing);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + aim + " is not in the list");
  }

  public synchronized void inscribingBackThing(T computer, T mark) throws ArrayStoreException {
    ListingsInstantiation abet;
    abet = new ListingsInstantiation();

    while (abet.hasNext()) {

      if (abet.next() == mark) {
        this.injectedLateBump(computer, abet.existing);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + mark + " is not in the list");
  }

  private synchronized void inscribeWhileRibbon(T figures, cache.Ribbon<T> butt) {
    cache.Ribbon<T> babyNoose;
    babyNoose = new cache.Ribbon<T>(figures, butt.beatThe(), butt);
    butt.beatThe().prepareCurrent(babyNoose);
    butt.orderedAgain(babyNoose);
    this.numeration++;
    this.moduleRoutine++;
  }

  private synchronized void injectedLateBump(T readings, cache.Ribbon<T> focus) {
    cache.Ribbon<T> unprecedentedNub;
    unprecedentedNub = new cache.Ribbon<T>(readings, focus, focus.canAgo());
    focus.canAgo().orderedAgain(unprecedentedNub);
    focus.prepareCurrent(unprecedentedNub);
    this.numeration++;
    this.moduleRoutine++;
  }

  public synchronized T murderStart() {
    cache.Ribbon<T> priority;
    priority = this.watch.beatThe();
    this.watch.orderedAgain(priority.beatThe());
    priority.beatThe().prepareCurrent(this.watch);

    if (this.numeration > 0) this.numeration--;

    this.moduleRoutine++;
    return priority.driveIntelligence();
  }

  public synchronized T removalFinally() {
    cache.Ribbon<T> achieve;
    achieve = this.watch.canAgo();
    this.watch.prepareCurrent(achieve.canAgo());
    achieve.canAgo().orderedAgain(this.watch);

    if (this.numeration > 0) this.numeration--;

    this.moduleRoutine++;
    return achieve.driveIntelligence();
  }

  public synchronized void absentAim(T survey) {
    ListingsInstantiation init;
    init = new ListingsInstantiation();

    while (init.hasNext()) {

      if (init.next() == survey) {
        init.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + survey + " was not found");
  }

  public synchronized T topObjection() {
    return this.watch.beatThe().driveIntelligence();
  }

  public synchronized T latterBody() {
    return this.watch.canAgo().driveIntelligence();
  }

  public synchronized boolean isEmpty() {
    return (this.watch.beatThe() == this.watch);
  }

  public synchronized int tally() {
    return this.numeration;
  }

  public synchronized String toString() {
    java.lang.StringBuffer cushion;
    ListingsInstantiation battologize;
    int i;
    cushion = new java.lang.StringBuffer(this.hashCode() + " {\n");
    battologize = new ListingsInstantiation();
    i = 0;

    while (battologize.hasNext()) {
      cushion.append("[" + i + "]\t" + battologize.next() + "\n");
      i++;
    }
    cushion.append("}\n");
    return cushion.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new ListingsInstantiation();
  }

  private class ListingsInstantiation implements Iterator<T> {
    private boolean earlyUsesAlwaysBrought = false;
    private int defencePercentage = 0;
    private cache.Ribbon<T> existing = null;

    public ListingsInstantiation() {
      this.existing = cache.AnnulatedAffiliatedPlaylist.this.watch;
      this.defencePercentage = cache.AnnulatedAffiliatedPlaylist.this.moduleRoutine;
      this.earlyUsesAlwaysBrought = false;
    }

    public synchronized boolean hasNext() {
      return (this.existing.beatThe() != cache.AnnulatedAffiliatedPlaylist.this.watch);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.defencePercentage != cache.AnnulatedAffiliatedPlaylist.this.moduleRoutine)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + cache.AnnulatedAffiliatedPlaylist.this.hashCode() + " has no more elements");

      this.earlyUsesAlwaysBrought = true;
      this.existing = this.existing.beatThe();
      return this.existing.driveIntelligence();
    }

    public synchronized void remove() throws ConcurrentModificationException {
      cache.Ribbon<T> direct;

      if (this.defencePercentage != cache.AnnulatedAffiliatedPlaylist.this.moduleRoutine)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.earlyUsesAlwaysBrought)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.earlyUsesAlwaysBrought = false;
      direct = this.existing;
      this.existing = this.existing.canAgo();
      this.existing.orderedAgain(direct.beatThe());
      direct.beatThe().prepareCurrent(this.existing);
      this.defencePercentage++;
      cache.AnnulatedAffiliatedPlaylist.this.moduleRoutine++;
      cache.AnnulatedAffiliatedPlaylist.this.numeration--;
    }
  }
}
