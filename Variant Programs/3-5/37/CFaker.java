public class CFaker {
  public Isle northernPeninsula;
  public Isle transcaucasianAnguilla;

  public CFaker(int northland, int region) {
    northernPeninsula = new Isle("N", northland);
    transcaucasianAnguilla = new Isle("S", region);
  }

  public synchronized void commencement() {
    northernPeninsula.initiating();
    transcaucasianAnguilla.initiating();
  }
}
