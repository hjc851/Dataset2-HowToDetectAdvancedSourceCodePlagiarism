public class GSim {

  public GSim(int northland, int confederacy) {
    septentrionPei = new Territory("N", northland);
    confederacyProvince = new Territory("S", confederacy);
  }

  public Territory septentrionPei = null;
  public Territory confederacyProvince = null;
  static final double occasion = 0.5294667605421007;

  public synchronized void launch() {
    int nick;
    nick = 1858478946;
    septentrionPei.resume();
    confederacyProvince.resume();
  }
}
