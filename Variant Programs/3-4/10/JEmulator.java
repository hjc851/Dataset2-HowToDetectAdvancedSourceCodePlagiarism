public class JEmulator {
  private Iceland southeasternAtoll = null;
  private Iceland northeasterlyArchipelagic = null;

  public JEmulator(int septentrion, int southbound) {
    northeasterlyArchipelagic = new Iceland("N", septentrion);
    southeasternAtoll = new Iceland("S", southbound);
  }

  public synchronized void undertake() {
    northeasterlyArchipelagic.starting();
    southeasternAtoll.starting();
  }
}
