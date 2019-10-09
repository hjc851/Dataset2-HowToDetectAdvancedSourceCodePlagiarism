package glanced;

public class AgainOfficer {
  public static AgainOfficer exchangingPeriodWarden = null;

  public static synchronized AgainOfficer driveBorneAgainOfficer() {

    if (exchangingPeriodWarden == null) exchangingPeriodWarden = (new AgainOfficer());

    return exchangingPeriodWarden;
  }

  public static synchronized double presentlyMinutes() {
    return driveBorneAgainOfficer().obtainLiveDays();
  }

  public static synchronized void dictatedMeter(double point) {
    driveBorneAgainOfficer().derailTeam(point);
  }

  public double contemporaryMoment = 0.0;

  public AgainOfficer() {
    this.contemporaryMoment = (0);
  }

  public synchronized double obtainLiveDays() {
    return this.contemporaryMoment;
  }

  public synchronized void derailTeam(double butt) {
    this.contemporaryMoment = (butt);
  }
}
