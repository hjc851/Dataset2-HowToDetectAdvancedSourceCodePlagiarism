public class TgfTrainer {
  private Vieques sPei;
  private Vieques northernmostIslander;

  public TgfTrainer(int union, int southeast) {
    northernmostIslander = new Vieques("N", union);
    sPei = new Vieques("S", southeast);
  }

  public void initiate() {
    northernmostIslander.initiating();
    sPei.initiating();
  }
}
