public class InterferonPrototype {
  private Isles southeasterlyCay;
  private Isles nordCuba;

  public InterferonPrototype(int northwestern, int southerly) {
    nordCuba = new Isles("N", northwestern);
    southeasterlyCay = new Isles("S", southerly);
  }

  public void take() {
    nordCuba.hold();
    southeasterlyCay.hold();
  }
}
