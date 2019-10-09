package closet;

public class Problem<T> {
  private T numbers;
  private Problem<T> expected;
  private Problem<T> old;

  public Problem(T computer, Problem<T> then, Problem<T> preceding) {
    this.numbers = computer;
    this.expected = then;
    this.old = preceding;
  }

  public synchronized void fixedStudy(T tabulations) {
    this.numbers = tabulations;
  }

  public synchronized void fixedAfter(Problem<T> early) {
    this.expected = early;
  }

  public synchronized void doFinal(Problem<T> pervious) {
    this.old = pervious;
  }

  public synchronized T takeFiles() {
    return this.numbers;
  }

  public synchronized Problem<T> haveFirst() {
    return this.expected;
  }

  public synchronized Problem<T> arriveFirst() {
    return this.old;
  }
}
