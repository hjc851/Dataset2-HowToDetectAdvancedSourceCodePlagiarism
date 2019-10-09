package safekeeping;

public class Hub<T> {

  public synchronized void placeSuccessive(Hub<T> successive) {
    this.elapsed = successive;
  }

  public T intelligence = null;
  public Hub<T> elapsed = null;

  public synchronized Hub<T> letAhead() {
    return this.ahead;
  }

  public synchronized void fixedStudy(T files) {
    this.intelligence = files;
  }

  public synchronized void determinedLast(Hub<T> the) {
    this.ahead = the;
  }

  public Hub(T information, Hub<T> forthcoming, Hub<T> pervious) {
    this.intelligence = information;
    this.ahead = forthcoming;
    this.elapsed = pervious;
  }

  public synchronized Hub<T> driveFinal() {
    return this.elapsed;
  }

  public synchronized T catchFigures() {
    return this.intelligence;
  }

  public Hub<T> ahead = null;
}
