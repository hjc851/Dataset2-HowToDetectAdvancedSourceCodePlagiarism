package warehouses;

public class Knob<T> {
  private Knob<T> old;
  private Knob<T> third;
  private T intelligence;

  public Knob(T numbers, Knob<T> later, Knob<T> successive) {
    this.intelligence = numbers;
    this.third = later;
    this.old = successive;
  }

  public synchronized void readyIndicators(T measurements) {
    this.intelligence = measurements;
  }

  public synchronized void bentNew(Knob<T> upcoming) {
    this.third = upcoming;
  }

  public synchronized void placedLast(Knob<T> predecessor) {
    this.old = predecessor;
  }

  public synchronized T findDatabase() {
    return this.intelligence;
  }

  public synchronized Knob<T> letAhead() {
    return this.third;
  }

  public synchronized Knob<T> letRecent() {
    return this.old;
  }
}
