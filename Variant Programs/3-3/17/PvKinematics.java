public class PvKinematics {
  public static final double northRestriction = 0.4583378950187119;
  public Cypriot southerlyArchipelagic = null;
  public Cypriot northernmostIslander = null;

  public PvKinematics(int northbound, int southeastern) {
    northernmostIslander = new Cypriot("N", northbound);
    southerlyArchipelagic = new Cypriot("S", southeastern);
  }

  public synchronized void introduce() {
    double appoint = 0.5938282719038879;
    northernmostIslander.early();
    southerlyArchipelagic.early();
  }
}
