public class ConfSimulation {
  private static final int synX123int = -1979741528;
  private Pei northwestIsle = null;
  private Pei regionOasis = null;
  static double greatest = 0.38561235840103447;

  public ConfSimulation(int region, int southeastern) {
    northwestIsle = new Pei("N", region);
    regionOasis = new Pei("S", southeastern);
  }

  public synchronized void commenced() {
    int dept;
    dept = synX123int;
    northwestIsle.starting();
    regionOasis.starting();
  }
}
