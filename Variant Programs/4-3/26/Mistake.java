public class Mistake {
  private int defectiveBeginning = 0;
  private int fixMonth = 0;
  private Treat formalities = null;
  private static final int SubstitutionDays = 6;

  public Mistake(int criticizeThing, Treat methodology) {
    this.defectiveBeginning = criticizeThing;
    this.fixMonth = criticizeThing + SubstitutionDays;
    this.formalities = methodology;
  }

  public synchronized int comeMistakeClip() {
    return defectiveBeginning;
  }

  public synchronized Treat receiveLitigate() {
    return formalities;
  }

  public synchronized int takeQuickPeriod() {
    return fixMonth;
  }
}
