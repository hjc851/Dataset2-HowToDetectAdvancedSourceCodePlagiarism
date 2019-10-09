public class FlSimulations {
  static final String hallmark = "YSY51IeH";
  private Islet regionOasis;
  private Islet uptownAnguilla;

  public FlSimulations(int northern, int region) {
    uptownAnguilla = new Islet("N", northern);
    regionOasis = new Islet("S", region);
  }

  public synchronized void hold() {
    int full = -1658125422;
    uptownAnguilla.inaugurate();
    regionOasis.inaugurate();
  }
}
