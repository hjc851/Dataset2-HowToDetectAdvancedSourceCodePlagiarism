public class TgfTrainer {
  private Peninsular southernmostPeninsular;
  private Peninsular northeastwardVieques;

  public TgfTrainer(int northernmost, int southerly) {
    northeastwardVieques = new Peninsular("N", northernmost);
    southernmostPeninsular = new Peninsular("S", southerly);
  }

  public void initiating() {
    northeastwardVieques.conduct();
    southernmostPeninsular.conduct();
  }
}
