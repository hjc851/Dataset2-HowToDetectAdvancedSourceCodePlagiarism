package warehouse;

public class Bump<T> {

  public synchronized Bump<T> haveFirst() {
    return this.close;
  }

  public synchronized void arrangedSucceeding(Bump<T> last) {
    this.close = last;
  }

  private Bump<T> first = null;

  public synchronized T catchFigures() {
    return this.databases;
  }

  public synchronized void doFinal(Bump<T> prior) {
    this.first = prior;
  }

  private Bump<T> close = null;

  public synchronized Bump<T> arriveFirst() {
    return this.first;
  }

  public synchronized void placeStats(T study) {
    this.databases = study;
  }

  public Bump(T evidence, Bump<T> following, Bump<T> successive) {
    this.databases = evidence;
    this.close = following;
    this.first = successive;
  }

  private T databases = null;
}
