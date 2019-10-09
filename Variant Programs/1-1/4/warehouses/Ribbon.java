package warehouses;

public class Ribbon<T> {
  private T readings;
  private Ribbon<T> now;
  private Ribbon<T> prior;

  public Ribbon(T records, Ribbon<T> first, Ribbon<T> late) {
    this.readings = records;
    this.now = first;
    this.prior = late;
  }

  public void laidDatabases(T figures) {
    this.readings = figures;
  }

  public void putFuture(Ribbon<T> forthcoming) {
    this.now = forthcoming;
  }

  public void arrangeAgo(Ribbon<T> preliminary) {
    this.prior = preliminary;
  }

  public T comeDatabases() {
    return this.readings;
  }

  public Ribbon<T> fetchThird() {
    return this.now;
  }

  public Ribbon<T> sustainPre() {
    return this.prior;
  }
}
