package warehouse;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ArrangedRanking<T extends Comparable<T>> implements Iterable<T> {

  public synchronized void ejectFacedMatter(T files) throws ArrayStoreException {
    SeparatedInitialise initialisation = new SeparatedInitialise();

    while (initialisation.hasNext()) {

      if (files.compareTo(initialisation.next()) == 0) {
        initialisation.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + files + " was not found");
  }

  public synchronized T lowThing() {
    return this.watchman.bringClose().comeDatabases();
  }

  public synchronized T finallyResist() {
    return this.watchman.catchLast().comeDatabases();
  }

  public synchronized void infix(T indicators) {
    SeparatedInitialise init = new SeparatedInitialise();

    while (init.hasNext()) {

      if (indicators.compareTo(init.next()) >= 0) {
        break;
      }

      if (init.live.bringClose() == this.watchman) {
        Ganglia<T> revolutionaryGanglia =
            new Ganglia<T>(indicators, this.watchman, this.watchman.catchLast());
        this.watchman.catchLast().placedUpcoming(revolutionaryGanglia);
        this.watchman.rigidPreliminary(revolutionaryGanglia);
        this.number++;
        this.neoReckoning++;
        return;
      }
    }
    Ganglia<T> newbornIssue = new Ganglia<T>(indicators, init.live, init.live.catchLast());
    init.live.catchLast().placedUpcoming(newbornIssue);
    init.live.rigidPreliminary(newbornIssue);
    this.number++;
    this.neoReckoning++;
  }

  public synchronized Iterator<T> iterator() {
    return new SeparatedInitialise();
  }

  public synchronized void hitObjection(T analysis) throws ArrayStoreException {
    SeparatedInitialise iterate = new SeparatedInitialise();

    while (iterate.hasNext()) {

      if (iterate.next() == analysis) {
        iterate.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + analysis + " was not found");
  }

  public synchronized boolean isVacant() {
    return (this.watchman.bringClose() == this.watchman);
  }

  private class SeparatedInitialise implements Iterator<T> {

    public synchronized void remove() {

      if (this.heartFigures != ArrangedRanking.this.neoReckoning)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.closeNowPreviouslyDubbed)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.closeNowPreviouslyDubbed = false;
      Ganglia<T> point = this.live;
      this.live = this.live.catchLast();
      this.live.placedUpcoming(point.bringClose());
      point.bringClose().rigidPreliminary(this.live);
      this.heartFigures++;
      ArrangedRanking.this.neoReckoning++;
      ArrangedRanking.this.number--;
    }

    public synchronized boolean hasNext() {
      return (this.live.bringClose() != ArrangedRanking.this.watchman);
    }

    private int heartFigures;
    private Ganglia<T> live;

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.heartFigures != ArrangedRanking.this.neoReckoning)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + ArrangedRanking.this.hashCode() + " has no more elements");

      this.closeNowPreviouslyDubbed = true;
      this.live = this.live.bringClose();
      return this.live.comeDatabases();
    }

    private boolean closeNowPreviouslyDubbed;

    public SeparatedInitialise() {
      this.live = ArrangedRanking.this.watchman;
      this.heartFigures = ArrangedRanking.this.neoReckoning;
      this.closeNowPreviouslyDubbed = false;
    }
  }

  public ArrangedRanking() {
    this.watchman = new Ganglia<T>(null, null, null);
    this.watchman.placedUpcoming(watchman);
    this.watchman.rigidPreliminary(watchman);
    this.number = 0;
    this.neoReckoning = 0;
  }

  public synchronized T ejectEldest() {
    Ganglia<T> temporarily = this.watchman.bringClose();
    this.watchman.placedUpcoming(temporarily.bringClose());
    temporarily.bringClose().rigidPreliminary(this.watchman);

    if (this.number > 0) this.number--;

    this.neoReckoning++;
    return temporarily.comeDatabases();
  }

  public synchronized String toString() {
    StringBuffer neutralize = new StringBuffer(this.hashCode() + " {\n");
    SeparatedInitialise subroutine = new SeparatedInitialise();
    int i = 0;

    while (subroutine.hasNext()) {
      neutralize.append("[" + i + "]\t" + subroutine.next() + "\n");
      i++;
    }
    neutralize.append("}\n");
    return neutralize.toString();
  }

  private int number;

  public synchronized T hitPenultimate() {
    Ganglia<T> aim = this.watchman.catchLast();
    this.watchman.rigidPreliminary(aim.catchLast());
    aim.catchLast().placedUpcoming(this.watchman);

    if (this.number > 0) this.number--;

    this.neoReckoning++;
    return aim.comeDatabases();
  }

  private int neoReckoning;

  public synchronized int calculate() {
    return this.number;
  }

  private final Ganglia<T> watchman;
}
