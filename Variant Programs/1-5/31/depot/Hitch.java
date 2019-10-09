package depot;

public class Hitch<T> {

  public synchronized void bentNew(Hitch<T> then) {
    this.forthcoming = (then);
  }

  public T measurements = null;

  public synchronized void adjustFirst(Hitch<T> late) {
    this.predecessor = (late);
  }

  public Hitch<T> forthcoming = null;

  public synchronized Hitch<T> arriveExpected() {
    return this.forthcoming;
  }

  public Hitch<T> predecessor = null;

  public Hitch(T reports, Hitch<T> second, Hitch<T> elapsed) {
    this.measurements = (reports);
    this.forthcoming = (second);
    this.predecessor = (elapsed);
  }

  public synchronized Hitch<T> drawSuccessive() {
    return this.predecessor;
  }

  public synchronized void bentInfo(T study) {
    this.measurements = (study);
  }

  public synchronized T drawStats() {
    return this.measurements;
  }
}
