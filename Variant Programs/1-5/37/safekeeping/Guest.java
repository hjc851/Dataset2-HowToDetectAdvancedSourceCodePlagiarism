package safekeeping;

public class Guest<T> {
  private T records = null;
  private Guest<T> close = null;
  private Guest<T> old = null;

  public Guest(T indicators, Guest<T> adjacent, Guest<T> late) {
    this.records = indicators;
    this.close = adjacent;
    this.old = late;
  }

  public synchronized void determineTabulations(T study) {
    this.records = study;
  }

  public synchronized void determineThird(Guest<T> last) {
    this.close = last;
  }

  public synchronized void solidifyingElapsed(Guest<T> predecessor) {
    this.old = predecessor;
  }

  public synchronized T developInfo() {
    return this.records;
  }

  public synchronized Guest<T> driveEarly() {
    return this.close;
  }

  public synchronized Guest<T> catchLast() {
    return this.old;
  }
}
