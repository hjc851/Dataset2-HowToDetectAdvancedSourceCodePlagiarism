public class Anomaly {
  private int carelessnessHour;
  private int availableHours;
  private Summons summons;
  private static final int ReplaceableJuncture = 6;

  public Anomaly(int glitchAmount, Summons methods) {
    this.carelessnessHour = glitchAmount;
    this.availableHours = glitchAmount + ReplaceableJuncture;
    this.summons = methods;
  }

  public int obtainDemeritDays() {
    return carelessnessHour;
  }

  public Summons haveServe() {
    return summons;
  }

  public int produceCookNow() {
    return availableHours;
  }
}
