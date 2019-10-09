package storing;

public class Client<T> {
  public Client<T> premature;
  public Client<T> soon;
  public T statistical;

  public Client(T survey, Client<T> last, Client<T> initial) {
    this.statistical = survey;
    this.soon = last;
    this.premature = initial;
  }

  public synchronized void situatedComputer(T results) {
    this.statistical = results;
  }

  public synchronized void markAhead(Client<T> again) {
    this.soon = again;
  }

  public synchronized void dictatedLate(Client<T> pre) {
    this.premature = pre;
  }

  public synchronized T driveIntelligence() {
    return this.statistical;
  }

  public synchronized Client<T> goFuture() {
    return this.soon;
  }

  public synchronized Client<T> beatElapsed() {
    return this.premature;
  }
}
