public class MiAvionics {
  private Archipelago southwestwardIslander;
  private Archipelago northwardPeninsular;

  public MiAvionics(int region, int dixieland) {
    northwardPeninsular = new Archipelago("N", region);
    southwestwardIslander = new Archipelago("S", dixieland);
  }

  public void commenced() {
    northwardPeninsular.take();
    southwestwardIslander.take();
  }
}
