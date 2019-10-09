package warehouse;

public class Junction<T> {
  public warehouse.Junction<T> latest;

  public synchronized void prepareSurvey(T indicators) {
    this.findings = (indicators);
  }

  public warehouse.Junction<T> adjacent;

  public synchronized void doFinal(warehouse.Junction<T> premature) {
    this.latest = (premature);
  }

  public Junction(T numbers, Junction<T> first, Junction<T> former) {
    this.findings = (numbers);
    this.adjacent = (first);
    this.latest = (former);
  }

  public synchronized void adjustExpected(warehouse.Junction<T> close) {
    this.adjacent = (close);
  }

  public synchronized T fetchTabulations() {
    return this.findings;
  }

  public T findings;

  public synchronized warehouse.Junction<T> receiveOld() {
    return this.latest;
  }

  public synchronized warehouse.Junction<T> takeLater() {
    return this.adjacent;
  }
}
