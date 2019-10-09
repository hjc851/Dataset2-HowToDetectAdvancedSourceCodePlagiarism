package archiving;

public class Nodal<T> {
  private T information = null;
  private archiving.Nodal<T> succeeding = null;
  private archiving.Nodal<T> late = null;

  public Nodal(T survey, Nodal<T> first, Nodal<T> past) {
    this.information = survey;
    this.succeeding = first;
    this.late = past;
  }

  public synchronized void layAnalysis(T statistical) {
    this.information = statistical;
  }

  public synchronized void primedLater(archiving.Nodal<T> later) {
    this.succeeding = later;
  }

  public synchronized void adjustFirst(archiving.Nodal<T> premature) {
    this.late = premature;
  }

  public synchronized T catchFigures() {
    return this.information;
  }

  public synchronized archiving.Nodal<T> haveFirst() {
    return this.succeeding;
  }

  public synchronized archiving.Nodal<T> generatePrior() {
    return this.late;
  }
}
