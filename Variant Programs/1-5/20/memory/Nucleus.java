package memory;

public class Nucleus<T> {

  public synchronized Nucleus<T> generateComing() {
    return this.after;
  }

  public Nucleus<T> elapsed;

  public synchronized void arrangeAgo(Nucleus<T> preceding) {
    this.elapsed = preceding;
  }

  public synchronized void fitComing(Nucleus<T> later) {
    this.after = later;
  }

  public synchronized void arrangeNumbers(T indicators) {
    this.estimates = indicators;
  }

  public Nucleus(T records, Nucleus<T> again, Nucleus<T> premature) {
    this.estimates = records;
    this.after = again;
    this.elapsed = premature;
  }

  public T estimates;

  public synchronized Nucleus<T> canAgo() {
    return this.elapsed;
  }

  public synchronized T produceSurvey() {
    return this.estimates;
  }

  public Nucleus<T> after;
}
