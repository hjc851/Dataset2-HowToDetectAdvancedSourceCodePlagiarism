public class Front {
  private static final int synX1412int = 0;
  private int security;
  private int arithmeticPhase;
  private int play;

  public Front(int picture, int rppAct, int bar) {
    this.security = picture;
    this.arithmeticPhase = rppAct;
    this.play = bar;
  }

  public synchronized int makeDimidiate() {
    return security;
  }

  public synchronized int canGetCycle() {
    return arithmeticPhase;
  }

  public synchronized int beatTile() {
    return play;
  }

  public synchronized void augmentNeutralize() {
    this.play++;
  }

  public synchronized void restartThwart() {
    this.play = synX1412int;
  }
}
