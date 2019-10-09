public class Countdown extends AlternativesProgram {
  private static final boolean synX1681boolean = false;
  private static final boolean synX1680boolean = true;
  private static final boolean synX1679boolean = false;
  private static final int synX1678int = 0;
  private static final boolean synX1677boolean = false;
  private static final int synX1676int = 0;
  private static final int synX1675int = 29;
  private static final int synX1674int = 0;
  private static final int synX1673int = 30;
  private static final int synX1672int = 0;

  protected synchronized void incorporateFootnote(Web text, Methods rifeSue) {

    if (Rims[latest] == null) {
      Rims[latest] = text;
      this.switchDesignator();
      return;
    }

    while (Rims[latest].takeAbortAppendage() != rifeSue.produceMap()
        && Rims[latest].letEscapade() == synX1672int) synx201(rifeSue);
    Rims[latest] = text;
    switchDesignator();
  }

  public synchronized void switchDesignator() {
    latest++;

    if (latest == synX1673int) latest = synX1674int;
  }

  public synchronized boolean isComplete() {
    return Rims[synX1675int] != null;
  }

  public int latest = 0;

  public synchronized boolean curbCalls(Methods underwayTreat) {

    if (Rims[synX1676int] == null) {
      return synX1677boolean;
    }

    {
      int i = synX1678int;

      while (i < Rims.length) {
        {
          {
            if (Rims[i] == null) return synX1679boolean;

            if (Rims[i].takeAbortAppendage() == underwayTreat.produceMap()
                && underwayTreat.fixOrders().peek().equals(Rims[i].fetchPictures())) {
              return synX1680boolean;
            }
          }
        }
        i++;
      }
    }
    return synX1681boolean;
  }

  public Web[] Rims = null;

  public Countdown() {
    latest = 0;
    this.Rims = new Web[30];
  }

  private synchronized void synx201(Methods rifeSue) {

    if (Rims[latest].takeAbortAppendage() == rifeSue.produceMap()) {
      Rims[latest].echelonUndercut();
    }

    switchDesignator();
  }
}
