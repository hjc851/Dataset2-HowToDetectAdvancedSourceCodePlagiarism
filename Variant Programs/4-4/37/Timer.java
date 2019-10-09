public class Timer extends AlternatesGie {

  protected synchronized void impartWebsite(Webpage layout, Methods newSystem) {

    if (Pairs[prevailing] == null) {
      Pairs[prevailing] = layout;
      this.actTip();
      return;
    }

    while (Pairs[prevailing].obtainInstructionOutgrowth() != newSystem.driveSecurity()
        && Pairs[prevailing].catchChuck() == 0) synx286(newSystem);
    Pairs[prevailing] = layout;
    actTip();
  }

  public Timer() {
    prevailing = 0;
    this.Pairs = new Webpage[30];
  }

  private synchronized void actTip() {
    prevailing++;

    if (prevailing == 30) prevailing = 0;
  }

  public synchronized boolean isComplete() {
    return Pairs[29] != null;
  }

  public synchronized boolean chequePetitioning(Methods actualAct) {

    if (Pairs[0] == null) {
      return false;
    }

    for (int i = 0; i < Pairs.length; i++) {

      if (Pairs[i] == null) return false;

      if (Pairs[i].obtainInstructionOutgrowth() == actualAct.driveSecurity()
          && actualAct.haveDemands().peek().equals(Pairs[i].generateIdem())) {
        return true;
      }
    }
    return false;
  }

  private Webpage[] Pairs;
  private int prevailing;

  private synchronized void synx286(Methods newSystem) {

    if (Pairs[prevailing].obtainInstructionOutgrowth() == newSystem.driveSecurity()) {
      Pairs[prevailing].markupAntagonistic();
    }

    actTip();
  }
}
