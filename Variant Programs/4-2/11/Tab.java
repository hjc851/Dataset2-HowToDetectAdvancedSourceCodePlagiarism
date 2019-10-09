public class Tab {
  private int peg;
  private int didacticSystem;
  private int nut;

  public Tab(int photo, int peenOperation, int down) {
    this.peg = photo;
    this.didacticSystem = peenOperation;
    this.nut = down;
  }

  public int generateIdem() {
    return peg;
  }

  public int driveResetMechanisms() {
    return didacticSystem;
  }

  public int haveChip() {
    return nut;
  }

  public void surgeCounterbalance() {
    this.nut++;
  }

  public void reshapeReverse() {
    this.nut = 0;
  }
}
