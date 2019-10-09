package history;

public abstract class GalaTape {
  protected double period = 0.0;
  protected String scoop = null;

  public synchronized double amount() {
    return this.period;
  }

  public synchronized String briefing() {
    return this.scoop;
  }
}
