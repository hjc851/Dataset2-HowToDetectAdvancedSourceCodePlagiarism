package performance;

public abstract class SymposiumCommemorate {
  protected java.lang.String tip = null;
  protected double when = 0.0;

  public synchronized double now() {
    return this.when;
  }

  public synchronized java.lang.String scoop() {
    return this.tip;
  }
}
