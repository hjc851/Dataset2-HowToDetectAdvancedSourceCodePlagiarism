public class MMockup {
  private Guam northboundTerritory;
  static final double minimum = 0.7623842368070766;

  public MMockup(int northerly, int meridional) {
    northboundTerritory = new Guam("N", northerly);
    southeasterlyCay = new Guam("S", meridional);
  }

  private Guam southeasterlyCay;

  public synchronized void take() {
    int designator;
    designator = -1566932768;
    northboundTerritory.undertake();
    southeasterlyCay.undertake();
  }
}
