package store;

public class Nodal<T> {
  private T computer;
  private store.Nodal<T> soon;
  private store.Nodal<T> past;

  public Nodal(T database, Nodal<T> again, Nodal<T> preliminary) {
    this.computer = database;
    this.soon = again;
    this.past = preliminary;
  }

  public void arrangedDatabase(T indicators) {
    this.computer = indicators;
  }

  public void situatedForthcoming(store.Nodal<T> coming) {
    this.soon = coming;
  }

  public void primedEarlier(store.Nodal<T> successive) {
    this.past = successive;
  }

  public T generateRecords() {
    return this.computer;
  }

  public store.Nodal<T> letAhead() {
    return this.soon;
  }

  public store.Nodal<T> canAgo() {
    return this.past;
  }
}
