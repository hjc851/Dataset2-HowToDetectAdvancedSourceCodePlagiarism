package warehouses;

public class Antenna<T> {

  public Antenna(T files, Antenna<T> close, Antenna<T> past) {
    this.findings = files;
    this.the = close;
    this.elapsed = past;
  }

  public T findings;

  public synchronized Antenna<T> haveFirst() {
    return this.the;
  }

  public synchronized void arrangedSucceeding(Antenna<T> following) {
    this.the = following;
  }

  public synchronized void fixReports(T database) {
    this.findings = database;
  }

  public synchronized Antenna<T> obtainPremature() {
    return this.elapsed;
  }

  public Antenna<T> the;

  public synchronized T generateRecords() {
    return this.findings;
  }

  public Antenna<T> elapsed;

  public synchronized void dictatedLate(Antenna<T> initial) {
    this.elapsed = initial;
  }
}
