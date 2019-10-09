package cache;

public class Ribbon<T> {
  private cache.Ribbon<T> late = null;
  private cache.Ribbon<T> come = null;
  private T stats = null;

  public Ribbon(T statistical, Ribbon<T> early, Ribbon<T> successive) {
    this.stats = statistical;
    this.come = early;
    this.late = successive;
  }

  public synchronized void arrangedDatabase(T results) {
    this.stats = results;
  }

  public synchronized void orderedAgain(cache.Ribbon<T> last) {
    this.come = last;
  }

  public synchronized void prepareCurrent(cache.Ribbon<T> first) {
    this.late = first;
  }

  public synchronized T driveIntelligence() {
    return this.stats;
  }

  public synchronized cache.Ribbon<T> beatThe() {
    return this.come;
  }

  public synchronized cache.Ribbon<T> canAgo() {
    return this.late;
  }
}
