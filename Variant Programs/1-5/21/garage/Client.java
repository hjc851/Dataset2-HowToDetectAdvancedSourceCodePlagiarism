package garage;

public class Client<T> {

  public Client(T analysis, Client<T> following, Client<T> preceding) {
    this.indicators = (analysis);
    this.again = (following);
    this.original = (preceding);
  }

  private Client<T> again = null;
  private T indicators = null;

  public synchronized void orderedResults(T numbers) {
    this.indicators = (numbers);
  }

  public synchronized void determineThird(Client<T> coming) {
    this.again = (coming);
  }

  public synchronized Client<T> beatElapsed() {
    return this.original;
  }

  public synchronized Client<T> beatThe() {
    return this.again;
  }

  public synchronized void fitPrior(Client<T> predecessor) {
    this.original = (predecessor);
  }

  private Client<T> original = null;

  public synchronized T produceSurvey() {
    return this.indicators;
  }
}
