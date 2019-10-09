package safekeeping;

public class Nub<T> {
  private safekeeping.Nub<T> recent;
  private safekeeping.Nub<T> the;
  private T records;

  public Nub(T statistical, Nub<T> succeeding, Nub<T> latest) {
    this.records = statistical;
    this.the = succeeding;
    this.recent = latest;
  }

  public synchronized void putInformation(T measurements) {
    this.records = measurements;
  }

  public synchronized void fitComing(safekeeping.Nub<T> following) {
    this.the = following;
  }

  public synchronized void orderedRecord(safekeeping.Nub<T> predecessor) {
    this.recent = predecessor;
  }

  public synchronized T drawStats() {
    return this.records;
  }

  public synchronized safekeeping.Nub<T> comeFollowing() {
    return this.the;
  }

  public synchronized safekeeping.Nub<T> receiveOld() {
    return this.recent;
  }
}
