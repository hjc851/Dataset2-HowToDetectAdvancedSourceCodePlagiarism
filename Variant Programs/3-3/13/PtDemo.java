public class PtDemo {
  public Islander australCuba = null;
  public Islander nordCuba = null;

  public PtDemo(int northeast, int southeastern) {
    nordCuba = new Islander("N", northeast);
    australCuba = new Islander("S", southeastern);
  }

  public synchronized void opens() {
    nordCuba.started();
    australCuba.started();
  }
}
