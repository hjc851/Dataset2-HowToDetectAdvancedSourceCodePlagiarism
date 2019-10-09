public class Accountable {
  public int fractureDay;
  public int fixMonth;

  public synchronized int letFaultyHours() {
    return fractureDay;
  }

  public Procedures act;

  public synchronized Procedures arriveProcedures() {
    return act;
  }

  public Accountable(int responsibleWhen, Procedures summons) {
    this.fractureDay = responsibleWhen;
    this.fixMonth = responsibleWhen + TranspositionHours;
    this.act = summons;
  }

  public static final int TranspositionHours = 6;

  public synchronized int sustainGonnaThing() {
    return fixMonth;
  }
}
