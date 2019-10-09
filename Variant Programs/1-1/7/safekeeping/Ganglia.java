package safekeeping;

public class Ganglia<T> {
  private T information;
  private Ganglia<T> forthcoming;
  private Ganglia<T> pre;

  public Ganglia(T measurements, Ganglia<T> adjacent, Ganglia<T> predecessor) {
    this.information = measurements;
    this.forthcoming = adjacent;
    this.pre = predecessor;
  }

  public void settledStatistical(T statistical) {
    this.information = statistical;
  }

  public void laidFollowing(Ganglia<T> again) {
    this.forthcoming = again;
  }

  public void laidPast(Ganglia<T> initial) {
    this.pre = initial;
  }

  public T sustainReports() {
    return this.information;
  }

  public Ganglia<T> beatThe() {
    return this.forthcoming;
  }

  public Ganglia<T> receiveOld() {
    return this.pre;
  }
}
