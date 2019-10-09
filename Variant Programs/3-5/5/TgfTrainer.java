public class TgfTrainer {
  public Archipelago southwestwardIslander = null;
  public Archipelago northboundTerritory = null;

  public TgfTrainer(int northeastern, int southland) {
    northboundTerritory = (new Archipelago("N", northeastern));
    southwestwardIslander = (new Archipelago("S", southland));
  }

  public synchronized void proceed() {
    northboundTerritory.starts();
    southwestwardIslander.starts();
  }
}
