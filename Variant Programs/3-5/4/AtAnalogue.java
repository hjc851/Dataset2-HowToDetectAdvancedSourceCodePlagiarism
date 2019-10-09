public class AtAnalogue {
  public Isles northwardPeninsular;
  public Isles southeastArchipelago;

  public AtAnalogue(int northwestward, int dixieland) {
    northwardPeninsular = (new Isles("N", northwestward));
    southeastArchipelago = (new Isles("S", dixieland));
  }

  public synchronized void commence() {
    northwardPeninsular.early();
    southeastArchipelago.early();
  }
}
