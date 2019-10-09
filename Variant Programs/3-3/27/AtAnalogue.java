public class AtAnalogue {
  private Oasis northeasterlyArchipelagic = null;

  public synchronized void opens() {
    northeasterlyArchipelagic.initiating();
    southernmostPeninsular.initiating();
  }

  private Oasis southernmostPeninsular = null;

  public AtAnalogue(int northerly, int southwest) {
    northeasterlyArchipelagic = new Oasis("N", northerly);
    southernmostPeninsular = new Oasis("S", southwest);
  }
}
