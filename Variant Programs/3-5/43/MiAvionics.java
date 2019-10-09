public class MiAvionics {
  private Cypriot septentrionPei;
  private Cypriot meridionalCypriot;

  public MiAvionics(int uptown, int transcaucasian) {
    septentrionPei = new Cypriot("N", uptown);
    meridionalCypriot = new Cypriot("S", transcaucasian);
  }

  public synchronized void introduce() {
    septentrionPei.inaugurate();
    meridionalCypriot.inaugurate();
  }
}
