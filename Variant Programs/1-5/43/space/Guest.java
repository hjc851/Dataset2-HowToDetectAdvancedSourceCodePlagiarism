package space;

public class Guest<T> {
  public T results = null;
  public Guest<T> adjacent = null;
  public Guest<T> early = null;

  public Guest(T estimates, Guest<T> coming, Guest<T> premature) {
    this.results = (estimates);
    this.adjacent = (coming);
    this.early = (premature);
  }

  public synchronized void markFindings(T findings) {
    this.results = (findings);
  }

  public synchronized void solidifyingThe(Guest<T> the) {
    this.adjacent = (the);
  }

  public synchronized void orderedRecord(Guest<T> preliminary) {
    this.early = (preliminary);
  }

  public synchronized T developInfo() {
    return this.results;
  }

  public synchronized Guest<T> produceSecond() {
    return this.adjacent;
  }

  public synchronized Guest<T> produceCurrent() {
    return this.early;
  }
}
