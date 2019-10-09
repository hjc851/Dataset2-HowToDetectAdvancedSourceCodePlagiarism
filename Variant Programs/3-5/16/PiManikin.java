public class PiManikin {

  public synchronized void hold() {
    regionCypriot.enter();
    sPei.enter();
  }

  private Peninsular sPei;
  private Peninsular regionCypriot;

  public PiManikin(int northwestward, int southland) {
    regionCypriot = new Peninsular("N", northwestward);
    sPei = new Peninsular("S", southland);
  }
}
