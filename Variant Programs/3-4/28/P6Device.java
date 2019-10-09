public class P6Device {
  public Pitcairn northerOasis = null;
  public Pitcairn southwesternIslet = null;

  public P6Device(int nord, int southward) {
    northerOasis = new Pitcairn("N", nord);
    southwesternIslet = new Pitcairn("S", southward);
  }

  public synchronized void early() {
    northerOasis.initiate();
    southwesternIslet.initiate();
  }
}
