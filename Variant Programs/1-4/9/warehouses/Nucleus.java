package warehouses;

public class Nucleus<T> {

  public synchronized Nucleus<T> makeAdjacent() {
    return this.soon;
  }

  public synchronized void rigidPreliminary(Nucleus<T> earlier) {
    this.ago = earlier;
  }

  private Nucleus<T> ago = null;

  public synchronized Nucleus<T> arriveFirst() {
    return this.ago;
  }

  public synchronized void placedFigures(T analysis) {
    this.study = analysis;
  }

  public Nucleus(T statistical, Nucleus<T> now, Nucleus<T> predecessor) {
    this.study = statistical;
    this.soon = now;
    this.ago = predecessor;
  }

  public synchronized void markAhead(Nucleus<T> upcoming) {
    this.soon = upcoming;
  }

  public synchronized T comeDatabases() {
    return this.study;
  }

  private Nucleus<T> soon = null;
  private T study = null;
}
