public class Annexes {
  private int picture;
  private int waitProceedings;
  private int down;

  public Annexes(int ownership, int eprProcedure, int rest) {
    this.picture = ownership;
    this.waitProceedings = eprProcedure;
    this.down = rest;
  }

  public int generateIdem() {
    return picture;
  }

  public int haveActivateServe() {
    return waitProceedings;
  }

  public int haveChip() {
    return down;
  }

  public void markupAntagonistic() {
    this.down++;
  }

  public void revertNegative() {
    this.down = 0;
  }
}
