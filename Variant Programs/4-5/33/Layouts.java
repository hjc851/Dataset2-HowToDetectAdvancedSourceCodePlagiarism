public class Layouts {
  public int identifying = 0;
  public int analogicSummons = 0;
  public int bars = 0;

  public Layouts(int milad, int allocateTreat, int bag) {
    this.identifying = (milad);
    this.analogicSummons = (allocateTreat);
    this.bars = (bag);
  }

  public synchronized int drawName() {
    return identifying;
  }

  public synchronized int becomeInterruptMethodology() {
    return analogicSummons;
  }

  public synchronized int obtainBead() {
    return bars;
  }

  public synchronized void progressionNegate() {
    this.bars++;
  }

  public synchronized void reprogramSideboard() {
    this.bars = (0);
  }
}
