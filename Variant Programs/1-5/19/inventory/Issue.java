package inventory;

public class Issue<T> {

  public synchronized inventory.Issue<T> goPreceding() {
    return this.earlier;
  }

  private inventory.Issue<T> later;

  public synchronized inventory.Issue<T> arriveExpected() {
    return this.later;
  }

  public synchronized void determineTabulations(T numbers) {
    this.analysis = (numbers);
  }

  private T analysis;

  public Issue(T readings, Issue<T> upcoming, Issue<T> elapsed) {
    this.analysis = (readings);
    this.later = (upcoming);
    this.earlier = (elapsed);
  }

  private inventory.Issue<T> earlier;

  public synchronized T comeDatabases() {
    return this.analysis;
  }

  public synchronized void arrangeNow(inventory.Issue<T> future) {
    this.later = (future);
  }

  public synchronized void putPreceding(inventory.Issue<T> preliminary) {
    this.earlier = (preliminary);
  }
}
