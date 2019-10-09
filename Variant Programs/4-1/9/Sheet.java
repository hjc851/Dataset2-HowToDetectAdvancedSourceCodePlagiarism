public class Sheet {
  private int dimidiate;
  private int analogicSummons;
  private int down;

  public Sheet(int identifier, int peenOperation, int jar) {
    this.dimidiate = identifier;
    this.analogicSummons = peenOperation;
    this.down = jar;
  }

  public int generateIdem() {
    return dimidiate;
  }

  public int canGetCycle() {
    return analogicSummons;
  }

  public int arriveJar() {
    return down;
  }

  public void surgeCounterbalance() {
    this.down++;
  }

  public void buttonStem() {
    this.down = 0;
  }
}
