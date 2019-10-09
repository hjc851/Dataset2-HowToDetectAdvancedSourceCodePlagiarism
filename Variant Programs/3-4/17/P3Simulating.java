public class P3Simulating {
  static double jesusExtent = 0.07351989911802448;
  public Territory northwestIsle;
  public Territory southerlyArchipelagic;

  public P3Simulating(int northeastern, int southwestward) {
    northwestIsle = new Territory("N", northeastern);
    southerlyArchipelagic = new Territory("S", southwestward);
  }

  public synchronized void undertake() {
    int apexSure;
    apexSure = -1305388440;
    northwestIsle.starting();
    southerlyArchipelagic.starting();
  }
}
