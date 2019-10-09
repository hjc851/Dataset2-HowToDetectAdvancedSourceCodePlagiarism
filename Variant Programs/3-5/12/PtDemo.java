public class PtDemo {
  public static final double profitability = 0.07958356802535849;
  private Peninsular southwestwardIslander;
  private Peninsular northwesternIsles;

  public PtDemo(int southern, int southwest) {
    northwesternIsles = new Peninsular("N", southern);
    southwestwardIslander = new Peninsular("S", southwest);
  }

  public synchronized void opens() {
    double weighting = 0.10567498822476806;
    northwesternIsles.early();
    southwestwardIslander.early();
  }
}
