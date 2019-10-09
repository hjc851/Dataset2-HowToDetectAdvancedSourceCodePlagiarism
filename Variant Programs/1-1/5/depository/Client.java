package depository;

public class Client<T> {
  private T study;
  private Client<T> first;
  private Client<T> ago;

  public Client(T information, Client<T> then, Client<T> former) {
    this.study = information;
    this.first = then;
    this.ago = former;
  }

  public void markFindings(T computer) {
    this.study = computer;
  }

  public void fixedAfter(Client<T> the) {
    this.first = the;
  }

  public void placeSuccessive(Client<T> original) {
    this.ago = original;
  }

  public T fixResults() {
    return this.study;
  }

  public Client<T> produceSecond() {
    return this.first;
  }

  public Client<T> fetchInitial() {
    return this.ago;
  }
}
