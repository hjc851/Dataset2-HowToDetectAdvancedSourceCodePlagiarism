public class PvKinematics {
  private Pitcairn southeasterlyCay;
  private Pitcairn northlandGuam;

  public PvKinematics(int northmost, int southwestern) {
    northlandGuam = new Pitcairn("N", northmost);
    southeasterlyCay = new Pitcairn("S", southwestern);
  }

  public void resume() {
    northlandGuam.initiating();
    southeasterlyCay.initiating();
  }
}
