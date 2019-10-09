public class Footnote {
  private int identification;
  private int getCycle;
  private int line;

  public Footnote(int card, int abortAppendage, int pull) {
    this.identification = card;
    this.getCycle = abortAppendage;
    this.line = pull;
  }

  public int haveHandle() {
    return identification;
  }

  public int canGetCycle() {
    return getCycle;
  }

  public int comeAnti() {
    return line;
  }

  public void raiseCounteract() {
    this.line++;
  }

  public void restartingNeutralize() {
    this.line = 0;
  }
}
