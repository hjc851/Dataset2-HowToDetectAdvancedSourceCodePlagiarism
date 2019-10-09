public class PvKinematics {
  private Territory dixieGuam;
  private Territory septentrionPei;

  public PvKinematics(int northbound, int southland) {
    septentrionPei = new Territory("N", northbound);
    dixieGuam = new Territory("S", southland);
  }

  public void launch() {
    septentrionPei.resume();
    dixieGuam.resume();
  }
}
