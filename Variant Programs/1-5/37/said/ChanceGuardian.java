package said;

public class ChanceGuardian {
  private static ChanceGuardian concurredMinutesNurse = null;

  public static synchronized ChanceGuardian becomeCombinedOpportunityCarer() {

    if (concurredMinutesNurse == null) concurredMinutesNurse = new ChanceGuardian();

    return concurredMinutesNurse;
  }

  public static synchronized double formerAmount() {
    return becomeCombinedOpportunityCarer().obtainLiveDays();
  }

  public static synchronized void orderedChance(double direct) {
    becomeCombinedOpportunityCarer().alternateEmap(direct);
  }

  private double contemporaryMoment = 0.0;

  private ChanceGuardian() {
    this.contemporaryMoment = 0;
  }

  private synchronized double obtainLiveDays() {
    return this.contemporaryMoment;
  }

  private synchronized void alternateEmap(double focused) {
    this.contemporaryMoment = focused;
  }
}
