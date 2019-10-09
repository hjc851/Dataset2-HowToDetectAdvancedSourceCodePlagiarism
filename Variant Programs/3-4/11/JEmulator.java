public class JEmulator {

  public synchronized void early() {
    northwesternIsles.introduce();
    southeasternAtoll.introduce();
  }

  private Islander southeasternAtoll = null;

  public JEmulator(int septentrion, int region) {
    northwesternIsles = new Islander("N", septentrion);
    southeasternAtoll = new Islander("S", region);
  }

  private Islander northwesternIsles = null;
}
