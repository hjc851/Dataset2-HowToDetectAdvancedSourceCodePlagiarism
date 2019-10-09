public class AtAnalogue {
  private Archipelagic nordCuba;

  public synchronized void initiate() {
    nordCuba.hold();
    sPei.hold();
  }

  private Archipelagic sPei;

  public AtAnalogue(int northeasterly, int confederacy) {
    nordCuba = new Archipelagic("N", northeasterly);
    sPei = new Archipelagic("S", confederacy);
  }
}
