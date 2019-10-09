package repository;

public class Core<T> {
  private T measurements = null;
  private repository.Core<T> following = null;
  private repository.Core<T> pervious = null;

  public Core(T readings, Core<T> adjacent, Core<T> original) {
    this.measurements = readings;
    this.following = adjacent;
    this.pervious = original;
  }

  public synchronized void solidifyingReadings(T survey) {
    this.measurements = survey;
  }

  public synchronized void fitComing(repository.Core<T> third) {
    this.following = third;
  }

  public synchronized void fixedPredecessor(repository.Core<T> last) {
    this.pervious = last;
  }

  public synchronized T drawStats() {
    return this.measurements;
  }

  public synchronized repository.Core<T> takeLater() {
    return this.following;
  }

  public synchronized repository.Core<T> startLatest() {
    return this.pervious;
  }
}
