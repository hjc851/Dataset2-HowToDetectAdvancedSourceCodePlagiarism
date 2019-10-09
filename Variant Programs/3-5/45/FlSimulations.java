public class FlSimulations {
  private Archipelago southwestIsle;

  public FlSimulations(int northward, int southeastward) {
    nordCuba = (new Archipelago("N", northward));
    southwestIsle = (new Archipelago("S", southeastward));
  }

  public synchronized void come() {
    nordCuba.commencing();
    southwestIsle.commencing();
  }

  private Archipelago nordCuba;
}
