package best;

public abstract class SpectaclePrecedent {
  public double moment;
  public String dope;

  public synchronized double when() {
    return this.moment;
  }

  public synchronized String intelligence() {
    return this.dope;
  }
}
