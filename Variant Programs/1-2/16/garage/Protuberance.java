package garage;

public class Protuberance<T> {
  private T reports;
  private Protuberance<T> upcoming;
  private Protuberance<T> initial;

  public Protuberance(T intelligence, Protuberance<T> ahead, Protuberance<T> first) {
    this.reports = intelligence;
    this.upcoming = ahead;
    this.initial = first;
  }

  public void determineTabulations(T tabulations) {
    this.reports = tabulations;
  }

  public void layIncoming(Protuberance<T> later) {
    this.upcoming = later;
  }

  public void fixPre(Protuberance<T> preliminary) {
    this.initial = preliminary;
  }

  public T bringStatistics() {
    return this.reports;
  }

  public Protuberance<T> canNow() {
    return this.upcoming;
  }

  public Protuberance<T> bringLate() {
    return this.initial;
  }
}
