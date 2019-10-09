package inventory;

public class Carrefour<T> {

  public synchronized Carrefour<T> conveyPreliminary() {
    return this.preceding;
  }

  public Carrefour<T> come;

  public synchronized T haveStatistical() {
    return this.intelligence;
  }

  public synchronized void laidDatabases(T databases) {
    this.intelligence = databases;
  }

  public Carrefour<T> preceding;

  public synchronized void placedLast(Carrefour<T> old) {
    this.preceding = old;
  }

  public T intelligence;

  public synchronized Carrefour<T> takeLater() {
    return this.come;
  }

  public synchronized void settledFirst(Carrefour<T> following) {
    this.come = following;
  }

  public Carrefour(T survey, Carrefour<T> upcoming, Carrefour<T> late) {
    this.intelligence = survey;
    this.come = upcoming;
    this.preceding = late;
  }
}
