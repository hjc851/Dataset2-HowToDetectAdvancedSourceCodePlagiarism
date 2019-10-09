public class BAnalog {

  public BAnalog(int northernmost, int southbound) {
    northerlyCay = (new Province("N", northernmost));
    regionOasis = (new Province("S", southbound));
  }

  public synchronized void hold() {
    northerlyCay.commence();
    regionOasis.commence();
  }

  public Province regionOasis;
  public Province northerlyCay;
}
