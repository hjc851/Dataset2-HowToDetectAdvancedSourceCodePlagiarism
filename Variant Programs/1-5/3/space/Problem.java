package space;

public class Problem<T> {

  public synchronized void placeSuccessive(space.Problem<T> early) {
    this.preliminary = early;
  }

  public space.Problem<T> preliminary = null;

  public synchronized T canNumbers() {
    return this.estimates;
  }

  public space.Problem<T> future = null;

  public synchronized void fixThen(space.Problem<T> now) {
    this.future = now;
  }

  public synchronized space.Problem<T> obtainPremature() {
    return this.preliminary;
  }

  public synchronized void putInformation(T stats) {
    this.estimates = stats;
  }

  public synchronized space.Problem<T> obtainLast() {
    return this.future;
  }

  public T estimates = null;

  public Problem(T records, Problem<T> first, Problem<T> premature) {
    this.estimates = records;
    this.future = first;
    this.preliminary = premature;
  }
}
