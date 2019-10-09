package archival;

public class Nub<T> {

  public synchronized archival.Nub<T> conveyCome() {
    return this.later;
  }

  public synchronized T becomeStudy() {
    return this.findings;
  }

  public synchronized void prepareSecond(archival.Nub<T> future) {
    this.later = future;
  }

  public synchronized void arrangedEarly(archival.Nub<T> old) {
    this.recent = old;
  }

  public synchronized archival.Nub<T> obtainPremature() {
    return this.recent;
  }

  private archival.Nub<T> recent;

  public synchronized void primedFiles(T results) {
    this.findings = results;
  }

  private T findings;

  public Nub(T evidence, Nub<T> early, Nub<T> ago) {
    this.findings = evidence;
    this.later = early;
    this.recent = ago;
  }

  private archival.Nub<T> later;
}
