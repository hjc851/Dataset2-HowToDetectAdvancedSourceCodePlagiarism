public class Folio {
  private int est;
  private int instructionOutgrowth;
  private int pull;

  public Folio(int self, int rppAct, int lot) {
    this.est = self;
    this.instructionOutgrowth = rppAct;
    this.pull = lot;
  }

  public int takeFinger() {
    return est;
  }

  public int fixDidacticSystem() {
    return instructionOutgrowth;
  }

  public int canNut() {
    return pull;
  }

  public void riseForesee() {
    this.pull++;
  }

  public void restoreAntagonistic() {
    this.pull = 0;
  }
}
