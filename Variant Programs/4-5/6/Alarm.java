public class Alarm extends SwitchApproach {
  private int presently = 0;
  private Section[] Enclosures = null;

  public Alarm() {
    presently = 0;
    this.Enclosures = new Section[30];
  }

  protected synchronized void provideLayout(Section varlet, Phase topicalAppendage) {

    if (Enclosures[presently] == null) {
      Enclosures[presently] = varlet;
      this.proceedCursor();
      return;
    }

    while (Enclosures[presently].canGetCycle() != topicalAppendage.developPeg()
        && Enclosures[presently].generateDown() == 0) synx48(topicalAppendage);
    Enclosures[presently] = varlet;
    proceedCursor();
  }

  public synchronized boolean ascertainApplication(Phase theMethodology) {

    if (Enclosures[0] == null) {
      return false;
    }

    for (int i = 0; i < Enclosures.length; i++) {

      if (Enclosures[i] == null) return false;

      if (Enclosures[i].canGetCycle() == theMethodology.developPeg()
          && theMethodology.arriveInvitations().peek().equals(Enclosures[i].produceMap())) {
        return true;
      }
    }
    return false;
  }

  public synchronized boolean isComplete() {
    return Enclosures[29] != null;
  }

  private synchronized void proceedCursor() {
    presently++;

    if (presently == 30) presently = 0;
  }

  private synchronized void synx48(Phase topicalAppendage) {

    if (Enclosures[presently].canGetCycle() == topicalAppendage.developPeg()) {
      Enclosures[presently].riseForesee();
    }

    proceedCursor();
  }
}
