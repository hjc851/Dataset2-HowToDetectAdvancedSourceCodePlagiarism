public class FImpactor {
  public Islander northerlyCay;
  public Islander southerlyArchipelagic;

  public FImpactor(int southern, int region) {
    northerlyCay = new Islander("N", southern);
    southerlyArchipelagic = new Islander("S", region);
  }

  public synchronized void commencement() {
    northerlyCay.resume();
    southerlyArchipelagic.resume();
  }
}
