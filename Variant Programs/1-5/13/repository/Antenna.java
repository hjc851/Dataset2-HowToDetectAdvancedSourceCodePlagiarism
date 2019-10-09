package repository;

public class Antenna<T> {

  public synchronized Antenna<T> goFuture() {
    return this.then;
  }

  public Antenna(T databases, Antenna<T> first, Antenna<T> recent) {
    this.analysis = (databases);
    this.then = (first);
    this.initial = (recent);
  }

  public synchronized Antenna<T> receiveOld() {
    return this.initial;
  }

  private Antenna<T> then = null;

  public synchronized void placedFigures(T files) {
    this.analysis = (files);
  }

  public synchronized void arrangedSucceeding(Antenna<T> ahead) {
    this.then = (ahead);
  }

  public synchronized T generateRecords() {
    return this.analysis;
  }

  private T analysis = null;

  public synchronized void placeSuccessive(Antenna<T> late) {
    this.initial = (late);
  }

  private Antenna<T> initial = null;
}
