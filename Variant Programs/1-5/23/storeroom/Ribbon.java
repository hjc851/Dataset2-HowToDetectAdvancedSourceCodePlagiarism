package storeroom;

public class Ribbon<T> {

  public synchronized storeroom.Ribbon<T> conveyCome() {
    return this.coming;
  }

  private storeroom.Ribbon<T> past = null;
  private T figures = null;
  private storeroom.Ribbon<T> coming = null;

  public synchronized T catchFigures() {
    return this.figures;
  }

  public synchronized storeroom.Ribbon<T> receiveOld() {
    return this.past;
  }

  public synchronized void determinedPremature(storeroom.Ribbon<T> late) {
    this.past = (late);
  }

  public Ribbon(T stats, Ribbon<T> succeeding, Ribbon<T> original) {
    this.figures = (stats);
    this.coming = (succeeding);
    this.past = (original);
  }

  public synchronized void placedFigures(T database) {
    this.figures = (database);
  }

  public synchronized void placeSoon(storeroom.Ribbon<T> forthcoming) {
    this.coming = (forthcoming);
  }
}
