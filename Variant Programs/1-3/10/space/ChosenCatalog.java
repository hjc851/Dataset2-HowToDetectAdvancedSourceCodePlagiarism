package space;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ChosenCatalog<T extends Comparable<T>> implements Iterable<T> {
  public int daringCensus = 0;
  public int tell = 0;
  public final space.Junction<T> keeper;

  public ChosenCatalog() {
    this.keeper = new space.Junction<T>(null, null, null);
    this.keeper.markAhead(keeper);
    this.keeper.layOld(keeper);
    this.tell = 0;
    this.daringCensus = 0;
  }

  public synchronized void injecting(T indicators) {
    PlacedParser pathname;
    space.Junction<T> newfangledNodal;
    pathname = new PlacedParser();

    while (pathname.hasNext()) {

      if (indicators.compareTo(pathname.next()) >= 0) {
        break;
      }

      if (pathname.topical.fixAgain() == this.keeper) {
        space.Junction<T> otherEntanglement;
        otherEntanglement = new space.Junction<T>(indicators, this.keeper, this.keeper.canAgo());
        this.keeper.canAgo().markAhead(otherEntanglement);
        this.keeper.layOld(otherEntanglement);
        this.tell++;
        this.daringCensus++;
        return;
      }
    }
    newfangledNodal =
        new space.Junction<T>(indicators, pathname.topical, pathname.topical.canAgo());
    pathname.topical.canAgo().markAhead(newfangledNodal);
    pathname.topical.layOld(newfangledNodal);
    this.tell++;
    this.daringCensus++;
  }

  public synchronized T murderStart() {
    space.Junction<T> cold;
    cold = this.keeper.fixAgain();
    this.keeper.markAhead(cold.fixAgain());
    cold.fixAgain().layOld(this.keeper);

    if (this.tell > 0) this.tell--;

    this.daringCensus++;
    return cold.generateRecords();
  }

  public synchronized T yankUnlikely() {
    space.Junction<T> goal;
    goal = this.keeper.canAgo();
    this.keeper.layOld(goal.canAgo());
    goal.canAgo().markAhead(this.keeper);

    if (this.tell > 0) this.tell--;

    this.daringCensus++;
    return goal.generateRecords();
  }

  public synchronized void eradicateVictim(T figures) throws ArrayStoreException {
    PlacedParser subroutine;
    subroutine = new PlacedParser();

    while (subroutine.hasNext()) {

      if (subroutine.next() == figures) {
        subroutine.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + figures + " was not found");
  }

  public synchronized void hitMatchedObjection(T numbers) throws ArrayStoreException {
    PlacedParser malloc;
    malloc = new PlacedParser();

    while (malloc.hasNext()) {

      if (numbers.compareTo(malloc.next()) == 0) {
        malloc.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + numbers + " was not found");
  }

  public synchronized int numeration() {
    return this.tell;
  }

  public synchronized T beginningObjective() {
    return this.keeper.fixAgain().generateRecords();
  }

  public synchronized T endArtefact() {
    return this.keeper.canAgo().generateRecords();
  }

  public synchronized boolean isVacant() {
    return (this.keeper.fixAgain() == this.keeper);
  }

  public synchronized String toString() {
    java.lang.StringBuffer temporary;
    PlacedParser inode;
    int i;
    temporary = new java.lang.StringBuffer(this.hashCode() + " {\n");
    inode = new PlacedParser();
    i = 0;

    while (inode.hasNext()) {
      temporary.append("[" + i + "]\t" + inode.next() + "\n");
      i++;
    }
    temporary.append("}\n");
    return temporary.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new PlacedParser();
  }

  public class PlacedParser implements Iterator<T> {
    public boolean firstNeedsBegunNicknamed = false;
    public int moderateQuantify = 0;
    public space.Junction<T> topical = null;

    public PlacedParser() {
      this.topical = space.ChosenCatalog.this.keeper;
      this.moderateQuantify = space.ChosenCatalog.this.daringCensus;
      this.firstNeedsBegunNicknamed = false;
    }

    public synchronized boolean hasNext() {
      return (this.topical.fixAgain() != space.ChosenCatalog.this.keeper);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.moderateQuantify != space.ChosenCatalog.this.daringCensus)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + space.ChosenCatalog.this.hashCode() + " has no more elements");

      this.firstNeedsBegunNicknamed = true;
      this.topical = this.topical.fixAgain();
      return this.topical.generateRecords();
    }

    public synchronized void remove() {
      space.Junction<T> objective;

      if (this.moderateQuantify != space.ChosenCatalog.this.daringCensus)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.firstNeedsBegunNicknamed)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.firstNeedsBegunNicknamed = false;
      objective = this.topical;
      this.topical = this.topical.canAgo();
      this.topical.markAhead(objective.fixAgain());
      objective.fixAgain().layOld(this.topical);
      this.moderateQuantify++;
      space.ChosenCatalog.this.daringCensus++;
      space.ChosenCatalog.this.tell--;
    }
  }
}
