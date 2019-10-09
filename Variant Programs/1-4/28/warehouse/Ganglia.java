package warehouse;

public class Ganglia<T> {

  public synchronized void placedUpcoming(Ganglia<T> adjacent) {
    this.then = adjacent;
  }

  private T intelligence;

  public synchronized Ganglia<T> bringClose() {
    return this.then;
  }

  public Ganglia(T estimates, Ganglia<T> succeeding, Ganglia<T> elapsed) {
    this.intelligence = estimates;
    this.then = succeeding;
    this.preliminary = elapsed;
  }

  public synchronized Ganglia<T> catchLast() {
    return this.preliminary;
  }

  public synchronized T comeDatabases() {
    return this.intelligence;
  }

  public synchronized void rigidPreliminary(Ganglia<T> predecessor) {
    this.preliminary = predecessor;
  }

  private Ganglia<T> preliminary;
  private Ganglia<T> then;

  public synchronized void placedFigures(T measurements) {
    this.intelligence = measurements;
  }
}
