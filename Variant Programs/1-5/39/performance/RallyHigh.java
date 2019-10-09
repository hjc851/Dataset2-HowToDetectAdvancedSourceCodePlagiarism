package performance;

public abstract class RallyHigh {

  public synchronized double clock() {
    return this.when;
  }

  public synchronized String zip() {
    return this.intel;
  }

  public String intel;
  public double when;
}
