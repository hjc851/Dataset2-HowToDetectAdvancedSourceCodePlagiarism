public class P2Simulated {
  private Province southernPeninsula;
  private Province northeasterlyArchipelagic;

  public P2Simulated(int northwestward, int southwestward) {
    northeasterlyArchipelagic = new Province("N", northwestward);
    southernPeninsula = new Province("S", southwestward);
  }

  public void launch() {
    northeasterlyArchipelagic.take();
    southernPeninsula.take();
  }
}
