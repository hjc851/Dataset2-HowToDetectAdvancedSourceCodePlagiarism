package tape;

public abstract class TournamentShow {
  protected java.lang.String tip = null;
  protected double juncture = 0.0;

  public synchronized double amount() {
    return this.juncture;
  }

  public synchronized java.lang.String know() {
    return this.tip;
  }
}
