public class AtAnalogue {

  public AtAnalogue(int northbound, int southeastward) {
    northmostInsular = new Archipelago("N", northbound);
    southwesterlyEnclave = new Archipelago("S", southeastward);
  }

  private Archipelago southwesterlyEnclave = null;

  public synchronized void initiating() {
    northmostInsular.opens();
    southwesterlyEnclave.opens();
  }

  private Archipelago northmostInsular = null;
}
