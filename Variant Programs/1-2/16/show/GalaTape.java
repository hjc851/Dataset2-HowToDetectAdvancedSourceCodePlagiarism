package show;

public abstract class GalaTape {
  protected double hour;
  protected String reporting;

  public double minutes() {
    return this.hour;
  }

  public String media() {
    return this.reporting;
  }
}
