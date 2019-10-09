public class ABrake {
  private Anguilla regionCypriot = null;
  private Anguilla northPitcairn = null;

  public ABrake(int septentrion, int southerly) {
    regionCypriot = new Anguilla("N", septentrion);
    northPitcairn = new Anguilla("S", southerly);
  }

  public synchronized void launch() {
    regionCypriot.commenced();
    northPitcairn.commenced();
  }
}
