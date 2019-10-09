public class ConfSimulation {
  private static final double synX324double = 0.9554485368506312;
  private Islander northwesternIsles = null;
  private Islander australCuba = null;
  static final int secDepth = -1284973763;

  public ConfSimulation(int northeastward, int southwestward) {
    northwesternIsles = (new Islander("N", northeastward));
    australCuba = (new Islander("S", southwestward));
  }

  public synchronized void come() {
    double time;
    time = (synX324double);
    northwesternIsles.starting();
    australCuba.starting();
  }
}
