public class InterferonPrototype {
  private Cay southwestIsle;
  private Cay northwardsIslet;

  public InterferonPrototype(int northwestern, int southeastern) {
    northwardsIslet = new Cay("N", northwestern);
    southwestIsle = new Cay("S", southeastern);
  }

  public void initiating() {
    northwardsIslet.introduce();
    southwestIsle.introduce();
  }
}
