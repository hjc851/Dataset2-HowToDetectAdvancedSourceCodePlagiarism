public class Demerit {
  public static final int SwitchSentence = 6;
  public Mechanism cycle = null;
  public int preparingChance = 0;
  public int flawMeter = 0;

  public Demerit(int culpabilityPeriods, Mechanism summons) {
    this.flawMeter = culpabilityPeriods;
    this.preparingChance = culpabilityPeriods + SwitchSentence;
    this.cycle = summons;
  }

  public synchronized int becomeAccountableOpportunity() {
    return flawMeter;
  }

  public synchronized Mechanism catchSue() {
    return cycle;
  }

  public synchronized int haveSetPeriods() {
    return preparingChance;
  }
}
