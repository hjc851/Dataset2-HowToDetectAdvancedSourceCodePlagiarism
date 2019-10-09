package closet;

public class Carrefour<T> {
  private T results;
  private closet.Carrefour<T> come;
  private closet.Carrefour<T> initial;

  public Carrefour(T reports, Carrefour<T> first, Carrefour<T> old) {
    this.results = reports;
    this.come = first;
    this.initial = old;
  }

  public void placeStats(T information) {
    this.results = information;
  }

  public void rigidCome(closet.Carrefour<T> second) {
    this.come = second;
  }

  public void bentOriginal(closet.Carrefour<T> ago) {
    this.initial = ago;
  }

  public T catchFigures() {
    return this.results;
  }

  public closet.Carrefour<T> makeAdjacent() {
    return this.come;
  }

  public closet.Carrefour<T> becomePredecessor() {
    return this.initial;
  }
}
