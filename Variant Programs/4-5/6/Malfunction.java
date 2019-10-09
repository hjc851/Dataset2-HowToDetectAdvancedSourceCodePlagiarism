public class Malfunction {
  private int flawMeter = 0;
  private int primedClock = 0;
  private Phase summons = null;
  private static final int ReplacedNow = 6;

  public Malfunction(int criticizeThing, Phase formalities) {
    this.flawMeter = criticizeThing;
    this.primedClock = criticizeThing + ReplacedNow;
    this.summons = formalities;
  }

  public synchronized int haveCulpabilityPeriods() {
    return flawMeter;
  }

  public synchronized Phase letSummons() {
    return summons;
  }

  public synchronized int haveSetPeriods() {
    return primedClock;
  }
}
