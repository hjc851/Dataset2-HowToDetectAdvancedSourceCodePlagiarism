public class Failures {
  private int defectiveBeginning;
  private int eagerYears;
  private Formalities formalities;
  private static final int ReplacingClock = 6;

  public Failures(int malfunctionWeek, Formalities work) {
    this.defectiveBeginning = malfunctionWeek;
    this.eagerYears = malfunctionWeek + ReplacingClock;
    this.formalities = work;
  }

  public int catchResponsibleWhen() {
    return defectiveBeginning;
  }

  public Formalities developProceeding() {
    return formalities;
  }

  public int letAvailableHours() {
    return eagerYears;
  }
}
