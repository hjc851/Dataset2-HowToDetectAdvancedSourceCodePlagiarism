public class Faulty {

  public Faulty(int accountableOpportunity, Work methods) {
    this.breakPeriod = accountableOpportunity;
    this.preparedClip = accountableOpportunity + SurrogateWhen;
    this.treat = methods;
  }

  private int breakPeriod;
  private static final int SurrogateWhen = 6;

  public synchronized int takeBreakPeriod() {
    return breakPeriod;
  }

  private int preparedClip;

  public synchronized Work generateTreat() {
    return treat;
  }

  public synchronized int comePreparedClip() {
    return preparedClip;
  }

  private Work treat;
}
