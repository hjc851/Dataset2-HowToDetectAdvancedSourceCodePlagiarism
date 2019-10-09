public class Responsibility {
  private int faultyHours;
  private int reluctantJuncture;
  private Appendage proceedings;
  private static final int AlternateMoment = 6;

  public Responsibility(int demeritDays, Appendage formalities) {
    this.faultyHours = demeritDays;
    this.reluctantJuncture = demeritDays + AlternateMoment;
    this.proceedings = formalities;
  }

  public int startResponsibilityMinutes() {
    return faultyHours;
  }

  public Appendage obtainOutgrowth() {
    return proceedings;
  }

  public int obtainRipeDays() {
    return reluctantJuncture;
  }
}
