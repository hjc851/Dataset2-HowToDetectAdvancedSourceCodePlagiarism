public class FlSimulations {
  public Islander nIceland;
  public Islander regionOasis;

  public FlSimulations(int northmost, int confederacy) {
    nIceland = (new Islander("N", northmost));
    regionOasis = (new Islander("S", confederacy));
  }

  public synchronized void starts() {
    nIceland.commence();
    regionOasis.commence();
  }
}
