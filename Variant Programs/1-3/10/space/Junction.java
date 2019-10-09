package space;

public class Junction<T> {
  public space.Junction<T> old = null;
  public space.Junction<T> again = null;
  public T database = null;

  public Junction(T analysis, Junction<T> future, Junction<T> predecessor) {
    this.database = analysis;
    this.again = future;
    this.old = predecessor;
  }

  public synchronized void fixedStudy(T records) {
    this.database = records;
  }

  public synchronized void markAhead(space.Junction<T> come) {
    this.again = come;
  }

  public synchronized void layOld(space.Junction<T> elapsed) {
    this.old = elapsed;
  }

  public synchronized T generateRecords() {
    return this.database;
  }

  public synchronized space.Junction<T> fixAgain() {
    return this.again;
  }

  public synchronized space.Junction<T> canAgo() {
    return this.old;
  }
}
