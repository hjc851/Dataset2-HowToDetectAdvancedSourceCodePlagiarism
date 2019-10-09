public class PtDemo {
  private Insular regionOasis;
  private Insular regionCypriot;

  public PtDemo(int northbound, int southwestern) {
    regionCypriot = new Insular("N", northbound);
    regionOasis = new Insular("S", southwestern);
  }

  public void started() {
    regionCypriot.commencement();
    regionOasis.commencement();
  }
}
