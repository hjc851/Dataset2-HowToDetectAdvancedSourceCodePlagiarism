package storeroom;

public class Hub<T> {

  public synchronized Hub<T> havePervious() {
    return this.past;
  }

  public synchronized Hub<T> fetchThird() {
    return this.adjacent;
  }

  public synchronized void placedLast(Hub<T> prior) {
    this.past = (prior);
  }

  public synchronized void settledFirst(Hub<T> then) {
    this.adjacent = (then);
  }

  public synchronized void doIntelligence(T results) {
    this.evidence = (results);
  }

  private Hub<T> past = null;

  public synchronized T makeIndicators() {
    return this.evidence;
  }

  private Hub<T> adjacent = null;

  public Hub(T databases, Hub<T> come, Hub<T> preceding) {
    this.evidence = (databases);
    this.adjacent = (come);
    this.past = (preceding);
  }

  private T evidence = null;
}
