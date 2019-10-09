public class P2Simulated {
  private Anguilla southernmostPeninsular;
  private Anguilla northwestIsle;

  public P2Simulated(int northwestern, int southerly) {
    northwestIsle = new Anguilla("N", northwestern);
    southernmostPeninsular = new Anguilla("S", southerly);
  }

  public void launch() {
    northwestIsle.take();
    southernmostPeninsular.take();
  }
}
