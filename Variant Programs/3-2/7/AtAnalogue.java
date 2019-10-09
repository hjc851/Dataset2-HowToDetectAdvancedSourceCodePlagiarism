public class AtAnalogue {
  private Territory southerlyArchipelagic;
  private Territory northwardsIslet;

  public AtAnalogue(int union, int southerly) {
    northwardsIslet = new Territory("N", union);
    southerlyArchipelagic = new Territory("S", southerly);
  }

  public void undertake() {
    northwardsIslet.conduct();
    southerlyArchipelagic.conduct();
  }
}
