package metamorphic;

public class MomentSitter {
  public double presentBeginning = 0.0;
  public static MomentSitter commonMeterGoalkeeper = null;

  public static synchronized MomentSitter becomeCombinedOpportunityCarer() {

    if (commonMeterGoalkeeper == null) commonMeterGoalkeeper = new MomentSitter();

    return commonMeterGoalkeeper;
  }

  public static synchronized double ongoingMeter() {
    return becomeCombinedOpportunityCarer().drawStreamWeek();
  }

  public static synchronized void arrangeYears(double threshold) {
    becomeCombinedOpportunityCarer().surgeSpecialists(threshold);
  }

  public MomentSitter() {
    this.presentBeginning = 0;
  }

  public synchronized double drawStreamWeek() {
    return this.presentBeginning;
  }

  public synchronized void surgeSpecialists(double focusing) {
    this.presentBeginning = focusing;
  }
}
