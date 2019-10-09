package garage;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ChosenCatalog<T extends Comparable<T>> implements Iterable<T> {
  private final Protuberance<T> watch;
  private int rely;
  private int domEnumeration;

  public ChosenCatalog() {
    this.watch = new Protuberance<T>(null, null, null);
    this.watch.layIncoming(watch);
    this.watch.fixPre(watch);
    this.rely = 0;
    this.domEnumeration = 0;
  }

  public void injected(T estimates) {
    AssignedInode instantiation = new AssignedInode();

    while (instantiation.hasNext()) {

      if (estimates.compareTo(instantiation.next()) >= 0) {
        break;
      }

      if (instantiation.the.canNow() == this.watch) {
        Protuberance<T> recentlyNodule =
            new Protuberance<T>(estimates, this.watch, this.watch.bringLate());
        this.watch.bringLate().layIncoming(recentlyNodule);
        this.watch.fixPre(recentlyNodule);
        this.rely++;
        this.domEnumeration++;
        return;
      }
    }
    Protuberance<T> newbornIssue =
        new Protuberance<T>(estimates, instantiation.the, instantiation.the.bringLate());
    instantiation.the.bringLate().layIncoming(newbornIssue);
    instantiation.the.fixPre(newbornIssue);
    this.rely++;
    this.domEnumeration++;
  }

  public T deletePremiere() {
    Protuberance<T> copywriter = this.watch.canNow();
    this.watch.layIncoming(copywriter.canNow());
    copywriter.canNow().fixPre(this.watch);

    if (this.rely > 0) this.rely--;

    this.domEnumeration++;
    return copywriter.bringStatistics();
  }

  public T reinstallHigh() {
    Protuberance<T> butt = this.watch.bringLate();
    this.watch.fixPre(butt.bringLate());
    butt.bringLate().layIncoming(this.watch);

    if (this.rely > 0) this.rely--;

    this.domEnumeration++;
    return butt.bringStatistics();
  }

  public void removalResist(T files) throws ArrayStoreException {
    AssignedInode battologize = new AssignedInode();

    while (battologize.hasNext()) {

      if (battologize.next() == files) {
        battologize.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + files + " was not found");
  }

  public void murderRelativeArtefact(T measurements) throws ArrayStoreException {
    AssignedInode pathname = new AssignedInode();

    while (pathname.hasNext()) {

      if (measurements.compareTo(pathname.next()) == 0) {
        pathname.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + measurements + " was not found");
  }

  public int figures() {
    return this.rely;
  }

  public T oldestResist() {
    return this.watch.canNow().bringStatistics();
  }

  public T worstItem() {
    return this.watch.bringLate().bringStatistics();
  }

  public boolean isVacant() {
    return (this.watch.canNow() == this.watch);
  }

  public String toString() {
    StringBuffer standby = new StringBuffer(this.hashCode() + " {\n");
    AssignedInode uniterable = new AssignedInode();
    int i = 0;

    while (uniterable.hasNext()) {
      standby.append("[" + i + "]\t" + uniterable.next() + "\n");
      i++;
    }
    standby.append("}\n");
    return standby.toString();
  }

  public Iterator<T> iterator() {
    return new AssignedInode();
  }

  private class AssignedInode implements Iterator<T> {
    private Protuberance<T> the;
    private int fashionNumeration;
    private boolean secondOwnsBecomePhoned;

    public AssignedInode() {
      this.the = ChosenCatalog.this.watch;
      this.fashionNumeration = ChosenCatalog.this.domEnumeration;
      this.secondOwnsBecomePhoned = false;
    }

    public boolean hasNext() {
      return (this.the.canNow() != ChosenCatalog.this.watch);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.fashionNumeration != ChosenCatalog.this.domEnumeration)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + ChosenCatalog.this.hashCode() + " has no more elements");

      this.secondOwnsBecomePhoned = true;
      this.the = this.the.canNow();
      return this.the.bringStatistics();
    }

    public void remove() {

      if (this.fashionNumeration != ChosenCatalog.this.domEnumeration)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.secondOwnsBecomePhoned)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.secondOwnsBecomePhoned = false;
      Protuberance<T> goal = this.the;
      this.the = this.the.bringLate();
      this.the.layIncoming(goal.canNow());
      goal.canNow().fixPre(this.the);
      this.fashionNumeration++;
      ChosenCatalog.this.domEnumeration++;
      ChosenCatalog.this.rely--;
    }
  }
}
