package warehouses;

public class Antenna<T> {
  public T databases;
  public Antenna<T> after;
  public Antenna<T> first;

  public Antenna(T stats, Antenna<T> close, Antenna<T> latest) {
    this.databases = stats;
    this.after = close;
    this.first = latest;
  }

  public synchronized void arrangedDatabase(T computer) {
    this.databases = computer;
  }

  public synchronized void fixedAfter(Antenna<T> incoming) {
    this.after = incoming;
  }

  public synchronized void rigidPreliminary(Antenna<T> premature) {
    this.first = premature;
  }

  public synchronized T bringStatistics() {
    return this.databases;
  }

  public synchronized Antenna<T> becomeAfter() {
    return this.after;
  }

  public synchronized Antenna<T> drawSuccessive() {
    return this.first;
  }
}
