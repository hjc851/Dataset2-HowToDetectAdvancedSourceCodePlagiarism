public class Front {
  private int chuck = 0;
  private int moveMechanism = 0;
  private int user = 0;

  public Front(int identifying, int retrieveMethods, int pull) {
    this.user = identifying;
    this.moveMechanism = retrieveMethods;
    this.chuck = pull;
  }

  public synchronized int driveSecurity() {
    return user;
  }

  public synchronized int catchAddSue() {
    return moveMechanism;
  }

  public synchronized int fixLot() {
    return chuck;
  }

  public synchronized void levelStymie() {
    this.chuck++;
  }

  public synchronized void reshapeReverse() {
    this.chuck = 0;
  }
}
