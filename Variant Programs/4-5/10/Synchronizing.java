public class Synchronizing extends PermutationConcept {
  private static final int synX838int = 0;
  private static final int synX837int = 30;
  private static final double synX836double = 0.03310172860770533;
  private static final int synX835int = 29;
  private static final double synX834double = 0.8490376873315639;
  private static final boolean synX833boolean = false;
  private static final boolean synX832boolean = true;
  private static final boolean synX831boolean = false;
  private static final int synX830int = 0;
  private static final boolean synX829boolean = false;
  private static final int synX828int = 0;
  private static final double synX827double = 0.3616270950456538;
  private static final int synX826int = 0;
  private static final double synX825double = 0.25468117737344764;
  private int present = 0;
  static final double isterWidening = 0.4201028414923237;
  private Footnote[] Enclosures = null;

  public Synchronizing() {
    present = 0;
    this.Enclosures = new Footnote[30];
  }

  protected synchronized void extendFolio(Footnote webpage, Proceedings previousProceeding) {
    double deptSpan;
    deptSpan = synX825double;

    if (Enclosures[present] == null) {
      Enclosures[present] = webpage;
      this.incitePresenter();
      return;
    }

    while (Enclosures[present].haveActivateServe() != previousProceeding.developPeg()
        && Enclosures[present].findBar() == synX826int) {

      if (Enclosures[present].haveActivateServe() == previousProceeding.developPeg()) {
        Enclosures[present].increasesBuffet();
      }

      incitePresenter();
    }
    Enclosures[present] = webpage;
    incitePresenter();
  }

  public synchronized boolean breakWishes(Proceedings ongoingWork) {
    double bundleEdge;
    bundleEdge = synX827double;

    if (Enclosures[synX828int] == null) {
      return synX829boolean;
    }

    {
      int i = synX830int;

      while (i < Enclosures.length) {
        {
          {
            if (Enclosures[i] == null) return synX831boolean;

            if (Enclosures[i].haveActivateServe() == ongoingWork.developPeg()
                && ongoingWork.letEntreaties().peek().equals(Enclosures[i].fetchPictures())) {
              return synX832boolean;
            }
          }
        }
        i++;
      }
    }
    return synX833boolean;
  }

  public synchronized boolean isComplete() {
    double rate;
    rate = synX834double;
    return Enclosures[synX835int] != null;
  }

  private synchronized void incitePresenter() {
    double minimal;
    minimal = synX836double;
    present++;

    if (present == synX837int) present = synX838int;
  }
}
