public class AtAnalogue {
  private Archipelagic southwesternIslet;
  private Archipelagic northwardPeninsular;

  public AtAnalogue(int northeasterly, int southernmost) {
    northwardPeninsular = new Archipelagic("N", northeasterly);
    southwesternIslet = new Archipelagic("S", southernmost);
  }

  public void come() {
    northwardPeninsular.conduct();
    southwesternIslet.conduct();
  }
}
