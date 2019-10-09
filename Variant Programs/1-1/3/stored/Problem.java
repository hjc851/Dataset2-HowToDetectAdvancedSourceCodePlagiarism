package stored;

public class Problem<T> {
  private T records;
  private Problem<T> come;
  private Problem<T> preceding;

  public Problem(T indicators, Problem<T> early, Problem<T> latest) {
    this.records = indicators;
    this.come = early;
    this.preceding = latest;
  }

  public void putInformation(T results) {
    this.records = results;
  }

  public void bentNew(Problem<T> later) {
    this.come = later;
  }

  public void placedLast(Problem<T> late) {
    this.preceding = late;
  }

  public T driveIntelligence() {
    return this.records;
  }

  public Problem<T> goFuture() {
    return this.come;
  }

  public Problem<T> makeFormer() {
    return this.preceding;
  }
}
