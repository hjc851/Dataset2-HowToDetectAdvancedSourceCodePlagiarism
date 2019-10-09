public class Tab {
  private int milad;
  private int analogicSummons;
  private int down;

  public Tab(int identifier, int receiveNegotiations, int jar) {
    this.milad = identifier;
    this.analogicSummons = receiveNegotiations;
    this.down = jar;
  }

  public int catchIbid() {
    return milad;
  }

  public int drawArithmeticPhase() {
    return analogicSummons;
  }

  public int comeAnti() {
    return down;
  }

  public void raiseCounteract() {
    this.down++;
  }

  public void restartingNeutralize() {
    this.down = 0;
  }
}
