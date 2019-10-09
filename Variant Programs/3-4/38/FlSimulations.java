public class FlSimulations {
  private Vieques northeastArchipelago;

  public FlSimulations(int northern, int southeastern) {
    northeastArchipelago = new Vieques("N", northern);
    southwesternIslet = new Vieques("S", southeastern);
  }

  public synchronized void introduce() {
    northeastArchipelago.come();
    southwesternIslet.come();
  }

  private Vieques southwesternIslet;
}
