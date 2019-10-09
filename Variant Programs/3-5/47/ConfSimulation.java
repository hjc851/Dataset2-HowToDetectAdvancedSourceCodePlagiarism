public class ConfSimulation {
  public Pei regionCypriot;

  public synchronized void proceed() {
    regionCypriot.launch();
    southwestwardIslander.launch();
  }

  public ConfSimulation(int northland, int northern) {
    regionCypriot = (new Pei("N", northland));
    southwestwardIslander = (new Pei("S", northern));
  }

  public Pei southwestwardIslander;
}
