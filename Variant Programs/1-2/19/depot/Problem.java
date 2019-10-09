package depot;

public class Problem<T> {
  private T results;
  private depot.Problem<T> close;
  private depot.Problem<T> original;

  public Problem(T files, Problem<T> early, Problem<T> former) {
    this.results = files;
    this.close = early;
    this.original = former;
  }

  public void primedFiles(T information) {
    this.results = information;
  }

  public void putFuture(depot.Problem<T> upcoming) {
    this.close = upcoming;
  }

  public void determineInitial(depot.Problem<T> premature) {
    this.original = premature;
  }

  public T canNumbers() {
    return this.results;
  }

  public depot.Problem<T> arriveExpected() {
    return this.close;
  }

  public depot.Problem<T> letRecent() {
    return this.original;
  }
}
