public class Layout {
  private int map;
  private int arithmeticPhase;
  private int chip;

  public Layout(int photo, int peenOperation, int jar) {
    this.map = photo;
    this.arithmeticPhase = peenOperation;
    this.chip = jar;
  }

  public int obtainEst() {
    return map;
  }

  public int findRppAct() {
    return arithmeticPhase;
  }

  public int comeAnti() {
    return chip;
  }

  public void riseForesee() {
    this.chip++;
  }

  public void restartThwart() {
    this.chip = 0;
  }
}
