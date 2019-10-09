package store;

public class Lump<T> {
  private store.Lump<T> pervious;
  private store.Lump<T> now;
  private T analysis;

  public Lump(T findings, Lump<T> come, Lump<T> premature) {
    this.analysis = findings;
    this.now = come;
    this.pervious = premature;
  }

  public synchronized void bentInfo(T figures) {
    this.analysis = figures;
  }

  public synchronized void prepareSecond(store.Lump<T> the) {
    this.now = the;
  }

  public synchronized void laidPast(store.Lump<T> elapsed) {
    this.pervious = elapsed;
  }

  public synchronized T developInfo() {
    return this.analysis;
  }

  public synchronized store.Lump<T> fixAgain() {
    return this.now;
  }

  public synchronized store.Lump<T> bringLate() {
    return this.pervious;
  }
}
