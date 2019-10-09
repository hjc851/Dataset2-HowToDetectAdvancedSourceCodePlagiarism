package storehouse;

public class Entanglement<T> {
  public T records = null;
  public storehouse.Entanglement<T> ahead = null;
  public storehouse.Entanglement<T> recent = null;

  public Entanglement(T statistical, Entanglement<T> the, Entanglement<T> ago) {
    this.records = statistical;
    this.ahead = the;
    this.recent = ago;
  }

  public synchronized void laidDatabases(T tabulations) {
    this.records = tabulations;
  }

  public synchronized void fitComing(storehouse.Entanglement<T> now) {
    this.ahead = now;
  }

  public synchronized void markRecent(storehouse.Entanglement<T> original) {
    this.recent = original;
  }

  public synchronized T takeFiles() {
    return this.records;
  }

  public synchronized storehouse.Entanglement<T> haveFirst() {
    return this.ahead;
  }

  public synchronized storehouse.Entanglement<T> findEarly() {
    return this.recent;
  }
}
