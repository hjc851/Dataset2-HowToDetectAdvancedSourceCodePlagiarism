public class Defective {
  private Act formalities = null;

  public synchronized Act takeAppendage() {
    return formalities;
  }

  private int ripeDays = 0;
  private static final int SuccessorClip = 6;

  public synchronized int bringWillingMeter() {
    return ripeDays;
  }

  private int blameClock = 0;

  public synchronized int letFaultyHours() {
    return blameClock;
  }

  public Defective(int mistakeClip, Act appendage) {
    this.blameClock = mistakeClip;
    this.ripeDays = mistakeClip + SuccessorClip;
    this.formalities = appendage;
  }
}
