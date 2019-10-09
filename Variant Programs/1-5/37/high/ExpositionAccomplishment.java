package high;

public abstract class ExpositionAccomplishment {
  protected double week = 0.0;
  protected String enquiries = null;

  public synchronized double periods() {
    return this.week;
  }

  public synchronized String media() {
    return this.enquiries;
  }
}
