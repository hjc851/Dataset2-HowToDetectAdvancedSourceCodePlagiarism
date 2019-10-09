public class FImpactor {
  private Vieques southboundIsla;
  private Vieques uptownAnguilla;

  public FImpactor(int northbound, int southward) {
    uptownAnguilla = new Vieques("N", northbound);
    southboundIsla = new Vieques("S", southward);
  }

  public void take() {
    uptownAnguilla.commencing();
    southboundIsla.commencing();
  }
}
