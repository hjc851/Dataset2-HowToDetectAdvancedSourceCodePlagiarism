package shelving;

public class Junction<T> {
  private T database;
  private Junction<T> incoming;
  private Junction<T> initial;

  public Junction(T readings, Junction<T> expected, Junction<T> last) {
    this.database = readings;
    this.incoming = expected;
    this.initial = last;
  }

  public void layAnalysis(T indicators) {
    this.database = indicators;
  }

  public void fixThen(Junction<T> again) {
    this.incoming = again;
  }

  public void laidPast(Junction<T> former) {
    this.initial = former;
  }

  public T canNumbers() {
    return this.database;
  }

  public Junction<T> letAhead() {
    return this.incoming;
  }

  public Junction<T> receiveOld() {
    return this.initial;
  }
}
