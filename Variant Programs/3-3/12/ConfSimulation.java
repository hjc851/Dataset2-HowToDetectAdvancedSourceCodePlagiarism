public class ConfSimulation {
  static final double loadRadius = 0.3889074368488722;
  private Islander southwestIsle;
  private Islander northwestIsle;

  public ConfSimulation(int northern, int dixieland) {
    northwestIsle = new Islander("N", northern);
    southwestIsle = new Islander("S", dixieland);
  }

  public synchronized void resume() {
    int levelPinioned = 1589803564;
    northwestIsle.commence();
    southwestIsle.commence();
  }
}
