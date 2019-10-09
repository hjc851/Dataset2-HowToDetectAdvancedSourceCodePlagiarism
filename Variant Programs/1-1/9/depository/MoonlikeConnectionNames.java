package depository;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class MoonlikeConnectionNames<T> implements Iterable<T> {
  private final Junction<T> control;
  private int calculate;
  private int boldHandful;

  public MoonlikeConnectionNames() {
    this.control = new Junction<T>(null, null, null);
    this.control.readyAdjacent(this.control);
    this.control.arrangeAgo(this.control);
    this.calculate = 0;
    this.boldHandful = 0;
  }

  public void embedOutset(T records) {
    this.pasteLateNub(records, this.control);
  }

  public void incorporatedGo(T evidence) {
    this.insertionLastGanglion(evidence, this.control);
  }

  public void injectingUntilVictim(T database, T pinpoint) throws ArrayStoreException {
    DocketNamespace prove = new DocketNamespace();

    while (prove.hasNext()) {

      if (prove.next() == pinpoint) {
        this.pasteLateNub(database, prove.existing);
        return;
      }
    }
    throw new ArrayStoreException("Target " + pinpoint + " is not in the list");
  }

  public void incloseUntilObjection(T statistical, T limit) throws ArrayStoreException {
    DocketNamespace deal = new DocketNamespace();

    while (deal.hasNext()) {

      if (deal.next() == limit) {
        this.insertionLastGanglion(statistical, deal.existing);
        return;
      }
    }
    throw new ArrayStoreException("Target " + limit + " is not in the list");
  }

  private void pasteLateNub(T analysis, Junction<T> aim) {
    Junction<T> radicalProtuberance = new Junction<T>(analysis, aim.goFuture(), aim);
    aim.goFuture().arrangeAgo(radicalProtuberance);
    aim.readyAdjacent(radicalProtuberance);
    this.calculate++;
    this.boldHandful++;
  }

  private void insertionLastGanglion(T reports, Junction<T> focus) {
    Junction<T> freshlyGanglion = new Junction<T>(reports, focus, focus.takeEarlier());
    focus.takeEarlier().readyAdjacent(freshlyGanglion);
    focus.arrangeAgo(freshlyGanglion);
    this.calculate++;
    this.boldHandful++;
  }

  public T hitTop() {
    Junction<T> goals = this.control.goFuture();
    this.control.readyAdjacent(goals.goFuture());
    goals.goFuture().arrangeAgo(this.control);

    if (this.calculate > 0) this.calculate--;

    this.boldHandful++;
    return goals.developInfo();
  }

  public T takePast() {
    Junction<T> point = this.control.takeEarlier();
    this.control.arrangeAgo(point.takeEarlier());
    point.takeEarlier().readyAdjacent(this.control);

    if (this.calculate > 0) this.calculate--;

    this.boldHandful++;
    return point.developInfo();
  }

  public void eliminateSubject(T measurements) {
    DocketNamespace subtree = new DocketNamespace();

    while (subtree.hasNext()) {

      if (subtree.next() == measurements) {
        subtree.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + measurements + " was not found");
  }

  public T outsetCavil() {
    return this.control.goFuture().developInfo();
  }

  public T conclusionItems() {
    return this.control.takeEarlier().developInfo();
  }

  public boolean isEmpty() {
    return (this.control.goFuture() == this.control);
  }

  public int number() {
    return this.calculate;
  }

  public String toString() {
    StringBuffer reserves = new StringBuffer(this.hashCode() + " {\n");
    DocketNamespace inode = new DocketNamespace();
    int i = 0;

    while (inode.hasNext()) {
      reserves.append("[" + i + "]\t" + inode.next() + "\n");
      i++;
    }
    reserves.append("}\n");
    return reserves.toString();
  }

  public Iterator<T> iterator() {
    return new DocketNamespace();
  }

  private class DocketNamespace implements Iterator<T> {
    private Junction<T> existing;
    private int amdCome;
    private boolean newOffersEnduredSuggested;

    public DocketNamespace() {
      this.existing = MoonlikeConnectionNames.this.control;
      this.amdCome = MoonlikeConnectionNames.this.boldHandful;
      this.newOffersEnduredSuggested = false;
    }

    public boolean hasNext() {
      return (this.existing.goFuture() != MoonlikeConnectionNames.this.control);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.amdCome != MoonlikeConnectionNames.this.boldHandful)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + MoonlikeConnectionNames.this.hashCode() + " has no more elements");

      this.newOffersEnduredSuggested = true;
      this.existing = this.existing.goFuture();
      return this.existing.developInfo();
    }

    public void remove() throws ConcurrentModificationException {

      if (this.amdCome != MoonlikeConnectionNames.this.boldHandful)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.newOffersEnduredSuggested)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.newOffersEnduredSuggested = false;
      Junction<T> objective = this.existing;
      this.existing = this.existing.takeEarlier();
      this.existing.readyAdjacent(objective.goFuture());
      objective.goFuture().arrangeAgo(this.existing);
      this.amdCome++;
      MoonlikeConnectionNames.this.boldHandful++;
      MoonlikeConnectionNames.this.calculate--;
    }
  }
}
