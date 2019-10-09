public class Folio {
  private static final int synX1280int = 0;
  public int est;
  public int waitProceedings;
  public int rest;

  public Folio(int dimidiate, int resetMechanisms, int line) {
    this.est = dimidiate;
    this.waitProceedings = resetMechanisms;
    this.rest = line;
  }

  public synchronized int startPicture() {
    return est;
  }

  public synchronized int canGetCycle() {
    return waitProceedings;
  }

  public synchronized int beatTile() {
    return rest;
  }

  public synchronized void surgeCounterbalance() {
    this.rest++;
  }

  public synchronized void restartThwart() {
    this.rest = synX1280int;
  }
}
