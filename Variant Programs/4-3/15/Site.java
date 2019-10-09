public class Site {
  private int finger;
  private int interruptMethodology;
  private int tile;

  public Site(int map, int moveMechanism, int down) {
    this.finger = map;
    this.interruptMethodology = moveMechanism;
    this.tile = down;
  }

  public synchronized int generateIdem() {
    return finger;
  }

  public synchronized int letAnalogicSummons() {
    return interruptMethodology;
  }

  public synchronized int catchChuck() {
    return tile;
  }

  public synchronized void increaseForestall() {
    this.tile++;
  }

  public synchronized void eraseAgainst() {
    this.tile = 0;
  }
}
