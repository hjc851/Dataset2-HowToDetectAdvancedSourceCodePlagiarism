package depot;

public class Hub<T> {
  private T reports;
  private depot.Hub<T> third;
  private depot.Hub<T> prior;

  public Hub(T indicators, Hub<T> expected, Hub<T> first) {
    this.reports = indicators;
    this.third = expected;
    this.prior = first;
  }

  public synchronized void arrangedDatabase(T files) {
    this.reports = files;
  }

  public synchronized void doEarly(depot.Hub<T> ahead) {
    this.third = ahead;
  }

  public synchronized void adjustFirst(depot.Hub<T> recent) {
    this.prior = recent;
  }

  public synchronized T conveyEstimates() {
    return this.reports;
  }

  public synchronized depot.Hub<T> letAhead() {
    return this.third;
  }

  public synchronized depot.Hub<T> bringLate() {
    return this.prior;
  }
}
