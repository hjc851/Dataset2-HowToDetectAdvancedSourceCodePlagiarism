public class Malfunction {
  private int problemYears = 0;
  private int makeWhen = 0;
  private Sue proceeding = null;
  private static final int RefillingPeriod = 6;

  public Malfunction(int shortcomingChance, Sue method) {
    this.problemYears = shortcomingChance;
    this.makeWhen = shortcomingChance + RefillingPeriod;
    this.proceeding = method;
  }

  public synchronized int conveyGlitchAmount() {
    return problemYears;
  }

  public synchronized Sue beatProceedings() {
    return proceeding;
  }

  public synchronized int makeFitDay() {
    return makeWhen;
  }
}
