package warehouse;

public class Nucleus<T> {
  private T readings;
  private warehouse.Nucleus<T> close;
  private warehouse.Nucleus<T> past;

  public Nucleus(T study, Nucleus<T> first, Nucleus<T> premature) {
    this.readings = study;
    this.close = first;
    this.past = premature;
  }

  public void readyIndicators(T stats) {
    this.readings = stats;
  }

  public void layIncoming(warehouse.Nucleus<T> upcoming) {
    this.close = upcoming;
  }

  public void layOld(warehouse.Nucleus<T> elapsed) {
    this.past = elapsed;
  }

  public T arriveEvidence() {
    return this.readings;
  }

  public warehouse.Nucleus<T> developNew() {
    return this.close;
  }

  public warehouse.Nucleus<T> obtainPremature() {
    return this.past;
  }
}
