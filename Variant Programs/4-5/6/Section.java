public class Section {
  private int identifier = 0;
  private int activateServe = 0;
  private int piece = 0;

  public Section(int picture, int peenOperation, int down) {
    this.identifier = picture;
    this.activateServe = peenOperation;
    this.piece = down;
  }

  public synchronized int produceMap() {
    return identifier;
  }

  public synchronized int canGetCycle() {
    return activateServe;
  }

  public synchronized int generateDown() {
    return piece;
  }

  public synchronized void riseForesee() {
    this.piece++;
  }

  public synchronized void readjustForestall() {
    this.piece = 0;
  }
}
