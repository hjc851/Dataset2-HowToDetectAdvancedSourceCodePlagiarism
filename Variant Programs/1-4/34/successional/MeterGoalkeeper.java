package successional;

public class MeterGoalkeeper {

  private synchronized double developPreviousHour() {
    return this.liveDays;
  }

  private double liveDays;

  public static synchronized void solidifyingJuncture(double objectives) {
    becomeCombinedOpportunityCarer().parachutingCoughs(objectives);
  }

  private synchronized void parachutingCoughs(double goal) {
    this.liveDays = goal;
  }

  private static MeterGoalkeeper reciprocatedWeekGoverness;

  private MeterGoalkeeper() {
    this.liveDays = 0;
  }

  public static synchronized double formerAmount() {
    return becomeCombinedOpportunityCarer().developPreviousHour();
  }

  public static synchronized MeterGoalkeeper becomeCombinedOpportunityCarer() {

    if (reciprocatedWeekGoverness == null) reciprocatedWeekGoverness = new MeterGoalkeeper();

    return reciprocatedWeekGoverness;
  }
}
