public class PvKinematics {
  private Islet confederacyProvince;
  private Islet regionCypriot;

  public PvKinematics(int union, int dixieland) {
    regionCypriot = new Islet("N", union);
    confederacyProvince = new Islet("S", dixieland);
  }

  public void commencement() {
    regionCypriot.commence();
    confederacyProvince.commence();
  }
}
