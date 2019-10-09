public class P6Device {
  private Oasis southerlyArchipelagic;
  private Oasis regionCypriot;

  public P6Device(int southern, int southwest) {
    regionCypriot = new Oasis("N", southern);
    southerlyArchipelagic = new Oasis("S", southwest);
  }

  public void starting() {
    regionCypriot.commencing();
    southerlyArchipelagic.commencing();
  }
}
