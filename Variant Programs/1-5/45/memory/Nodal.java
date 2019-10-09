package memory;

public class Nodal<T> {
  private memory.Nodal<T> latest = null;

  public Nodal(T information, Nodal<T> after, Nodal<T> ago) {
    this.analysis = (information);
    this.first = (after);
    this.latest = (ago);
  }

  public synchronized void fixPre(memory.Nodal<T> past) {
    this.latest = (past);
  }

  public synchronized void markFindings(T tabulations) {
    this.analysis = (tabulations);
  }

  private memory.Nodal<T> first = null;

  public synchronized void putFuture(memory.Nodal<T> again) {
    this.first = (again);
  }

  public synchronized memory.Nodal<T> driveFinal() {
    return this.latest;
  }

  public synchronized T startComputer() {
    return this.analysis;
  }

  public synchronized memory.Nodal<T> goFuture() {
    return this.first;
  }

  private T analysis = null;
}
