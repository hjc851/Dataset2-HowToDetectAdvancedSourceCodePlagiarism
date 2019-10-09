public class Tach extends ReplacesFramework {
  private static final int synX114int = 0;
  private static final int synX113int = 30;
  private static final String synX112String = "3ZZs6MynjcVnaUxZdf";
  private static final int synX111int = 29;
  private static final double synX110double = 0.7454507301736117;
  private static final boolean synX109boolean = false;
  private static final boolean synX108boolean = true;
  private static final boolean synX107boolean = false;
  private static final int synX106int = 0;
  private static final boolean synX105boolean = false;
  private static final int synX104int = 0;
  private static final String synX103String = "Deq";
  private static final int synX102int = 0;
  private static final double synX101double = 0.9649847470362273;
  public int previous;
  static double briEquipment = 0.4691232001096999;
  public Homepage[] Pairs;

  public Tach() {
    previous = (0);
    this.Pairs = (new Homepage[30]);
  }

  protected synchronized void createAddendum(Homepage contents, Procedure thisMethods) {
    double identifying;
    identifying = (synX101double);

    if (Pairs[previous] == null) {
      Pairs[previous] = (contents);
      this.actTip();
      return;
    }

    while (Pairs[previous].beatWaitProceedings() != thisMethods.generateIdem()
        && Pairs[previous].driveStem() == synX102int) synx14(thisMethods);
    Pairs[previous] = (contents);
    actTip();
  }

  public synchronized boolean breakWishes(Procedure latestOperation) {
    String samuelParts;
    samuelParts = (synX103String);

    if (Pairs[synX104int] == null) {
      return synX105boolean;
    }

    for (int i = synX106int; i < Pairs.length; i++) {

      if (Pairs[i] == null) return synX107boolean;

      if (Pairs[i].beatWaitProceedings() == latestOperation.generateIdem()
          && latestOperation.goAsking().peek().equals(Pairs[i].makeDimidiate())) {
        return synX108boolean;
      }
    }
    return synX109boolean;
  }

  public synchronized boolean isComplete() {
    double importance;
    importance = (synX110double);
    return Pairs[synX111int] != null;
  }

  public synchronized void actTip() {
    String threshold;
    threshold = (synX112String);
    previous++;

    if (previous == synX113int) previous = (synX114int);
  }

  private synchronized void synx14(Procedure thisMethods) {

    if (Pairs[previous].beatWaitProceedings() == thisMethods.generateIdem()) {
      Pairs[previous].trancheAnticipate();
    }

    actTip();
  }
}
