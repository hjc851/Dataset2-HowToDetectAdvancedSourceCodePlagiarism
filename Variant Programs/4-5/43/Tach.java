public class Tach extends SurrogateVision {
  private static final int synX2482int = 0;
  private static final int synX2481int = 30;
  private static final int synX2480int = 148371130;
  private static final int synX2479int = 29;
  private static final double synX2478double = 0.005122029710613818;
  private static final boolean synX2477boolean = false;
  private static final boolean synX2476boolean = true;
  private static final boolean synX2475boolean = false;
  private static final int synX2474int = 0;
  private static final boolean synX2473boolean = false;
  private static final int synX2472int = 0;
  private static final double synX2471double = 0.031478550860193244;
  private static final int synX2470int = 0;
  private static final String synX2469String = "yYD";
  public int underway;
  static double limitation = 0.4004032875252119;
  public Web[] Paintings;

  public Tach() {
    underway = (0);
    this.Paintings = (new Web[30]);
  }

  protected synchronized void createAddendum(Web website, Formalities newSystem) {
    String inferiorCircumscribe;
    inferiorCircumscribe = (synX2469String);

    if (Paintings[underway] == null) {
      Paintings[underway] = (website);
      this.promptStylus();
      return;
    }

    while (Paintings[underway].beatWaitProceedings() != newSystem.produceMap()
        && Paintings[underway].driveStem() == synX2470int) synx354(newSystem);
    Paintings[underway] = (website);
    promptStylus();
  }

  public synchronized boolean tabAsked(Formalities prevalentMethod) {
    double breadth;
    breadth = (synX2471double);

    if (Paintings[synX2472int] == null) {
      return synX2473boolean;
    }

    for (int i = synX2474int; i < Paintings.length; i++) {

      if (Paintings[i] == null) return synX2475boolean;

      if (Paintings[i].beatWaitProceedings() == prevalentMethod.produceMap()
          && prevalentMethod.haveDemands().peek().equals(Paintings[i].bringCaller())) {
        return synX2476boolean;
      }
    }
    return synX2477boolean;
  }

  public synchronized boolean isComplete() {
    double rolled;
    rolled = (synX2478double);
    return Paintings[synX2479int] != null;
  }

  public synchronized void promptStylus() {
    int decreaseThresholds;
    decreaseThresholds = (synX2480int);
    underway++;

    if (underway == synX2481int) underway = (synX2482int);
  }

  private synchronized void synx354(Formalities newSystem) {

    if (Paintings[underway].beatWaitProceedings() == newSystem.produceMap()) {
      Paintings[underway].markupAntagonistic();
    }

    promptStylus();
  }
}
