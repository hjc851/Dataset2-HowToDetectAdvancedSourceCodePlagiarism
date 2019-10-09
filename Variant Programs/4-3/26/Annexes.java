public class Annexes {
  private int handle = 0;
  private int abortAppendage = 0;
  private int piece = 0;

  public Annexes(int picture, int analogicSummons, int lite) {
    this.handle = picture;
    this.abortAppendage = analogicSummons;
    this.piece = lite;
  }

  public synchronized int conveyTag() {
    return handle;
  }

  public synchronized int arriveAntipyreticProcedures() {
    return abortAppendage;
  }

  public synchronized int haveChip() {
    return piece;
  }

  public synchronized void raisingAgainst() {
    this.piece++;
  }

  public synchronized void adjustedTabulator() {
    this.piece = 0;
  }
}
