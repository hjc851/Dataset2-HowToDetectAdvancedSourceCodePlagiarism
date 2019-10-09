public class EMoot {

  public synchronized void introduce() {
    northboundTerritory.opens();
    dixieGuam.opens();
  }

  public EMoot(int northland, int northern) {
    northboundTerritory = (new Insular("N", northland));
    dixieGuam = (new Insular("S", northern));
  }

  private Insular dixieGuam;
  private Insular northboundTerritory;
}
