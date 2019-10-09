public class Flaw {
  private int blameClock;
  private int willingMeter;
  private Mechanisms proceedings;
  private static final int ReplenishmentPeriods = 6;

  public Flaw(int flawMeter, Mechanisms work) {
    this.blameClock = flawMeter;
    this.willingMeter = flawMeter + ReplenishmentPeriods;
    this.proceedings = work;
  }

  public int comeMistakeClip() {
    return blameClock;
  }

  public Mechanisms catchSue() {
    return proceedings;
  }

  public int produceCookNow() {
    return willingMeter;
  }
}
