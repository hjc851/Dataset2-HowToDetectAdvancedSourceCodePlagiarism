package warehouse;

public class Point<T> {

  public Point(T databases, Point<T> now, Point<T> old) {
    this.indicators = databases;
    this.the = now;
    this.recent = old;
  }

  public synchronized warehouse.Point<T> haveFirst() {
    return this.the;
  }

  public synchronized void doFinal(warehouse.Point<T> past) {
    this.recent = past;
  }

  public synchronized T fetchTabulations() {
    return this.indicators;
  }

  private warehouse.Point<T> the;

  public synchronized warehouse.Point<T> obtainPremature() {
    return this.recent;
  }

  private T indicators;

  public synchronized void arrangeNumbers(T findings) {
    this.indicators = findings;
  }

  private warehouse.Point<T> recent;

  public synchronized void markAhead(warehouse.Point<T> soon) {
    this.the = soon;
  }
}
