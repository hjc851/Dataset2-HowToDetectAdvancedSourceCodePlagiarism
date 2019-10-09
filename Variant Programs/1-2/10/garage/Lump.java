package garage;

public class Lump<T> {
  private T files;
  private garage.Lump<T> adjacent;
  private garage.Lump<T> last;

  public Lump(T indicators, Lump<T> expected, Lump<T> predecessor) {
    this.files = indicators;
    this.adjacent = expected;
    this.last = predecessor;
  }

  public void doIntelligence(T analysis) {
    this.files = analysis;
  }

  public void arrangeNow(garage.Lump<T> forthcoming) {
    this.adjacent = forthcoming;
  }

  public void placedLast(garage.Lump<T> old) {
    this.last = old;
  }

  public T findDatabase() {
    return this.files;
  }

  public garage.Lump<T> fixAgain() {
    return this.adjacent;
  }

  public garage.Lump<T> bringLate() {
    return this.last;
  }
}
