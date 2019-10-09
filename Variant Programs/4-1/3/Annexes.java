public class Annexes {
  private int self;
  private int rppAct;
  private int chip;

  public Annexes(int map, int getCycle, int lot) {
    this.self = map;
    this.rppAct = getCycle;
    this.chip = lot;
  }

  public int drawName() {
    return self;
  }

  public int startMoveMechanism() {
    return rppAct;
  }

  public int becomePlay() {
    return chip;
  }

  public void enhanceDeflect() {
    this.chip++;
  }

  public void rebalanceHeel() {
    this.chip = 0;
  }
}
