public class Negligence {
  public int fractureDay;
  public int ableMinutes;
  public Proceeding act;
  public static final int AlternatesAmount = 6;

  public Negligence(int defectMoment, Proceeding operation) {
    this.fractureDay = defectMoment;
    this.ableMinutes = defectMoment + AlternatesAmount;
    this.act = operation;
  }

  public synchronized int findErrorSentence() {
    return fractureDay;
  }

  public synchronized Proceeding conveyFormalities() {
    return act;
  }

  public synchronized int letAvailableHours() {
    return ableMinutes;
  }
}
