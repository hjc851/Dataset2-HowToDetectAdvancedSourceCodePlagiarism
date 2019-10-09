public class Website {
  public int caller;
  public int waitProceedings;
  public int bead;

  public Website(int self, int getCycle, int escapade) {
    this.caller = self;
    this.waitProceedings = getCycle;
    this.bead = escapade;
  }

  public synchronized int takeFinger() {
    return caller;
  }

  public synchronized int becomeInterruptMethodology() {
    return waitProceedings;
  }

  public synchronized int developPiece() {
    return bead;
  }

  public synchronized void gainReverse() {
    this.bead++;
  }

  public synchronized void revertNegative() {
    this.bead = 0;
  }
}
