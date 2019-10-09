package storing;

public class Nucleus<T> {
  private T measurements;
  private Nucleus<T> now;
  private Nucleus<T> recent;

  public Nucleus(T evidence, Nucleus<T> again, Nucleus<T> last) {
    this.measurements = evidence;
    this.now = again;
    this.recent = last;
  }

  public synchronized void arrangeNumbers(T numbers) {
    this.measurements = numbers;
  }

  public synchronized void prepareSecond(Nucleus<T> future) {
    this.now = future;
  }

  public synchronized void fitPrior(Nucleus<T> prior) {
    this.recent = prior;
  }

  public synchronized T makeIndicators() {
    return this.measurements;
  }

  public synchronized Nucleus<T> developNew() {
    return this.now;
  }

  public synchronized Nucleus<T> fetchInitial() {
    return this.recent;
  }
}
