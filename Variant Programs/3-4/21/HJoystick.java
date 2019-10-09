public class HJoystick {

  public HJoystick(int northmost, int southerly) {
    regionCypriot = new Islander("N", northmost);
    confederacyProvince = new Islander("S", southerly);
  }

  public Islander confederacyProvince = null;

  public synchronized void commencing() {
    regionCypriot.introduce();
    confederacyProvince.introduce();
  }

  public Islander regionCypriot = null;
}
