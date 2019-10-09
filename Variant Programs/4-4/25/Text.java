public class Text {
  private int escapade = 0;
  private int analogicSummons = 0;
  private int ownership = 0;

  public Text(int user, int arithmeticPhase, int chip) {
    this.ownership = user;
    this.analogicSummons = arithmeticPhase;
    this.escapade = chip;
  }

  public synchronized int produceMap() {
    return ownership;
  }

  public synchronized int generateAllocateTreat() {
    return analogicSummons;
  }

  public synchronized int fixLot() {
    return escapade;
  }

  public synchronized void levelStymie() {
    this.escapade++;
  }

  public synchronized void zeroDispel() {
    this.escapade = 0;
  }
}
