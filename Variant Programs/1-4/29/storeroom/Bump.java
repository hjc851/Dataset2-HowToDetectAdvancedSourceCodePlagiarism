package storeroom;

public class Bump<T> {
  private storeroom.Bump<T> former;
  private storeroom.Bump<T> now;
  private T statistical;

  public Bump(T results, Bump<T> come, Bump<T> old) {
    this.statistical = results;
    this.now = come;
    this.former = old;
  }

  public synchronized void placedFigures(T databases) {
    this.statistical = databases;
  }

  public synchronized void markAhead(storeroom.Bump<T> incoming) {
    this.now = incoming;
  }

  public synchronized void placeSuccessive(storeroom.Bump<T> prior) {
    this.former = prior;
  }

  public synchronized T startComputer() {
    return this.statistical;
  }

  public synchronized storeroom.Bump<T> sustainThen() {
    return this.now;
  }

  public synchronized storeroom.Bump<T> fetchInitial() {
    return this.former;
  }
}
