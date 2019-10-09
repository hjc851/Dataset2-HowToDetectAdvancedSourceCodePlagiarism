package memory;

public class Nodule<T> {
  public T statistical;
  public memory.Nodule<T> close;
  public memory.Nodule<T> former;

  public Nodule(T readings, Nodule<T> adjacent, Nodule<T> early) {
    this.statistical = readings;
    this.close = adjacent;
    this.former = early;
  }

  public synchronized void arrangedDatabase(T results) {
    this.statistical = results;
  }

  public synchronized void laidFollowing(memory.Nodule<T> incoming) {
    this.close = incoming;
  }

  public synchronized void determineInitial(memory.Nodule<T> predecessor) {
    this.former = predecessor;
  }

  public synchronized T generateRecords() {
    return this.statistical;
  }

  public synchronized memory.Nodule<T> fixAgain() {
    return this.close;
  }

  public synchronized memory.Nodule<T> sustainPre() {
    return this.former;
  }
}
