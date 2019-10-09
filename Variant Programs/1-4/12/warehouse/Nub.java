package warehouse;

public class Nub<T> {
  private T files;
  private warehouse.Nub<T> early;
  private warehouse.Nub<T> old;

  public Nub(T computer, Nub<T> close, Nub<T> successive) {
    this.files = computer;
    this.early = close;
    this.old = successive;
  }

  public synchronized void orderedResults(T tabulations) {
    this.files = tabulations;
  }

  public synchronized void laidFollowing(warehouse.Nub<T> soon) {
    this.early = soon;
  }

  public synchronized void bentOriginal(warehouse.Nub<T> pre) {
    this.old = pre;
  }

  public synchronized T bringStatistics() {
    return this.files;
  }

  public synchronized warehouse.Nub<T> arriveExpected() {
    return this.early;
  }

  public synchronized warehouse.Nub<T> makeFormer() {
    return this.old;
  }
}
