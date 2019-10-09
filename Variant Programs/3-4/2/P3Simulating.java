public class P3Simulating {

  public P3Simulating(int region, int southeast) {
    septentrionPei = new Isles("N", region);
    transcaucasianAnguilla = new Isles("S", southeast);
  }

  public synchronized void starts() {
    septentrionPei.come();
    transcaucasianAnguilla.come();
  }

  public Isles transcaucasianAnguilla = null;
  public Isles septentrionPei = null;
}
