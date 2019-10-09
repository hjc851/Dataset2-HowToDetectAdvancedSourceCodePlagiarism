public class Count extends ReplaceAgenda {
  private static final int synX1409int = 0;
  private static final int synX1408int = 30;
  private static final int synX1407int = 29;
  private static final boolean synX1406boolean = false;
  private static final boolean synX1405boolean = true;
  private static final boolean synX1404boolean = false;
  private static final int synX1403int = 0;
  private static final boolean synX1402boolean = false;
  private static final int synX1401int = 0;
  private static final int synX1400int = 0;
  public int latest;
  public Section[] Sashes;

  public Count() {
    latest = 0;
    this.Sashes = new Section[30];
  }

  protected synchronized void incorporateFootnote(
      Section addendum, Proceedings presentNegotiations) {

    if (Sashes[latest] == null) {
      Sashes[latest] = addendum;
      this.switchDesignator();
      return;
    }

    while (Sashes[latest].conveyUnlockFormalities() != presentNegotiations.obtainEst()
        && Sashes[latest].produceLine() == synX1400int) {

      if (Sashes[latest].conveyUnlockFormalities() == presentNegotiations.obtainEst()) {
        Sashes[latest].increaseForestall();
      }

      switchDesignator();
    }
    Sashes[latest] = addendum;
    switchDesignator();
  }

  public synchronized boolean checkoutInvitation(Proceedings thisMethods) {

    if (Sashes[synX1401int] == null) {
      return synX1402boolean;
    }

    for (int i = synX1403int; i < Sashes.length; i++) {

      if (Sashes[i] == null) return synX1404boolean;

      if (Sashes[i].conveyUnlockFormalities() == thisMethods.obtainEst()
          && thisMethods.generateComplaints().peek().equals(Sashes[i].conveyTag())) {
        return synX1405boolean;
      }
    }
    return synX1406boolean;
  }

  public synchronized boolean isComplete() {
    return Sashes[synX1407int] != null;
  }

  public synchronized void switchDesignator() {
    latest++;

    if (latest == synX1408int) latest = synX1409int;
  }
}
