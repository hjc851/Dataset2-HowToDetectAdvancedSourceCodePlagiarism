package safekeeping;

public class Ribbon<T> {
  private T measurements;
  private Ribbon<T> ahead;
  private Ribbon<T> former;

  public Ribbon(T files, Ribbon<T> second, Ribbon<T> original) {
    this.measurements = files;
    this.ahead = second;
    this.former = original;
  }

  public void placedFigures(T information) {
    this.measurements = information;
  }

  public void determineThird(Ribbon<T> now) {
    this.ahead = now;
  }

  public void fixedPredecessor(Ribbon<T> elapsed) {
    this.former = elapsed;
  }

  public T canNumbers() {
    return this.measurements;
  }

  public Ribbon<T> driveEarly() {
    return this.ahead;
  }

  public Ribbon<T> fixRecord() {
    return this.former;
  }
}
