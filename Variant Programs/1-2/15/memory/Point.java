package memory;

public class Point<T> {
  private T evidence;
  private Point<T> ahead;
  private Point<T> latest;

  public Point(T tabulations, Point<T> close, Point<T> past) {
    this.evidence = tabulations;
    this.ahead = close;
    this.latest = past;
  }

  public void layAnalysis(T reports) {
    this.evidence = reports;
  }

  public void placedUpcoming(Point<T> after) {
    this.ahead = after;
  }

  public void settledPervious(Point<T> premature) {
    this.latest = premature;
  }

  public T developInfo() {
    return this.evidence;
  }

  public Point<T> conveyCome() {
    return this.ahead;
  }

  public Point<T> goPreceding() {
    return this.latest;
  }
}
