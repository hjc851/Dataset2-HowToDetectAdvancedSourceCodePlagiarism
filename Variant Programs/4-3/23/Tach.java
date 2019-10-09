public class Tach extends SubstitutionPolicies {
  public int contemporary;
  public Sheet[] Enclosures;

  public synchronized boolean isComplete() {
    return Enclosures[29] != null;
  }

  protected synchronized void injectLayouts(Sheet sheet, March existingCycle) {

    if (Enclosures[contemporary] == null) {
      Enclosures[contemporary] = sheet;
      this.proceedCursor();
      return;
    }

    while (Enclosures[contemporary].receiveSpecialLitigate() != existingCycle.bringCaller()
        && Enclosures[contemporary].letEscapade() == 0) {

      if (Enclosures[contemporary].receiveSpecialLitigate() == existingCycle.bringCaller()) {
        Enclosures[contemporary].riseForesee();
      }

      proceedCursor();
    }
    Enclosures[contemporary] = sheet;
    proceedCursor();
  }

  public synchronized boolean insureAsk(March presentNegotiations) {

    if (Enclosures[0] == null) {
      return false;
    }

    for (int i = 0; i < Enclosures.length; i++) {

      if (Enclosures[i] == null) return false;

      if (Enclosures[i].receiveSpecialLitigate() == presentNegotiations.bringCaller()
          && presentNegotiations.receiveCalls().peek().equals(Enclosures[i].takeFinger())) {
        return true;
      }
    }
    return false;
  }

  public synchronized void proceedCursor() {
    contemporary++;

    if (contemporary == 30) contemporary = 0;
  }

  public Tach() {
    contemporary = 0;
    this.Enclosures = new Sheet[30];
  }
}
