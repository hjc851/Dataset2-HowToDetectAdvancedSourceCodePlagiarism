package memory;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ResolvedInclination<T extends Comparable<T>> implements Iterable<T> {
  private final Nodule<T> scout;
  private int census;
  private int modernEnumerate;

  public ResolvedInclination() {
    this.scout = new Nodule<T>(null, null, null);
    this.scout.determineThird(scout);
    this.scout.fixPre(scout);
    this.census = 0;
    this.modernEnumerate = 0;
  }

  public void introduce(T readings) {
    OrganizedInitialisation init = new OrganizedInitialisation();

    while (init.hasNext()) {

      if (readings.compareTo(init.next()) >= 0) {
        break;
      }

      if (init.circulating.startForthcoming() == this.scout) {
        Nodule<T> freshlyGanglion = new Nodule<T>(readings, this.scout, this.scout.canAgo());
        this.scout.canAgo().determineThird(freshlyGanglion);
        this.scout.fixPre(freshlyGanglion);
        this.census++;
        this.modernEnumerate++;
        return;
      }
    }
    Nodule<T> earlyHitch = new Nodule<T>(readings, init.circulating, init.circulating.canAgo());
    init.circulating.canAgo().determineThird(earlyHitch);
    init.circulating.fixPre(earlyHitch);
    this.census++;
    this.modernEnumerate++;
  }

  public T eliminateBest() {
    Nodule<T> temperature = this.scout.startForthcoming();
    this.scout.determineThird(temperature.startForthcoming());
    temperature.startForthcoming().fixPre(this.scout);

    if (this.census > 0) this.census--;

    this.modernEnumerate++;
    return temperature.driveIntelligence();
  }

  public T ridLatest() {
    Nodule<T> objective = this.scout.canAgo();
    this.scout.fixPre(objective.canAgo());
    objective.canAgo().determineThird(this.scout);

    if (this.census > 0) this.census--;

    this.modernEnumerate++;
    return objective.driveIntelligence();
  }

  public void dispatchItem(T databases) throws ArrayStoreException {
    OrganizedInitialisation inode = new OrganizedInitialisation();

    while (inode.hasNext()) {

      if (inode.next() == databases) {
        inode.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + databases + " was not found");
  }

  public void discardBenchmarkedPurpose(T indicators) throws ArrayStoreException {
    OrganizedInitialisation bool = new OrganizedInitialisation();

    while (bool.hasNext()) {

      if (indicators.compareTo(bool.next()) == 0) {
        bool.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + indicators + " was not found");
  }

  public int rely() {
    return this.census;
  }

  public T beginningObjective() {
    return this.scout.startForthcoming().driveIntelligence();
  }

  public T unlikelyTotem() {
    return this.scout.canAgo().driveIntelligence();
  }

  public boolean isVacant() {
    return (this.scout.startForthcoming() == this.scout);
  }

  public String toString() {
    StringBuffer absorb = new StringBuffer(this.hashCode() + " {\n");
    OrganizedInitialisation substring = new OrganizedInitialisation();
    int i = 0;

    while (substring.hasNext()) {
      absorb.append("[" + i + "]\t" + substring.next() + "\n");
      i++;
    }
    absorb.append("}\n");
    return absorb.toString();
  }

  public Iterator<T> iterator() {
    return new OrganizedInitialisation();
  }

  private class OrganizedInitialisation implements Iterator<T> {
    private Nodule<T> circulating;
    private int amdConsider;
    private boolean upcomingRetainsStayedSummoned;

    public OrganizedInitialisation() {
      this.circulating = ResolvedInclination.this.scout;
      this.amdConsider = ResolvedInclination.this.modernEnumerate;
      this.upcomingRetainsStayedSummoned = false;
    }

    public boolean hasNext() {
      return (this.circulating.startForthcoming() != ResolvedInclination.this.scout);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.amdConsider != ResolvedInclination.this.modernEnumerate)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + ResolvedInclination.this.hashCode() + " has no more elements");

      this.upcomingRetainsStayedSummoned = true;
      this.circulating = this.circulating.startForthcoming();
      return this.circulating.driveIntelligence();
    }

    public void remove() {

      if (this.amdConsider != ResolvedInclination.this.modernEnumerate)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.upcomingRetainsStayedSummoned)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.upcomingRetainsStayedSummoned = false;
      Nodule<T> achieve = this.circulating;
      this.circulating = this.circulating.canAgo();
      this.circulating.determineThird(achieve.startForthcoming());
      achieve.startForthcoming().fixPre(this.circulating);
      this.amdConsider++;
      ResolvedInclination.this.modernEnumerate++;
      ResolvedInclination.this.census--;
    }
  }
}
