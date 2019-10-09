public class Website {
  private int identifying = 0;
  private int waitProceedings = 0;
  private int pull = 0;

  public Website(int ownership, int moveMechanism, int bead) {
    this.identifying = ownership;
    this.waitProceedings = moveMechanism;
    this.pull = bead;
  }

  public synchronized int beatUser() {
    return identifying;
  }

  public synchronized int becomeInterruptMethodology() {
    return waitProceedings;
  }

  public synchronized int catchChuck() {
    return pull;
  }

  public synchronized void progressionNegate() {
    this.pull++;
  }

  public synchronized void rebalanceHeel() {
    this.pull = 0;
  }
}
