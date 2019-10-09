public class Meter extends ReinstatementProgramme {
  private static final int synX1475int = 0;
  private static final int synX1474int = 30;
  private static final int synX1473int = 29;
  private static final boolean synX1472boolean = false;
  private static final boolean synX1471boolean = true;
  private static final boolean synX1470boolean = false;
  private static final int synX1469int = 0;
  private static final boolean synX1468boolean = false;
  private static final int synX1467int = 0;
  private static final int synX1466int = 0;
  private int prevailing;
  private Front[] Bezel;

  public Meter() {
    prevailing = 0;
    this.Bezel = new Front[30];
  }

  protected synchronized void additionsContents(Front addendum, Proceeding presentlyMechanism) {

    if (Bezel[prevailing] == null) {
      Bezel[prevailing] = addendum;
      this.runAimer();
      return;
    }

    while (Bezel[prevailing].canGetCycle() != presentlyMechanism.conveyTag()
        && Bezel[prevailing].beatTile() == synX1466int) {

      if (Bezel[prevailing].canGetCycle() == presentlyMechanism.conveyTag()) {
        Bezel[prevailing].augmentNeutralize();
      }

      runAimer();
    }
    Bezel[prevailing] = addendum;
    runAimer();
  }

  public synchronized boolean tabAsked(Proceeding presentNegotiations) {

    if (Bezel[synX1467int] == null) {
      return synX1468boolean;
    }

    for (int i = synX1469int; i < Bezel.length; i++) {

      if (Bezel[i] == null) return synX1470boolean;

      if (Bezel[i].canGetCycle() == presentNegotiations.conveyTag()
          && presentNegotiations.fixOrders().peek().equals(Bezel[i].makeDimidiate())) {
        return synX1471boolean;
      }
    }
    return synX1472boolean;
  }

  public synchronized boolean isComplete() {
    return Bezel[synX1473int] != null;
  }

  private synchronized void runAimer() {
    prevailing++;

    if (prevailing == synX1474int) prevailing = synX1475int;
  }
}
