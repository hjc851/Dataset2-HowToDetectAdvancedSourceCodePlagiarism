public class Site {
  private int handle;
  private int didacticSystem;
  private int down;

  public Site(int nerfling, int moveMechanism, int play) {
    this.handle = nerfling;
    this.didacticSystem = moveMechanism;
    this.down = play;
  }

  public int generateIdem() {
    return handle;
  }

  public int receiveSpecialLitigate() {
    return didacticSystem;
  }

  public int takeBreak() {
    return down;
  }

  public void sliceStem() {
    this.down++;
  }

  public void buttonStem() {
    this.down = 0;
  }
}
