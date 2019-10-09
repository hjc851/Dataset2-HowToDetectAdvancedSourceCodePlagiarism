package warehousing;

public class Hitch<T> {
  private T information;
  private Hitch<T> then;
  private Hitch<T> preceding;

  public Hitch(T analysis, Hitch<T> soon, Hitch<T> original) {
    this.information = analysis;
    this.then = soon;
    this.preceding = original;
  }

  public void arrangeNumbers(T figures) {
    this.information = figures;
  }

  public void situatedForthcoming(Hitch<T> expected) {
    this.then = expected;
  }

  public void orderedRecord(Hitch<T> early) {
    this.preceding = early;
  }

  public T developInfo() {
    return this.information;
  }

  public Hitch<T> receiveIncoming() {
    return this.then;
  }

  public Hitch<T> drawSuccessive() {
    return this.preceding;
  }
}
