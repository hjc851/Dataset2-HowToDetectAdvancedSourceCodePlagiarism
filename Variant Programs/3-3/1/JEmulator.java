public class JEmulator {
  public static final double northernThrottle = 0.6586717264519448;
  private Province southeasternAtoll = null;
  private Province nordCuba = null;

  public JEmulator(int norther, int southwest) {
    nordCuba = new Province("N", norther);
    southeasternAtoll = new Province("S", southwest);
  }

  public synchronized void undertake() {
    double subalternRestricting = 0.11388202463766328;
    nordCuba.commenced();
    southeasternAtoll.commenced();
  }
}
