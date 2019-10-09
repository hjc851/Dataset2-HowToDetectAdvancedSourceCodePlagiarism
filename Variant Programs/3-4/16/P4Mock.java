public class P4Mock {
  private Isla northlandGuam = null;
  private Isla southernPeninsula = null;
  static String describe = "57ckGw1x7bwXa5ig";

  public P4Mock(int septentrion, int southland) {
    northlandGuam = new Isla("N", septentrion);
    southernPeninsula = new Isla("S", southland);
  }

  public synchronized void initiating() {
    double essential;
    essential = 0.6494424402946718;
    northlandGuam.come();
    southernPeninsula.come();
  }
}
