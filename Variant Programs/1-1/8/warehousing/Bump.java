package warehousing;

public class Bump<T> {
  private T measurements;
  private Bump<T> third;
  private Bump<T> first;

  public Bump(T tabulations, Bump<T> close, Bump<T> old) {
    this.measurements = tabulations;
    this.third = close;
    this.first = old;
  }

  public void fitRecords(T analysis) {
    this.measurements = analysis;
  }

  public void primedLater(Bump<T> second) {
    this.third = second;
  }

  public void fitPrior(Bump<T> ago) {
    this.first = ago;
  }

  public T drawStats() {
    return this.measurements;
  }

  public Bump<T> becomeAfter() {
    return this.third;
  }

  public Bump<T> havePervious() {
    return this.first;
  }
}
