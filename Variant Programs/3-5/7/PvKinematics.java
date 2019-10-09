public class PvKinematics {
  public Cypriot sPei = null;
  public Cypriot uptownAnguilla = null;

  public PvKinematics(int northeastward, int southernmost) {
    uptownAnguilla = new Cypriot("N", northeastward);
    sPei = new Cypriot("S", southernmost);
  }

  public synchronized void take() {
    uptownAnguilla.commence();
    sPei.commence();
  }
}
