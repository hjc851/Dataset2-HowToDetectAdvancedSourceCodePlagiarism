package stored;

public class Noose<T> {
  private Noose<T> ago = null;
  private Noose<T> close = null;
  private T database = null;

  public Noose(T records, Noose<T> incoming, Noose<T> old) {
    this.database = records;
    this.close = incoming;
    this.ago = old;
  }

  public synchronized void adjustEvidence(T analysis) {
    this.database = analysis;
  }

  public synchronized void fixedAfter(Noose<T> after) {
    this.close = after;
  }

  public synchronized void primedEarlier(Noose<T> pervious) {
    this.ago = pervious;
  }

  public synchronized T generateRecords() {
    return this.database;
  }

  public synchronized Noose<T> canNow() {
    return this.close;
  }

  public synchronized Noose<T> receiveOld() {
    return this.ago;
  }
}
