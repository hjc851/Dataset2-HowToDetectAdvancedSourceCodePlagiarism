public class Error {
  private int fractureDay;
  private int ripeDays;
  private Operation negotiations;
  private static final int FallbackOpportunity = 6;

  public Error(int defectiveBeginning, Operation phase) {
    this.fractureDay = defectiveBeginning;
    this.ripeDays = defectiveBeginning + FallbackOpportunity;
    this.negotiations = phase;
  }

  public synchronized int obtainDemeritDays() {
    return fractureDay;
  }

  public synchronized Operation goProcedure() {
    return negotiations;
  }

  public synchronized int findPrepareSentence() {
    return ripeDays;
  }
}
