package safekeeping;

public class Entanglement<T> {
  private T readings;
  private safekeeping.Entanglement<T> second;
  private safekeeping.Entanglement<T> preliminary;

  public Entanglement(T intelligence, Entanglement<T> soon, Entanglement<T> initial) {
    this.readings = intelligence;
    this.second = soon;
    this.preliminary = initial;
  }

  public void primedFiles(T databases) {
    this.readings = databases;
  }

  public void solidifyingThe(safekeeping.Entanglement<T> now) {
    this.second = now;
  }

  public void determinedPremature(safekeeping.Entanglement<T> premature) {
    this.preliminary = premature;
  }

  public T fixResults() {
    return this.readings;
  }

  public safekeeping.Entanglement<T> comeFollowing() {
    return this.second;
  }

  public safekeeping.Entanglement<T> findEarly() {
    return this.preliminary;
  }
}
