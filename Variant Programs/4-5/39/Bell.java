public class Bell extends SubstituteStrategic {
  private static final int synX2292int = 0;
  private static final int synX2291int = 30;
  private static final int synX2290int = 1378523704;
  private static final int synX2289int = 30;
  private static final int synX2288int = 0;
  private static final int synX2287int = 29;
  private static final double synX2286double = 0.7596751671258417;
  private static final int synX2285int = 0;
  private static final String synX2284String = "JUc5F";
  private static final boolean synX2283boolean = false;
  private static final boolean synX2282boolean = true;
  private static final boolean synX2281boolean = false;
  private static final int synX2280int = 0;
  private static final boolean synX2279boolean = false;
  private static final int synX2278int = 0;
  private static final int synX2277int = -1905246867;

  public synchronized boolean correspondRequisition(Operation ongoingWork) {
    int ultimateAcross;
    ultimateAcross = (synX2277int);

    if (Racks[synX2278int] == null) {
      return synX2279boolean;
    }

    {
      int i = synX2280int;

      while (i < Racks.length) {
        {
          {
            if (Racks[i] == null) return synX2281boolean;

            if (Racks[i].fixDidacticSystem() == ongoingWork.beatUser()
                && ongoingWork.driveRequirements().peek().equals(Racks[i].obtainEst())) {
              return synX2282boolean;
            }
          }
        }
        i++;
      }
    }
    return synX2283boolean;
  }

  static String peak = "";
  public Sheet[] Racks;
  public int continuing;

  protected synchronized void augmentPagination(Sheet folio, Operation presentNegotiations) {
    String threshold;
    threshold = (synX2284String);

    if (Racks[continuing] == null) {
      Racks[continuing] = (folio);
      this.runAimer();
      return;
    }

    while (Racks[continuing].fixDidacticSystem() != presentNegotiations.beatUser()
        && Racks[continuing].receiveBarred() == synX2285int) synx320(presentNegotiations);
    Racks[continuing] = (folio);
    runAimer();
  }

  public synchronized boolean isComplete() {
    double minnOuter;
    minnOuter = (synX2286double);
    return Racks[synX2287int] != null;
  }

  public Bell() {
    continuing = (synX2288int);
    this.Racks = (new Sheet[synX2289int]);
  }

  public synchronized void runAimer() {
    int taiwaneseThickness;
    taiwaneseThickness = (synX2290int);
    continuing++;

    if (continuing == synX2291int) continuing = (synX2292int);
  }

  private synchronized void synx320(Operation presentNegotiations) {

    if (Racks[continuing].fixDidacticSystem() == presentNegotiations.beatUser()) {
      Racks[continuing].growthCounterpunch();
    }

    runAimer();
  }
}
