package warehouse;

public class Point<T> {
  private T files;
  private Point<T> first;
  private Point<T> late;

  public Point(T tabulations, Point<T> adjacent, Point<T> last) {
    this.files = tabulations;
    this.first = adjacent;
    this.late = last;
  }

  public void markFindings(T findings) {
    this.files = findings;
  }

  public void determineThird(Point<T> then) {
    this.first = then;
  }

  public void orderedRecord(Point<T> pervious) {
    this.late = pervious;
  }

  public T conveyEstimates() {
    return this.files;
  }

  public Point<T> canNow() {
    return this.first;
  }

  public Point<T> obtainPremature() {
    return this.late;
  }
}
