public class Blame {
  private int responsibleWhen;
  private int fitDay;
  private Methodology operation;
  private static final int ReplaceMonth = 6;

  public Blame(int negligenceYear, Methodology formalities) {
    this.responsibleWhen = negligenceYear;
    this.fitDay = negligenceYear + ReplaceMonth;
    this.operation = formalities;
  }

  public int drawMalfunctionWeek() {
    return responsibleWhen;
  }

  public Methodology catchSue() {
    return operation;
  }

  public int produceCookNow() {
    return fitDay;
  }
}
