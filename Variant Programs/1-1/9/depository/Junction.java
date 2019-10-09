package depository;

public class Junction<T> {
  private T information;
  private Junction<T> future;
  private Junction<T> last;

  public Junction(T indicators, Junction<T> second, Junction<T> earlier) {
    this.information = indicators;
    this.future = second;
    this.last = earlier;
  }

  public void rigidEstimates(T study) {
    this.information = study;
  }

  public void readyAdjacent(Junction<T> following) {
    this.future = following;
  }

  public void arrangeAgo(Junction<T> early) {
    this.last = early;
  }

  public T developInfo() {
    return this.information;
  }

  public Junction<T> goFuture() {
    return this.future;
  }

  public Junction<T> takeEarlier() {
    return this.last;
  }
}
