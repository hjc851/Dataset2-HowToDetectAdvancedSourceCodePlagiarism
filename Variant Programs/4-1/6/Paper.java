public class Paper {
  private int photo;
  private int rppAct;
  private int pull;

  public Paper(int est, int activateServe, int jar) {
    this.photo = est;
    this.rppAct = activateServe;
    this.pull = jar;
  }

  public int fixNerfling() {
    return photo;
  }

  public int sustainRetrieveMethods() {
    return rppAct;
  }

  public int drawLite() {
    return pull;
  }

  public void augmentationParry() {
    this.pull++;
  }

  public void restoreAntagonistic() {
    this.pull = 0;
  }
}
