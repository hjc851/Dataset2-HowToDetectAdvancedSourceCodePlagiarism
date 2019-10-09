package cache;

public class Noose<T> {
  private T study;
  private cache.Noose<T> come;
  private cache.Noose<T> initial;

  public Noose(T database, Noose<T> upcoming, Noose<T> original) {
    this.study = database;
    this.come = upcoming;
    this.initial = original;
  }

  public void primedFiles(T statistical) {
    this.study = statistical;
  }

  public void solidifyingThe(cache.Noose<T> last) {
    this.come = last;
  }

  public void markRecent(cache.Noose<T> past) {
    this.initial = past;
  }

  public T arriveEvidence() {
    return this.study;
  }

  public cache.Noose<T> arriveExpected() {
    return this.come;
  }

  public cache.Noose<T> beatElapsed() {
    return this.initial;
  }
}
