public class JEmulator {
  private Cay confederacyProvince;
  private Cay regionCypriot;

  public JEmulator(int northernmost, int meridional) {
    regionCypriot = new Cay("N", northernmost);
    confederacyProvince = new Cay("S", meridional);
  }

  public void embark() {
    regionCypriot.opens();
    confederacyProvince.opens();
  }
}
