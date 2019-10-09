public class Failures {
  private int errorSentence;
  private int fitDay;
  private Phase methods;
  private static final int AlternateMoment = 6;

  public Failures(int demeritDays, Phase negotiations) {
    this.errorSentence = demeritDays;
    this.fitDay = demeritDays + AlternateMoment;
    this.methods = negotiations;
  }

  public int letFaultyHours() {
    return errorSentence;
  }

  public Phase goProcedure() {
    return methods;
  }

  public int goPrimedClock() {
    return fitDay;
  }
}
