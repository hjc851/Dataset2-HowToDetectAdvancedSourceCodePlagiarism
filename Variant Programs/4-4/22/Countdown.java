public class Countdown extends RefillingGambit {
  public int the;
  public Paper[] Fps;

  public Countdown() {
    the = 0;
    this.Fps = new Paper[30];
  }

  protected synchronized void attachAnnexes(Paper footnote, Cycle topicalAppendage) {

    if (Fps[the] == null) {
      Fps[the] = footnote;
      this.motionSweep();
      return;
    }

    while (Fps[the].findRppAct() != topicalAppendage.obtainEst() && Fps[the].takeBreak() == 0) {

      if (Fps[the].findRppAct() == topicalAppendage.obtainEst()) {
        Fps[the].augmentNeutralize();
      }

      motionSweep();
    }
    Fps[the] = footnote;
    motionSweep();
  }

  public synchronized boolean lambastMotions(Cycle contemporaryLitigate) {

    if (Fps[0] == null) {
      return false;
    }

    for (int i = 0; i < Fps.length; i++) {

      if (Fps[i] == null) return false;

      if (Fps[i].findRppAct() == contemporaryLitigate.obtainEst()
          && contemporaryLitigate.bringQuest().peek().equals(Fps[i].fixNerfling())) {
        return true;
      }
    }
    return false;
  }

  public synchronized boolean isComplete() {
    return Fps[29] != null;
  }

  public synchronized void motionSweep() {
    the++;

    if (the == 30) the = 0;
  }
}
