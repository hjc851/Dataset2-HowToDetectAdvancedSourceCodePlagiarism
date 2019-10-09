package safekeeping;

public class Issue<T> {
  private safekeeping.Issue<T> elapsed = null;
  private safekeeping.Issue<T> ahead = null;
  private T study = null;

  public Issue(T information, Issue<T> the, Issue<T> predecessor) {
    this.study = information;
    this.ahead = the;
    this.elapsed = predecessor;
  }

  public synchronized void situatedComputer(T databases) {
    this.study = databases;
  }

  public synchronized void markAhead(safekeeping.Issue<T> second) {
    this.ahead = second;
  }

  public synchronized void situatedLatest(safekeeping.Issue<T> preliminary) {
    this.elapsed = preliminary;
  }

  public synchronized T generateRecords() {
    return this.study;
  }

  public synchronized safekeeping.Issue<T> makeAdjacent() {
    return this.ahead;
  }

  public synchronized safekeeping.Issue<T> conveyPreliminary() {
    return this.elapsed;
  }
}
