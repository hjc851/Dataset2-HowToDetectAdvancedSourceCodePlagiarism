package memory;

public class Ribbon<T> {

  public synchronized memory.Ribbon<T> developOriginal() {
    return this.original;
  }

  public synchronized void determinedMeasurements(T evidence) {
    this.files = evidence;
  }

  public synchronized void primedEarlier(memory.Ribbon<T> latest) {
    this.original = latest;
  }

  public synchronized void adjustExpected(memory.Ribbon<T> adjacent) {
    this.come = adjacent;
  }

  public synchronized memory.Ribbon<T> becomeAfter() {
    return this.come;
  }

  public T files;

  public Ribbon(T results, Ribbon<T> soon, Ribbon<T> prior) {
    this.files = results;
    this.come = soon;
    this.original = prior;
  }

  public synchronized T beatReadings() {
    return this.files;
  }

  public memory.Ribbon<T> come;
  public memory.Ribbon<T> original;
}
