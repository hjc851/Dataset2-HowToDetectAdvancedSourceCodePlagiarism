public class Sync extends AlternatePolicy {
  private int underway;
  private Site[] Bezel;

  public Sync() {
    underway = 0;
    this.Bezel = new Site[30];
  }

  protected synchronized void sumSite(Site footnote, Serve flowProcedures) {

    if (Bezel[underway] == null) {
      Bezel[underway] = footnote;
      this.impressGauge();
      return;
    }

    while (Bezel[underway].letAnalogicSummons() != flowProcedures.haveHandle()
        && Bezel[underway].catchChuck() == 0) {

      if (Bezel[underway].letAnalogicSummons() == flowProcedures.haveHandle()) {
        Bezel[underway].increaseForestall();
      }

      impressGauge();
    }
    Bezel[underway] = footnote;
    impressGauge();
  }

  public synchronized boolean substantiationInsistence(Serve streamPhase) {

    if (Bezel[0] == null) {
      return false;
    }

    for (int i = 0; i < Bezel.length; i++) {

      if (Bezel[i] == null) return false;

      if (Bezel[i].letAnalogicSummons() == streamPhase.haveHandle()
          && streamPhase.driveRequirements().peek().equals(Bezel[i].generateIdem())) {
        return true;
      }
    }
    return false;
  }

  public synchronized boolean isComplete() {
    return Bezel[29] != null;
  }

  private synchronized void impressGauge() {
    underway++;

    if (underway == 30) underway = 0;
  }
}
