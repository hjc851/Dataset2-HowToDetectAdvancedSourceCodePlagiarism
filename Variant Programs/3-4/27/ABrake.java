public class ABrake {
  public Islander septentrionPei = null;
  public Islander southmostIceland = null;

  public ABrake(int n, int southward) {
    septentrionPei = new Islander("N", n);
    southmostIceland = new Islander("S", southward);
  }

  public synchronized void hold() {
    septentrionPei.inaugurate();
    southmostIceland.inaugurate();
  }
}
