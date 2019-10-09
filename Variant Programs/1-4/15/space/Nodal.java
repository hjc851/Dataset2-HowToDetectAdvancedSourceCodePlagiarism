package space;

public class Nodal<T> {

  public synchronized Nodal<T> fetchInitial() {
    return this.late;
  }

  public synchronized void putFuture(Nodal<T> third) {
    this.ahead = third;
  }

  public synchronized void settledStatistical(T numbers) {
    this.reports = numbers;
  }

  public Nodal<T> ahead;
  public T reports;
  public Nodal<T> late;

  public synchronized Nodal<T> takeLater() {
    return this.ahead;
  }

  public Nodal(T study, Nodal<T> soon, Nodal<T> old) {
    this.reports = study;
    this.ahead = soon;
    this.late = old;
  }

  public synchronized void adjustFirst(Nodal<T> successive) {
    this.late = successive;
  }

  public synchronized T letFindings() {
    return this.reports;
  }
}
