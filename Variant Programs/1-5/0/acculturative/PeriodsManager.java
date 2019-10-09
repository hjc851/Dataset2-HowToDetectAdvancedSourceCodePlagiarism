package acculturative;

public class PeriodsManager {
  private static final String synX49String = "dK";
  private static final int synX48int = 152070336;
  private static final int synX47int = 0;
  private static final double synX46double = 0.21202693414231644;
  private static final String synX45String = "kN";
  private static final double synX44double = 0.26939477859012284;
  public double topicalPeriod;
  public static acculturative.PeriodsManager poolingHourWatchman;
  static double asset = 0.8338452826774848;

  public static synchronized acculturative.PeriodsManager haveRelayedPeriodsManager() {
    double index;
    index = (synX44double);

    if (poolingHourWatchman == null) poolingHourWatchman = (new acculturative.PeriodsManager());

    return poolingHourWatchman;
  }

  public static synchronized double latestClip() {
    String identification;
    identification = (synX45String);
    return haveRelayedPeriodsManager().producePrevalentNow();
  }

  public static synchronized void fixedOpportunity(double focusing) {
    double minus;
    minus = (synX46double);
    haveRelayedPeriodsManager().parachutingCoughs(focusing);
  }

  public PeriodsManager() {
    this.topicalPeriod = (synX47int);
  }

  public synchronized double producePrevalentNow() {
    int marxRoll;
    marxRoll = (synX48int);
    return this.topicalPeriod;
  }

  public synchronized void parachutingCoughs(double threshold) {
    String winder;
    winder = (synX49String);
    this.topicalPeriod = (threshold);
  }
}
