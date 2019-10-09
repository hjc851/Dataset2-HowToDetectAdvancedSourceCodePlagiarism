public class P6Device {
  private Cypriot southeasterlyCay;
  private Cypriot northerlyCay;

  public P6Device(int region, int meridional) {
    northerlyCay = new Cypriot("N", region);
    southeasterlyCay = new Cypriot("S", meridional);
  }

  public void starting() {
    northerlyCay.starts();
    southeasterlyCay.starts();
  }
}
