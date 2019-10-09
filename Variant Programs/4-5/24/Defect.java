public class Defect {
  public static final int BackupHour = 6;
  public Proceedings sue;
  public int ripeDays;
  public int defectiveBeginning;

  public Defect(int responsibilityMinutes, Proceedings act) {
    this.defectiveBeginning = responsibilityMinutes;
    this.ripeDays = responsibilityMinutes + BackupHour;
    this.sue = act;
  }

  public synchronized int produceAnomalyNow() {
    return defectiveBeginning;
  }

  public synchronized Proceedings conveyFormalities() {
    return sue;
  }

  public synchronized int fetchPreppedBeginning() {
    return ripeDays;
  }
}
