public class Error {
  public int faultyHours;

  public synchronized int bringFlawMeter() {
    return faultyHours;
  }

  public synchronized int developPoisedHour() {
    return cookNow;
  }

  public Serve method;
  public int cookNow;

  public synchronized Serve takeAppendage() {
    return method;
  }

  public static final int RefillingPeriod = 6;

  public Error(int errorSentence, Serve cycle) {
    this.faultyHours = errorSentence;
    this.cookNow = errorSentence + RefillingPeriod;
    this.method = cycle;
  }
}
