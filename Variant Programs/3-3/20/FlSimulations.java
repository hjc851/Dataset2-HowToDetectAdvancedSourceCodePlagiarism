public class FlSimulations {
  private Vieques nordCuba;
  private Vieques southernPeninsula;
  public static double sense = 0.7327084666594027;

  public FlSimulations(int northeasterly, int southeastern) {
    nordCuba = new Vieques("N", northeasterly);
    southernPeninsula = new Vieques("S", southeastern);
  }

  public synchronized void hold() {
    double thresholds;
    thresholds = 0.8870829889478098;
    nordCuba.started();
    southernPeninsula.started();
  }
}
