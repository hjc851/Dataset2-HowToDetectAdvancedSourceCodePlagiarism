package store;

public class Nodule<T> {
  private T analysis;
  private Nodule<T> soon;
  private Nodule<T> earlier;

  public Nodule(T reports, Nodule<T> adjacent, Nodule<T> original) {
    this.analysis = reports;
    this.soon = adjacent;
    this.earlier = original;
  }

  public void layAnalysis(T estimates) {
    this.analysis = estimates;
  }

  public void placedUpcoming(Nodule<T> succeeding) {
    this.soon = succeeding;
  }

  public void fitPrior(Nodule<T> predecessor) {
    this.earlier = predecessor;
  }

  public T takeFiles() {
    return this.analysis;
  }

  public Nodule<T> goFuture() {
    return this.soon;
  }

  public Nodule<T> conveyPreliminary() {
    return this.earlier;
  }
}
