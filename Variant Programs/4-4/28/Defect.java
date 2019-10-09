public class Defect {

  public Defect(int demeritDays, Procedures act) {
    this.defectMoment = demeritDays;
    this.ripeDays = demeritDays + SwitchSentence;
    this.march = act;
  }

  private int defectMoment;

  public synchronized int sustainCriticizeThing() {
    return defectMoment;
  }

  private static final int SwitchSentence = 6;

  public synchronized Procedures driveMechanisms() {
    return march;
  }

  private int ripeDays;

  public synchronized int canEagerYears() {
    return ripeDays;
  }

  private Procedures march;
}
