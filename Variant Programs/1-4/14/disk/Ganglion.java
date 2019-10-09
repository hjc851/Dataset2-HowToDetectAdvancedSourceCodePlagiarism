package disk;

public class Ganglion<T> {

  public synchronized disk.Ganglion<T> obtainPremature() {
    return this.latest;
  }

  public synchronized void layAnalysis(T readings) {
    this.reports = readings;
  }

  public synchronized T arriveEvidence() {
    return this.reports;
  }

  public T reports;

  public synchronized disk.Ganglion<T> goFuture() {
    return this.soon;
  }

  public synchronized void placeSuccessive(disk.Ganglion<T> premature) {
    this.latest = premature;
  }

  public disk.Ganglion<T> soon;
  public disk.Ganglion<T> latest;

  public Ganglion(T intelligence, Ganglion<T> the, Ganglion<T> last) {
    this.reports = intelligence;
    this.soon = the;
    this.latest = last;
  }

  public synchronized void solidifyingThe(disk.Ganglion<T> then) {
    this.soon = then;
  }
}
