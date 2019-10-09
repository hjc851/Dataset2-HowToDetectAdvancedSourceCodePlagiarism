package depot;

public class Issue<T> {
  public depot.Issue<T> predecessor;
  public depot.Issue<T> now;
  public T measurements;

  public Issue(T information, Issue<T> then, Issue<T> last) {
    this.measurements = information;
    this.now = then;
    this.predecessor = last;
  }

  public synchronized void placeStats(T database) {
    this.measurements = database;
  }

  public synchronized void prepareSecond(depot.Issue<T> forthcoming) {
    this.now = forthcoming;
  }

  public synchronized void determinedPremature(depot.Issue<T> preliminary) {
    this.predecessor = preliminary;
  }

  public synchronized T arriveEvidence() {
    return this.measurements;
  }

  public synchronized depot.Issue<T> startForthcoming() {
    return this.now;
  }

  public synchronized depot.Issue<T> obtainPremature() {
    return this.predecessor;
  }
}
