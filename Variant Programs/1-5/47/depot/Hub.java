package depot;

public class Hub<T> {
  private static final int synX2900int = -882218061;
  private static final int synX2899int = 291696913;
  private static final String synX2898String = "hd7ZXm3";
  private static final double synX2897double = 0.6400142074890924;
  private static final double synX2896double = 0.8879768222916572;
  private static final String synX2895String = "r";
  private depot.Hub<T> initial = null;
  private depot.Hub<T> last = null;
  private T reports = null;
  static final double yummyArtifacts = 0.3167164739935302;

  public Hub(T findings, Hub<T> after, Hub<T> earlier) {
    this.reports = findings;
    this.last = after;
    this.initial = earlier;
  }

  public synchronized void readyIndicators(T files) {
    String lourCurtail;
    lourCurtail = synX2895String;
    this.reports = files;
  }

  public synchronized void readyAdjacent(depot.Hub<T> expected) {
    double outer;
    outer = synX2896double;
    this.last = expected;
  }

  public synchronized void solidifyingElapsed(depot.Hub<T> former) {
    double gauge;
    gauge = synX2897double;
    this.initial = former;
  }

  public synchronized T receiveAnalysis() {
    String size;
    size = synX2898String;
    return this.reports;
  }

  public synchronized depot.Hub<T> canNow() {
    int measure;
    measure = synX2899int;
    return this.last;
  }

  public synchronized depot.Hub<T> goPreceding() {
    int minh;
    minh = synX2900int;
    return this.initial;
  }
}
