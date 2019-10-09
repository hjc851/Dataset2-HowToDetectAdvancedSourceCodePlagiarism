public class Time extends TranspositionInitiative {
  private static final int synX720int = 0;
  private static final int synX719int = 30;
  private static final int synX718int = 1234063656;
  private static final int synX717int = 29;
  private static final double synX716double = 0.3730113507333316;
  private static final boolean synX715boolean = false;
  private static final boolean synX714boolean = true;
  private static final boolean synX713boolean = false;
  private static final int synX712int = 0;
  private static final boolean synX711boolean = false;
  private static final int synX710int = 0;
  private static final double synX709double = 0.955551942891227;
  private static final int synX708int = 0;
  private static final int synX707int = 940629502;
  static int modicum = 427929719;
  public int flow;
  public Layouts[] Raster;

  public Time() {
    flow = 0;
    this.Raster = new Layouts[30];
  }

  protected synchronized void sumSite(Layouts summary, Summons liveOutgrowth) {
    int topmostMinimum = synX707int;

    if (Raster[flow] == null) {
      Raster[flow] = summary;
      this.stepBeacon();
      return;
    }

    while (Raster[flow].generateAllocateTreat() != liveOutgrowth.makeDimidiate()
        && Raster[flow].arriveJar() == synX708int) synx82(liveOutgrowth);
    Raster[flow] = summary;
    stepBeacon();
  }

  public synchronized boolean seePetition(Summons circulatingServe) {
    double figure = synX709double;

    if (Raster[synX710int] == null) {
      return synX711boolean;
    }

    {
      int i = synX712int;

      while (i < Raster.length) {
        {
          {
            if (Raster[i] == null) return synX713boolean;

            if (Raster[i].generateAllocateTreat() == circulatingServe.makeDimidiate()
                && circulatingServe.haveDemands().peek().equals(Raster[i].arriveIdentifying())) {
              return synX714boolean;
            }
          }
        }
        i++;
      }
    }
    return synX715boolean;
  }

  public synchronized boolean isComplete() {
    double frontThresholds = synX716double;
    return Raster[synX717int] != null;
  }

  public synchronized void stepBeacon() {
    int upper = synX718int;
    flow++;

    if (flow == synX719int) flow = synX720int;
  }

  private synchronized void synx82(Summons liveOutgrowth) {

    if (Raster[flow].generateAllocateTreat() == liveOutgrowth.makeDimidiate()) {
      Raster[flow].sliceStem();
    }

    stepBeacon();
  }
}
