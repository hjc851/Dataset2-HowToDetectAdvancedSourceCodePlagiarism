public class Responsible {
  private int responsibilityMinutes;
  private int preparesOpportunity;
  private Proceeding litigate;
  private static final int RenewalDay = 6;

  public Responsible(int responsibleWhen, Proceeding treat) {
    this.responsibilityMinutes = responsibleWhen;
    this.preparesOpportunity = responsibleWhen + RenewalDay;
    this.litigate = treat;
  }

  public int developCarelessnessHour() {
    return responsibilityMinutes;
  }

  public Proceeding obtainOutgrowth() {
    return litigate;
  }

  public int produceCookNow() {
    return preparesOpportunity;
  }
}
