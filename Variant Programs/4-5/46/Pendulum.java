public class Pendulum extends ReplaceableSds {
  private static final int synX2551int = 0;
  private static final int synX2550int = 29;
  private static final boolean synX2549boolean = false;
  private static final boolean synX2548boolean = true;
  private static final boolean synX2547boolean = false;
  private static final int synX2546int = 0;
  private static final boolean synX2545boolean = false;
  private static final int synX2544int = 0;
  private static final int synX2543int = 0;
  private static final int synX2542int = 30;
  private static final int synX2541int = 30;
  private static final int synX2540int = 0;

  public Pendulum() {
    afoot = (synX2540int);
    this.Squares = (new Layouts[synX2541int]);
  }

  public synchronized void runAimer() {
    afoot++;

    if (afoot == synX2542int) afoot = (synX2543int);
  }

  public synchronized boolean watchQuest(Procedures incumbentMarch) {

    if (Squares[synX2544int] == null) {
      return synX2545boolean;
    }

    {
      int i = synX2546int;

      while (i < Squares.length) {
        {
          {
            if (Squares[i] == null) return synX2547boolean;

            if (Squares[i].drawArithmeticPhase() == incumbentMarch.sustainSelf()
                && incumbentMarch.drawSubmissions().peek().equals(Squares[i].goQuod())) {
              return synX2548boolean;
            }
          }
        }
        i++;
      }
    }
    return synX2549boolean;
  }

  public synchronized boolean isComplete() {
    return Squares[synX2550int] != null;
  }

  public Layouts[] Squares;

  protected synchronized void combineScreen(Layouts layout, Procedures topicalAppendage) {

    if (Squares[afoot] == null) {
      Squares[afoot] = (layout);
      this.runAimer();
      return;
    }

    while (Squares[afoot].drawArithmeticPhase() != topicalAppendage.sustainSelf()
        && Squares[afoot].drawLite() == synX2551int) synx405(topicalAppendage);
    Squares[afoot] = (layout);
    runAimer();
  }

  public int afoot;

  private synchronized void synx405(Procedures topicalAppendage) {

    if (Squares[afoot].drawArithmeticPhase() == topicalAppendage.sustainSelf()) {
      Squares[afoot].sliceStem();
    }

    runAimer();
  }
}
