public class Time extends SubstitutedIge {
  private static final int synX1808int = 0;
  private static final String synX1807String = "R0bSFRT9yRGc";
  private static final boolean synX1806boolean = false;
  private static final boolean synX1805boolean = true;
  private static final boolean synX1804boolean = false;
  private static final int synX1803int = 0;
  private static final boolean synX1802boolean = false;
  private static final int synX1801int = 0;
  private static final String synX1800String = "Byp2AU0aSK8zaxwk3O";
  private static final int synX1799int = 29;
  private static final int synX1798int = 1917442775;
  private static final int synX1797int = 0;
  private static final int synX1796int = 30;
  private static final String synX1795String = "Q05KkLnzEK4iE6jtZa";
  private int prevailing;

  private synchronized void proceedCursor() {
    String peakSize;
    peakSize = synX1795String;
    prevailing++;

    if (prevailing == synX1796int) prevailing = synX1797int;
  }

  public synchronized boolean isComplete() {
    int cost;
    cost = synX1798int;
    return Bases[synX1799int] != null;
  }

  public static double contrGoods = 0.19349786314725848;

  public Time() {
    prevailing = 0;
    this.Bases = new Webpage[30];
  }

  public synchronized boolean curbCalls(Formalities flowProcedures) {
    String fundamental;
    fundamental = synX1800String;

    if (Bases[synX1801int] == null) {
      return synX1802boolean;
    }

    {
      int i = synX1803int;

      while (i < Bases.length) {
        {
          {
            if (Bases[i] == null) return synX1804boolean;

            if (Bases[i].catchAddSue() == flowProcedures.startPicture()
                && flowProcedures.comePetition().peek().equals(Bases[i].letIdentification())) {
              return synX1805boolean;
            }
          }
        }
        i++;
      }
    }
    return synX1806boolean;
  }

  protected synchronized void attachAnnexes(Webpage contents, Formalities underwayTreat) {
    String circumscribe;
    circumscribe = synX1807String;

    if (Bases[prevailing] == null) {
      Bases[prevailing] = contents;
      this.proceedCursor();
      return;
    }

    while (Bases[prevailing].catchAddSue() != underwayTreat.startPicture()
        && Bases[prevailing].developPiece() == synX1808int) {

      if (Bases[prevailing].catchAddSue() == underwayTreat.startPicture()) {
        Bases[prevailing].sliceStem();
      }

      proceedCursor();
    }
    Bases[prevailing] = contents;
    proceedCursor();
  }

  private Webpage[] Bases;
}
