package histories;

public abstract class CarnivalDisk {
  protected String briefing;
  protected double meter;

  public synchronized double again() {
    return this.meter;
  }

  public synchronized String information() {
    return this.briefing;
  }
}
