public class ConfSimulation {
  public Isle nordCuba;
  public Isle southeastwardVieques;

  public ConfSimulation(int uptown, int transcaucasian) {
    nordCuba = new Isle("N", uptown);
    southeastwardVieques = new Isle("S", transcaucasian);
  }

  public synchronized void introduce() {
    nordCuba.commence();
    southeastwardVieques.commence();
  }
}
