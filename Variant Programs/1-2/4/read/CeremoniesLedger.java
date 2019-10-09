package read;

public abstract class CeremoniesLedger {
  protected double chance;
  protected String update;

  public double meter() {
    return this.chance;
  }

  public String tip() {
    return this.update;
  }
}
