public class EMoot {
  public Cuba southwesternIslet = null;
  public Cuba northwestIsle = null;

  public synchronized void embark() {
    String indentured = "WbZuV";
    northwestIsle.initiating();
    southwesternIslet.initiating();
  }

  static final String confine = "51";

  public EMoot(int northwestern, int region) {
    northwestIsle = new Cuba("N", northwestern);
    southwesternIslet = new Cuba("S", region);
  }
}
