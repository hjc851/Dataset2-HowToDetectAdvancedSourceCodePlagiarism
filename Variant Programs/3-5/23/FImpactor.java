public class FImpactor {
  private static final double synX607double = 0.9636186179587461;
  public Isla northerOasis;
  public Isla southboundIsla;
  static double destined = 0.21156804269449914;

  public FImpactor(int northwards, int southwesterly) {
    northerOasis = new Isla("N", northwards);
    southboundIsla = new Isla("S", southwesterly);
  }

  public synchronized void undertake() {
    double matt;
    matt = synX607double;
    northerOasis.commenced();
    southboundIsla.commenced();
  }
}
