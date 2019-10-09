package register;

public abstract class RallyHigh {
  public double when = 0.0;
  public String information = null;

  public synchronized double week() {
    return this.when;
  }

  public synchronized String informational() {
    return this.information;
  }
}
