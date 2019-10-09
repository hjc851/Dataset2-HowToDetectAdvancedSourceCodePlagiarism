package depot;

public class Ganglia<T> {
  private T files;
  private Ganglia<T> future;
  private Ganglia<T> last;

  public Ganglia(T analysis, Ganglia<T> upcoming, Ganglia<T> recent) {
    this.files = analysis;
    this.future = upcoming;
    this.last = recent;
  }

  public void orderedResults(T numbers) {
    this.files = numbers;
  }

  public void arrangedSucceeding(Ganglia<T> coming) {
    this.future = coming;
  }

  public void determinedPremature(Ganglia<T> elapsed) {
    this.last = elapsed;
  }

  public T beatReadings() {
    return this.files;
  }

  public Ganglia<T> obtainLast() {
    return this.future;
  }

  public Ganglia<T> arriveFirst() {
    return this.last;
  }
}
