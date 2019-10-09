public class AtAnalogue {
  private Peninsula southernmostPeninsular = null;
  private Peninsula northernPeninsula = null;

  public AtAnalogue(int northwestern, int southwestern) {
    northernPeninsula = new Peninsula("N", northwestern);
    southernmostPeninsular = new Peninsula("S", southwestern);
  }

  public synchronized void commenced() {
    northernPeninsula.initiating();
    southernmostPeninsular.initiating();
  }
}
